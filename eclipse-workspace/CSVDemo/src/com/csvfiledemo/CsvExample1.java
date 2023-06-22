package com.csvfiledemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvExample1 {
	
	public CsvExample1()
	{
		
	}

	public List<CsvFileInfo1> readMobileData(String fileName)
	{
		List<CsvFileInfo1> mobileList = new ArrayList<>();
		String line = "";
		//int i = 0;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			br.readLine();
			
			while((line = br.readLine()) != null)
			{
				String[] singleList = line.split(",");
				mobileList.add(new CsvFileInfo1(singleList[0], singleList[1], 
						Double.parseDouble(singleList[2]),singleList[3], singleList[4], singleList[5],
						Integer.parseInt(singleList[6])));
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return mobileList;
	}
	
	public List<CsvFileInfo1> findPhoneByBrand(String brand)
	{
		String fileName = "mobile.csv";
		List<CsvFileInfo1> mobileList = this.readMobileData(fileName);
		List<CsvFileInfo1> allSameBrand = new ArrayList<>();
		
		for(CsvFileInfo1 mobile : mobileList)
		{
			if(mobile.getBrandName().equalsIgnoreCase(brand)) {
				allSameBrand.add(mobile);
			}
		}
		return allSameBrand;
	}
	
	public List<CsvFileInfo1> findCostMorethanFiveHundred()
	{
		String fileName = "mobile.csv";
		List<CsvFileInfo1> mobiList = this.readMobileData(fileName);
		List<CsvFileInfo1> costMorethanFH = new ArrayList<>();
		
		for(CsvFileInfo1 mobile : mobiList)
		{
			if(mobile.getCost()>500.0)
			{
				costMorethanFH.add(mobile);
			}
		}
		return costMorethanFH;
	}
	public static void main(String[] args) {
		
		CsvExample1 csv = new CsvExample1();

		//System.out.println(csv.readMobileData("mobile.csv"));
		System.out.println("samsung brand mobiles: ");
		System.out.println(csv.findPhoneByBrand("samsung"));
		System.out.println("mobiles cost more than five hundered : ");
		System.out.println(csv.findCostMorethanFiveHundred());
		
	}

}
