package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommand1 {

	public static void main(String[] args) 
	throws Throwable
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println("Title of the page::"+title);
		System.out.println("length of the title is::"+title.length());
		
		String myurl=driver.getCurrentUrl();
		System.out.println("Url of the page is::"+myurl);
		System.out.println("Length of the url is ::"+myurl.length());
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
