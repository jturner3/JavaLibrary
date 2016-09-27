package _08_DataCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	ArrayList<String> names = new ArrayList<String>();
	
	names.add("John");
	names.add("Stephen");
	names.add("Rhino");
	names.add("Puff");
	names.addAll(Arrays.asList("Sydney", "John", "DEEz"));
	System.out.println(names);
	
	
	//Create an Array list of integers and some numbers to it
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	numbers.add(5);
	numbers.add(8);
	numbers.add(3);
	numbers.addAll(Arrays.asList(5,690,88));
	
	System.out.println(numbers);
	
	//Create and Array list of Doubles and add some doubles to it
	//Print out each one on a different line
	
	ArrayList<Double> dubNums = new ArrayList <Double>();
	dubNums.addAll(Arrays.asList(5.43,5.3,2.3));
	System.out.println(dubNums);
	System.out.println(dubNums.get(1));
	System.out.println(dubNums.get(2));
	
	
	
	
	
	
	
		
		
	}

}
