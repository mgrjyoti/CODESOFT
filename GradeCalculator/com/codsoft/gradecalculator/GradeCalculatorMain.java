package com.codsoft.gradecalculator;

import java.util.Scanner;

public class GradeCalculatorMain {
	
	private static boolean loop=true;
	private static GradeCalculatorImplemetation gad;
	
	public static void main(String[] args) {
		
		System.out.println("==============Wel-Come To Grade Calculator ===============");
		while (loop) {	
		grade();
	}
}

	private static void grade() {
		System.out.println(" Enter Your Choice.\n 1. Enter 1 for create grade card"
				+ "\n 2. Enter 2 For show greade card.\n 3. Enter 3 For exist application.");
		Scanner scanner= new Scanner(System.in);
		int choice=scanner.nextInt();
		
		switch (choice) {
		
		case 1: {
			gad.createGradeCard();
			break;
		}
		case 2: {
			gad.showGradeCard();
			break;
		}
		case 3: {
			System.out.println("Thank You!!!");
			loop=false;
			scanner.close();
			break;
		}
		default:
			System.out.println("Please enter valid choice.");
			
		}
	}
}
