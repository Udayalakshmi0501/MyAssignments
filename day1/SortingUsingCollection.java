package week5.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		//Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)
		String[] values = {"Google","Microsoft","Testleaf","Maverick"};
		//get the length of the array
		int len = values.length;
		System.out.println(len);
		//convert the string into list
		List<String> SortingUsingCollection = new ArrayList<String>();
		//sort the array
		Collections.sort(SortingUsingCollection);
		//iterate in the reverse order
		for (int i = values.length-1; i >=0; i--) {
			System.out.println(values[i]);
			
		}
		

	}

}
