package mytestng;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyFile {
	Properties p;
	FileInputStream fi;
	WebDriver driver;
	@BeforeTest
	public void launch() throws Throwable
	{
		p=new Properties();
		fi=new FileInputStream("OR.properties");
		//load the file
		p.load(fi);
		driver=new ChromeDriver();
		driver.get(p.getProperty("Url")); 
		driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		driver.findElement(By.name(p.getProperty("username"))).sendKeys("Admin");
		driver.findElement(By.name(p.getProperty("password"))).sendKeys("Admin");
		driver.findElement(By.name(p.getProperty("login"))).click();
	}
	@AfterTest
	public void logout()
	{
		driver.close();
	}
}
