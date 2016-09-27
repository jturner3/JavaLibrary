package _07_conditionals;

public class _02_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isFreezingColdInHere = false;
		String message;
		if (isFreezingColdInHere){
			message = "Please turn on the heat. Please!";
		}else{
			message = "It's not too bad in the room";
		}
		System.out.println(message);
		
		boolean passwordCheck = true;
		String alert;
		if(passwordCheck){
			alert = "Password is correct and valid.";
		}else {
			alert = "Password is incorrect. Try again";
		}
		System.out.println(alert);
	}

}
