package _02_HelloWorld;

import _17_Encapsulation.ColtsPlayers;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ColtsPlayers aCastonzo = new ColtsPlayers();
			aCastonzo.name= "Anthony Castonzo";
			aCastonzo.setNumber(74);
			System.out.println(aCastonzo.getNumber());
			
			ColtsPlayers fGore = new ColtsPlayers();
			fGore.name = "Frank Gore";
			fGore.setNumber(23);
			System.out.println(fGore.getNumber());
			
	}

}
