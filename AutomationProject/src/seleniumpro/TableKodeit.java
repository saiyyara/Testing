package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableKodeit {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		String list1=driver.findElement(By.xpath("//tr[3]/td[2]")).getText();
		System.out.println(list1); 
		String list2=driver.findElement(By.xpath("//tr[4]/td[3]")).getText();
		System.out.println(list2); 
		driver.close();

	}

}
