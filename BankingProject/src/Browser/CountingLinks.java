package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		//get collection of links in a page which are stored in html tags "a".
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No of links are :"+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			//get each link name
			String linkname=links.get(i).getText(); 
			
			//get url of each link
			String url=links.get(i).getAttribute("href");
			System.out.println(linkname+"\n"+url);
		}
		driver.close();
	}

}
