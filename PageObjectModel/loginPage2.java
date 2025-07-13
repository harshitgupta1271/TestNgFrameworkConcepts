package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


// page object class is created using page factory mkethod and the rest test class is same no change
public class loginPage2 {
	
   WebDriver driver;
	
	// constructor
	loginPage2(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);// because of this line we dont need to write driver for findby annotation
	}
	
	//locators
	// webelemt will be located on web page and will be returned to these variable
	@FindBy(xpath="//input[@placeholder='Username']") WebElement txt_username_loc;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txt_password_loc;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_login_loc;
	
	
	//action methods
    public void setUserName(String username) {
    	txt_username_loc.sendKeys(username);
    }
    public void setUserPassword(String password) {
    	txt_password_loc.sendKeys(password);
    }
    public void clickLoginbtn() {
    	
    	btn_login_loc.click();
    	
    }

}