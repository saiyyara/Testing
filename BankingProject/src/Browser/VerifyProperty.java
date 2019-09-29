package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyProperty {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://openmind.cfapps.io/employee");
		driver.manage().window().maximize();
		//Get gmail URl
		
		String url=driver.findElement(By.linkText("LATEST JOBS")).getAttribute("href");
		System.out.println(url);
		driver.close();

	}

}
