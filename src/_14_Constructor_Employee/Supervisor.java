package _14_Constructor_Employee;

public class Supervisor extends Employee {
	
	public String department;
	
	Supervisor(String name, double salary, int startYear, int birthYear, String department, String job) {
		super(name, salary, startYear, birthYear, department, job);
		this.department = department;
	
	}

}
