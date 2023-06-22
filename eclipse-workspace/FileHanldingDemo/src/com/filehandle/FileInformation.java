package com.filehandle;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		
		File obj = new File("D:\\Wipro_JFSD\\Filef1.txt");
		if(obj.exists())
		{
			System.out.println("File Name : \t" + obj.getName());
			System.out.println("Absolute Path : \t" + obj.getAbsolutePath());
			System.out.println("Writeable : \t" + obj.canWrite());
			System.out.println("Readable : \t" + obj.canRead());
			System.out.println("File size in bytes : \t" + obj.length());
		}
		else
		{
			System.out.println("The File does not exist");
		}
	}

}
