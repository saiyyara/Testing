package ApplicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUser {
	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement clickadmin;
	@FindBy(id = "btnAdd")
	WebElement clickadd;
	@FindBy(id = "systemUser_employeeName_empName")
	WebElement enterempname;
	@FindBy(id = "systemUser_userName")
	WebElement enterusername;
	@FindBy(id = "systemUser_password")
	WebElement enterpassword;
	@FindBy(id = "systemUser_confirmPassword")
	WebElement entercpassword;
	@FindBy(id = "btnSave")
	WebElement clicksave;

	// define methods
	public String verifyUser(WebDriver driver, String ename, String username, String password, String cpassword)
			throws Throwable {
		String res = "";
		clickadmin.click();
		Thread.sleep(3000);
		clickadd.click();
		Thread.sleep(3000);
		enterempname.sendKeys(ename);
		enterusername.sendKeys(username);
		enterpassword.sendKeys(password);
		entercpassword.sendKeys(cpassword);
		clicksave.click();
		Thread.sleep(5000);
		if (driver.getCurrentUrl().contains("viewSystemUsers")) {
			res = "User creation successful";
		} else {
			res = "User creation is failed.";
		}
		return res;
	}

}
