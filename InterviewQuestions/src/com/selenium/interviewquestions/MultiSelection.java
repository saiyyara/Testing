package com.selenium.interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file://C:/Users/danish/Desktop/Multi.html");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.name("multiSelection"));
		Select list=new Select(element);
		boolean value=list.isMultiple();
		System.out.println(value);
		
		list.selectByValue("blue");
		Thread.sleep(2000);
		list.selectByValue("green");
		Thread.sleep(2000);
		list.selectByValue("red");
		Thread.sleep(2000);
		list.selectByValue("golden");
		Thread.sleep(2000); 
		
		List<WebElement> olist=list.getAllSelectedOptions();
		System.out.println("No Of Selected Items::"+olist.size());
		for(int i = 0; i < olist.size(); i++) 
		{
			String str=olist.get(i).getText();
			System.out.println(str); 
		}
		list.deselectByValue("green");
		Thread.sleep(2000);
		driver.close();
	}

}
