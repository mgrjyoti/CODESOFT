package com.codsoft.gradecalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeCalculatorImplemetation {

	private List<Entity> entities= new ArrayList<Entity>();
	
	private String[] subjects = {"Java ", "Python", "HTML ", "CSS ", "AI ", "SQL", "C Language"};
	
	public void createGradeCard() {
		System.out.println("How many Grade cards you want to create?");
		Scanner scanner= new Scanner(System.in);
		int how = scanner.nextInt();
		
		for (int i = 1; i <= how; i++) {
			Entity entity = new Entity();
			System.out.println("Enter School Name : ");
			entity.setSchooleNmae(scanner.next());
			System.out.println("Enter Student Id : ");
			entity.setId(scanner.nextLong());
			System.out.println("Enter Student Name : ");
			entity.setStudName(scanner.next());
			System.out.println("Enter student roll number : ");
			entity.setRollNo(scanner.nextInt());
			System.out.println("Enter class : ");
			entity.setClassName(scanner.next());
			System.out.println("Enter Subject marks : ");
			for (int j = 0; j < subjects.length; j++) {
				System.out.println("Enter " + j + " marks : ");
				float marks= scanner.nextFloat();
			}
			System.out.println("Enter Student status: ");
			entity.setStatus(scanner.next());
			
			entities.add(entity);
			System.out.println("\n\n " + entity.getStudName()+  " data added sucessfully.");
		}
		
	}
	
	public void showGradeCard() {
		if (entities.isEmpty()) {
			System.out.println("no data found.");
		}
		else {
			System.out.println("Details " +entities.size());
			System.out.println("\t SCHOOL NAME "+ "\n ");
		}
	}
}
