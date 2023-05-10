package week1.day4;

public class Calculator {
	
	public void addTWoNumbers(int a , int b) {
		int c = a+b;
		System.out.println(c);	
	}
	public void subTwoNumbers(int e , int f) {
		int d = e-f;
		System.out.println(d);
	}
	public void multiplyTwoNumbers(double i , double g) {
		double h = i*g;
		System.out.println(h);
	}
	public void divideTwoNumbers(float x , float y) {
		float z=x/y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.addTWoNumbers(25, 68);
		calc.subTwoNumbers(65, 24);
		calc.multiplyTwoNumbers(24569.56, 65569.87);
		calc.divideTwoNumbers(96.23F,32.68F );
		


	}

}
