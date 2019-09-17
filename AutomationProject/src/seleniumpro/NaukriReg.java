package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriReg {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		driver.findElement(By.name("userType")).click();
		driver.findElement(By.name("fname")).sendKeys("Danish Equbal");
		driver.findElement(By.name("email")).sendKeys("danishkutiiiii.rgtu@gmail.com");
		driver.findElement(By.name("password")).sendKeys("God!#gr8");
		driver.findElement(By.name("number")).sendKeys("7004988343");
		driver.findElement(By.name("uploadCV")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("E:\\Autoit\\UploadFiles.exe");
		Thread.sleep(5000);
		driver.findElement(By.name("basicDetailSubmit")).click();
		Thread.sleep(9000);
		driver.close();
	}

}
