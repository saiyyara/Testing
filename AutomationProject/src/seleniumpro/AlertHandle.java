package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/home.aspx");
		driver.manage().window().maximize();
		//click login button
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(4000); 
		driver.quit();
	}

}
