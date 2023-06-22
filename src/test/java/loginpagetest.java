import org.testng.annotations.Test;
import pages.loginpage;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;
public class loginpagetest {
	WebDriver driver;
	loginpage login;
  @Test(priority = 0)
  public void test1valid()
  {
	  login=new loginpage(driver);
	  login.enterusername("tomsmith");
	  login.enterpassword("SuperSecretPassword!");
	  login.clickbutton();
	  Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");

  }
  @Test(priority = 1)
  public void test2invalid()
  {
	  login=new loginpage(driver);
	  login.enterusername("radwa");
	  login.enterpassword("helloradwa!");
	  login.clickbutton();
	  Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/login");
  } 
  @BeforeMethod
  public void beforeMethod() {
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/login");
  
  }
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(10000);
	  driver.quit();
  }

}
