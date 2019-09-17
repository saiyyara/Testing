package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouse2 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).build().perform();
		
		WebElement babykid=driver.findElement(By.xpath("//ul[1]/li[5]/span[1]"));
		WebElement actionkid=driver.findElement(By.xpath("//li[5]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[7]/a[1]"));
		
		ac.moveToElement(babykid).pause(6000);
		ac.build().perform();
		Thread.sleep(4000);
		
		ac.moveToElement(actionkid).pause(4000).click();
		ac.build().perform();
		Thread.sleep(6000);
		System.out.println(driver.getTitle());
		driver.close();

	}

}
