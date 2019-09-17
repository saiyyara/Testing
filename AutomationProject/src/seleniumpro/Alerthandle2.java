package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerthandle2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("file://C:/Users/danish/Desktop/Alertbox.html");
		//click button
		driver.findElement(By.xpath("//button")).click();
		
		driver.switchTo().alert().sendKeys("Danish"); 
		Thread.sleep(3000);
		
		//accepting the alert box
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//getting message
		
		String alertmessage=driver.findElement(By.id("demo")).getText();
		System.out.println(alertmessage);
		Thread.sleep(3000);
		driver.close();
	}

}
