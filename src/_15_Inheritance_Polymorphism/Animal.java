package _15_Inheritance_Polymorphism;

public class Animal {

	//Properties
	public int numLegs;
	public int numTeeth;
	public int numEyes;
	public int lifespan;
	
	
	public boolean isWarmBlooded;
	
	public String name;
	public String habitat;
	public String food;
	
	//Methods
	
	public void printName(){
		System.out.println("My name is " + name);
	}
	
	public void printHabitat(){
		System.out.println("Their habitat is: " + habitat);
	}

	public void speak () {
		System.out.println("I am an amnimal");
	}
	
	public void printFood(){
		System.out.println("My favorite food is: " + food);
	}

	
		
	}
	
	
	

