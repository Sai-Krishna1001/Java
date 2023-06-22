package com.electricity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BillDAO {

	Connection conn;
	// create a method connect() for database connection
	public void connect() throws SQLException{
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebill","root","sql@123");
			System.out.println("Database Connected......");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// To calculate totalBill based on Units
	public static double totalBill(double units)   
    {      
        double billToPay = 0;  
        // check whether units are less than 100  
        if(units < 100)  
        {  
            billToPay = units * 1.20;  
        }  
        // check whether the units are less than 300  
        else if(units < 300){  
            billToPay = 100 * 1.20 + (units - 100) * 2;  
        }  
        // check whether the units are greater than 300  
        else if(units > 300)  
        {  
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;  
        }  
		return billToPay;   
    }
	
	// create a method to  Insert bill into the database
	public void insertBill() {
		
		Scanner sc = new Scanner(System.in);
		PreparedStatement pst;
		String query = "INSER INTO BILL VALUES(?,?,?,?,?,?)";
		
		System.out.println("Enter the UserName : ");
		String uname = sc.next();
		System.out.println("Enter the MeterNo : ");
		int meterNo = sc.nextInt();
		System.out.println("Enter the Month : ");
		String month = sc.next();
		System.out.println("Enter the Units : ");
		double units = sc.nextDouble();
		System.out.println("Enter the Status : ");
		String status = sc.next();
		double tBill = totalBill(units);
		
		BillDetails bd = new BillDetails(uname,meterNo,month, units,tBill,status);
		
		try {
			pst = conn.prepareStatement(query);
			
			pst.setString(1, bd.userName);
			pst.setInt(2, bd.meterNo);
			pst.setString(3, bd.month);
			pst.setDouble(4,bd.units);
			pst.setDouble(5, bd.totalBill);
			pst.setString(6, bd.status);
			pst.executeUpdate();
			pst.close();
			System.out.println("A Bill was inserted successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	// create a method to delete bill from the database
	public void deleteBill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the MeterNo : ");
		int meterNo = sc.nextInt();
		PreparedStatement pst;
		String query = "DELETE FROM BILL WHERE MeterNo = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(2, meterNo);
			pst.executeUpdate(); 
			pst.close();
			System.out.println("A Bill was deleted successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	// create a method to update bill from the database
	public void updateBill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserName : ");
		String uname = sc.next();
		System.out.println("Enter the MeterNo : ");
		int meterNo = sc.nextInt();
		System.out.println("Enter the Month : ");
		String month = sc.next();
		System.out.println("Enter the Units : ");
		double units = sc.nextDouble();
		double totalBill = totalBill(units);
		System.out.println("Enter the status : ");
		String status = sc.next();
		
		PreparedStatement pst = null;
		String query = "UPDATE BILL SET USERNAME = ?,METERNO = ?, MONTH = ?, UNITS = ?, TOTALBILL = ?, STATUS = ? WHERE METERNO = " + meterNo;
		
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, uname);
			pst.setInt(2, meterNo);
			pst.setString(3, month);
			pst.setDouble(4, units);
			pst.setDouble(5, totalBill);
			pst.setString(6, status);
			pst.executeUpdate();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("An existing Bill was updated successfully!");
		sc.close();
	}
	
;	// create a method to fetch bills from the database
	public void selectBill(int choice) {
		
		BillDetails bd = new BillDetails();
		String query = null;
		Statement st;
		if(choice == 4) query = "select * from bill";
		else if(choice == 5) query = "select * from bill where status = 'unpaid' ";
		else if(choice == 6) query = "select * from bill where status = 'paid' ";
		else if(choice == 7) query = "select * from bill where totalBill = (select max(totalBill) from bill) ";
		else if(choice == 8) query = "select * from bill where totalBill = (select min(totalBill) from bill) ";
		
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				bd.userName = rs.getString(1);
				bd.meterNo = rs.getInt(2);
				bd.month = rs.getString(3);
				bd.units = rs.getDouble(4);
				bd.totalBill = rs.getDouble(5);
				bd.status = rs.getString(6);
				
				System.out.println(bd.userName + ", " + bd.meterNo + ", " + bd.month + ", " + bd.units + ", " + bd.totalBill + ", " + bd.status);
			}
			st.close();
			System.out.println("Bills Fetched Successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
