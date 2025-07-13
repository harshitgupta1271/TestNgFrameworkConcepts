package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest {
	
	
	WebDriver driver;
	@BeforeClass
	void setUp() {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	@Test
	void testLogin() {
		loginPage2 lp = new loginPage2(driver);
		lp.setUserName("Admin");
		lp.setUserPassword("admin123");
		lp.clickLoginbtn();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
	}

}


