package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class form_fillup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// Create the object of the driver 
	        ChromeDriver driver = new ChromeDriver();
		// Using driver object call the get method used for passing link.
	        driver.get("http://training.qaonlinetraining.com/testPage.php");
	        driver.findElement(By.name("name")).sendKeys("Rafeul Karim");
	        driver.findElement(By.name("email")).sendKeys("rafeul15@gmail.com");
	        driver.findElement(By.name("website")).sendKeys("www.google.com");
	        driver.findElement(By.name("comment")).sendKeys("I am good.");
	        driver.findElement(By.name("submit")).click();
	}

}
