package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		/* Load url "https://acme-test.uipath.com/login"
		 2. Enter email as "kumar.testleaf@gmail.com"
		 3. Enter Password as "leaf@12"
		 4. Click login button
		 5. Get the title of the page and print
		 6. Click on Log Out
		 7. Close the browser (use -driver.close())*/
		
		//launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		//load URL
		driver.get("https://acme-test.uipath.com/login");
		//maximize the window
		driver.manage().window().maximize();
		//enter the email id
		WebElement emailID = driver.findElement(By.id("email"));
		emailID.sendKeys("kumar.testleaf@gmail.com");
		//enter the password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("leaf@12");
		//click the login button
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		//get the title of the page and print it
		String homepageTitle = driver.getTitle();
		System.out.println("Homepage Title = " +homepageTitle);
		//click on logout button
		WebElement logout = driver.findElement(By.linkText("Log Out"));
		logout.click();
		//close the browser
		Thread.sleep(3000);
		driver.close();
		
		
		


	}

}
