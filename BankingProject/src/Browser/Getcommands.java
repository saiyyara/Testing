package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args)
	throws Throwable
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		//get the Title of page and Length
		
		String strtitle=driver.getTitle();
		System.out.println("Page Title is ::"+strtitle);
		System.out.println("Page Title Length is: :"+strtitle.length());
		
		//get the Current Url and length of url
		String strurl=driver.getCurrentUrl();
		System.out.println("Url of the page is ::"+strurl);
		System.out.println("Url of the page length is ::"+strurl.length());
		Thread.sleep(5000);
		driver.close();
	}

}
