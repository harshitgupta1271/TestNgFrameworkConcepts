package annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {
	
	@Test
	
	void pqr () {
		System.out.println("This is pqr");
	}
	
	@BeforeSuite
	
	void bs() {
		System.out.println("This is beforesuite");
	}
	@AfterSuite
	
	void as() {
		System.out.println("This is a aftersuite");
	}

}
