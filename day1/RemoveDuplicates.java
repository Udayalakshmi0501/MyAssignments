package week5.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
	    //declare the input
		int [ ] number = {1,2,3,4,5,6,7,8,1,2,3};
		//declare the empty set
		Set<Integer> uniqueNumber = new LinkedHashSet<Integer>();
		//iterate the values form IntArray
		for (int i = 0; i < number.length; i++) {
			//add the values in the set
			uniqueNumber.add(number[i]);
			
		}
		//remove the duplicates and print the unique number
		System.out.println(uniqueNumber);

	}

}
