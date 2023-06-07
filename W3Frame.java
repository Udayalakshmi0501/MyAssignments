package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Frame {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it'][1]"));
		tryIt.click();
		Alert clickOk = driver.switchTo().alert();
		clickOk.accept();
		String text = clickOk.getText();
		System.out.println(text);
		clickOk.sendKeys("Udayalakshmi");
		
		

	}

}
