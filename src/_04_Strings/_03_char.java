package _04_Strings;

public class _03_char {
		public static void main(String[] args) {
			//Unicode (Copyright sign or theta sign) look up numbers that work
			char uniChar = '\u00A5';
			System.out.println(uniChar);
			
			char[] charArray = {'a','b','c','d'};
			System.out.println(charArray);
			
			//Find a different unicode and assign to a new variable
			//Print it Out
			//Create a new character array and print it out
			
			uniChar='\u00A9';
			System.out.println(uniChar);
			
			char[] charName = {'j','o','h','n'};
			System.out.println(charName);
			
			//Air Quotes
			
			System.out.println("Hello \"Tough Guy\", How are you?");
			System.out.println("John Turner");
			System.out.println("John \nTurner");
			//Double forward slash when putting slashes in the functions so it knows
			//not to use them
			System.out.println("c:\\desktop\\user\\texthello.txt");
			
			System.out.println("hello I just entered a b\baskspace in the sting");
			
			
			
		}
}
