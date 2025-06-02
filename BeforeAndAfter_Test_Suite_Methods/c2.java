package annotations;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class c2 {
	
	
	
	@Test
	void Xyz() {
		System.out.println("This is xyz");
	}
	
@AfterTest
	
	void at() {
		System.out.println("This is after test");
	}

}
