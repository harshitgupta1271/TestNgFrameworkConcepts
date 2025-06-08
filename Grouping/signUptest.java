package grouping;

import org.testng.annotations.Test;


public class signUptest {
	
	
	@Test (priority = 1,groups = {"regression"})
	void signUpByEmail() {
		System.out.println("Signing via email");
	}
	
	@Test (priority = 2,groups = {"regression"})
	void signUpByfacebook() {
		System.out.println("Signing via facebook");
	}
	@Test (priority = 3,groups = {"regression"})
	void signUptwiter() {
		System.out.println("Signing via twiter");
	}

}
