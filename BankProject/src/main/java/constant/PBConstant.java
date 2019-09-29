package constant;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PBConstant {
	public static WebDriver driver;
	public static Properties p;
	public static FileInputStream fi;

	@BeforeMethod
	public void launch() throws Throwable {
		p = new Properties();
		fi = new FileInputStream("E:\\AutoSelenium\\AutomationProject\\PropertyFile\\Environment.properties");
		p.load(fi);
		driver = new ChromeDriver();
		driver.get(p.getProperty("objurl"));
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void logout() {
		driver.close();
	}
}
