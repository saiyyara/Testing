package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
		
		//count number of items
		
		List<WebElement> olist=listbox.getOptions();
		System.out.println("No of items in ListBox::"+olist.size()); 
		
		for(int i=1;i<olist.size();i++)
		{
			String name=olist.get(i).getText();
			System.out.println(name);
			Thread.sleep(3000);
			//click on each click
			olist.get(i).click();
		}
		driver.close();
	}

}
