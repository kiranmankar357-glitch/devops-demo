package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest {
	
	@Test
	public void titileValidation() {
		String expectedTitle = "demosite";
		String actualTitle = driver.getTitle();
		
		Reporter.log("Expected Result = " + expectedTitle);
		Reporter.log("Actual Result = " + actualTitle);
		
		assertTrue(actualTitle.equals(expectedTitle), "Mismatch in the results, ");
	}
	
	@Test
	public void urlValidation() {
		String expectedUrl = "https://demoqa.com/login";
		String actualUrl= driver.getCurrentUrl();
		
		Reporter.log("Expected Result = " + expectedUrl);
		Reporter.log("Actual Result = " + actualUrl);
		
		assertTrue(actualUrl.equals(expectedUrl), "Mismatch in the results, ");
	}

}
