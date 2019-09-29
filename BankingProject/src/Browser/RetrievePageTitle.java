package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievePageTitle {

	public static void main(String[] args) 
	throws Throwable
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//getting Title by getTitle method
		
		//String strget=driver.getTitle();
		//System.out.println("Page title is :"+strget);
		
		//by getting page webelement
		WebElement titlelement=driver.findElement(By.tagName("title"));
		System.out.println("Title of web page element ::"+titlelement.getAttribute("textContent"));
		
		Thread.sleep(5000);
		driver.quit();
	}

}
