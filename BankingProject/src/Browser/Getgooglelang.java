package Browser;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getgooglelang {

	public static void main(String[] args) 
	throws Throwable
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		List<WebElement> e=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println("Languages supported by google are:");
		
		for(WebElement w:e)
		{
			System.out.println(w.getText());
		}
		Thread.sleep(5000);
		driver.close();
	}

}
