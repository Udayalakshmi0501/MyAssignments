package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccounts {

	public static void main(String[] args) throws InterruptedException {
		
		/* 1. Login to https://login.salesforce.com 
	    2.Click on toggle menu button from the left corner
	    3. Click view All and click Sales from App Launcher
	    4. Click on Accounts tab 
	    5. Click on New button 
	    6.Enter 'your name' as account name 
	    7. Select Ownership as Public
	    8. Click save and verify Account name "
*/
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//login to salesforce application
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'AppLauncherHeader')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//span[text()='Accounts']"));
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']")).sendKeys("Udayalakshmi");
		
		
		

	}

}
