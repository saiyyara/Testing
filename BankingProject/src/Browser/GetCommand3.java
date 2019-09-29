package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommand3 {

	public static void main(String[] args)
	throws Throwable
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://sarkarienaukri.in");
		driver.manage().window().maximize();
		
		String strtitle=driver.getTitle();
		System.out.println("Page title is :: "+strtitle);
		System.out.println("Length of the Title is::"+strtitle.length());
		
		String strurl=driver.getCurrentUrl();
		System.out.println("Url of the page is ::"+strurl);
		System.out.println("Length of the url is ::"+strurl.length());
		
		Thread.sleep(7000);
		driver.close();
	}

}
