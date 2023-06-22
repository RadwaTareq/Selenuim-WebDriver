package asu.practical;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
public class lab7handson1 {
	WebDriver driver ;
	 @BeforeTest
	  public void beforeTest() {
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com");		  
	  }
  @Test
  public void a() {
	  System.out.print("sign up") ; 
  }
  @Test
  public void b() {
	  System.out.print("log in ");
  }
  @Test
  public void c() {
	  System.out.print("search for ");  
  }
  @Test
  public void d() {
	  System.out.print("add it to cart ");	  
  }
  @Test
  public void e() {
	  System.out.print("check out");	  
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
