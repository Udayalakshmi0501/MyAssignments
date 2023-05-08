package week1.day2;

public class Mobile {
	
	String mobileBrandName="Samsung Galaxy A33";
	char mobileLogo='S';
	short noOfMobilePiece=5;
	int modelNumber=33;
	long mobileImeiNumber=351567422655517L;
	float mobilePrice=31999.99F;
	boolean isDamaged=false;
	
	public static void main(String[] args) {
		
		Mobile samsung=new Mobile();
		System.out.println(samsung.mobileBrandName);
		System.out.println(samsung.mobileLogo);
		System.out.println(samsung.noOfMobilePiece);
		System.out.println(samsung.modelNumber);
		System.out.println(samsung.mobileImeiNumber);
		System.out.println(samsung.mobilePrice);
		System.out.println(samsung.isDamaged);
		
	
	}

}
