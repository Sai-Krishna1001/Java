package com.writetocsv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class WritingToCSV {

	public static void main(String[] args) {
		
		String id = "208";
		String name = "jhonny";
		String age = "25";
		String filepath = "cake.csv";
		
		saveRecord(id, name, age, filepath);
	}
	
	public static void saveRecord(String id,String name, String age, String filepath) {
		
		try {
			FileWriter fw = new FileWriter(filepath,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println(id + "," + name + "," + age);
			pw.flush();
			pw.close();
			
			JOptionPane.showMessageDialog(null, "Record Saved");
			
		} catch (IOException e) {
			
			JOptionPane.showMessageDialog(null, "Record Not Saved");
		}
		
	}
}
