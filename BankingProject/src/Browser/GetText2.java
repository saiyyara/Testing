package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText2 {

	public static void main(String[] args)
			throws Throwable
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		String textmatch=driver.findElement(By.partialLinkText("For")).getText();
		
		if(textmatch.equalsIgnoreCase("Forgot Password?"))
		{
			System.out.println("Link Text is matching:");
			
		}
		else
		{
			System.out.println("Link text is not matching");
		}
		Thread.sleep(6000);
		driver.close();
				

	}

}
