package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcLink {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		//click on every link
		driver.findElement(By.linkText("FLIGHTS")).click();
		driver.findElement(By.linkText("STAY")).click();
		driver.findElement(By.linkText("RAIL DRISHTI")).click();
		driver.findElement(By.linkText("E-CATERING")).click();

	}

}
