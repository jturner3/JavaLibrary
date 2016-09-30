package _13_Friends;

public class Friends {

	String name;
	int grade;
	int age;
	int realFriends;
	String school;
	String occupation;
	int numberKids;
	boolean relationship;
	int numYearsFriends;
	String response;
	boolean isOnline;
	
	public void getgrade(){
		System.out.println(grade);
	}
	
	public void onlineCheck(){
		if(isOnline){
			System.out.println(name + " is online ");
		} else {
			System.out.println(name + " is not online ");
			}
	}
	
			//Switch Function 
	
		
	public void printYearsFriends(){
		switch(numYearsFriends){
		case 5:
			response = "You have been friends with " + name + "for " + numYearsFriends + " years";
			break;
		case 10:
			response = "You have been friends with " + name + "for " + numYearsFriends + " years";
			break;
		case 20:
			response = "You have been friends with " + name + "for " + numYearsFriends + " years";
			break;
		}
		System.out.println(response);
		System.out.println(isOnline);
		
		
		
		
	}
}
