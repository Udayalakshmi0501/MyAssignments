package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://www.leafground.com/select.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	    //select your favorite UI Automation tool
	    WebElement automationTool = driver.findElement(By.xpath("//select[@style='overflow-wrap: break-word; height: 150%;']"));
	    Select UITool = new Select(automationTool);
	    UITool.selectByVisibleText("Selenium");
	    
        //select your preferred country.
	    WebElement countryTextBox = driver.findElement(By.id("j_idt87:country_label"));
	    countryTextBox .click();
	  
	    WebElement preferredCountry = driver.findElement(By.id("j_idt87:country_3"));
	    preferredCountry.click();
	  

	    // Confirm whether the Cities belongs to Country is loaded or not
	    WebElement selectCities = driver.findElement(By.xpath("//label[text()='Select City']"));
	    selectCities.click();
	    WebElement preferredCity = driver.findElement(By.xpath("//li[text()='Chennai']"));
	    preferredCity.click();
	    

	    //Choose the Course to be selected
	    WebElement course = driver.findElement(By.id("j_idt87:auto-complete_input"));
	    course.sendKeys("Selenium WebDriver");
	    WebElement selectedCourse = driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']"));
	    selectedCourse.click();
	    
	    
	    Thread.sleep(3000);
	    
	    //close the browser
	    //driver.close();
	}

}
