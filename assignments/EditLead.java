package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting up browser and driver property
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
			ChromeDriver driver = new ChromeDriver();
		
		
		//Launch application URL
			
			driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize window
			
			driver.manage().window().maximize();
			
		// Enter user name
			
			driver.findElementById("username").sendKeys("Demosalesmanager");
		
		//Enter Password
			
			driver.findElementById("password").sendKeys("crmsfa");
			
		//Click Login Button
			driver.findElementByClassName("decorativeSubmit").click();
		
			
		//Click CRM/SFA Link
			driver.findElementByLinkText("CRM/SFA").click();
		
		Thread.sleep(500);
		
		//Click Leads link
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		Thread.sleep(1000);
		
		//Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("kalpana");
		
		//	Click Find leads button
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//provide wait time to load search results
		Thread.sleep(1000);
		
		//Click on first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		//Verify title of the page
		String pageTitle = driver.getTitle();
		
		if (pageTitle.contains("View Lead")) {
			
			System.out.println("Navigated to View Lead Page successfully");
		}
		
		//Click Edit
		driver.findElementByXPath("//a[text()='Edit']").click();
		
		//Change the company name
		
		String expectedCompanyName="Cognizant";
		
		WebElement companyName = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
		
			//Clear the company name
			companyName.clear();
			
			//change company name
			companyName.sendKeys(expectedCompanyName);
		
		
		//Click Update
		driver.findElementByXPath("//input[@value='Update']").click();
		
		Thread.sleep(1000);
		
		//Confirm the changed name appears
		
		String updatedCompanyName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		
		
		if (updatedCompanyName.contains(expectedCompanyName))
			System.out.println("Company Name updated as expected and Updated company name is:"+expectedCompanyName);
		else
			System.out.println("Company Name not updated as expected "+"Actual company name displayed is: "+updatedCompanyName+" Expected company name is: "+expectedCompanyName);
		
		//Close the browser (Do not log out)		
		driver.close();
	}

}
