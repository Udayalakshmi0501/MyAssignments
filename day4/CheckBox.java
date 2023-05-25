package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://www.leafground.com/checkbox.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    //click basic checkbox
	    WebElement checkBox = driver.findElement(By.className("ui-chkbox-label"));
	    checkBox.click();
	    
	    //click notification box
	    WebElement notification = driver.findElement(By.xpath("//span[text()='Ajax']"));
	    notification.click();
	    
	    //choose ur fav language
	    WebElement favLanguage1 = driver.findElement(By.xpath("//label[text()='Java']"));
	    favLanguage1.click();
	    WebElement favLanguage2 = driver.findElement(By.xpath("//label[text()='Others']"));
	    favLanguage2.click();
	    
	    //choose tristate checkbox
	    WebElement triState = driver.findElement(By.id("j_idt87:ajaxTriState"));
	    triState.click();
	    WebElement triStateCheckBox = driver.findElement(By.id("j_idt87:ajaxTriState"));
	    triStateCheckBox.click();
	    
	    //click toggle switch
	    WebElement toggleSwitch = driver.findElement(By.className("ui-toggleswitch-slider"));
	    toggleSwitch.click();
	    
	    //Verify if check box is disabled or not
	    boolean checkbox = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']/div[1]/input")).isEnabled();
	    System.out.println(checkbox);
	    
	    //select multiple
	    WebElement multiple = driver.findElement(By.xpath("//ul[@data-label='Cities']"));
	    multiple.click();
	    WebElement paris = driver.findElement(By.xpath("(//label[text()='Paris'])[2]"));
	    paris.click();
	    WebElement london = driver.findElement(By.xpath("(//label[text()='London'])[2]"));
	    london.click();
	    
	    
	   Thread.sleep(2000);
	   
	   //close the browser
	   driver.close();
	   
	    
	    
	    


	}

}
