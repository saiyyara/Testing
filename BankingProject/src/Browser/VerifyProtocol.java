package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyProtocol {

	public static void main(String[] args)
	throws Throwable
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String strurl=driver.getCurrentUrl();
		if(strurl.startsWith("https://"))
		{
			System.out.println("url is secured :");
		}
		else
		{
			System.out.println("Url is not secured :");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
