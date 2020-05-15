package week2.day2.assignments;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnRadioButtonActivities {

	public static void main(String[] args) {

		// Setting up driver and browser property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Creating driver object for ChromeDriver class
		ChromeDriver driver = new ChromeDriver();

		// Navigate to URL
		driver.navigate().to("http://leafground.com/pages/radio.html");
		
		
		//Are you enjoying the classes?		
		
		WebElement yesRadioButton = driver.findElementByXPath("//input[@id='yes']");
		
		String labelName = driver.findElementByXPath("//input[@class='myradio' and @value='1' and @id='yes']/parent::label").getText();
		
			// check whether the radio button is displayed in screen or not and enabled or not
			if (yesRadioButton.isDisplayed() & yesRadioButton.isEnabled()) {
			 							 
				//check whether the radio button is selected or not			    
				if (yesRadioButton.isSelected())			  			  
					System.out.println(labelName+" Radio button already selected"); 
			    else			  
			    	yesRadioButton.click();
					System.out.println(labelName+" radio button selected successfully");
			}
		
			
		//Find default selected radio button
		
		String radiobuttonName = driver.findElementByXPath("//input[@name='news' and @value='1' ]/parent::label").getText();
		
		System.out.println("Default selected radio button is:"+radiobuttonName);
		
		
		//Select your age group (Only if choice wasn't selected)
		
		WebElement age = driver.findElementByXPath("//input[@name='age' and @value='1']");
		
		if (age.isDisplayed() & age.isEnabled()) {
			
			if (age.isSelected()) 
			{
				System.out.println("age 21 - 40 years radio button is already selected");
			}
			else 
			{
				age.click();
				System.out.println("Age 21-40 years radion button selected successfully");
			}
		}
		
		//close the browser
		driver.close();
	}

}


