package tester;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class testAnnotation {
	
	
	 @Test (priority = 2)
	    public void z() {
	        System.out.println("z");
	    }

	    @Test (priority = 3)
	    public void y() {
	        System.out.println("y");
	    }

	    @Test (priority = 1)
	    public void x() {
	        System.out.println("x");
	    }
	    
	
	

}
