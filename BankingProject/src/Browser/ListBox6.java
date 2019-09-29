package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox6 {

	public static void main(String[] args) throws Throwable 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shadi.com/");
	driver.manage().window().maximize();
	String Expitem="Masters";
	boolean itemexist=false;
	Select listbox=new Select(driver.findElement(By.xpath("//*[@id='ddlEducation']")));
	
	List<WebElement> olist=listbox.getOptions();
	System.out.println("No of items are ::"+olist.size());
	
	for(int i=1;i<olist.size();i++)
	{
		String allitems=olist.get(i).getText();
		Thread.sleep(3000);
		System.out.println(allitems); 
		
		if(allitems.equalsIgnoreCase(Expitem))
		{
			itemexist=true;
			break;
		}
			
	}
	if(itemexist)
	{
		System.out.println("Item found in Listbox::"+Expitem);
	}
	else
	{
		System.out.println("Item not found in Listbox::"+Expitem);
	}

	driver.close();
	}
	
}
