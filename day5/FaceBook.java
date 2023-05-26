package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		//load the URL
		driver.get("https://www.facebook.com/");
		//maximize the window
		driver.manage().window().maximize();
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//click on create new account button
		WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createNewAccount.click();
		//enter the first name
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Udayalakshmi");
		//enter surname
		WebElement surName = driver.findElement(By.name("lastname"));
		surName.sendKeys("Sivakumar");
		//enter the mobile number
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobileNumber.sendKeys("1234567890");
		//enter the password
		WebElement passWord = driver.findElement(By.name("reg_passwd__"));
		passWord.sendKeys("adcd@1234");
		//select the birthday day
		WebElement birthdayDay = driver.findElement(By.name("birthday_day"));
		//create SELECT class
		Select birthDayDay = new Select(birthdayDay);
		birthDayDay.selectByValue("1");
		//select the birthday month
		WebElement birthdayMonth = driver.findElement(By.name("birthday_month"));
		Select birthDayMonth = new Select(birthdayMonth);
		birthDayMonth.selectByVisibleText("May");
		//select the birthday year
		WebElement bithdayYear = driver.findElement(By.name("birthday_year"));
		Select birthDayYear = new Select(bithdayYear);
		birthDayYear.selectByIndex(23);
		
		//click on the gender
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		
		Thread.sleep(2000);
		//close the browser
		driver.close();
		
		
		
		

	}

}
