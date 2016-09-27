package _07_conditionals;

public class _05_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int whiteCastlesEaten = 5;
		String response;
		
		switch(whiteCastlesEaten){
			case 0: 
				response = "That's probably smart.";	
				break;
				
			case 5:
				response = "Well, are you feeling good after those 5?";
				break;
			case 10:
				response = "I know you are feeling full buddy!";
				break;
				
			case 20:
				response = "Dead on sight, Heart Attack";
				break;
			default: 
				response = "White Castle is the best";
				break;
				
		}
		System.out.println(response);
	}

}
