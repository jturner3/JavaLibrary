package _14_Constructor_Employee;

public class Janitor extends Employee {
	
	public String department;
	
	Janitor(String name, double salary, int startYear, int birthYear, String department, String job) {
		super(name, salary, startYear, birthYear, department, job);
		this.department = department;
		this.job = job;
	}
		
}
