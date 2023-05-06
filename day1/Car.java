package week1.day1;

public class Car {
	
	public void openTheCarDoor() {
		System.out.println("openTheCarDoor");
	}
	public void putSeatBelt() {
		System.out.println("putSeatBelt");
	}
	public void checkMirrorPosition() {
		System.out.println("checkMirrorPosition");
	}
	public void startTheCar() {
		System.out.println("startTheCar");
	}
	public void removeHandBreak() {
		System.out.println("removeHandBreak");
	}
	public void applyBreak() {
		System.out.println("applyBreak");
	}
	
	
	public static void main(String[] args) {
		Car punch=new Car();
		punch.openTheCarDoor();
		punch.putSeatBelt();
		punch.checkMirrorPosition();
		punch.startTheCar();
		punch.removeHandBreak();
		punch.applyBreak();
		
			
	}

}
