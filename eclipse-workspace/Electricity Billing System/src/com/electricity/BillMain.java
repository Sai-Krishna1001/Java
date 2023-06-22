package com.electricity;

import java.sql.SQLException;
import java.util.Scanner;

public class BillMain {
	
	// Continue or Exit Method
	public void continueOrExit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Do You Want to Continue(Y/N) : ");
		String x = sc.next();
		if(x.equalsIgnoreCase("y")) {
			try {
				switchOperation();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if(x.equalsIgnoreCase("n")) {
			System.out.println("Exit the Console");
		}
		else {
			System.out.println("Enter the Correct Input(Y/N):");
		}
		sc.close();
	}
	
	// Switch Operations Method
	public void switchOperation() throws SQLException {
		BillDAO bdao = new BillDAO();
		bdao.connect();
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1. InsertBill"
				+ "\n 2. deleteBill based on meterNo"
				+ "\n 3. updateBill based on meterNo"
				+ "\n 4. show all bills"
				+ "\n 5. show the unpaid bills"
				+ "\n 6. show the paid bills"
				+ "\n 7. show the highest bill"
				+ "\n 8. show the lowest bill"
				+ "\n 9. Exit");
		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();
		
		switch (choice) 
		{
			case 1: {		
				bdao.insertBill();
				continueOrExit();
			}
			case 2:{
				bdao.deleteBill();
				continueOrExit();
				break;
			}
			case 3:{
				bdao.updateBill();
				continueOrExit();
				break;
			}
			case 4:{
				bdao.selectBill(choice);
				continueOrExit();
				break;
			}
			case 5:{
				bdao.selectBill(choice);
				continueOrExit();
				break;
			}
			case 6:{
				bdao.selectBill(choice);
				continueOrExit();
				break;
			}
			case 7:{
				bdao.selectBill(choice);
				continueOrExit();
				break;
			}
			case 8:{
				bdao.selectBill(choice);
				continueOrExit();
				break;
			}
			case 9:{
				System.out.println("Exit the Console");
				break;
			}	
		}
		sc.close();
	}

	public static void main(String[] args){
		BillMain bm = new BillMain();
		try {
			bm.switchOperation();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
