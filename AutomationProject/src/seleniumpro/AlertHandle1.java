package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandle1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		//submit button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		
		String slertmessage=driver.switchTo().alert().getText();
		System.out.println(slertmessage);
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000); 
		String slertmessage1=driver.switchTo().alert().getText();
		System.out.println(slertmessage1);
		driver.switchTo().alert().accept();
		Thread.sleep(3000); 
		
		driver.quit();
	}

}
