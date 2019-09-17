package baseclass;
import ApplicationLayer.LoginPage;
import ApplicationLayer.AddUser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationLayer.AddEmp;
import ApplicationLayer.AddCandidates;
import ApplicationLayer.LogoutPagee;

public class TestScript {
	WebDriver driver;
	@BeforeMethod
	public void launch() throws Throwable
	{
		driver=new ChromeDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		LoginPage login=PageFactory.initElements(driver,LoginPage.class);
		String loginResult=login.verifyLogin(driver,"Admin","Qedge123!@#");
		System.out.println(loginResult); 
	}
	@Test(priority=0)
	public void createEmp() throws Throwable
	{
		AddEmp addemp=PageFactory.initElements(driver,AddEmp.class);
		String empresults=addemp.verifyEmp(driver,"Rohan","Shaan","10313");
		System.out.println(empresults); 
		//driver.close();
	}
	@Test(priority=1)
	public void createUser() throws Throwable
	{
		AddUser adduser=PageFactory.initElements(driver,AddUser.class);
		String userresults=adduser.verifyUser(driver,"Akhilesh Kumar","Akhi@#%23","God!$gr923","God!$gr923");
		System.out.println(userresults); 
		//driver.close();
	}
	@Test(priority=2)
	public void createCandidate() throws Throwable
	{
		AddCandidates addcandidate=PageFactory.initElements(driver,AddCandidates.class);
		String candresults=addcandidate.verifyCandidate(driver,"Ruupesh","Siinha","retp@gmail.com","9510101010","def","Hi all");
		System.out.println(candresults); 
	}
	@AfterTest
	public void logout() throws Throwable
	{
		LogoutPagee logout=PageFactory.initElements(driver,LogoutPagee.class);
		String logoutresults=logout.verifyLogout(driver);
		System.out.println(logoutresults);
		driver.quit();
	}
}
