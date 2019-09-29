package Browser;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingCalender {

	public static void main(String[] args) throws Throwable 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		ac.build().perform();
		List<WebElement> dates=driver.findElements(By.xpath("//*[@data-handler='selectDay']"));
		System.out.println("No of Days"+dates.size());
		for(int i=0;i<dates.size();i++)
		{
			String text=driver.findElements(By.xpath("//*[@data-handler='selectDay']")).get(i).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.xpath("//*[@data-handler='selectDay']")).get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
		driver.close();

	}

}
