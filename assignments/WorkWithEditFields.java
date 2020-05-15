package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithEditFields {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting up driver and browser property
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//Launch application URL:	
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		// Maximize window
		Options manage = driver.manage();
		
		Window window = manage.window();
		
		window.maximize();
		
		
		//Enter your email address		
		driver.findElementById("email").sendKeys("test@gmail.com");
		
		
		//Append a text and press keyboard tab		
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		 
		Thread.sleep(200);
		
		
		//Get default text entered
		
		String attribute = driver.findElement(By.name("username")).getAttribute("value");
		
		System.out.println(attribute);
		
		Thread.sleep(200);
		
		
		//Clear the text
		WebElement clearText = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		
		clearText.clear();
		
		Thread.sleep(200);
		
		
		//Confirm that edit field is disabled		
		 WebElement editField = driver.findElementByXPath("(//div[@class='large-6 small-12 columns']/input)[5]");
		
		if (editField.isEnabled()) 
			System.out.println("edit field is enabled");
		else 
			System.out.println("edit field is disabled");
		
		//close the browser
		driver.close();
		
	}	
	
}
