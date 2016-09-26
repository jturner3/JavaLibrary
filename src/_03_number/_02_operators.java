package _03_number;

public class _02_operators{
	public static void main(String[] args) {
	//ToDo Done
	
	//Discussion #1: Basic. These are easy to get. Same math concepts
		int ten = 5+5;
		int eleven = 16-5;
		int twenty = 10*2;
		int two = 12/6;
		
	//Discussion #2: Modulus. Divides the number and gives the remainder
		
		int modulus = 13 % 4;
		int modulusTwo = 41 % 2;
		
		int modulusThirteenAndFour = 13 % 4;
		
		//Eleven
		ten = ten + 1;
		System.out.println(ten);
		//Twelve
		ten += 1;
		System.out.println(ten);
		
		double stockPrice;
		stockPrice = 103.75;
		stockPrice *= 1.3;
		System.out.println(stockPrice);
		
	
	//Discussion #3: Increment and Decrement
		
		int increment = twenty++;
		int incrementTwo = ++twenty; //Note that this adds two first
		int decrement = ten--;
		System.out.println(increment);
		
	//Discussion #4: Shorthand
	//Will take the integer and execute the shorthand operator to give it it's new value
		int x;  
	   	 x = 7;
	   	 x += 4;
	   	 System.out.println(x);
	    
	   	 x = 7;
	   	 x -= 4;
	   	 System.out.println(x);
	    
	   	 x = 7;
	   	 x *= 4;
	   	 System.out.println(x);
	    
	   	 x = 7;
	   	 x /= 4;
	   	 System.out.println(x);
	    
	   	 x = 7;
	   	 x %= 4;
	   	 System.out.println(x);
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
