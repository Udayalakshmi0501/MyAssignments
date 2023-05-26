package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

	public static void main(String[] args) throws InterruptedException {
		
		//to open chrome driver
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("https://www.tamilmatrimony.in/");
		//maximize the browser
		driver.manage().window().maximize();
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//select the matrimony profile
		WebElement selectProfile = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
		Select selectprofile=new Select(selectProfile);
		selectprofile.selectByVisibleText("Myself");
		//enter the name
		WebElement name = driver.findElement(By.xpath("(//input[@class='hp-regform-txtfield'])[1]"));
		name.sendKeys("Udayalakshmi");
		//click on gender
		WebElement gender = driver.findElement(By.xpath("//input[@id='genderfemale']"));
		gender.click();
		//select your date of birth
		WebElement birthdayDay = driver.findElement(By.xpath("//select[@name='DOBDAY']"));
		Select birthDayDay = new Select (birthdayDay);
		birthDayDay.selectByValue("1");
		WebElement birthdayMonth = driver.findElement(By.xpath("//select[@name='DOBMONTH']"));
		Select bithDayMonth= new Select(birthdayMonth);
		bithDayMonth.selectByIndex(5);
		WebElement birthdayYear = driver.findElement(By.xpath("//select[@name='DOBYEAR']"));
		Select birthDayYear = new Select(birthdayYear);
		birthDayYear.selectByVisibleText("2000");
		
		//select your religion
		WebElement religion = driver.findElement(By.xpath("(//select[@name='RELIGION'])[1]"));
		Select choosereligion = new Select(religion);
		choosereligion.selectByValue("1");
		
		//select your mothertongue
		WebElement mothertongue = driver.findElement(By.xpath("//select[@name='MOTHERTONGUE']"));
		Select motherTongue = new Select(mothertongue);
		motherTongue.selectByValue("47");
		
		//select your country
		WebElement country = driver.findElement(By.xpath("//select[@name='COUNTRY']"));
		Select choseCountry = new Select (country);
		choseCountry.selectByVisibleText("India");
		
		//enter the mobile no
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='MOBILENO']"));
		mobileNumber.sendKeys("1234567890");
		
		//enter the email id
		WebElement emailId = driver.findElement(By.xpath("//input[@id='EMAIL']"));
		emailId.sendKeys("udaya0501@gmail.com");
		
		Thread.sleep(3000);
		
		//close the browser
		//driver.close();
		
		
		
		
		
		

	}

}
