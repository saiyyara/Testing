package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyXpath {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		//parent
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Nilesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='text']//following::input[1]")).sendKeys("Mishra");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='text']//following::input[2]")).sendKeys("nilesh123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='text']//following::input[3]")).sendKeys("nilesh123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("asd!21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='year']//preceding::select[2]")).sendKeys("28");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='year']//preceding::select[1]")).sendKeys("Sep");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[starts-with(@id,'ye')]")).sendKeys("1981");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@value='2' and @type='radio']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
