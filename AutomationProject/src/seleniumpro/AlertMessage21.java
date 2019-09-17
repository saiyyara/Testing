package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessage21 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		//click on reset button
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext); 
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		driver.switchTo().alert().dismiss();
		driver.close();
	}

}
