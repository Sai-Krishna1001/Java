 package com.student.results;

import java.util.Scanner;

public class StudentResultImplementation {

	public static void main(String[] args) {
		
		EvaluationAndGradingTeam EGT = new EvaluationAndGradingTeam();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Students in the class : ");
		EGT.intialize(sc.nextInt());
		
		for (int i = 0; i < EGT.getNoOfStudents(); i++) {
			StudentMarks sm = new StudentMarks();
			System.out.println( i+1  + "Enter the Studnet name : ");
			sm.setSname(sc.next());
			System.out.println("Enter the student rollno : ");
			sm.setRollno(sc.nextInt());
			System.out.println("Enter the marks of maths : ");
			sm.setMaths(sc.nextInt());
			System.out.println("Enter the marks of physics : ");
			sm.setPhysics(sc.nextInt());
			System.out.println("Enter the marks of chemistry : ");
			sm.setChemistry(sc.nextInt());
			System.out.println("Enter the marks of english : ");
			sm.setEnglish(sc.nextInt());
			EGT.add(sm);
		}
		sc.close();
		
		EGT.calculateTotalMarks();
		EGT.calculateClassAverageMarks();
		EGT.calculateSubjectAverageMarks();
		ReportGenerationTeam RGT = new ReportGenerationTeam();
		RGT.findTopper();
		RGT.checkPassOrFail();
		
		
		System.out.println("================================================================");
		System.out.println("Total marks of each student");
		System.out.println("Studentname \t \t TotalMarks");
		for (int i = 0; i < EGT.getNoOfStudents(); i++) {
			System.out.println(EGT.getMarks()[i].getSname() + " \t : \t " + EGT.getTotalMarks()[i]);
		}
		System.out.println("================================================================");
		System.out.println("Class average marks : " + EGT.getClassAverageMarks());
		System.out.println("================================================================");
		System.out.println("The average marks of maths : " + EGT.getMathsAvg());
		System.out.println("The average marks of physics : " + EGT.getPhysicsAvg());
		System.out.println("The average marks of chemistry : " + EGT.getChemistryAvg());
		System.out.println("The average marks of english : " + EGT.getEnglishAvg());
		System.out.println("================================================================");
		System.out.println("Topper of the class : " + RGT.getTopperName());
		System.out.println("================================================================");
		System.out.println("Passed Students: ");
		RGT.getPassedStudents();
		System.out.println("================================================================");
		System.out.println("Failed students: ");
		RGT.getFailedStudents();
		
		
	}

}
