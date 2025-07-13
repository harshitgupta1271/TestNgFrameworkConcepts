package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//page object class is created without using page factory method
public class loginPage {
	
	WebDriver driver;
	
	// constructor
	loginPage(WebDriver driver){
		this.driver = driver;
	}
	
	// locators
	
	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
    By txt_password_loc = By.xpath("//input[@placeholder='Password']");
    By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
    
    // actions methods
    
    public void setUserName(String username) {
    	driver.findElement(txt_username_loc).sendKeys(username);
    }
    public void setUserPassword(String password) {
    	driver.findElement(txt_password_loc).sendKeys(password);
    }
    public void clickLoginbtn() {
    	
    	driver.findElement(btn_login_loc).click();
    	
    }
    
    
	

}
