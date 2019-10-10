package com.selenium.interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxExample {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		/*ListBox or DropDown
		 * Create object of ListBox of select class
		 */
		WebElement element1=driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Month')]"));
		WebElement element2=driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Year')] "));
		Select monthList=new Select(element1);
		Select yearList=new Select(element2);
		boolean value1=monthList.isMultiple();
		boolean value2=yearList.isMultiple();
		System.out.println(value1+" "+value2); 
		monthList.selectByIndex(1);
		System.out.println(monthList.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		List<WebElement> olist=monthList.getOptions();
		System.out.println("No of months:"+olist.size());
		for(int i=0;i<olist.size();i++)
		{
			String str=olist.get(i).getText();
			System.out.println(str);
		}
		yearList.selectByValue("2019");
		yearList.getAllSelectedOptions();
		Thread.sleep(4000);
		driver.close();
	}

}
