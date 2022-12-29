package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_clone_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// Create the object of the driver 
	        ChromeDriver driver = new ChromeDriver();
		// Using driver object call the get method used for passing link.
	        driver.get("https://www.amazon.com/"); 
	        //driver.close();
	}

}
