package drivefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ApplicationLayer.LoginPage;
import ApplicationLayer.LogoutPagee;
import ApplicationLayer.AddUser;
import utilities.ReadExcel;
public class DataDrivenFrameworkUser 
{
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	//read input path
	String inputpath="./Input/Userdata.xlsx";
	//write Output path
	String outputpath="./Output/UserResults.xlsx";
	@BeforeTest
	public void adminLogin() throws Throwable
	{
		report=new ExtentReports("./Reports/User.html");
		driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		LoginPage login=PageFactory.initElements(driver,LoginPage.class);
		String loginres=login.verifyLogin(driver,"Admin","Qedge123!@#" );
		Reporter.log(loginres,true);
	}
	@Test
	public void userCreation() throws Throwable
	{
		//to access read excel methods
		ReadExcel excel=new ReadExcel(inputpath);
		//to access User Class
		AddUser user=PageFactory.initElements(driver,AddUser.class);
		//count no of rows in sheet
		int rc=excel.rowCount("User");
		//count no of count in rows
		int cc=excel.colCount("User");
		Reporter.log("No of Rows:"+rc,true);
		Reporter.log("No of Col in ROws:"+cc,true);
		for(int i=1;i<=rc;i++)
		{
			test=report.startTest("User Creation");
			test.assignAuthor("Danish QA Analyst");
			test.assignCategory("Multi Data");
			
			//to read data
			String empname=excel.cellData("User", i, 0);
			String username=excel.cellData("User", i, 1);
			String password=excel.cellData("User", i, 2);
			String confpasswrd=excel.cellData("User", i, 3);
			user.verifyUser(driver, empname, username, password, confpasswrd);
			if(driver.getCurrentUrl().contains("viewSystemUsers"))
			{
				test.log(LogStatus.PASS,"AddUser PASS");
				Reporter.log("Add User Pass",true);
				//to write data
				excel.setData("User", i, 4, "PASS","outputpath");
				excel.greenColour("User", i, 4, outputpath); 
			}
			else
			{
				test.log(LogStatus.FAIL,"AddUser Fail");
				Reporter.log("Add User Fail",true);
				//to write data
				excel.setData("User", i, 4, "FAIL","outputpath");
				excel.redColour("User", i, 4, outputpath); 				
			}
			report.endTest(test);
			report.flush();
		}
		excel.closeFiles();
	}
	@AfterTest
	public void logoutApp() throws Throwable
	{
		LogoutPagee logout=PageFactory.initElements(driver, LogoutPagee.class);
		logout.verifyLogout(driver);
		driver.close();
	}
}
