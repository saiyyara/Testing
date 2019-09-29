package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndeselection {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file://C:/Users/danish/Desktop/Multi.html");
		driver.manage().window().maximize();
		
		Select listitem=new Select(driver.findElement(By.xpath("//*[@name='multiSelection']")));
		
		boolean value=listitem.isMultiple();
		System.out.println(value);
		
		listitem.selectByIndex(0);
		Thread.sleep(3000); 
		
		
		listitem.selectByIndex(2);
		Thread.sleep(3000); 
		
		listitem.selectByIndex(4);
		Thread.sleep(3000);
		
		listitem.selectByIndex(7);
		Thread.sleep(3000); 
		
		//count no of elements
		
		List<WebElement> olist=listitem.getOptions();
		System.out.println("No of items are ::"+olist.size());
		
		for(int i=1;i<olist.size();i++)
		{
			String itemname=olist.get(i).getText();
			System.out.println(itemname); 
		}
		listitem.deselectByIndex(0);
		Thread.sleep(3000); 
		
		listitem.deselectByIndex(2);
		Thread.sleep(3000);
		
		listitem.deselectAll();
		Thread.sleep(3000); 
		driver.close();
		
	}

}
