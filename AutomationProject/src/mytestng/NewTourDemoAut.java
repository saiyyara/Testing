package mytestng;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NewTourDemoAut {
 ExtentReports report;
 ExtentTest    test;
 Properties p;
 FileInputStream fi;
 WebDriver driver;
 @BeforeTest
 public void launch() throws Throwable
 {
	 report=new ExtentReports("./Report1/Register2.html");
	 p=new Properties();
	 fi=new FileInputStream("OR.properties");
	 p.load(fi);
	 driver=new ChromeDriver();
	 
 }
 @Test
 public void verifyRegister() throws Throwable
 {
	 test=report.startTest("Register Test","Verify Register Functionality");
	 test.assignAuthor(" Rakesh Sr Software Developer");
	 driver.get("http://www.newtours.demoaut.com");
	 test.log(LogStatus.INFO,driver.getCurrentUrl());
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath(p.getProperty("register"))).click();
	 test.log(LogStatus.INFO,"Click on Register");
	 driver.findElement(By.xpath(p.getProperty("firstname"))).sendKeys("Rakesh");
	 test.log(LogStatus.INFO,"Entered FirstName");
	 driver.findElement(By.xpath(p.getProperty("lastname"))).sendKeys("Kumar");
	 test.log(LogStatus.INFO,"Entered LastName");
	 driver.findElement(By.xpath(p.getProperty("phone"))).sendKeys("9123919191");
	 test.log(LogStatus.INFO,"Entered Phone");
	 driver.findElement(By.xpath(p.getProperty("email"))).sendKeys("test@gmail.com");
	 test.log(LogStatus.INFO,"Entered Email");
	 driver.findElement(By.xpath(p.getProperty("address"))).sendKeys("abc colony");
	 test.log(LogStatus.INFO,"Entered Address");
	 driver.findElement(By.xpath(p.getProperty("city"))).sendKeys("Hyderabad");
	 test.log(LogStatus.INFO,"Entered City");
	 driver.findElement(By.xpath(p.getProperty("state"))).sendKeys("Telangana");
	 test.log(LogStatus.INFO,"Entered State");
	 driver.findElement(By.xpath(p.getProperty("postalcode"))).sendKeys("500038");
	 test.log(LogStatus.INFO,"Entered Postal code");
	 Select country=new Select(driver.findElement(By.xpath(p.getProperty("country"))));
	 country.selectByVisibleText("INDIA");
	 test.log(LogStatus.INFO,"Select Country");
	 driver.findElement(By.xpath(p.getProperty("username"))).sendKeys("Rakesh");
	 test.log(LogStatus.INFO,"Entered username");
	 driver.findElement(By.xpath(p.getProperty("password"))).sendKeys("rakesh@123");
	 test.log(LogStatus.INFO,"Entered password");
	 driver.findElement(By.xpath(p.getProperty("conpassd"))).sendKeys("rakesh@123");
	 test.log(LogStatus.INFO,"enetred confirm passwor");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath(p.getProperty("submit"))).click();	
	 test.log(LogStatus.INFO,"click on submit");
	 String expect=driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).getText();
	 System.out.println(expect);
	 String actualval=driver.getCurrentUrl();
	 System.out.println(actualval);
	 if(actualval.contains(expect))
	 {
		 Reporter.log("Registration Success::",true);
		 test.log(LogStatus.PASS,"Registration Success::"+expect+" "+actualval);
	 }
	/*else
	 {
		 String message=driver.findElement(By.xpath(p.getProperty("dasboard"))).getText();
		 Reporter.log("Registration Fail",true);
		 test.log(LogStatus.FAIL,message+""+expect+""+actualval);
	 }*/
 }
 @AfterTest
 public void logout()
 {
	 report.endTest(test);
	 report.flush();
	 driver.close();
 }
}
