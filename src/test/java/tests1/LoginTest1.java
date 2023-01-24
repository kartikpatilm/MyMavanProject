package tests1;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages1.LoginPage1;
@Listeners(utility1.TestListeners1.class)
public class LoginTest1 {
 public static WebDriver driver;
 LoginPage1 lp;
  @BeforeClass
  public void init() {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  lp=new LoginPage1(driver);
  }
  @Test
  public void click() {
	  lp.usernametextbox("Admin");
	  lp.passwordtextbox("admin123");
	  lp.clicklogin();
System.out.println("login successfully");
System.out.println("login successfully2");
System.out.println("login successfully3");
  }
  @Test
  public void verifytitle() {
	  Assert.assertFalse(driver.getTitle().contains("Orange"),"Page title does not match");
  }
  
	    
  @AfterClass
  public void teardown() {
	  driver.close();
  }
}
