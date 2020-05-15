package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting up driver and browser properties:
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//Creating object for ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the screen
		driver.manage().window().maximize();
				
		//Enter the username
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		//Enter the password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();
		
		Thread.sleep(500);
		
		//Click Leads link
		driver.findElementByLinkText("Leads").click();
		
		//Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		
		Thread.sleep(1000);
		
		//Click on Phone Tab
		driver.findElementByXPath("//span[text()='Phone']").click();
		
		//Enter phone number 99
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		
		//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);
		
		//Capture lead ID of First Resulting lead
		String firstLeadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		
		System.out.println("First resulting Lead ID is:"+firstLeadID);
		
		//Click First Resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		Thread.sleep(2000);
		
		//Click Delete Button
		
		driver.findElementByXPath("//a[text()='Delete']").click();
		
		Thread.sleep(1000);
		
		//CLick Find Leads Link
		driver.findElementByLinkText("Find Leads").click();
		
		//Enter captured lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys(firstLeadID);
		
		//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(500);
		
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String expectedMessage = "No records to display";
				
		String actualMessage = driver.findElementByXPath("//div[text()='No records to display']").getText();
		
		//System.out.println(actualMessage);
		
		if (actualMessage.equals(expectedMessage)) {
			System.out.println("Lead ID "+firstLeadID+" is deleted successfully");
			
		} else {
			System.out.println("Lead ID "+firstLeadID+" is not deleted");
		}
		
		
		//Close the browser (Do not log out)
		driver.close();
		
	}

}
