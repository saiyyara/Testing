package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args)
	throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("dotnetbyheart@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("pass")).sendKeys("god8252089308");
		Thread.sleep(5000);
		driver.findElement(By.id("loginbutton")).click(); 
		Thread.sleep(5000);
		driver.close();
	}

}
