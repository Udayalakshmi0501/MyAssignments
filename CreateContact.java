package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		
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
		//click on ccontact button
		WebElement contacts = driver.findElement(By.linkText("Contacts"));
		contacts.click();
		//click on create button
		WebElement createContact = driver.findElement(By.linkText("Create Contact"));
		createContact.click();
		//enter the firstname field
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("Udayalakshmi");
		//enter the lastname field
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("Sivakumar");
		//enter the firstname(local)
		WebElement firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstNameLocal.sendKeys("Udaya");
		//enter the lastname(local)
		WebElement lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
		lastNameLocal.sendKeys("Siva");
		//Enter Department Field 
		WebElement departmentName = driver.findElement(By.name("departmentName"));
		departmentName.sendKeys("abcd");
		//Enter Description Field
		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("acfudbklsh  hfuwdn");
		//Enter your email in the E-mail address Field 
		WebElement emailID = driver.findElement(By.id("createContactForm_primaryEmail"));
		emailID.sendKeys("udayalakshmi0501@gmail.com");
		// Select State/Province as NewYork 
		WebElement stateORprovince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateorprovince = new Select (stateORprovince);
		stateorprovince.selectByVisibleText("New York");
		// Click on Create Contact
		WebElement createContactButton = driver.findElement(By.className("smallSubmit"));
		createContactButton.click();
		//click on edit button
		WebElement editButton = driver.findElement(By.linkText("Edit"));
		editButton.click();
		//Clear the Description Field
		WebElement clearDescription = driver.findElement(By.id("updateContactForm_description"));
		clearDescription.clear();
		//Fill ImportantNote Field
		WebElement importantNote = driver.findElement(By.name("importantNote"));
		importantNote.sendKeys("Automation Testing is used to write and execute the TestScripts with the help of tools");
		//Click on update button
		WebElement updateButton = driver.findElement(By.xpath("//input[@value='Update']"));
		updateButton.click();
		//Get the Title of Resulting Page.
		String homePageTitle = driver.getTitle();
		System.out.println("HomePage Title = " +homePageTitle);
		
		
		
		
	}

}
