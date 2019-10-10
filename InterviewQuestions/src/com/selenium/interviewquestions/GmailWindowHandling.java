package com.selenium.interviewquestions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailWindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.xpath("//a[contains(text(),'Help')]"));
		element1.click();
		WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
		element2.click();
		WebElement element3=driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
	    element3.click();
	    
	    ArrayList<String> browser=new ArrayList<String>(driver.getWindowHandles());
	    System.out.println(browser);
	    //switch to help window
	    
	    String helpTitle=driver.switchTo().window(browser.get(3)).getTitle();
	    System.out.println("1."+helpTitle);
	    
	    WebDriverWait wait=new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Help Center"))).click();
	    driver.close();
	    
	    //switch to Privacy Window
	    
	    String privacyTitle=driver.switchTo().window(browser.get(2)).getTitle();
	    System.out.println("2."+privacyTitle);
	    WebElement element4=driver.findElement(By.linkText("Technologies"));
	    wait.until(ExpectedConditions.elementToBeClickable(element4));
	    element4.click();
	    driver.close();
	    
	    //switch To Terms Window
	    String termsTitle=driver.switchTo().window(browser.get(1)).getTitle();
	    System.out.println("3."+termsTitle);
	    WebElement element5=driver.findElement(By.xpath("//a[contains(text(),'arch')]"));
	    wait.until(ExpectedConditions.elementToBeClickable(element5));
	    element5.click();
	    driver.close();
	    
	    //switch to parent window
	    String parentTitle=driver.switchTo().window(browser.get(0)).getTitle();
	    System.out.println(parentTitle);
	    WebElement element6=driver.findElement(By.xpath("//input[@id='identifierId']"));
	    wait.until(ExpectedConditions.visibilityOf(element6));
	    element6.sendKeys("dotnetlambda@gmail.com");
	    driver.close();
	}

}
