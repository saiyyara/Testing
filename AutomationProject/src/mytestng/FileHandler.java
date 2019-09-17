package mytestng;

import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileHandler 
{
	WebDriver driver;
	@BeforeTest
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void fileHandlerTest() throws Throwable
	{
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen,new File("E://Datadriven//screens//iteration//Loginpage.png"));
		Reporter.log("Screenshot is:",true);
	}
	@AfterTest
	public void logout()
	{
		driver.close();
	}
}
