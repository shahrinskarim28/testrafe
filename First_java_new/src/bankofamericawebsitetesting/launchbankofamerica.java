package bankofamericawebsitetesting;


import org.openqa.selenium.chrome.ChromeDriver;

public class launchbankofamerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				// Create the object of the driver 
			        ChromeDriver driver = new ChromeDriver();
				// Using driver object call the get method used for passing link.
			        driver.get("https://google.com"); 
			        
	}

}
