package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	static WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");	
	}
	
	@AfterTest
	public void afterTest() {
	//	driver.quit();
			
	}

}
