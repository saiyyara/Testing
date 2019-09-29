package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//select class in Selenium
		
		Select monthlist=new Select(driver.findElement(By.xpath("//*[@id='month']")));
		Select yearlist=new Select(driver.findElement(By.xpath("//*[@id='year']")));		
		//single selection or multiple selection
		
		boolean vlaue1=yearlist.isMultiple();
		boolean value2=monthlist.isMultiple();
		System.out.println(vlaue1+" "+value2);
		Thread.sleep(3000);
		
		monthlist.selectByVisibleText("Jan");
		Thread.sleep(3000);
		yearlist.selectByVisibleText("1988");
		Thread.sleep(3000);
		
		monthlist.selectByValue("10");
		Thread.sleep(3000);
		yearlist.selectByValue("1993");
		Thread.sleep(3000); 
		
		monthlist.selectByIndex(4);
		System.out.println(monthlist.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		yearlist.selectByIndex(50);
		System.out.println(yearlist.getFirstSelectedOption().getText());
		Thread.sleep(3000); 
		driver.close();

	}

}
