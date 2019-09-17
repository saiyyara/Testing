package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablekodit {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		//Store Table
		WebElement table=driver.findElement(By.id("product"));
		//get no of rows
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("No of rows::"+rows.size()); 
		//get now of columns in rows
		for(int i=1;i<rows.size();i++)
		{
			//get no of columns
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("Rows No is:"+i+"no of columns::"+cols.size());
		}
		driver.close(); 

	}

}
