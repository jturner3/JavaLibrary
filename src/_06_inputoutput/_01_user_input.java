
package _06_inputoutput;

import java.util.Scanner;

public class _01_user_input {
	public static void main(String[] args) {
		//Variable Declarations, no assigning of the value to initialize it
		String name = "John";
		String birthCity;
		String age;
		
		//Scanner is a Java class - used for User Input
		Scanner inputInfo = new Scanner(System.in);
		
		//Setup a simple user input
		
		System.out.println("Enter your name below: ");
		String username = inputInfo.nextLine();
		System.out.println(username);
		
		System.out.println("Enter your birth city: ");
		birthCity = inputInfo.nextLine();
	
		
		System.out.println("Enter your age: ");
		age = inputInfo.nextLine();
		
		
		//Use concatenation to make a sentence using these inputs
		
		System.out.println("Hello " + name + " you were born in " + birthCity + " and you are " + age + " years old ");
		
		inputInfo.close();
		
	}
}
