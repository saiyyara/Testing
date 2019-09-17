package mytestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenFramework 
{
	WebDriver driver;
	FileInputStream fi;
	FileOutputStream fo;
	XSSFWorkbook  wb;
	XSSFSheet ws;
	XSSFRow r;
	@BeforeTest
	public void launch()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void login() throws Throwable
	{
		//read path of excel
		fi=new FileInputStream("./Input//Logindata.xlsx");
		//get workbook from file
		wb=new XSSFWorkbook(fi);
		//get sheet
		ws=wb.getSheet("Login");
		//get first row from sheet
		r=ws.getRow(0);
		//get count  rows  and columns from sheet
		int rc=ws.getLastRowNum();
		int cc=r.getLastCellNum();
		Reporter.log("No of Rows:"+rc+"No of columns in row:"+cc,true);
		for(int i=1;i<=rc;i++)
		{
			driver.get("http://orangehrm.qedgetech.com");
			driver.manage().window().maximize();
			//read Username data column
			String Username=ws.getRow(i).getCell(0).getStringCellValue();
			String Password=ws.getRow(i).getCell(1).getStringCellValue();
			//fill login form
			driver.findElement(By.name("txtUsername")).sendKeys(Username);
			driver.findElement(By.name("txtPassword")).sendKeys(Password);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(4000);
			if(driver.getCurrentUrl().contains("dash"))
			{
				//take screen shot for pass and store
				File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//copy screen shot into local system
				FileUtils.copyFile(screen,new File("E://Datadriven//screens//iteration//"+i+" "+"Loginpage.png"));
				Reporter.log("Login Success",true);
				//write as login success into result column
				ws.getRow(i).createCell(2).setCellValue("Login Success");
				//write pass into status column
				ws.getRow(i).createCell(3).setCellValue("PASS");
			} 
			else
			{
				File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screen,new File("E://Datadriven//screens//iteration//"+i+" "+"Loginpage.png"));
				//get error message
				String message=driver.findElement(By.id("spanMessage")).getText();
				Reporter.log(message,true);
				ws.getRow(i).createCell(2).setCellValue(message);
 				//write as Fail into status column
				ws.getRow(i).createCell(3).setCellValue("FAIL");
			}
		}
		fi.close();
		fo=new FileOutputStream("./Output/LoginResults.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}
	@AfterTest
	public void logout()
	{
		driver.close();
	}
}
