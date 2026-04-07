package test;

import org.testng.annotations.Test;

import pom.Login;

public class loginValidation extends BaseTest {
	
	@Test
	public void validUsernameValidPasswordTest() {
		String username = "kiran@gmail.com";
		String password = "kiran123";
		
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}

}
