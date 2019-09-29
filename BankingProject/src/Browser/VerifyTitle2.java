package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle2 {

	public static void main(String[] args)
			throws Throwable
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		String expecttitle=driver.getTitle();
		String actualtitle="google";
		
		if(expecttitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Title is matching ::"+expecttitle+" "+actualtitle);
		}
		else
		{
			System.out.println("Title is not matching ::"+expecttitle+" "+actualtitle);
		}
		Thread.sleep(7000);
		driver.close();
	}

}
