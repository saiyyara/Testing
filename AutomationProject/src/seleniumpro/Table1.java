package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		String list1=driver.findElement(By.xpath("//tr[2]/td[2]")).getText();
		System.out.println(list1);
		String celltext1=driver.findElement(By.xpath("//tr[6]/td[3]")).getText();
		System.out.println(celltext1); 
		driver.close();

	}

}
