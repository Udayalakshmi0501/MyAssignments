package week4.day2;

public class AxisBank extends Bankinfo {
	
	public void deposit() {
		System.out.println("Deposit is the amount of money used as security for delivery of goods");
	}


	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
		

	}

}
