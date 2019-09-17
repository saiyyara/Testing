package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert22 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		//send value to the Textbox
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("DanishEqubal");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click(); 
		
		String text=driver.switchTo().alert().getText();
		System.out.println(text); 
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.close();
	}

}
