package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginShadi {

	public static void main(String[] args) 
	throws Throwable
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shadi.com/login.htm?url_token=NDVkZGVlODk5NWFmZTdkYzZmMGQ0Njk3YmVlZTQyYWMYtnlJEow6KA");
	driver.manage().window().maximize();
	driver.findElement(By.name("user_email")).sendKeys("danish8ever@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.name("user_pass")).sendKeys("danish");
	Thread.sleep(5000);
	driver.findElement(By.name("submit")).click();
	driver.close();
	}

}
