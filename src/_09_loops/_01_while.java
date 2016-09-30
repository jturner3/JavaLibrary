package _09_loops;

public class _01_while {
	public static void main(String[] args) {
		//Count from 0 to 10
		
		int count = 0;
		while(count <= 10){
			System.out.println(count);
			count++;
		}
		
		//Count from 10 to zero
		
		int countTwo = 10;
		while(countTwo >= 0){
			System.out.println(countTwo);
			countTwo --;
		}
		
		//From 100 count bakcwards by 5s
		
		int countThree = 100;
		while(countThree >=0){
			System.out.println(countThree);
			countThree -= 5 ;
		}
		
		for(int i = 0; i <= 10; i++){
			System.out.println(i);
		}
		
		for (int i =0; i <= 10; i+= 2){
			System.out.println(i);
		}
	
		
		for (int i = 0; i <=30; i+=3){
			System.out.println(i);
			if(i == 15){
				System.out.println("midpoint");
			} else {
				System.out.println(" ");
		}
		}
		
		for(int i = 0; i <=100; i+=7){
			System.out.println(i);
			if(i == 28 || i == 49){
				continue;
			}
			System.out.println(i);
		}	
			
		for(int i = 0; i <=100; i+=7){
			if(i != 28 && i != 49){
				System.out.println(i);
			}
		}
			
	
	
		//Count from 1 -10.
		//Console: The number is (number).
		//Console: If it's five, print "I'm Alive."
		
		for(int i = 0; i<=10; i+=1){
		if(i == 5){
			System.out.println(" I'm Alive.");
		}else{
			System.out.println("The number is "+i);
		}	
	}
		//FizzBuzz Example
		
		for(int i = 0; i<=100; i+=1){
		if (((i % 5) == 0) && ((i % 7) == 0))
		System.out.println("Fizzbuzz");
		else if ((i % 5) == 0) System.out.print("fizz");
    	 else if ((i % 7) == 0) System.out.print("buzz"); 
    	 else System.out.print(i);                        
    	 System.out.print(" ");
		
		}	
			System.out.println();
		
		
		
		
	}
		
}


