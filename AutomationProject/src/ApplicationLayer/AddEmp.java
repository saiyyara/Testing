package ApplicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmp 
{
	@FindBy(id="menu_pim_viewPimModule")
	WebElement click_pim;
	@FindBy(id="btnAdd")
	WebElement click_add;
	@FindBy(id="firstName")
	WebElement enter_fname;
	@FindBy(id="lastName")
	WebElement  enter_lname;
	@FindBy(id="employeeId")
	WebElement enter_eid;
	@FindBy(id="btnSave")
	WebElement click_save;
	//create method
	public String verifyEmp(WebDriver driver,String fname,String lname,String eid) 
	throws Throwable
	{
		String res="";
		click_pim.click();
		click_add.click();
		enter_fname.sendKeys(fname);
		enter_lname.sendKeys(lname);
		enter_eid.clear();
		enter_eid.sendKeys(eid);
		click_save.click();
		Thread.sleep(3000); 
		if(driver.getCurrentUrl().contains("empNumber"))
		{
			res="Add Employee Success";
		}
		else
		{
			res="Add Employee is failed";
		}
		return res;
	}
}
