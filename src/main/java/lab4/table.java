package lab4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		WebElement cell=driver.findElement(By.xpath("//tr[2]/td[2]"));
		System.out.println(cell.getText());
	}

}
