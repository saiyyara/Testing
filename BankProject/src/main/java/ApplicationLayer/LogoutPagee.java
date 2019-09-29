package ApplicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPagee {
	@FindBy(id = "welcome")
	WebElement click_welcome;
	@FindBy(linkText = "Logout")
	WebElement click_logout;
	@FindBy(name = "Submit")
	WebElement click_login;

	// create method
	public String verifyLogout(WebDriver driver) throws Throwable {
		String res = "";
		click_welcome.click();
		Thread.sleep(4000);
		click_logout.click();
		Thread.sleep(4000); 
		if (click_login.isDisplayed()) {
			res = "logout successful";
		} else {
			res = "logout failed";
		}
		return res;
	}
}
