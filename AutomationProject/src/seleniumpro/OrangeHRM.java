package seleniumpro;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM 
{

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("Raghu");
		driver.findElement(By.name("lastName")).sendKeys("Kumar");
		driver.findElement(By.name("employeeId")).clear();
		driver.findElement(By.name("employeeId")).sendKeys("12133");
		Thread.sleep(3000);
		driver.findElement(By.name("photofile")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("E:\\Autoit\\UploadImage.exe");
		Thread.sleep(7000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(7000);
		driver.close();
	}
}
