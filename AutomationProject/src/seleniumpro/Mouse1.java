package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).build().perform();
		
		WebElement homefur=driver.findElement(By.xpath("//ul[1]/li[6]/span[1]")); 
		WebElement bulb=driver.findElement(By.xpath("//*[@title='Bulbs']")); 
		
		ac.moveToElement(homefur).pause(5000);
		ac.build().perform();
		Thread.sleep(5000);
		
		ac.moveToElement(bulb).pause(9000).click(); 
		ac.build().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.close();
	}

}
