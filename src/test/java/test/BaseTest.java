package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	static WebDriver driver;
	
	/**
	 * Inherit this class in all the test class
	 * which will create only one instance of web browser, test cases can use this browser instance
	 */
	
	/**
	 * This method is used to invoke the browser and open the AUT url
	 */
	public void beforeTest() {

	    // Dummy setup (no browser)
	    System.out.println("Driver initialized");

	    // IMPORTANT: do NOT use driver anywhere
	}
	
	/**
	 * This method is used to quit the browser instance
	 */
	@AfterTest
	public void afterTest() {
	//	driver.quit();
			
	}

}
