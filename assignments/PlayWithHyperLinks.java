package week2.day1.assignments;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithHyperLinks {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting up driver and browser property
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		//Launch application URL:		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		Thread.sleep(200);
		
		
		//Go to Home page		
		driver.findElementByLinkText("Go to Home Page").click();
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//img[@src='images/link.png']")).click();
		
		
		//Find where am supposed to go without clicking me?		
		String attribute = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		
		System.out.println("Find where am supposed to go without clicking me?");
		
		System.out.println(attribute);
		
		
		//Verify am I broken?		
		driver.findElementByLinkText("Verify am I broken?").click();
		
		String title = driver.getTitle();
		
		if (title.contains("Not Found")) 
			System.out.println("page not found "+title);
		else 
			System.out.println("page loaded successfully "+title);
		
		//navigate back to hyperlink page
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		
		//Go to Home Page (Interact with same link name)
		
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
		
		driver.findElement(By.xpath("//img[@src='images/link.png']")).click();
		
	
	//How many links are available in this page? 
		
		//Identify the number of Link on webpage and assign into Webelement List 
		 List<WebElement> links = driver.findElements(By.xpath("//a"));   
		 
         int linkCount = links.size();  
         
         System.out.println("Total number of links available in hyperlink page is: "+linkCount);
		
         
         //close the browser
         driver.close();
	}

}
