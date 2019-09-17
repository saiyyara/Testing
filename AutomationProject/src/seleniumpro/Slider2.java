package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider2 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//div[@id='slider']"));
		ac.dragAndDropBy(slider, 250, 0);
		ac.build().perform();
		Thread.sleep(6000); 
		ac.dragAndDropBy(slider,-150, 0);
		ac.build().perform();
		Thread.sleep(6000);
		driver.close();
	}

}
