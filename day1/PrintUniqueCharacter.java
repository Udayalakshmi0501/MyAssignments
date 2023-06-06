package week5.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		//declare the input
		String name = "Udayalakshmi";
		//convert the string into CharArray
		char[] charArray = name.toCharArray();
		//create  a new set in hashset
		Set<Character> uniqueCharacter = new HashSet<Character>();
		//create a new set in linkedhashset for the insertion order
		Set<Character> uniqueCharacter1 = new LinkedHashSet<Character>();
		//add each characters to the set 
	    for (int i = 0; i < charArray.length; i++) {
			uniqueCharacter.add(charArray[i]);
		}
		System.out.println(uniqueCharacter);
		//add each characters to the set for linked hashset
		for (int j = 0; j < charArray.length; j++) {
			uniqueCharacter1.add(charArray[j]);	
		}
	    System.out.println(uniqueCharacter1);
		
		

	}

}
