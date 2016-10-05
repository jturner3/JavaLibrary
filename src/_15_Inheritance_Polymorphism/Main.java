package _15_Inheritance_Polymorphism;

import _17_Encapsulation.PatriotsPlayers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal george = new Animal();
		george.name = "George the Animal";
		george.printName();
		
		
		
		Bear barney = new Bear ();
		barney.name = "Barney";
		barney.isHibernating = true;
		barney.printName();
		barney.habitat = "Woods";
		barney.printHabitat();
		
		Kangaroo jack = new Kangaroo();
		jack.name = "Jack";
		jack.isJumping = true;
		jack.printName();
		jack.habitat = "Outback";
		jack.printHabitat();
		
		Mouse mickey = new Mouse();
		mickey.habitat = "Hole in wall";
		
		barney.speak();
		jack.speak();
		
		jack.printFood();
		barney.printFood();
		mickey.printFood();
		
		PatriotsPlayers lBlount = new PatriotsPlayers();
		lBlount.name = "Legaratte Blount";
		lBlount.isACheater = true;
		
		
	}

}
