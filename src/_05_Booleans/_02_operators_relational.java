package _05_Booleans;

public class _02_operators_relational {
	public static void main(String[] args) {
		/* Relational Operators
		 * >
		 * <
		 * >=
		 * <=
		 * ==
		 * ===
		 */
		
		//TODO - create an int called currBalance and assign it a value
		//use an if statement to check if that balance is greater than zero
		//Use different relational operators to print diffrent statments
		
		int currBalance = 3500;
		
		if(currBalance >= 0) {
			System.out.println("Thank god I have some money!");	
		} 
		if(currBalance >= 2000) {
			System.out.println("Your on your way bigFella!");
		}
		else {
			System.out.println("Go and get some money!");
		}
		
		//TODO - create a password string and check it
		
		int bankPin = 2056;
		if(bankPin ==2016) {
			System.out.println(bankPin);
		}
		else {
			System.out.println("Wrong Pin Buddy!");
		}
		
		//Check this out
		
		String password = "Irish31";
		if(password.equals("Irish31")){
			System.out.println("Correct Password!!");
		} else {
			System.out.println("Something went wrong with login");
		}
		
		
		
	
		
		
		
		
		
		
	}
}
