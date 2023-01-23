package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	
	@FindBy (xpath="//input[@name='username']")
     WebElement usernamebox;
    @FindBy (xpath="//input[@name='password']")
    WebElement passwordbox;
    @FindBy(xpath="//button[@type='submit']")
    WebElement loginbutton;
    
    public LoginPage1( WebDriver driver) {
    	
    	PageFactory.initElements(driver,this);
    }
    	public void usernametextbox(String user) {
    		usernamebox.sendKeys(user);
    	}
    	public void passwordtextbox(String pass) {
    		passwordbox.sendKeys(pass);
    	}
    	public void clicklogin() {
    		loginbutton.click();
    	}
    
}
