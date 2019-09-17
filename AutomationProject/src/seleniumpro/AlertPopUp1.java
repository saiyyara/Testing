package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUp1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/danish/Desktop/Alertbox.html");
		//script for click button
		
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("Danish");
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000); 
		
		String message=driver.findElement(By.id("demo")).getText();
		System.out.println(message);
		Thread.sleep(3000);
		
		driver.quit();

	}

}
