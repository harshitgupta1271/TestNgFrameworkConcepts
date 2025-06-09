// Package declaration. This class belongs to the 'data' package
package data;

// Importing necessary Selenium and TestNG classes
import java.time.Duration;  // To handle wait time
import org.openqa.selenium.By;  // Used to locate elements
import org.openqa.selenium.WebDriver;  // Interface for browser driver
import org.openqa.selenium.chrome.ChromeDriver;  // Chrome browser driver
import org.testng.Assert;  // Provides assertion methods
import org.testng.annotations.AfterClass;  // Executes after all test methods in the class
import org.testng.annotations.BeforeClass;  // Executes before any test methods in the class
import org.testng.annotations.DataProvider;  // Used to provide data to test methods
import org.testng.annotations.Test;  // Marks a method as a TestNG test case

// Main class for testing login functionality using DataProvider
public class dataProviders {

    // Declare WebDriver as a global variable to be used in all methods
    WebDriver driver;

    // Setup method to initialize the browser and wait configuration
    @BeforeClass
    void setup() {
        driver = new ChromeDriver();  // Launch Chrome browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Set implicit wait for 10 seconds
    }

    // Test method that runs multiple times using data from the DataProvider named "dp"
    @Test(dataProvider="dp")  // Binds the test method to the "dp" DataProvider
    void testLogin(String email, String password) throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");  // Open login page
        driver.manage().window().maximize();  // Maximize the browser window

        // Fill in the email and password from DataProvider input
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);  
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);

        // Click the Login button
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        // Check if login was successful by checking if "My Account" heading is displayed
        boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();

        if (status == true) {
            // If login is successful, click the Logout link
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
            Assert.assertTrue(true);  // Assert test as passed
        } else {
            Assert.fail();  // Mark test as failed
        }
    }

    // Method to close the browser after all test cases are executed
    @AfterClass
    void tearDown() {
        driver.quit();  // Close the browser session
    }

    // DataProvider method named "dp" which provides multiple sets of login credentials
    // 'indices = {0,2}' means only the 1st and 3rd sets will be used for the test
    @DataProvider(name="dp", indices = {0,2})
    public Object[][] loginData() {
        Object[][] data = {
            {"abc@gmail.com", "test123"},  // Set 0 - will be used
            {"xyz@gmail.com", "test012"},  // Set 1 - will be skipped
            {"harshitth511@gmail.com", "Codechef@123"},  // Set 2 - will be used
            {"pavanol123@gmail.com", "test@123"},  // Set 3 - will be skipped
            {"johncanedy@gmail.com", "test"}  // Set 4 - will be skipped
        };
        return data;  // Return the 2D array of test data
    }
}
