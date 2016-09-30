package _13_Friends;

public class BasicObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Friends johnsFavoriteFriend = new Friends();
		johnsFavoriteFriend.age = 22;
		johnsFavoriteFriend.occupation = "Student";
		johnsFavoriteFriend.school = "Whatever College LOL";
		johnsFavoriteFriend.grade = 316;
		johnsFavoriteFriend.realFriends = 4;
		johnsFavoriteFriend.numberKids = 0 ;
		
		
		System.out.println(johnsFavoriteFriend.realFriends);
		
		Friends lonely = new Friends();
		lonely.age = 32;
		lonely.getgrade();
		lonely.numYearsFriends= 10;
		
		
		lonely.printYearsFriends();
		
		System.out.println(lonely.numYearsFriends);
		
		System.out.println(johnsFavoriteFriend.grade);
		
	}

}
