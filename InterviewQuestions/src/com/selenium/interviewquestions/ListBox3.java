package com.selenium.interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		String expect = "amazon Fresh";
		boolean itemexist = false;
		WebElement element1 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select list = new Select(element1);

		List<WebElement> olist = list.getOptions();
		System.out.println("No of Items Present::" + olist.size());
		for (WebElement x : olist) {
			String str = x.getText();
			System.out.println(str);
			if (str.equalsIgnoreCase(expect)) {
				itemexist = true;
				break;
			}
		}
		driver.close();
	}

}
