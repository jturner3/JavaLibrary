package _14_Constructor_Employee;

public class Employee {

	//Properties
	public String name; 
	protected double salary;
	int startYear;
	int birthYear;
	public String job;
	
	//Constructor
	//A constructor is a method that has the same name as the Class itself - it builds
	//our instances or objects of that class type
	
	
	
	Employee(String name, double salary, int startYear, int birthYear, String department, String job){
		this.name = name;
		this.salary = salary;
		this.startYear = startYear;
		this.birthYear = birthYear;
		this.job = job;
		
	}
}
