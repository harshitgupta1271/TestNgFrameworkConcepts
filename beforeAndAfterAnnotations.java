package tester;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* Test case
 * login   --- Before method
 * search  -- test
 * logout   -- after method
 * login
 * advanced search -- test
 * logout
 */

/*
public class beforeAndAfterAnnotations {

    @BeforeMethod
    void login() {
        System.out.println("This is login");
    }

    @AfterMethod
    void logout() {
        System.out.println("This is logout");
    }

    @Test(priority = 1)
    void search() {
        System.out.println("This is Search");
    }

    @Test(priority = 2)
    void advancedSearch() {
        System.out.println("This is AdvancedSearch");
    }
}

output- This is login
        This is search
        This is logout
        This is login
        This is advanced search
        This is logout
*/

/* Test case
 * login   --- Before class
 * search  -- test
 * advanced search -- test
 * logout   -- after class
 */

public class beforeAndAfterAnnotations {

    @BeforeClass
    void login() {
        System.out.println("This is login");
    }

    @AfterClass
    void logout() {
        System.out.println("This is logout");
    }

    @Test(priority = 1)
    void search() {
        System.out.println("This is Search");
    }

    @Test(priority = 2)
    void advancedSearch() {
        System.out.println("This is AdvancedSearch");
    }
    
}

/* out put-  These methods executes at class level
 * This is login
 * This is search 
 * This is advanced search
 * This is logout
 * 
 * 
 * 
 */















