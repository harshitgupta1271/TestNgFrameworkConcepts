package data; // Declares the package to organize the class logically

import io.github.bonigarcia.wdm.WebDriverManager; // Automatically manages driver binaries
import org.openqa.selenium.WebDriver; // Base interface for all browser drivers
import org.openqa.selenium.chrome.ChromeDriver; // Chrome browser driver
import org.openqa.selenium.edge.EdgeDriver; // Edge browser driver

import org.testng.annotations.BeforeClass; // Executes before any @Test methods in this class
import org.testng.annotations.Parameters; // Injects values from testng.xml
import org.testng.annotations.Test; // Marks a method as a test case

public class parallelTesting { // Class for performing parallel browser testing

    WebDriver driver; // Declares WebDriver reference to control browser

    @BeforeClass
    @Parameters({"browsers", "url"}) // Accepts parameters from testng.xml
    public void setUp(String br, String url) {
        try {
            switch (br.toLowerCase()) { // Case-insensitive browser name check
                case "chrome":
                   
                    driver = new ChromeDriver(); // Launch Chrome browser
                    break;

                case "edge":
                 
                    driver = new EdgeDriver(); // Launch Edge browser
                    break;

                default:
                    throw new IllegalArgumentException("Unsupported browser: " + br); // Handle invalid browser input
            }

            driver.manage().window().maximize(); // Maximize browser window
            driver.get(url); // Navigate to the specified URL

        } catch (Exception e) {
            System.out.println("Error while initializing driver for: " + br); // Error log
            e.printStackTrace(); // Print stack trace for debugging
        }
    }

    @Test
    public void getTitle() {
        System.out.println("Title is: " + driver.getTitle()); // Print the title of the current page
    }
}
