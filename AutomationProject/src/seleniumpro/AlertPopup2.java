package seleniumpro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//get parent windows id
		String parent=driver.getWindowHandle();
		System.out.println("Currently loaded window::"+parent);
		Thread.sleep(3000);
		//click on terms link
		driver.findElement(By.id("terms-link")).click();
		Thread.sleep(3000);
		//get collection of all windows
		Set<String> allwindid=driver.getWindowHandles();
		System.out.println(allwindid); 
		for(String each:allwindid)
		{
			if(!parent.equals(each)) 
			{
				driver.switchTo().window(each);
				Thread.sleep(3000); 
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/a[1]")).click();
				//Switch Back to parent
				
				driver.switchTo().window(parent);
				Thread.sleep(4000); 
				driver.quit();
			}
		}
		
	} 

}
