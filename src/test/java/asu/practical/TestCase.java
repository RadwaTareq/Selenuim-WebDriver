package asu.practical;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

@Test
public class TestCase {
	WebDriver driver;
  public void f() {
	  System.out.print("hey radwa:)!");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://mvnrepository.com/");
	  try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
