package com.codsoft.Game;

import java.util.Random;
import java.util.Scanner;

public class NumberGameTask {

	private static boolean loop=true;
	public static void main(String[] args) {
		System.out.println("==============Wel-Come To Number Game===============");
		
			while (loop) {	
			game();
		}
	}

	private static void game() {
		System.out.println("Enter Player Name : ");
		Scanner scanner= new Scanner(System.in);
		String playerName =scanner.next();
		
		System.out.println(playerName + " Enter Your Choice.\n 1. Enter 1 for Play Game"
				+ "\n 2. Enter 2 For EXit Game.");
		int choice=scanner.nextInt();
		
		switch (choice) {
		
		case 1: {
			int min=1;
			int max=100;
			Random random = new Random();
			System.out.println("How many Rounds of game you want to play?");
			int round=scanner.nextInt();
			for (int i = 1; i <= round; i++) {
				System.out.println("\nRound : "+ i );
				int count=0;
				int snum=random.nextInt(max- min)+min;
				int guss;
				System.out.println("Guss The number between "+ min + " and "+ max +" : " );
				while (true) {
					System.out.println("Enter Your guss Number : ");
					guss=scanner.nextInt();
					count ++;
					if (guss < snum) {
						System.out.println( playerName +" you enterd number is too LOW !!! Please try agin...");
					}
					else if (guss > snum) {
						System.out.println(playerName +" you enterd number is too HIGH !!! Please try agin...");
					}
					else {
						System.out.println("Congratulation " + playerName+ " you have guess correct number. "+guss+ " in attempts "+ count);
						break;
					}
				}
			}
			scanner.close();
			}
		break;	
		case 2: {
			System.out.println("Thank You!!!");
			loop=false;
			break;
		}
		default:
			System.out.println("Please enter valid choice.");
			
		}
	}
}
