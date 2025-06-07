package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class allBeforeAndAfterAnnotationsHierarchy {  

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("1. @BeforeSuite - Executed once before the entire test suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("2. @BeforeTest - Executed before <test> tag in testng.xml");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("3. @BeforeClass - Executed before the first method in this class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("4. @BeforeMethod - Executed before each @Test method");
    }

    @Test
    public void testCase1() {
        System.out.println("🔸 Test Case 1 is executing");
    }

    @Test
    public void testCase2() {
        System.out.println("🔸 Test Case 2 is executing");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("5. @AfterMethod - Executed after each @Test method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("6. @AfterClass - Executed after all methods in the class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("7. @AfterTest - Executed after <test> tag in testng.xml");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("8. @AfterSuite - Executed once after the entire test suite");
    }
}

/* output-----
1. @BeforeSuite - Executed once before the entire test suite
2. @BeforeTest - Executed before <test> tag in testng.xml
3. @BeforeClass - Executed before the first method in this class
4. @BeforeMethod - Executed before each @Test method
🔸 Test Case 1 is executing
5. @AfterMethod - Executed after each @Test method
4. @BeforeMethod - Executed before each @Test method
🔸 Test Case 2 is executing
5. @AfterMethod - Executed after each @Test method
6. @AfterClass - Executed after all methods in the class
7. @AfterTest - Executed after <test> tag in testng.xml
8. @AfterSuite - Executed once after the entire test suite

 */
