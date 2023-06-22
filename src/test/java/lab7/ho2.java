package lab7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ho2 {
	WebDriver driver;
	@DataProvider (name="dp")
	public static Object [][] provider()
	{
		return new Object [][]
				{
			{"radwa@mai.com","123","The change you wanted was rejected","Invalid"},
			{"nehal.magdy.cs@gmail.com","Suds245hone152","https://app.factorialhr.com/dashboard","Valid"}
				};
	}
  @Test(dataProvider = "dp")
  public void f(String username,String pass,String link,String status) {
	   WebElement email=driver.findElement(By.id("user_email"));
		WebElement password=driver.findElement(By.id("user_password"));
		WebElement button=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		email.sendKeys(username);
		password.sendKeys(pass);
		button.submit();
		if(status.equalsIgnoreCase("Valid"))
		{
			Assert.assertEquals(link, driver.getCurrentUrl());
		}
		else if(status.equalsIgnoreCase("Invalid"))
		{
			WebElement mes=driver.findElement(By.linkText("//div[@class=\"flash flash--wrong\"]"));
			String error=mes.getText();
			Assert.assertEquals(link,mes);
		}
		
  }
 
  @BeforeTest
  @Parameters("browser")
  public void beforeTest(String bro) {
	  if(bro.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(bro.equalsIgnoreCase("chr"))
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://api.factorialhr.com/en-US/users/sign_in?user%5Bemail%5D=dsd%40jm");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
