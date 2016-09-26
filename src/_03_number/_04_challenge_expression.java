package _03_number;

public class _04_challenge_expression {
	public static void main(String[] args) {
		//John goes shopping for a new car with the following balance:
		double bankBalance = 50000;
		
		//I buy a car with tint & rims
		
		double car = 40000;
		double tint = 400;
		double rims = 4500;
		
		//Total damage is calculated;
		
		double newCarBill = car + tint + rims;
		
		//What is the new total?
		//Show how to concatenate here!!!:
		System.out.println("Car Bill: " + newCarBill);
		
		//The bank balance is calculated.
		
		double afterCarShopBalance = bankBalance - newCarBill;
		System.out.println("Bank Balance:" + afterCarShopBalance);
		
		//Stress the importance of changing this value
		//Changed the value after doing the car shopping so the new balance
		//is the amount of money after car shopping
		bankBalance = afterCarShopBalance;
		
		//It's payday
		bankBalance = bankBalance + 10000;
		
		//Also got a tax reimbursement
		bankBalance += 50;
		System.out.println("Balance after reimbursement: " + bankBalance);
		
		//The bank balance has a new value now and it has been changing since
		//i've been adding more values to the balance
		
		//A year later my "wife" says she's unhappy and wants to split
		bankBalance = bankBalance /2;
		System.out.println("Bank Balance after divorce: " + bankBalance);
		
		//A mysterious wanderer comes and multiplies his bank balance by 5
		bankBalance = bankBalance * 5;
		System.out.println("After financial miracle: " + bankBalance);
		
		//The ex-wife comes back and wants the other 9 cars by 4 and give him the 
		//remaining car
		
		int otherCars = 9;
		otherCars = otherCars % 4;
		
		System.out.println("Other Cars:" + otherCars);
	
		
	
		
		
	}
}
