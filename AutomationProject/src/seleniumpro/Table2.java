package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bseindia.com/sensex/code/16/");
		driver.manage().window().maximize();
		//Store Table locator
		WebElement table=driver.findElement(By.xpath("//div[@id='gain1']//table"));
		//get collection of rows
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("No of rows::"+rows.size()); 
		
		for(int i=1;i<rows.size();i++)
		{
			//get collection of columns
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td")); 
			System.out.println("Rows no::"+i+"No of columns::"+cols.size());
		}
		driver.close();
	}

}
