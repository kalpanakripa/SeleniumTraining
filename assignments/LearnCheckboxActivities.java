package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCheckboxActivities {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting up driver and browser property
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		
		//Launch Application URL
		driver.get("http://leafground.com/pages/checkbox.html");				
		Thread.sleep(1000);
		
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Select the languages that you know?
		
			// select java checkbox
			driver.findElementByXPath("//div[text()='Java']/input").click();
		
			// select SQL checkbox
			driver.findElementByXPath("//div[text()='SQL']/input").click();
			
			Thread.sleep(1000);
			
	
		//Confirm Selenium is checked
		
			WebElement seleniumCheckBox = driver.findElementByXPath("//div[text()='Selenium']/input");
		
			if (seleniumCheckBox.isSelected()) 
				System.out.println("Selenium checkbox is selected");
			
			else
				System.out.println("Selenium checkbox is not selected");
		
			Thread.sleep(1000);
			
			
		//DeSelect only checked
			
			WebElement notselectedChkBox = driver.findElementByXPath("//div[text()='Not Selected']/input");
			
			WebElement selectedChkBox = driver.findElementByXPath("//div[text()='I am Selected']/input");
			
			//check whether which check box is selected and deselect the checked one
			if (notselectedChkBox.isSelected()) {
				notselectedChkBox.click();
			} 
			else if (selectedChkBox.isSelected()) {
				
				selectedChkBox.click();
			}
		
			Thread.sleep(1000);
			
			
		 //Select all below checkboxes
					
			List<WebElement> OptionChkBox =driver.findElements(By.xpath("//div[contains(text(),'Option ')]/input"));
											
			int count = OptionChkBox.size();						
			
			//Select all checkboxes
			for (int i = 0; i <count; i++) 
			{
				OptionChkBox.get(i).click();
			}
			
		//Close Browser
			driver.close();
	}

}
