package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Login {

	WebDriver driver;

	/**
	 * Please the driver object
	 * 
	 * @param driverObj driver object
	 */
	public Login(WebDriver driverObj) {
		driver = driverObj;

		// ✔ Set implicit wait ONCE here (best practice)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * Use this method to login to the application
	 */
	public void loginWithCredentials(String username, String password) {

		Reporter.log("username = " + username);
		Reporter.log("password = " + password);

		WebElement email = driver.findElement(By.id("userName"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login"));

		email.clear();
		email.sendKeys(username);

		pass.clear();
		pass.sendKeys(password);

		loginBtn.click();
	}
}