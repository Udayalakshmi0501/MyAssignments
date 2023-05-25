package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://www.leafground.com/radio.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    
	    //choose the browser
	    WebElement favBrowser = driver.findElement(By.xpath("(//label[text()='Chrome'])[1]"));
	    favBrowser.click();
	    
	    //check which is unselectable
	    driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();
	    String unselected1 = driver.findElement(By.xpath("//label[text()='Chennai']")).getText();
	    String unselected2 = driver.findElement(By.xpath("//label[text()='Bengaluru']")).getText();
	    System.out.println("unselected= "+unselected1+", "+unselected2);
	    
	    //Find the default select radio button
	    WebElement clicked = driver.findElement(By.xpath("//table[@id='j_idt87:console2']//td[3]"));
	    System.out.println(clicked.getText());
	    
	    
	    boolean enabled = clicked.isEnabled();
	    System.out.println(enabled);
	    
	    
	    Thread.sleep(2000);
	    
	    
	    //close the browser
	    driver.close();
	    
	    

	}

}
