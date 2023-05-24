package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		/*http://leaftaps.com/opentaps/control/main
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
		*/
		
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
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
        //Click Leads link
		WebElement leadButton = driver.findElement(By.linkText("Leads"));
        leadButton.click();
        //Click Find leads
        WebElement findlead = driver.findElement(By.linkText("Find Leads"));
        findlead.click();
        //Click on Email field
        WebElement email = driver.findElement(By.linkText("Email"));
        email.click();
        //Enter the Email
        WebElement typeEmail = driver.findElement(By.xpath("//input[@name='emailAddress']"));
        typeEmail.sendKeys("udayalakshmi0501@gmail.com");
        //Click find leads button
        WebElement findLeadButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        findLeadButton.click();
        //Capture name of First Resulting lead
        String firstresultinglead = driver.getTitle();
        System.out.println("First Resulting Lead = " +firstresultinglead);
        
        //click firstResultingLead
        WebElement firstResultingLead = driver.findElement(By.xpath("//a[text()='15143']"));
        firstResultingLead.click();
        //click duplicate lead
        WebElement duplicateLead = driver.findElement(By.linkText("Duplicate Lead"));
        duplicateLead.click();
        //Verify the title as 'Duplicate Lead'
        String duplicatelead = driver.getTitle();
        System.out.println("Duplicate Lead = " +duplicatelead);
        if(duplicatelead.contains("Duplicate Lead")) {
        	System.out.println("Yes, It is verified");
        }else {
        	System.out.println("No, It is not verified");
        }
        //Click Create Lead
        WebElement createLeadButton = driver.findElement(By.name("submitButton"));
        createLeadButton.click();
        //Confirm the duplicated lead name is same as captured name
        
        
        
        
        // Close the browser
        driver.close();
        
        
        
        
        
        
        
  
        


	}

}
