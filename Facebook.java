package week3.day3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		//load the URL 
		driver.get("https://en-gb.facebook.com/");
		//maximize the window
		driver.manage().window().maximize();
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on create new account button
		WebElement createNewAccount = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
		createNewAccount.click();
		//enter the first name
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Udayalakshmi");
		//enter the last name
		WebElement surname = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		surname.sendKeys("Sivakumar");
		//enter the mobile number
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobileNumber.sendKeys("9790253590");
		//enter the password
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("abc@123");
		//enter the date of birth using dropdown
		WebElement birthdayDay = driver.findElement(By.name("birthday_day"));
		Select birthDay = new Select(birthdayDay);
		birthDay.selectByIndex(0);
		WebElement birthdayMonth = driver.findElement(By.name("birthday_month"));
		Select birthDayMonth = new Select (birthdayMonth);
		birthDayMonth.selectByValue("5");
		WebElement birthdayYear = driver.findElement(By.name("birthday_year"));
		Select birthDayYear = new Select(birthdayYear);
		birthDayYear.selectByVisibleText("2000");
		//select the radio button
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='1']"));
		radioButton.click();
		
		Thread.sleep(3000);
		driver.quit();		
	
		           
		            

	}

}
