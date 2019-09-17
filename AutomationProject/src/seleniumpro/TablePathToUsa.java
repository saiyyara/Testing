package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePathToUsa {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/");
		driver.manage().window().maximize();
		String tabledata=driver.findElement(By.xpath("//tr[1]/td[2]")).getText();
		System.out.println(tabledata); 
		driver.close();

	}

}
