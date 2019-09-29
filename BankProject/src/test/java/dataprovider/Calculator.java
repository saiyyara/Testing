package dataprovider;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Calculator {
	WebDriver driver;
	DesiredCapabilities cap;
	String Url = "https://www.calculator.net/";
	String node = "http://localhost:4444/wd/hub";

	@Parameters({"browser"})
	@BeforeMethod
	public void launch(String browse) throws Throwable {
		if (browse.equalsIgnoreCase("iexplore")) {
			System.out.println("Executing on IE");
			cap = new DesiredCapabilities();
			cap.setBrowserName("iexplore");
			cap.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(node), cap);
			driver.get(Url);
			driver.manage().window().maximize();
		}
		else if (browse.equalsIgnoreCase("chrome")) {
			System.out.println("Executing on chrome");
			cap = new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(node), cap);
			driver.get(Url);
			driver.manage().window().maximize();
		} 
		else {
			System.out.println("Browser is not executing");
		}
	}
	@Test
	public void calculatePercent()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Math')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Percentage Cal')]")).click();
		driver.findElement(By.id("cpar1")).sendKeys("10");
		driver.findElement(By.id("cpar2")).sendKeys("35000");
		driver.findElement(By.xpath("//*[@type='text']//following::input[4]")).click();
		String result=driver.findElement(By.xpath(".//*[@id='content']/p[2]/font/b")).getText();
		System.out.println("The result is::"+result);
		if(result.equals("3500"))
		{
			System.out.println("Result is Pass:");
		}
		else {
			System.out.println("Result is Failed");
		}		
	}
	@AfterMethod
	public void logout()
	{
		driver.close();
	}
}
