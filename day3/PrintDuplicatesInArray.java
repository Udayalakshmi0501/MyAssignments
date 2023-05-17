package week2.day3;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// Enter the Input array values
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
        // output 14,18,17
		int length = arr.length;
		//print the length of the array
		System.out.println(length);
		
		//iterate the values 0 to arr.length using FOR loop
		for (int i = 0; i < arr.length; i++) {
			
			//iterate the values i+1 to arr.length using NESTED FOR loop
			for (int j = i+1 ; j < arr.length; j++) {
				
				//compare the above both iteractions using If condition
				if(arr[i] == arr[j]) {
					
					//if the above condition satisfies then print the duplicate values
					System.out.println(arr[i]);
				}
			}
			
		
			
		}
	}

}
