package com.selenium.interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		WebElement element1=driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Year')]"));
		Select yearList=new Select(element1);
		yearList.selectByVisibleText("2002"); 
		 
		List<WebElement> olist=yearList.getOptions();
		System.out.println("No of Elements:"+olist.size()); 
		for(int i=0;i<olist.size();i++) 
		{
			String str=olist.get(i).getText();
			System.out.println(str);
		}
	}

}
