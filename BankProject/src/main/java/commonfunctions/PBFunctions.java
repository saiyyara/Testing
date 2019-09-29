package commonfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import constant.PBConstant;

public class PBFunctions extends PBConstant {
	/*Project Name:Primus Bank
	 *Module Name :Admin Login
	 *Author Name :Danish
	 *Creation Date:17/09/2019
	 */
	public static boolean verifyLogin(String username, String password) {
		driver.findElement(By.xpath(p.getProperty("objusername"))).sendKeys(username);
		driver.findElement(By.xpath(p.getProperty("objpassword"))).sendKeys(password);
		driver.findElement(By.xpath(p.getProperty("objloginbtn"))).click();
		String expectval = "adminflow";
		String actval = driver.getCurrentUrl();
		if (actval.toLowerCase().contains(expectval.toLowerCase())) {
			Reporter.log("Login Success", true);
			return true;
		} else {
			Reporter.log("Login Failed", true);
			return false;
		}
	}

	/*Project Name:Primus Bank 
	 *Module Name :New Branch Creation
	 *Author Name :Danish
	 *Creation Date:19/09/2019
	 */
	public static boolean verifyBracnCreation(String bname, String address1, String zcode, int country, int state,
			int city) throws Throwable {
		driver.findElement(By.xpath(p.getProperty("objnewbranch"))).click();
		driver.findElement(By.xpath(p.getProperty("objbname"))).sendKeys(bname);
		driver.findElement(By.xpath(p.getProperty("objadd1"))).sendKeys(address1);
		driver.findElement(By.xpath(p.getProperty("objzcode"))).sendKeys(zcode);
		new Select(driver.findElement(By.xpath(p.getProperty("objcountry")))).selectByIndex(1);
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(p.getProperty("objstate")))).selectByIndex(1);
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(p.getProperty("objcity")))).selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath(p.getProperty("objsubmit"))).click();
		// get alert message
		String alertmessage = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		String expectval = "new Branch";
		if (alertmessage.toLowerCase().contains(expectval.toLowerCase())) {
			Reporter.log("Branch Creation Successful", true);
			return true;
		} else {
			Reporter.log("Branch Creation Failed", true);
			return false;

		}
	}

	/*Project Name:Primus Bank
	 *Module Name :Branch Updation 
	 *Author Name :Danish
	 *Creation Date:19/09/2019
	 */
	public static boolean verifyUpdateBranch(String bname, String address1) throws Throwable {
		driver.findElement(By.xpath(p.getProperty("obj_click_edit"))).click();
		Thread.sleep(3000);
		WebElement branch = driver.findElement(By.xpath(p.getProperty("obj_bank_name")));
		WebElement add1 = driver.findElement(By.xpath(p.getProperty("obj_update_add1")));
		branch.clear();
		branch.sendKeys(bname);
		Thread.sleep(3000);
		add1.clear();
		add1.sendKeys(address1);
		driver.findElement(By.xpath(p.getProperty("obj_click_update"))).click();
		// get alert message
		String alertmessage = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		String expectval = "Branch Up";
		if (alertmessage.toLowerCase().contains(expectval.toLowerCase())) {
			Reporter.log("Branch Updation Successful", true);
			return true;
		} else {
			Reporter.log("Branch Updation Failed", true);
			return false;

		}
	}

	/*Project Name:Primus Bank
	 *Module Name :Navigate to Branches 
	 *Author Name:Danish 
	 *Creation Date:19/09/2019
	 */
	public static void navigateBranch() throws Throwable {
		driver.findElement(By.xpath(p.getProperty("objbranches"))).click();
		Thread.sleep(3000);
	}

	/*Project Name:Primus Bank 
	 *Module Name :Admin Logout 
	 *Author Name :Danish
	 *Creation Date:19/09/2019
	 */

	public static boolean verifyLogout() {
		driver.findElement(By.xpath(p.getProperty("objlogout"))).click();
		if (driver.findElement(By.xpath(p.getProperty("objloginbtn"))).isDisplayed()) {
			Reporter.log("Logoout Successful", true);
			return true;
		} else {
			Reporter.log("Logoout Failed", true);
			return false;
		}
	}
}
