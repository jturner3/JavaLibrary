package _09_loops;

public class _02_forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for(initialize lvc(loop control variable) relational test lvc; modify lvc)
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
		
		
		//Create a for loop that increments by 5 and
		//counts 0 - 100
		
		for(int i = 0; i <= 100; i+= 5){
			System.out.println(i);
		}
		
		//i.e this should be your output:
		//0 + 1 = 1
		//1 + 2 = 3
		//3 + 3 = 6
		//6 + 4 = 10
		//10 + 5 = 15
		//15 + 6 = 21
		//21 + 7 = 28
		//28 + 8 = 36
		//36 + 9 = 45
		//45 + 10 = 55
		
		int sum = 0;
		for(int i = 0; i <= 10; i++){
			sum = sum + i;
		}	
		System.out.println(sum);
		
		//Simple interest over time;
		
		double balance = 5000;
		double rate = 1.02; //2% interest
		for(int i = 0; i < 10; i++){
			balance *= rate; //balance = balance * rate
		}
			System.out.println(balance);
			
			String spaces = "There are spaces in this string";
			int numSpaces = 0;
			//Printing out the number of spaces in a string 
			//System.out.println(spaces.length());
			
			//Printing out a single character in a string
			//System.out.println(spaces.charAt(30));
			
			//Printing out string one character at a time
			for (int i = 0; i < spaces.length();i++) {
				System.out.println(spaces.charAt(i));
			}
			
			
			
			
			
	}

}
