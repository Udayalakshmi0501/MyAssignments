package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		ChromeDriver browser = new ChromeDriver();
		//EdgeDriver browser = new EdgeDriver();
		//FirefoxDriver browser = new FirefoxDriver();
		//load URL
		browser.get("https://mail.google.com/mail/");
	    //maximize the window
		browser.manage().window().maximize();
		
		//to tell system that after how many milliseconds the window should close
		Thread.sleep(3000);
		//close the window
		browser.close();
		
		
		
		

	}

}
