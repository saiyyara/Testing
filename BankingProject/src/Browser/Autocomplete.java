package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.oyorooms.com/");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='autoComplete__home']")).sendKeys("Pah");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='autoComplete__home']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='autoComplete__home']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='autoComplete__home']")).sendKeys(Keys.ENTER);
		
		
	}

}
