
public class _03_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of the best comedians of all time. 
		String[] comedians = {"John Turner","Katt Williams","Kevin Hart"};
		
		for(String comedian : comedians){
			System.out.println(comedian);
		}
		
		String [] greatestBossesOfAllTime = {"Jenn Aikins", "Bob Alcorn", "Robin Holer"};
		for(String boss : greatestBossesOfAllTime){
			System.out.println(boss);
		}
	
		//Converts the string into characters on different lines
		String s = "Hello";
		for(char ch : s.toCharArray()){
			System.out.println(ch);
		}
		
		
		
		
	}

}
