package asu.practical;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class TestCaseTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.print("integer = "+n+" string = "+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://web.whatsapp.com/");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
