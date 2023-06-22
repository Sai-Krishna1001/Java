package com.exceptionexamples;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatException {

	static void convertDateFormat(String inputDate)
	{
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			Date date = sdf.parse(inputDate);
			//System.out.println(date);
			SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-mm-dd");
			String outputDate = outputsdf.format(date);
			System.out.println("After changing date format to yyyy-mm-dd " + outputDate);
			 
		}
		catch(java.text.ParseException e)
		{
			System.out.println("some error occur while coverting date format ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in dd/mm/yyyy format : ");
		String inputDate = sc.next();
		convertDateFormat(inputDate);
		

	}

}
