package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//type your name in the field
		WebElement typeYourName = driver.findElement(By.name("j_idt88:name"));
		typeYourName.sendKeys("Udayalakshmi");
		
		//append the country for the given city
		WebElement appendCountry = driver.findElement(By.id("j_idt88:j_idt91"));
		appendCountry.sendKeys(",India");
		
		//check whether the text box is disabled
		boolean textBoxDisabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println(textBoxDisabled);
		
		//clear the text
		WebElement clearTheText = driver.findElement(By.id("j_idt88:j_idt95"));
		clearTheText.clear();
		
		//retrieve the text
		String retrieveText = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(retrieveText);
		
		//enter the email id and enter tab
		WebElement emailId = driver.findElement(By.id("j_idt88:j_idt99"));
		emailId.sendKeys("udayalakshmi0501@gmail.com");
		emailId.sendKeys(Keys.TAB);
		
		//enter about yourself
		WebElement aboutYourself = driver.findElement(By.id("j_idt88:j_idt101"));
		aboutYourself.sendKeys("I am Udaya from Tirunelveli currently pursuring testing course in TestLeaf");
		
		//type the words in one option of the texteditor
		WebElement italic = driver.findElement(By.className("ql-italic"));
		italic.click();
		WebElement textEditor = driver.findElement(By.className("ql-cursor"));
		textEditor.sendKeys("Assignment");
		Thread.sleep(2000);
		
		//click the enter key and check whether the error msg gets displayed
		WebElement enterKey = driver.findElement(By.id("j_idt106:thisform:age"));
		enterKey.sendKeys(Keys.ENTER);
		boolean ageIsMandatory = driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).isDisplayed();
		System.out.println(ageIsMandatory);
		
		//Click and Confirm Label Position Changes
		WebElement confirmLabelPosition = driver.findElement(By.id("j_idt106:j_idt113"));
		Point originalLocation = confirmLabelPosition.getLocation();
		WebElement findElement = driver.findElement(By.id("j_idt106:float-input"));
		findElement.click();
		Point changedLocation = findElement.getLocation();
		
		if(originalLocation.equals(changedLocation)) {
			System.out.println("Label Position is  not changed");
		}else {
			System.out.println("Label Position is changed");
		}
		
		
		//Type your name and choose the third option
		WebElement typeName = driver.findElement(By.id("j_idt106:auto-complete_input"));
		typeName.sendKeys("Udayalakshmi");
		WebElement chooseThirdOption = driver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']//li[3]"));
		//WebElement chooseThirdOption = driver.findElement(By.className("ui-autocomplete-token-label"));
		chooseThirdOption.click();
		
		//Type your DOB (mm/dd/yyyy) and confirm date chosen
		WebElement dateOfBirth = driver.findElement(By.id("j_idt106:j_idt116_input"));
		dateOfBirth.sendKeys("05/01/2000");
		String dob = driver.findElement(By.linkText("1")).getText();
		if("05/01/2000".contains(dob)) {
			System.out.println("Date chosen is same");
		}
		
		//Type number and spin to confirm value changed
		WebElement enterValue = driver.findElement(By.id("j_idt106:j_idt118_input"));
		enterValue.sendKeys("15");
		WebElement changedValue = driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']//a[1]"));
		changedValue.click();
		String newValue = changedValue.getText();
		if(newValue.equals("15")) {
			System.out.println("The values doesn't changed");
		}else {
			System.out.println("The values changed");
		}
		
		//Type random number (1-100) and confirm slider moves correctly
		
		
		
		//Click and Confirm whether the Keyboard appears
		WebElement textBox = driver.findElement(By.id("j_idt106:j_idt122"));
		textBox.click();
		boolean keyBoard = driver.findElement(By.xpath("(//div[contains(@class,'ui-widget ui-widget-content')])[3]")).isDisplayed();
		System.out.println(keyBoard);
		if(keyBoard==true) {
			System.out.println("Keyboard displayed");
		}
		WebElement textbox = driver.findElement(By.id("j_idt106:j_idt122"));
		textbox.sendKeys("avdhgfmndvj");
		
		
		//Custom Toolbar
		WebElement bold = driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]"));
		bold.click();
		WebElement usingCustomToolBar = driver.findElement(By.className("ql-cursor"));
		usingCustomToolBar.sendKeys("Completed");
		Thread.sleep(3000);
		
		
		//close the browser
		driver.close();
		
		
		

		
		
		
	}

}
