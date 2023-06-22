package com.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//employee data
		List<EmpData> data = new ArrayList<EmpData>();
		data.add(new EmpData(1, "shirley", 9000,2000, "e","12/10/2020"));
		data.add(new EmpData(2, "shivraj", 10000,2500, "m", "8/8/2020"));
		data.add(new EmpData(3, "raj", 4000,1000, "c", "15/10/2021"));
		data.add(new EmpData(4, "simran", 7000,2000, "hr", "11/11/2021"));
		
		//employee data1
		List<EmpData1> data1 = new ArrayList<EmpData1>();
		data1.add(new EmpData1("e", "engg", 6000));
		data1.add(new EmpData1("m", "manager", 2000));
		data1.add(new EmpData1("c", "engg", 5000));
		data1.add(new EmpData1("hr", "engg", 4000));
		
		//input of empid
		System.out.println("Enter the EmpNum : ");
		int empNo = sc.nextInt();
		int salary = 0;
		int check = 0;
		
		//display employee data
		for (EmpData empData: data) 
		{
			if(empData.getEno() == empNo) 
			{	
				for (EmpData1 empData1 : data1) 
				{
					if(empData.getDesig() == empData1.getCode()) 
					{
						salary = empData.getBasic() + empData.getHra() + empData1.getDa();
						check = 1;
						System.out.println("Employee Information : ");
						System.out.println(
							"eno = " + empNo +
							", ename = " + empData.getEname() +
							", desig = " + empData.getDesig() + 
							", doj = " + empData.getDate() + 
							", Total Salary = " + salary
							);
						break;
					}
				}
			}
			if(check == 1)
			{
				break; 
			}
		}
		if(check == 0) System.out.println("EmployeeID not applicable");
	}
		
}
