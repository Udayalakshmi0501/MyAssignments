package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
	
		//declare the chromeDriver
		ChromeDriver driver = new ChromeDriver();
		//load URL
		driver.get("https://www.leafground.com/alert.xhtml");
		//maximize the windows
		driver.manage().window().maximize();
		//find the element using locators and click it
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		//control the move to an alert
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		//accept the alert
		simpleAlert.accept();
		//click the confirm alert button using locator
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//control the move to an alert
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		//dismiss the alert
		confirmAlert.dismiss();
		//click the prompt alert button
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//control the move to an alert
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		//get the text
		String text = promptAlert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		//enter the values in the given text
		promptAlert.sendKeys("TestLeaf");
		promptAlert.accept();
		//click the sweet alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		//Alert sweetAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		//click the sweet modal dialog
		WebElement sweetModalDialog = driver.findElement(By.xpath("(//span[text()='Show'])[4]"));
		sweetModalDialog.click();
		//get the text of an alert
		String text2 = sweetModalDialog.getText();
		//print the text we get
		System.out.println(text2);
		//check whether the text we get from the webpage is same as which is present in webpage using if condition
		if(text2.equals("Unless you close this, you cannot interact with other element. But am inspectable !") ){
			System.out.println("Yes,it is verified");	
		}else {
			System.out.println("No, it is not verified");
		}
		Thread.sleep(3000);
		//close the alert
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		//click the sweet Alert COnfirmation button
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt106']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		//click minimize and maximize button
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt111']")).click();
		//check whether the button maximixe is working fine or not
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
		Thread.sleep(3000);
		//close the maximize page
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[3]")).click();
		Thread.sleep(3000);
		//close the page
		driver.close();
		
		
	}

}
