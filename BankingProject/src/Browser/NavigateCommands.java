package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) 
	throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println("Page Title 1::"+driver.getTitle());
		
		driver.findElement(By.partialLinkText("For")).click();
		Thread.sleep(5000);
		System.out.println("Page Title 2::"+driver.getTitle());
		
		//previous page
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println("Page Title 3::"+driver.getTitle());
		
		//forward page
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println("Page Title 4::"+driver.getTitle());
		
		//reload page
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
	}

}
