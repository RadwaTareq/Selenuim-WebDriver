package lab4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement dd=driver.findElement(By.xpath("//select"));
		Select sel=new Select(dd);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("ALBANIA");
		Thread.sleep(2000);
		sel.selectByVisibleText("ANGOLA");
		List<WebElement> elements=sel.getOptions();
		for(WebElement w:elements)
		{
			System.out.println(w.getText());
		}
		

	}

}
