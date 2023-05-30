package week4.day2;

public class Desktop extends Computer {
	public void desktopSize(){
		System.out.println("Most of the desktop screen size ranges from 19 to 34 inches");
	}

	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();

	}

}
