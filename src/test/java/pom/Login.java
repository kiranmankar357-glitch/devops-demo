package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Login {

    WebDriver driver;

    // Constructor
    public Login(WebDriver driverObj) {
        driver = driverObj;
    }

    public void loginWithCredentials(String username, String password) {

        Reporter.log("username = " + username);
        Reporter.log("password = " + password);

        WebElement email = driver.findElement(By.id("userName"));
        WebElement pass = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login")); // FIXED locator

        email.clear();
        email.sendKeys(username);

        pass.clear();
        pass.sendKeys(password);
        
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        loginBtn.click();
    }
}