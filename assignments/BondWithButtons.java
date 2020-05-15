package week2.day1.assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class BondWithButtons {

	public static void main(String[] args) {
		
		//Setting up driver and browser property
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		//Launch URL
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		
		//Click button to travel home page
		
		driver.findElementById("home").click();
		
		driver.findElement(By.xpath("//img[@src='images/button.png']")).click();
		
		
		//Find position of button (x,y) -using getLocation() method
		
		Point location = driver.findElementById("position").getLocation();
		
		int x = location.getX();
		int y = location.getY();
		
		System.out.println("x coordinate:"+x);
		
		System.out.println("y coordinate:"+y);
		
		
		//Find button color
		
		String color = driver.findElementById("color").getCssValue("background-color");
		
		System.out.println(color);
	 
		 
		//Find the height and width - using getSize() method

		Dimension size = driver.findElementById("size").getSize();
		
		int height = size.height;
		
		int width = size.width;
		
		System.out.println("Height of button is:"+height);
		
		System.out.println("width of the button is:"+width);
		 
		//close the browser:
		driver.close();
		
	}

}
