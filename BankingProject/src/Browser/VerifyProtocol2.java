package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyProtocol2 {

	public static void main(String[] args) 
	throws Throwable
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		String geturl=driver.getCurrentUrl();
		
		if (geturl.startsWith("https://")) 
		{
			System.out.println("--Url is secured--");
		}
		else
		{
			System.out.println("---Url is not secured---");
		}
		Thread.sleep(7000);
		driver.close();
	}

}
