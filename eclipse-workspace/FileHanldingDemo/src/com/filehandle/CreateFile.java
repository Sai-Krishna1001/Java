package com.filehandle;

import java.io.File;	//import the file class
import java.io.IOException;		//import the IOException class to handle errors

public class CreateFile {

	public static void main(String[] args) {
		
		try {
			File obj = new File("D:\\Wipro_JFSD\\Filef1.txt");
			if(obj.createNewFile())
			{
				System.out.println("File Created : " + obj.getName());
			}
			else
			{
				System.out.println("File already Exists");
			}
			
		}
		catch(IOException e)
		{
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

}
