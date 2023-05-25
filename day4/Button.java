package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Click and Confirm title
		WebElement title = driver.findElement(By.id("j_idt88:j_idt90"));
		title.click();
		
		driver.get("http://www.leafground.com/button.xhtml");
		
		//Confirm if the button is disabled.
		boolean button = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.out.println(button);
		
		//Find the position of the Submit button
		WebElement submitButton = driver.findElement(By.id("j_idt88:j_idt94"));
		Point originalLocation = submitButton.getLocation();
		System.out.println(originalLocation);
		
		//find the height and width of the button
		Dimension size = driver.findElement(By.id("j_idt88:j_idt98")).getSize();
		System.out.println(size);
		
		//close the browser
		driver.close();
		
		
		
		
		

	}

}
