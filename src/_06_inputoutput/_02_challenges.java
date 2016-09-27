package _06_inputoutput;

import java.util.Scanner;

public class _02_challenges {
		public static void main(String[] args) {
			String brand;
			String kids;
			String cars;
			
			Scanner inputInfo = new Scanner(System.in);
					
			//Silver Challenge
			
			String name;
			String title;
			int children;
			String queen;
			String king;
			String princess;
			String prince;
			String lady;
			String lad;
			String knight;
			String jester;
			
			
			
			//Game starts
			System.out.println("Please enter your name");
			name = inputInfo.nextLine();	
			
			System.out.println("Please enter your title: Queen, King, Princess, Prince, Knight, Lady, Lad, Jester, or peasent.");
			title = inputInfo.nextLine().toLowerCase();	
			
			if (title.contains("Queen")||title.contains("King")||title.contains("Lady")||title.contains("Lad")||title.contains("Knight")){
				System.out.println("You are royalty.");
			} else {
				System.out.println("You must work for your power.");
			}
			
			System.out.println("How many children do you have?");
			children = inputInfo.nextInt();	
			
			if (children <= 0){
				System.out.println("You have no children.");
			}
			
			if (children >= 1){
				System.out.println("You have " + children + " children.");
			}
			
			System.out.println("Your name is " + title + " " + name + " and you have " + children + " children to fight for.");
		}
}
