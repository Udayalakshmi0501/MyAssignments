package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
	   
		        //declare the input
				int[] number = {3,2,11,4,6,7,2,3,3,6,7};
				//create an empty set using TreeSet
				Set<Integer> secondLargest = new TreeSet<Integer>();
				//Declare for loop iterator from 0 to number.length and add into Set 
				for (int i = 0; i < number.length; i++) {
					secondLargest.add(number[i]);
					}
				//convert set into list
				List<Integer> secondLargestNumber=new ArrayList<Integer>(secondLargest);
				//print the second largest number from list
				int size = secondLargestNumber.size();
				System.out.println(size);
				//for (int i = 0; i < secondLargestNumber.size(); i++) {
				System.out.println(secondLargestNumber.get(secondLargestNumber.size()-2));
					
				//}

				

	}

}
