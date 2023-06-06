package week5.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		//declare the input
		String text = "We learn java basics as part of java sessions in java week1";
		//split the above text into arrays 
		String[] split = text.split(" ");
		//create the empty set
		Set<String> removeDuplicateWords = new LinkedHashSet<String>();
		//iterate the string array
		for (int i = 0; i < split.length; i++) {
			removeDuplicateWords.add(split[i]);
			
		}
		System.out.println(removeDuplicateWords);
			
		

	}

}
