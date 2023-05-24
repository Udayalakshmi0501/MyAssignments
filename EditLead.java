package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {

		
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
        //click findLeads field
        WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
        findLeads.click();
        //Enter first name
        WebElement firstName = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
        firstName.sendKeys("Udayalakshmi");
        //Click Find leads button
        WebElement findleadsbutton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        findleadsbutton.click();
        //click on first resulting lead
        WebElement firstResultingLead = driver.findElement(By.xpath("//a[text()='15143']"));
        firstResultingLead.click();
        //Verify title of the page
        String title = driver.getTitle();
        System.out.println("Page Title = " +title);
        //click edit
        WebElement editButton = driver.findElement(By.linkText("Edit"));
        editButton.click();
        //Change the company name
        WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
        companyName.sendKeys("testleaf");
        //Click Update
        WebElement update = driver.findElement(By.name("submitButton"));
        update.click();
        // Confirm the changed name appears
        WebElement companyNameWithId = driver.findElement(By.id("viewLead_companyName_sp"));
	    String leadId = companyNameWithId.getText();
	    System.out.println("Lead Id =" +leadId);
	    
	    
	    if(leadId.contains("testleaf")) {
	    	System.out.println("The company name is verified");
	    }else {
	    	System.out.println("The company name is not verified");
	    }
	    
	    //close the browser
	    driver.close();
        


	}

}
