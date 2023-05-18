package week2.day4;

import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//declare the input for the below string text
		String text = "We learn java basics as part of java sessions in java week1";
		//intialize the integer variable as count
		int count;
		//Split the String into array
		String[] split = text.split(" ");
		//iterate the values  using FOR loop
		for (int i = 0; i < split.length; i++) {
			
			//give the value to the count as 1
			count=1;
			//check whether the text is not equal to zero
			if(split[i]!= "0") {
				//iterate another loop to check the duplicate words
				for (int j = i+1; j < split.length; j++) {
					//check whether the first loop is equal to second loop condition
					if(split[i].equals(split[j])) {
						//if the condition satsfies add the variable in the count by 1
						count++;
						//replace the splt[j] as ""
						split[j]=" ";
						
					}
				}
			}
			//check whether what are  the counts are greater than 1
			if(count>1) 
				//counts which are all geater than 1 represent them in ""
				split[i]="";
			//call the output which is displaying the text without duplicate words
			System.out.print(split[i] +" ");
			
				
		}
			
			
		}
		

	}


