package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SynchrinizeClass {
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Actions ac=new Actions(driver);
		driver.switchTo().frame(0);
		driver.findElement(By.id("tags")).sendKeys("Java");
		 driver.findElement(By.id("tags")).sendKeys(Keys.ARROW_DOWN);
		 
		 driver.findElement(By.id("tags")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);		
		driver.close();
	}

}
