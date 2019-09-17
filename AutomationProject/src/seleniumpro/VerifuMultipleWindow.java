package seleniumpro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifuMultipleWindow {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		//get parent window id
		String parent=driver.getWindowHandle();
		System.out.println(parent); 
		//get all links
		Set<String> allwinid=driver.getWindowHandles();
		System.out.println(allwinid);
		Iterator<String> iterator=allwinid.iterator();
		while(iterator.hasNext())
		{
			String child=iterator.next();
			if(!parent.equals(child))
			{
				String pagetitle=driver.switchTo().window(child).getTitle();
				System.out.println(pagetitle); 
				driver.manage().window().maximize();
				Thread.sleep(5000); 
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@value='Register with us']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@title='I am a Fresher']")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
