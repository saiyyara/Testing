package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMouseover {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		//ac.sendKeys(Keys.ESCAPE).build().perform();
		
		WebElement menlink=driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
		WebElement jackets=driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/div[1]/li[1]/ul[1]/li[7]/a[1]"));
        ac.moveToElement(menlink).pause(5000);
        ac.build().perform();
        Thread.sleep(5000);
        
        ac.moveToElement(jackets).pause(5000).click();
        ac.build().perform();
        Thread.sleep(4000); 
        driver.close();
	}

}
