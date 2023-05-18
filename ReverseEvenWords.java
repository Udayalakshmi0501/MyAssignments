package week2.day4;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
          // declare the input for the below string
		String text = "I am a Software Tester";
		//output =  I ma a erawtfoS Tester
		//Split the above words in a string text and place it in array form
		String[] split = text.split(" ");
		
		//iterate using for loop
		for (int i = 0; i < split.length; i++) {
			
			//find the odd index words within the loop using if statement
			if(i%2!=0) {
				
				//split the words in the string to character
				char[] charArray = split[i].toCharArray();
				//iterate the words using reverse for loop
				for (int j = charArray.length-1; j >=0; j--) {
					//print the woeds in j
					System.out.print(charArray[j]);
					
				 }
			}
				
				else {
		                // Print the text as it is
		                System.out.print(split[i]);
		            }

		            // call the statement and make sure that we add a space at the end of each word 
		            System.out.print(" ");
					
				}
				
				
				
				
				
			}
			
		}

	


