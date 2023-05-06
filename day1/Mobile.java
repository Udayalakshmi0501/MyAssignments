package week1.day1;

public class Mobile {
	
	public void makeACall() {
		System.out.println("makeACall");
	}
	public void takePictures() {
		System.out.println("takePictures");
	}
	public void makePayments() {
		System.out.println("makePayments");
	}
	public void useManyApps() {
		System.out.println("useManyApps");
	}
	public void playGames() {
		System.out.println("playGames");
	}

	public static void main(String[] args) {
		Mobile device=new Mobile();
		device.makeACall();
		device.takePictures();
		device.makePayments();
		device.useManyApps();
		device.playGames();

	}

}
