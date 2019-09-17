package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePath2Usa {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/");
		driver.manage().window().maximize();
		//store table
		WebElement table=driver.findElement(By.xpath("//table[@class='table']"));
		//find no of rows
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("No of rows::"+rows.size());
		driver.close();
	}

}
