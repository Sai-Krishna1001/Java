package com.filehandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
		File obj = new File("D:\\Wipro_JFSD\\Filef1.txt");
		Scanner myReader = new Scanner(obj);
		while(myReader.hasNextLine())
		{
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An error occurred");
			e.printStackTrace();
		}

	}

}
