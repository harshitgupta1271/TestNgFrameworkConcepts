package tester;

// Importing the TestNG @Test annotation

import org.testng.annotations.Test;



public class testAnnotation {
	
	
	
    // This test method is marked with priority = 2
    // It will run after the method with priority = 1
    @Test(priority = 2)
    public void z() {
        System.out.println("z");
    }

    // This test method is marked with priority = 3
    // It will run after the methods with lower priority values
    @Test(priority = 3)
    public void y() {
        System.out.println("y");
    }

    // This test method is marked with priority = 1
    // Since 1 is the lowest priority, it will run first
    @Test(priority = 1)
    public void x() {
        System.out.println("x");
    }
	    
	
	

}
