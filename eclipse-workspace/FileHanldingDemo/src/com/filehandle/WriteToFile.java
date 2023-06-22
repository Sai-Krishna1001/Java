package com.filehandle;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("D:\\Wipro_JFSD\\Filef1.txt");
			myWriter.write("java is the programming language");
			myWriter.close();
			System.out.println("successfully wrote to the file");
			
		}
		catch(IOException e)
		{
			System.out.println("An error occurred");
			e.printStackTrace();
		}

	}

}
