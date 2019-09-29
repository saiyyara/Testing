package dataprovider;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class DataSupply {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
  @Test(dataProvider = "orangeHrm")
  public void verifyLogin(String user, String passs) throws Exception
  {
	test=report.startTest("Accessing Data from Data Provider");
	driver.get("http://orangehrm.qedgetech.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("txtUsername")).sendKeys(user);
	driver.findElement(By.name("txtPassword")).sendKeys(passs);
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	if(driver.getCurrentUrl().contains("dash")) 
	{
		Reporter.log("Login Successful",true);
		test.log(LogStatus.PASS,"Login Successful");
	}
	else
	{
		String message=driver.findElement(By.id("spanMessage")).getText();
		Reporter.log(message,true);
		test.log(LogStatus.FAIL,message);
	}
	report.endTest(test);
	report.flush();
  }

  @DataProvider
  public Object[][] orangeHrm() {
    Object login[][]=new Object[5][2];
    login[0][0]="Admin";
    login[0][1]="Qedge123!@#";
    login[1][0]="Test";
    login[1][1]="admin";
    login[2][0]="Admin";
    login[2][1]="Qedge123!@#";
    login[3][0]="Test";
    login[3][1]="Adminj";
    login[4][0]="Test";
    login[4][1]="Admin";
    return login;
  }
  @BeforeTest
  public void beforeTest() {
	  report=new ExtentReports("./Reports/LoginData.html");
	  System.setProperty("webdriver.chrome.driver","E://selenium//chromedriver.exe");
	  driver=new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
