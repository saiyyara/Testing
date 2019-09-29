package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginNaukri {

	public static void main(String[] args) 
	throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		
		//sending text to textbox username
		driver.findElement(By.id("usernameField")).sendKeys("danish.rgtu@gmail.com");
		Thread.sleep(5000);
		//sending keys to textbox password
		driver.findElement(By.id("passwordField")).sendKeys("God!$gr8");
		Thread.sleep(5000);
		
		driver.findElement(By.className("col s12")).click();
	    driver.close();
	}

}
