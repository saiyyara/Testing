package ApplicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCandidates {
	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	WebElement click_recrt;
	@FindBy(id = "btnAdd")
	WebElement click_add;
	@FindBy(id = "addCandidate_firstName")
	WebElement enter_fname;
	@FindBy(id = "addCandidate_lastName")
	WebElement enter_lname;
	@FindBy(id = "addCandidate_email")
	WebElement enter_email;
	@FindBy(id = "addCandidate_contactNo")
	WebElement enter_contact;
	@FindBy(id = "addCandidate_keyWords")
	WebElement enter_keyword;
	@FindBy(id = "addCandidate_comment")
	WebElement enter_comment;
	@FindBy(id = "btnSave")
	WebElement click_save;

	// Method creation
	public String verifyCandidate(WebDriver driver, String fname, String lname, String email, String contact,
			String keywrd, String comment) throws Throwable {
		String res = "";
		click_recrt.click();
		Thread.sleep(3000);
		click_add.click();
		Thread.sleep(3000);
		enter_fname.sendKeys(fname);
		enter_lname.sendKeys(lname);
		enter_email.sendKeys(email);
		enter_contact.sendKeys(contact);
		enter_keyword.sendKeys(keywrd);
		enter_comment.sendKeys(comment);
		if (driver.getCurrentUrl().contains("id")) {
			res = "Candidates creation Successful";
		} else {
			res = "Candidates Creation Successful";
		}
		return res;
	}
}
