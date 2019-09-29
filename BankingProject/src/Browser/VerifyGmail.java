package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGmail {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Ramesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='text']//following::input[1]")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='text']//following::input[2]")).sendKeys("rameshkumar000111");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("rakes@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='password']//following::input[1]")).sendKeys("rakes@123");
		driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
