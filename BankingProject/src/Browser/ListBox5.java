package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox5 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.shadi.com/");
		driver.manage().window().maximize();
		
		Select list=new Select(driver.findElement(By.xpath("//*[@id='ddlEducation']")));
		
		boolean value=list.isMultiple();
		System.out.println(value);
		Thread.sleep(3000);
		
		list.selectByVisibleText("Masters");
		Thread.sleep(3000);
		
		list.selectByValue("5");
		Thread.sleep(3000);
		
		list.selectByIndex(4); 
		Thread.sleep(3000);
		
		driver.close();
		
 
	}

}
