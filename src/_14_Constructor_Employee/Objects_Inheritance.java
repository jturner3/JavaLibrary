package _14_Constructor_Employee;

public class Objects_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee jen = new Employee ("Jenn", 1000000, 1980, 2015, "Talk", "Disc assessment");
		
		Manager e200 = new Manager ("Sydney", 1000000, 1996, 2016, "Java", "Overwatch people");
		
		Supervisor jigga = new Supervisor ("jigga", 200000, 2002, 1994, "CSS", "HOVAAAAAA!");
		System.out.println(jigga.department);
		System.out.println(e200.department);
		System.out.println(jigga.job);
	}

}
