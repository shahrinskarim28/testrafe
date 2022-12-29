package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// Create the object of the driver 
	        ChromeDriver driver = new ChromeDriver();
		// Using driver object call the get method used for passing link.
	        driver.get("https://admin-demo.nopcommerce.com/login/");
	        WebElement email=driver.findElement(By.id("Email"));			
	        findElementsdriver.findElement(By.name("Email")).clear();
	        .sendKeys("admin@yourstore.com");
	        driver.findElement(By.name("Password")).sendKeys("admin");
	        driver.findElement(By.className("button-1")).click();
	}

}
