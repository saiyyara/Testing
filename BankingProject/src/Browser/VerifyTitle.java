package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args)
	throws Throwable
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		String expcttitle=driver.getTitle();
		String actualtitle="google";
		if(expcttitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Title is matching::"+expcttitle+" "+actualtitle);
		}
		else
		{
			System.out.println("Title is not matching::"+expcttitle+" "+actualtitle);
		}
		Thread.sleep(5000);
		driver.close();
	}

}
