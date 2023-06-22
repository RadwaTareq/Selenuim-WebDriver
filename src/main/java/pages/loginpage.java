package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class loginpage 
{
	private WebDriver driver;
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver,100);
	    PageFactory.initElements(driver,this);
	}
	 @FindBy(id = "username")
	 WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//button")
	WebElement loginbutton;
	public void enterusername(String name) {
		username.sendKeys(name);
		
	}
	public void enterpassword(String pass) {
		password.sendKeys(pass);
		
	}
	public void clickbutton() {
		loginbutton.submit();
		
	}
	 
	 
	

}
