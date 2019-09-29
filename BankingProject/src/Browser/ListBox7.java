package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox7 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		
		Select listcount=new Select(driver.findElement(By.xpath("//*[@id='ddlCountry']")));
		
		List<WebElement> olist=listcount.getOptions();
		System.out.println("No of items are ::"+olist.size()); 
		for(int i=1;i<olist.size();i++)
		{
			String alllist=olist.get(i).getText();
			System.out.println(alllist);
		}
		driver.close();
	}

}
