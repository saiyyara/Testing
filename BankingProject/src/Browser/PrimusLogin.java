package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class PrimusLogin {

	public static void main(String[] args) 
	throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new InternetExplorerDriver();
		driver.get("http://primusbank.qedgetech.com/home.aspx");
		//set window Size explicitly
		Dimension d=new Dimension(800,1024);
		driver.manage().window().setSize(d);
		//maximize window
		//driver.manage().window().maximize();
		//enter UserName
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		Thread.sleep(5000);
		//enter password
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		Thread.sleep(5000);
		//click on Login
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
