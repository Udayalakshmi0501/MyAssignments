package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		/*
		11	Capture lead ID of First Resulting lead
	
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
*/

		
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the window
		driver.manage().window().maximize();
		//locate the username field and the provide the input
		WebElement username = driver.findElement(By.id("username")); 
		username.sendKeys("DemoSalesManager");  
		//locate the password field and provide thw password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");    
		//click on login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));     
		loginButton.click();
		//click on the crmsfa
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));                     
		crmsfa.click();
		//click lead button
		WebElement leadsButton = driver.findElement(By.linkText("Leads"));
		leadsButton.click();
		//click find leads button
		WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
		findLeads.click();
		//click on phone
		WebElement phoneButton = driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]"));
		phoneButton.click();
		//enter phone number
		WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
		phoneNumber.sendKeys("1234567890");
		//Click find leads button
		WebElement findLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadsButton.click();
		//Capture lead ID of First Resulting lead
		
		
		//click first resulting lead
		WebElement firstResultingLead = driver.findElement(By.linkText("11761"));
		firstResultingLead.click();
		//click delete
		//WebElement delete = driver.findElement(By.linkText("Delete"));
		//delete.click();
		//Click Find leads
		WebElement findleadsButton = driver.findElement(By.linkText("Find Leads"));
		findleadsButton.click();
		Thread.sleep(3000);
		//Enter captured lead ID
		
		
		
		//Click find leads button
		
		
		
		
		
		
		
		
		
		
		
	}

}
