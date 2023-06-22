package lab5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/delete_customer.php");
		d.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("53920");
		d.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		Alert a= d.switchTo().alert();
		System.out.print(a.getText());
		a.accept();
		Thread.sleep(4000);
		Alert a2=d.switchTo().alert();
		System.out.print(a2.getText());
		a2.accept();
		

	}

}
