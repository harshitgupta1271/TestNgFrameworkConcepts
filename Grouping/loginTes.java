package grouping;

import org.testng.annotations.Test;


public class loginTes {
	
	
	@Test (priority = 1,groups = {"sanity"})
	void loginByEmail() {
		System.out.println("logging via email");
	}
	
	@Test (priority = 2,groups = {"sanity"})
	void loginByfacebook() {
		System.out.println("logging via facebook");
	}
	@Test (priority = 3,groups = {"sanity"})
	void loginBytwiter() {
		System.out.println("logging via twiter");
	}

}
