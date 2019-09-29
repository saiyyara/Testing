package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) 
	throws Throwable
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://openmind.cfapps.io/employee");
		driver.manage().window().maximize();
		
		String textlink=driver.findElement(By.partialLinkText("Gm")).getText();
		
		if(textlink.equalsIgnoreCase("gmail"))
		{
			System.out.println("Link text is matching::");
		}
		else
		{
			System.out.println("link text is not matching::");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
