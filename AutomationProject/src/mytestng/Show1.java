package mytestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Show1 {
 WebDriver driver;
 @BeforeTest
 public void launch() {
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Reporter.log("Running launch",true);
		} 
 @Test(description="Testing Register Link",priority=0,enabled=true)
 public void verifyRegister() {
 	driver.findElement(By.partialLinkText("REG")).click();
 	Reporter.log("Executing Register Test",true); 
 	}
 @Test(description="Testing Hotels Link",priority=1,enabled=true)
 public void verifyHotel() {
 	driver.findElement(By.partialLinkText("Hot")).click();
 	Reporter.log("Executing Hotels Test",true);
 	}
 @Test(description="Testing Sign-On Link",priority=2,enabled=true)
 public void verifySignon() {
 	driver.findElement(By.partialLinkText("SIG")).click();
 	Reporter.log("Executing Sign-On Test",true);
 	}
 @AfterTest(alwaysRun=true)
 public void logout() {
		driver.quit();
		Reporter.log("Running logout",true);
 	}
}
