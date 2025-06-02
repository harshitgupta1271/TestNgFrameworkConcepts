package annotations;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {

	
	@BeforeTest
	
	void bt() {
		System.out.println("This is before test");
	}
	
	@Test
	void abc() {
		System.out.println("This is abc");
	}
	

}
