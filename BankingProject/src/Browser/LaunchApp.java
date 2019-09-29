package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchApp {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver","E:\\selenium\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();

	}

}
