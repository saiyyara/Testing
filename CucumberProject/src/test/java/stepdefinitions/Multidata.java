package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Multidata {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	@When("^I Open OrangeHrms URL on \"([^\"]*)\"$")
	public void i_Open_OrangeHrms_URL_on(String Browser)throws Throwable{
		report=new ExtentReports(".Orange/Login.html");	
		if(Browser.equalsIgnoreCase("chrome")) 
		{		
	    System.setProperty("webdriver.chrome.driver","E://selenium//chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://orangehrm.qedgetech.com");
	    driver.manage().window().maximize();
		}
		else if(Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","E://selenium//geckodriver.exe");
		    driver=new FirefoxDriver();
		    driver.get("http://orangehrm.qedgetech.com");
		}
		else
		{
			System.out.println("Browser is not matching"); 
		}
	}

	@When("^I enter \"([^\"]*)\" in Username Field$")
	public void i_enter_in_Username_Field(String username) {
	    driver.findElement(By.name("txtUsername")).sendKeys(username);
	}

	@When("^I enter \"([^\"]*)\" in Password Field$")
	public void i_enter_in_Password_Field(String password){
	    driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^I Click Login Button$")
	public void i_Click_Login_Button() throws Throwable{
	    driver.findElement(By.id("btnLogin")).click();
	    Thread.sleep(3000);
	}

	@Then("^I should see Login Button$")
	public void i_should_see_Login_Button(){
	   test=report.startTest("multipledata");
	   if(driver.getCurrentUrl().contains("dash"))
	   {
		   test.log(LogStatus.PASS,"Login is Successfull");
		   System.out.println("Login is successful");
	   }
	   else {
		   String message=driver.findElement(By.id("spanMessage")).getText();
		   test.log(LogStatus.FAIL,message);
		   System.out.println("Login Failed"); 
	   }
	}

	@When("^I close the Browser$")
	public void i_close_the_Browser(){
		report.endTest(test);
		report.flush();
	    driver.close();
	}
}
