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

import ApplicationLayer.AddEmp;
import ApplicationLayer.LoginPage;
import ApplicationLayer.LogoutPagee;
import utilities.ReadExcel;
public class DataDrivenFramework {
WebDriver driver;
ExtentReports report;
ExtentTest test;
//to read data from excel
String inputpath="./Input/Empdata.xlsx";
//to write results
String outputpath="./Output/Results.xlsx";
@BeforeTest
public void adminLogin() throws Throwable
{
	//generate extent reports
	report=new ExtentReports("./Reports/Emp.html");
	driver=new ChromeDriver();
	driver.get("http://orangehrm.qedgetech.com/");
	driver.manage().window().maximize();
	//calling login pages
	LoginPage login=PageFactory.initElements(driver,LoginPage.class);
	String loginres=login.verifyLogin(driver,"Admin","Qedge123!@#");
	Reporter.log(loginres,true);
}
@Test
public void empCreation() throws Throwable
{
	//to access read excel methods

	ReadExcel xl=new ReadExcel(inputpath);
	//call emp class objects
	AddEmp emp=PageFactory.initElements(driver,AddEmp.class);
	//count no of rows in sheet
	int rc=xl.rowCount("Emp");
	//count no col in row
	int cc=xl.colCount("Emp");
	Reporter.log("No of row:"+rc,true); 
	Reporter.log("No of col:"+cc,true);
	for(int i=1;i<=rc;i++)
	{
		//report logs to html
		test=report.startTest("Emp creation");
		test.assignAuthor("Danish QA Analyst");
		test.assignCategory("Multiple Data");
		//read columns
		String fname=xl.cellData("Emp",i,0);
		String lname=xl.cellData("Emp",i,1);
		String eid=xl.cellData("Emp",i,2);
		emp.verifyEmp(driver, fname, lname, eid);
		if(driver.getCurrentUrl().contains("empNumber")) 
		{
			test.log(LogStatus.PASS,"AddEmp Pass");
			Reporter.log("Add Emp Pass",true);
			//write into result column
			xl.setData("Emp", i, 3, "Pass", outputpath); 
			xl.greenColour("Emp",i,3, outputpath); 
		}
		else
		{
			test.log(LogStatus.FAIL,"AddEmp Fail");
			//Reporter.log("Add Emp Pass",true);
			xl.setData("Emp", i, 3, "FAIL", outputpath);
			xl.redColour("Emp", i, 3, outputpath); 
		}
		report.endTest(test);
		report.flush();
	}
	xl.closeFiles();
	
}
@AfterTest
public void logoutApp() throws Throwable
{
	LogoutPagee logout=PageFactory.initElements(driver,LogoutPagee.class);
	logout.verifyLogout(driver);
	driver.close();
}
}
