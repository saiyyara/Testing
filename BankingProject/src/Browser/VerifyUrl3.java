package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl3 {

	public static void main(String[] args) 
	throws Throwable
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/home.aspx");
		driver.manage().window().maximize();
		
		String mathedurl=driver.getCurrentUrl();
		
		if(mathedurl.startsWith("https://"))
		{
			System.out.println("-------Url is secured------");
		}
		else
		{
			System.out.println("----url is not secured---");
		}
		Thread.sleep(6000);
		driver.close();
	}

}
