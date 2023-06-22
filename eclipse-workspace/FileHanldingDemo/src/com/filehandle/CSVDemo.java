package com.filehandle;

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
public class CSVDemo  
{  
	public static void main(String[] args)   
	{  
		String line = "";  
		String splitBy = ",";  
		try   
		{  
			//parsing a CSV file into BufferedReader class constructor  
			BufferedReader br = new BufferedReader(new FileReader("CSVDemo.csv"));
			int count = 0;
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{
				if(count == 0) {
					count ++;
					continue;
				}
				String[] employee = line.split(splitBy);    // use comma as separator  
				System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] +"]");  
			}  
		}   
		catch (IOException e)   
		{  
			e.printStackTrace();  
		}  
	}  
}  
