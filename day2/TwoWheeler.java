package week1.day2;

public class TwoWheeler {
	
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=2451L;
	boolean isPunctured=true;
	String bikeName="Hero Honda";
	double runningKM=1057.5D;
	

	public static void main(String[] args) {
	
		TwoWheeler honda=new TwoWheeler();
	    System.out.println(honda.noOfWheels);
		System.out.println(honda.noOfMirrors);
		System.out.println(honda.chassisNumber);
		System.out.println(honda.isPunctured);
		System.out.println(honda.bikeName);
		System.out.println(honda.runningKM);
		
	}

}
