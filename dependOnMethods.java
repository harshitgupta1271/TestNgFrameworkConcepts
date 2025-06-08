package annotations;

import org.junit.Assert;
import org.testng.annotations.Test;

/*
 * open
 * login
 * search
 * logout
 */
public class dependOnMethods {

    // This test simulates opening the app
    @Test(priority = 1)
    void openApp() {
        // Test passes
        Assert.assertTrue(true);
    }

    // This test depends on "openApp" method
    @Test(priority = 2, dependsOnMethods = {"openApp"})
    void login() {
        // This test will FAIL
        Assert.assertTrue(false);
    }

    // This test depends on BOTH "login" and "openApp"
    @Test(priority = 3, dependsOnMethods = {"login", "openApp"})
    void search() {
        // This test will be SKIPPED because "login" FAILED
        Assert.assertTrue(true);
    }

    // This test depends only on "login"
    @Test(priority = 4, dependsOnMethods = {"login"})
    void logout() {
        // This test will also be SKIPPED because "login" FAILED
        Assert.assertTrue(true);
    }
}
