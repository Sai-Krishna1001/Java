package com.jap.onlinequiz;

import java.util.Scanner;

public class OnlineQuiz {
	static int HScore,x,index;
	//to find the highest scored school
	static String FindHighestScoredSchool(String[] scores, String[] nameOfSchools)
	{
		HScore = Integer.parseInt(scores[0]);
		for (int i = 1; i < 10; i++) {
			x = Integer.parseInt(scores[i]);
			if(HScore < x)
			{
				HScore = x;
				index = i;
			}
		}
		return nameOfSchools[index];
	}
	// to find the average score of 10 schools
	static int calculateAverageScore(String[] scores)
	{
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += Integer.parseInt(scores[i]);
		}
		return sum/10;
	}
	
	
	public static void main(String[] args)
	{
		String nameOfSchools[] = new String[10];
		String scores[] = new String[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nameOfSchools and scores :");
		try {
			for (int i = 0; i < 10 ; i++) {
				nameOfSchools[i] = sc.next();
				scores[i] = String.valueOf(sc.nextInt());
				//scores[i+3] = String.valueOf(sc.nextInt()); //array index out of bound exception
			}
			System.out.println("The average score of 10 schools is : " + calculateAverageScore(scores));
			
			System.out.println("The highest scorer in the quiz is : " + FindHighestScoredSchool(scores,nameOfSchools)
			+ " with a score of: " + HScore);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
