package lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class hands0n2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement checkbox= driver.findElement(By.id("vfb-6-0"));
        checkbox.click();
        System.out.println(checkbox.isSelected());
        
         WebElement radiobutton1= driver.findElement(By.id("vfb-7-1"));
         WebElement radiobutton2= driver.findElement(By.id("vfb-7-2"));
         WebElement radiobutton3= driver.findElement(By.id("vfb-7-3"));
         System.out.println("before select"+radiobutton1.isSelected());
         radiobutton1.click();
         System.out.println("after select"+radiobutton1.isSelected());
         Thread.sleep(2000);
         System.out.println("before select"+radiobutton2.isSelected());
         radiobutton2.click();
         System.out.println("after select"+radiobutton2.isSelected());
         Thread.sleep(2000);
         System.out.println("before select"+radiobutton3.isSelected());
         radiobutton3.click();
         System.out.println("after select"+radiobutton3.isSelected());
         Thread.sleep(2000);
         
	}

}
