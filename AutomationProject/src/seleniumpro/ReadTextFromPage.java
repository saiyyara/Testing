package seleniumpro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTextFromPage {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		File f=new File("E://Name.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);

		String para1=driver.findElement(By.xpath("//div[2]/div[2]/p[1]")).getText();
		String para2=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/p[2]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		driver.close();
	}
	
}
