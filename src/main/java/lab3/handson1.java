package lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class handson1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/login.html");
        WebElement email= driver.findElement(By.xpath("//input[@name=\"email\"]"));
        WebElement pass= driver.findElement(By.xpath("//input[@name=\"passwd\"]"));
        WebElement button= driver.findElement(By.id("SubmitLogin"));

        email.sendKeys("radwa");
        pass.sendKeys("1234");
       
       
        Thread.sleep(2000);
        email.clear();
        email.sendKeys("ahmed");
        button.click();
        button.submit();
        
	}

}
