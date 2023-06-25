package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateNewDashBoard {

	public static void main(String[] args) throws InterruptedException {
		
		/* 1. Login to https://login.salesforce.com 
	    2.Click on the toggle menu button from the left corner 
	    3. Click View All and click Dashboards from App Launcher
	    4. Click on the New Dashboard option 
	    5.Enter Name as 'Salesforce Automation by Your Name ' and Click on               Create.
	    6.Click on Save and Verify Dashboard name."*/
		
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//p[text()='Dashboards']"));
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("Salesforce Automation by Udayalakshmi");
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		

	}

}
