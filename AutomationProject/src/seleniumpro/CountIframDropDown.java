package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class CountIframDropDown {

	public static void main(String[] args) 
	{
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://jqueryui.com/accordion/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//get no of frames
		List<WebElement> olist=driver.findElements(By.tagName("iframe"));
		System.out.println("No of Frames is ::"+olist.size());
		driver.close();
	}

}
