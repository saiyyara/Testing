package mytestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportOrangeHrm {
ExtentReports report;
ExtentTest test;
WebDriver driver;
@BeforeTest
public void generateReport()
{
	report=new ExtentReports("./Reports/Login1.html");
	driver=new ChromeDriver();
}
@Test
public void verifyLogin()
{
	test=report.startTest("Login Test","Verify Login Functionality");
	test.assignAuthor(" Rakesh Sr Software Developer");
	driver.get("http://orangehrm.qedgetech.com"); 
	test.log(LogStatus.INFO,driver.getCurrentUrl());
	driver.manage().window().maximize();
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	test.log(LogStatus.INFO,"Username Entered");
	driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	test.log(LogStatus.INFO,"Password Entered");
	driver.findElement(By.name("Submit")).click();
	test.log(LogStatus.INFO,"Click on Login Button");
	String expectval="dash";
	String actualval=driver.getCurrentUrl();
	if(actualval.contains(expectval))
	{
		Reporter.log("Login Success:",true);
		test.log(LogStatus.PASS,"Login Success::"+expectval+" "+actualval);
	}
	else
	{
		//get error message
		String message=driver.findElement(By.id("spanMessage")).getText();
		Reporter.log("Login Fail",true);
		test.log(LogStatus.FAIL,message+""+expectval+""+actualval);
		
	}
}
	@AfterTest
	public void logout()
	{
		report.endTest(test);
		report.flush();
		driver.close();
	}
 
}
