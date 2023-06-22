package lab5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/popup.php");
		String firstWin=d.getWindowHandle();
		d.findElement(By.linkText("Click Here")).click();
		Set<String> allwindows=d.getWindowHandles();
		String secondwin="";
		for(String s : allwindows)
		{
			if(!s.equalsIgnoreCase(firstWin))
			{
				secondwin=s;
			}
			
		}
		d.switchTo().window(firstWin);
		Thread.sleep(3000);
		d.switchTo().window(secondwin);
		Thread.sleep(3000);
		d.switchTo().window(firstWin);

	}

}
