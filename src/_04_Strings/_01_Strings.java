package _04_Strings;

public class _01_Strings {
	public static void main(String[] args) {
		
	String planet = "Earth";
	String state = "Indiana";
	String address = "123 Earthy Heaven";
	String name = "Papa John";
	
	//3 concatenations
	
	System.out.println(planet + " " + state + " " + address);
	
	//Upper and Lowercase functions
	
	String toLowerCase = name.toLowerCase();
	System.out.println(toLowerCase);
	
	String toUpperCase =address.toUpperCase();
	System.out.println(toUpperCase);
	
	//Bronze Challenge
	
	String first = "John";
	String middle = "Douglas";
	String last = "Turner";
	
	System.out.println(first + " " + middle + " " + last);
	
	//Silver Challenge
	//Example
	
	String firstTwo= first.substring(0,2);
	System.out.println(firstTwo);
	
	String phrase= "Soda Can";
	String firstWord= phrase.substring(0,4);
	System.out.println(firstWord);
	String lastWord=phrase.substring(5,8);
	System.out.println(lastWord);
	
	
	
	//TODO show how to check whether two strings are equal.
	
	
	
	
	
	
		
	}

}
