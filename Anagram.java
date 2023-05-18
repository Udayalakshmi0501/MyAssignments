package week2.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		//declare the input to the first string 
		String text1="stops";
		//declare the nput to the second string
		String text2="potss";
		//check whether the length of the above both strings are same using IF condition
		if(text1.length()==text2.length()){
			//convert the both strings into characters
			
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			
			//Sorting both the arrays( for ascending order)
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			//check whether the both arrays has equal values using boolean statement
			
			boolean equals = charArray1.equals(charArray2);
			
			//check using if and else statements
			
			if (equals) {
                System.out.println("Both strings have the same values.");
            } else {
                System.out.println("Both strings don't have the same values.");
            }
			
			
		}
		

	}

}
