package seleniumpro;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCloseEacc {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
		//click every link button
		Thread.sleep(3000);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click(); 
		driver.findElement(By.linkText("Terms")).click();
		
		//create list
		
		ArrayList<String> brwid=new ArrayList<>(driver.getWindowHandles());
		System.out.println(brwid); 
		//get title of child windows
		String title=driver.switchTo().window(brwid.get(3)).getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Help Center")).click();
		Thread.sleep(3000);
		driver.close();
		//get title of Privacy
		String ptitle=driver.switchTo().window(brwid.get(2)).getTitle();
		System.out.println(ptitle); 
		Thread.sleep(3000);
		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(3000);
		driver.close();
		String termstitle=driver.switchTo().window(brwid.get(1)).getTitle();
		System.out.println(termstitle);
		driver.findElement(By.linkText("Terms of Service")).click();
		Thread.sleep(3000);
		driver.close();
		String parenttitle=driver.switchTo().window(brwid.get(0)).getTitle();
		System.out.println(parenttitle);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("dotnetlambda@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("god8252089308");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.close();
		
		
		
		
		
		
		
		

	}

}
