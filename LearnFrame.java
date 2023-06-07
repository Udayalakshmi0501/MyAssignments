package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		
		
		        //declare the chromeDriver
				ChromeDriver driver = new ChromeDriver();
				//load URL
				driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
				//maximize the windows
				driver.manage().window().maximize();
				//control the move to frame
				driver.switchTo().frame(0);
				//click the frame
				WebElement ele = driver.findElement(By.id("Click"));
				ele.click();
				String text = ele.getText();
				System.out.println(text);
				//contro the movement to out of the frame or to the main webpage
				driver.switchTo().defaultContent();
				//control the move of the nested frame
				driver.switchTo().frame(3);
				WebElement nestedFrame = driver.findElement(By.xpath("//button[text()='Click Me']"));
				nestedFrame.click();
				String text2 = nestedFrame.getText();
				System.out.println(text2);
				driver.switchTo().defaultContent();
				Thread.sleep(3000);
				driver.close();

	}

}
