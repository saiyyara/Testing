package ApplicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	//Maintain Repository for Login Page
	@FindBy(name="txtUsername")
	WebElement enterusername;
	@FindBy(name="txtPassword")
	WebElement enterpassword;
	@FindBy(name="Submit")
	WebElement clicklogin;
	//method for Login
	public String verifyLogin(WebDriver driver,String username,String password) throws Throwable
	{
		String res="";
		enterusername.sendKeys(username); 
		enterpassword.sendKeys(password); 
		clicklogin.click();
		Thread.sleep(3000); 
		if(driver.getCurrentUrl().contains("dash"))
		{
			res="Login Success";
		}
		else
		{
			res="Login fail";
		}
		return res;
	}
	
}
