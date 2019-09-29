package BankProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyProj {
public static void main(String[] args)
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("");
	driver.manage().window().maximize();
	driver.close();
}
}
