package com.selenium.interviewquestions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// get parent window
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		// click on Terms link
		WebElement element1 = driver.findElement(By.partialLinkText("Ter"));
		element1.click();
		/*
		 * Get Collection of Windows
		 */
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		for (String each : allWindows) {
			// Parent should not equal to any child window
			if (!parent.equals(each)) {
				// switch to child window
				driver.switchTo().window(each);
				WebDriverWait wait = new WebDriverWait(driver, 7);
				WebElement element2 = driver
						.findElement(By.xpath("//a[contains(text(),' 1. The services we provide ')]"));
				wait.until(ExpectedConditions.elementToBeClickable(element2));
				element2.click();
				// switch back to parent window
				driver.switchTo().window(parent);

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Danish");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastname']")));
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Equbal");
				Thread.sleep(4000);
				driver.quit();
			}
		}
	}

}
