package _03_number;

public class _01_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exercise #1: Write variables for age, birthYear, gradYear, numSiblings.
		
		int myAge = 17;
		int birthYear =1998;
		int gradYear = 2016;
		int numSiblings = 3;
	
		
		//Exercise #2: Who Can remember the six numerical types?
		
		byte by = 127; //8 -bit signed -128 to 127 - useful for saving memory
		byte tooBig = -128;
		
		short sh = 32767; //2^16, -32,678 to 32767,aka. Int16
		int i = 0; //32-bit signed number
		long l = 7;
		float f = 10.8f; //32-bit signed number -> floating point integer
		double d = 7.80;//64-bit signed number -> 64-bit decimal
		
		//Each type has its advantages, but int and double will be used the most.
		int wholeNumber = 8;
		double decimal = 8.7;
		
		double pi = 3.14;
		
		//You don't have to assign a value immediately
		//you can reset the variables after you have established the variable and integer
		int burgersEaten = 20;
		System.out.println(burgersEaten);
		
		burgersEaten = 25;
		
		System.out.println(burgersEaten);
		
		//However when you do assign the value, it must be the same type
		//burgersEaten = "five" 
		burgersEaten = 5;
		System.out.println(burgersEaten);
		
		int tacosEaten;
		tacosEaten = 3;
		System.out.println(tacosEaten);
		
		tacosEaten = 6;
		System.out.println(tacosEaten);
		
		
	

	}

}
