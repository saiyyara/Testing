package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.shadi.com/");
		driver.manage().window().maximize();
		
		//Use select class
		Select religion=new Select(driver.findElement(By.xpath("//*[@name='religion']")));
		
		boolean value1=religion.isMultiple();
		System.out.println(value1);
		Thread.sleep(3000);
		
		religion.selectByVisibleText("Islam");
		Thread.sleep(3000);
		
		religion.selectByValue("7-58"); 
		Thread.sleep(3000);
		
		religion.selectByIndex(25);
		System.out.println(religion.getFirstSelectedOption().getText());
		Thread.sleep(3000); 
		driver.close();

	}

}
