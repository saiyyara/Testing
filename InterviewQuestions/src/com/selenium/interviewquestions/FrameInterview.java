package com.selenium.interviewquestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInterview {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/danish/Desktop/Iframe.html");
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> Olist=driver.findElements(By.tagName("iframe"));
		System.out.println(Olist.size());
		//driver.switchTo().frame(0);
		//String str=driver.findElement(By.xpath("//div[contains(text(),'Category:')]")).getText();
		//System.out.println(str); 
		//List<WebElement> Olist1=driver.findElements(By.tagName("iframe"));
		//System.out.println(Olist1.size()); 
		for(int i=0; i<Olist.size(); i++)
		{
			driver.switchTo().frame(i);
			int total=driver.findElements(By.xpath("//img[@src='/images/logo/logo_v1.png']")).size();
			System.out.println(total);
		    driver.switchTo().defaultContent();
		}
	
		driver.close();
	}

}
