package annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.awt.Button;
import org.testng.Assert; // ✅ Correct TestNG Assert import

public class hardAndSoftAssertion {

    // @Test ( priority = 1 )
    void testTitle() {
        String str1 = "title";
        String str2 = "Title";

        /*
         Output without using assertion:
         Test Failed
         PASSED: annotations.assertEquals.testTitle

         if(str1.equals(str2)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        */

        // Using TestNG assertion to fail the test when values don't match
        // FAILED: annotations.assertEquals.testTitle
        // java.lang.AssertionError: expected [Title] but found [title]

        // Assert.assertEquals(str1, str2);  // Will FAIL due to case difference

        // But if you still want to use if-else, do this instead
        /*
         Output:
         PASSED: annotations.assertEquals.testTitle

         if(str1.equals(str2)) {
            System.out.println("Test Passed");
            Assert.assertTrue(true);
         } else {
            System.out.println("Test Failed");
            Assert.assertTrue(false);
         }
        */

        // Assert.assertNotEquals(str1, str2);
        // Assert.assertNotEquals(123, 321);  // PASSED: annotations.assertEquals.testTitle
        // Assert.fail(); // test failed
    }

    // @Test(priority = 2)
    void test_hardassertion() {
        System.out.println("testing......");
        System.out.println("testing......");

        Assert.assertEquals(1, 2);

        System.out.println("testing......");
        System.out.println("testing......");
    }

    // Output:
    // testing......
    // testing......
    // FAILED: annotations.assertEquals.test_hardassertion
    // java.lang.AssertionError: expected [2] but found [1]
    //     at org.testng.Assert.fail(Assert.java:111)

    // Once the assertion got failed, then after-assertion no statement will execute in hard assertions.
    // So to avoid this, we use soft assertion.

    @Test(priority = 3)
    void test_softassertion() {
        System.out.println("testing......");
        System.out.println("testing......");

        SoftAssert sa = new SoftAssert();

        sa.assertEquals(1, 2);

        System.out.println("testing......");
        System.out.println("testing......");

        sa.assertAll();

        // Output:
        // testing......
        // testing......
        // testing......
        // testing......
        // FAILED: annotations.assertEquals.test_softassertion
        // java.lang.AssertionError: The following asserts failed:
        // expected [2] but found [1]
        //     at org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:46)
    }
}
