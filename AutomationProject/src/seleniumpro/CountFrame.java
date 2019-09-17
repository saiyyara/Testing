package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CountFrame {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//get collection of Frames
		
		List<WebElement> olist=driver.findElements(By.tagName("iframe"));
		System.out.println("No of Frames in a page::"+olist.size()); 
		//switch To frame
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable")); 
		
		ac.clickAndHold(src).moveToElement(dst).release().perform();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		driver.findElement(By.linkText("Selectable")).click();
		Thread.sleep(6000);
		driver.close();

	}

}
