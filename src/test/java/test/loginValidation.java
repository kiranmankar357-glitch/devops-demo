package test;

import org.testng.annotations.Test;

import pom.Login;

public class loginValidation extends BaseTest {
	

	// stash demo - y11
	// from x11 branch
	@Test
	public void validUsernameValidPasswordTest() {
		String username = "kiran@gmail.com";
		String password = "kiran123";
		
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
	
	/**
	 * update the code base from b1 branch
	 */
	@Test
	public void invalidUsernameValidPasswordTest() {
		String username = "invalid-kiran@gmail.com";
		String password = "kiran123";
		
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}


}
