package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();                                          // launch browser
		driver.manage().window().maximize();                                               //maximize the window
		driver.get("http://leaftaps.com/opentaps/control/login");                          //load the URL
		WebElement username = driver.findElement(By.id("username"));                       //locate the username field
		username.sendKeys("DemoSalesManager");                                             //provide the input as given
		WebElement password = driver.findElement(By.id("password"));                       //locate the password field
		password.sendKeys("crmsfa");                                                       //provide the password as given
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));     //click on login button
		loginButton.click();
		String welcomePageTitle = driver.getTitle();                                        //get welcomepage title
	    System.out.println("Welcome Page Title = "  +welcomePageTitle);                     //call out the welcomepage title
	    WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));                     //click on the crmsfa
	    crmsfa.click();
	    String homePageTitle = driver.getTitle();                                           //get homepage title
	    System.out.println("Home Page Title = "  +homePageTitle);                          //call out the homepage title
	    WebElement leads = driver.findElement(By.linkText("Leads"));                        //click on leads button
	    leads.click();
	    WebElement createLead = driver.findElement(By.linkText("Create Lead"));             //click on create lead 
	    createLead.click();
	    WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));   //locate the companyname field
	    companyName.sendKeys("TestLeaf");                                                   //provide the companyname as given
	    WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));       //locate the firstname field
	    firstName.sendKeys("Udayalakshmi");                                                 //provide the name as given
	    WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));         //locate the lastname field
	    lastName.sendKeys("Sivakumar");                                                     //provide the lastname as given
	    WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));  // locate the firstname(local) field
	    firstNameLocal.sendKeys("Udaya");                                                    //Provide the name as given
	    WebElement departmentName = driver.findElement(By.id("createLeadForm_departmentName"));  //locate the department name field
	    departmentName.sendKeys("Automation Testing");                                                  //provide the department name
	    WebElement descriptionBox = driver.findElement(By.id("createLeadForm_description")); //locate the description field
	    descriptionBox.sendKeys("Automation Testing is used to write and execute the TestScripts with the help of tools" );  // provide the infos to the description
	    WebElement emailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));  //locate the email field
	    emailAddress.sendKeys("udayalakshmi0501@gmail.com");                                 //provide the valid email id to the field
	    WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));       //locate the create lead button
	    createLeadButton.click();                                                            //click the create lead button
	    Thread.sleep(3000);                                                                  ////to tell system that after how many milliseconds the browser should close
	    driver.close();                                                                      //to close the browser
	    
	    
	    
	    
	    
	     
	    
	     
	    
		
		
		
		
		

	}

}
