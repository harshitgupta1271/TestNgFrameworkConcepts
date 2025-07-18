package listner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

//@Listeners(listner.listener.class)
public class testCases {

    WebDriver driver;

    @BeforeClass
    void setup() throws InterruptedException {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    void testLogo() {
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        AssertJUnit.assertEquals(status, true);
    }

    @Test(priority = 2)
    void testAppUrl() {
    	
        AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 3, dependsOnMethods = {"testAppUrl"})
    void testHomePageTitle() {
        AssertJUnit.assertEquals(driver.getTitle(), "OrangeHRM");
    }

   	@AfterMethod
	@AfterClass
    void tearDown() {
        driver.quit();
    }
}
