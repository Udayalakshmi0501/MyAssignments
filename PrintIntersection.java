package week2.day3;

public class PrintIntersection {

	public static void main(String[] args) {
		//declare array for {3,2,11,4,6,7}
		int [] arr1 = {3,2,11,4,6,7};	
		
		// Declare another array for {1,2,8,4,9,7};
		int [] arr2 = {1,2,8,4,9,7};
		//iterate the values 0 to arr1.length using FOR loop
		for (int i = 0; i < arr1.length; i++) {
			////iterate the values 0 to arr2.length using NESTED FOR loop for another set of arrays
			for (int j = 0; j < arr2.length; j++) {
				//check whether the condition satisfies IF condition
				if(arr1[i]==arr2[j]) {
					//print the output
					System.out.println(arr1[i]);
				}
				
			}
			
		}

	}

}
