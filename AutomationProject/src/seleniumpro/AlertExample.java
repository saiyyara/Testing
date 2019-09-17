package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		//click on button
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		String text=driver.switchTo().alert().getText();
		System.out.println(text); 
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
	}

}
