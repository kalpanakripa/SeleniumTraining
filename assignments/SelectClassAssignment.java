package week2.day1.assignments;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
		
		//navigate to URL
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		//maximize screen
		
		Options manage = driver.manage();
		
		Window window = manage.window();
		
		window.maximize();
		
		
		//Enter User name
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		
		//Enter Password
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		
		//Click Login Button
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		//Click Lead
		
		driver.findElementByLinkText("Leads").click();
		
		
		//Click Create Lead
		
		driver.findElementByLinkText("Create Lead").click();
		
		
		//Enter Company name 
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		
		
		// Enter First Name
		
		driver.findElementById("createLeadForm_firstName").sendKeys("kalpana");
		
		
		//Enter Last Name
		
		driver.findElementById("createLeadForm_lastName").sendKeys("vasudevan");
		
		
		
		//Select Employee in Source Using SelectbyVisible text
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dropdown1 = new Select(source);
		
		dropdown1.selectByVisibleText("Employee");
		
		
		// Select value as Pay Per Click Advertising in MarketingCampaign
		
		WebElement campaignid = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select dropdown2 = new Select(campaignid);
		
		dropdown2.selectByValue("9001");
		
		
		//Select value as Corporation in OwnerShip field
		
		WebElement ownershipid = driver.findElementById("createLeadForm_ownershipEnumId");
		
		Select dropdown3= new Select(ownershipid);
		
		dropdown3.selectByIndex(5);
		
		Thread.sleep(200);
		
		//Select country value as 'india'
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		
		Select dropdown4 = new Select(country);
		
		dropdown4.selectByVisibleText("India");
		
		
		//Click Create Lead Button
		
		driver.findElementByClassName("smallSubmit").click();
		
		
		// Get the title of resulting page
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//Close the browser
		driver.close();
	}

}
