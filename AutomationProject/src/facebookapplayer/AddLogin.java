package facebookapplayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddLogin 
{
	@FindBy(name="txtuId")
	WebElement enter_email;
	@FindBy(name="txtPword")
	WebElement enter_pass;
	@FindBy(name="login")
	WebElement click_login;
	//create method
	public String login(WebDriver driver,String email,String pass) throws Throwable
	{
		String res="";
		enter_email.sendKeys("Admin");
		enter_pass.sendKeys("Admin");
		click_login.click();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().contains("adminflow"))
		{
			res="Login Successful";
		}
		else
		{
			res="login not Successful";
		}
		return res;
	}
}
