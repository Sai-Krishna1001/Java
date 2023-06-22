package com.routeplanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Task1 : read the flight route Info as input from a CSV file named routes.csv
//and store the route Info for each route  in a list
//and display the details of flight route Info

//Task2 : To show the direct flights Info from specific city

//Task3 : To sort  direct flights route Info based on destination address

//Task4 : To show the list of direct routes and intermediate connections

public class RoutePlan {
	
	// to read data from csv file
	public List<Route> readRouteData(String fileName)
	{
		List<Route> routeInfo = new ArrayList<>();
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			br.readLine();
			// to store flight route Info
			while((line=br.readLine()) != null)
			{
				String[] sroute = line.split(",");
				routeInfo.add(new Route(sroute[0], sroute[1], Integer.parseInt(sroute[2]), sroute[3],
						sroute[4]));
			}
			br.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return routeInfo;
	}
	
	// to find the available flights Info from specific city
	public void showDirectFlights(List<Route> routeInfo, String fromCity)
	{
		List<Route> AvailableFromCity = new ArrayList<>();
		// store the available flights Info in the list 	
		for(Route route : routeInfo)
		{
			if(route.getFromAddress().equalsIgnoreCase(fromCity))
			{
				AvailableFromCity.add(route);
			}
		}
		// Incase flights not available through FromAddress
		if(AvailableFromCity.size() == 0)
		{
			System.out.println("We are sorry. At this point of time, we do not have any information "
					+ "on flights originating from "+ fromCity);
		}
		else
		{
			for (Route route : AvailableFromCity) {
				System.out.println(route);
			}
		}
	}
	
	// to sort direct flights route Info based on destination address
	public void sortDirectFlights(List<Route> routeInfo)
	{
		//List<Route> sortDestAdd = new ArrayList<>();
		Collections.sort(routeInfo, (a,b) ->		//using lambda expression
		{
			return a.getToAddress().compareTo(b.getToAddress());
		});
		
		for (Route route : routeInfo) {
			System.out.println(route);
		}
		
	}
	
	//to find the direct and indirect routes from one address to another address
	public void directAndIndirectRoutes(List<Route> routeInfo, String fromCity, String toCity)
	{
		List<Route> fromAddToAdd = new ArrayList<>();
		//to store direct routes
		for (Route route : routeInfo) {
			if(route.getFromAddress().equalsIgnoreCase(fromCity) && route.getToAddress().equalsIgnoreCase(toCity))
			{
				fromAddToAdd.add(route);
			}
		}
		
		// to store indirect routes
				
		for (Route fromRoute : routeInfo) 
		{
			boolean x = fromRoute.getFromAddress().equalsIgnoreCase(fromCity);
			boolean y = !(fromRoute.getToAddress().equalsIgnoreCase(toCity));
			String toAddress = fromRoute.getToAddress();
			
			if(x && y)
			{
				for (Route toRoute : routeInfo)
				{
					boolean x2 = toRoute.getFromAddress().equalsIgnoreCase(toAddress);
					boolean y2 = toRoute.getToAddress().equalsIgnoreCase(toCity);
					if(x2 && y2)
					{
						fromAddToAdd.add(fromRoute);
						fromAddToAdd.add(toRoute);
					}
				}
			}
		}
		
		if(fromAddToAdd.size() == 0)
		{
			System.out.println("We are sorry. At this point of time, we do not have any information "
					+ "on flights originating from "+ fromCity);
		}
		else
		{
			for (Route route : fromAddToAdd) {
				System.out.println(route);
			}
		}
		
	}
	//main method
	public static void main(String[] args) {
		
		RoutePlan rp = new RoutePlan();
		String fileName = "routes.csv";
		List<Route> routeInfo = rp.readRouteData(fileName);
		
		
		//Task 1
		System.out.println("All available Flights: ");
		System.out.println("==============================================================");
		/// to display the all flight route Info
		for (Route route : routeInfo) {
			System.out.println(route);
		}
		
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FromAddress :");
		String fromCity = sc.next();
		System.out.println("Enter the ToAddress : ");
		String toCity = sc.next();
		
		//Task 2
		
		System.out.println("Flights available from "+ fromCity + " : ");
		System.out.println("================================================================");
		rp.showDirectFlights(routeInfo, fromCity);
		
		//Task 3
		System.out.println("All Flights route Info sorted based on destination address : ");
		System.out.println("================================================================");
		rp.sortDirectFlights(routeInfo);
		
		//Task 4
		System.out.println("List of Flight direct routes and intermediate connections : ");
		System.out.println("==================================================================");
		rp.directAndIndirectRoutes(routeInfo, fromCity, toCity);
		
		sc.close();
	}

}
