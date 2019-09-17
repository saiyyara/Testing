package seleniumpro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWrite {

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fi=new FileInputStream("E:\\Dummy.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheetAt(0);
		int rc=ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		for(int i=1;i<=rc;i++)
		{
			//write some text in result column
			ws.getRow(i).createCell(2).setCellValue("Pass");
		}
		fi.close();
		FileOutputStream fo=new FileOutputStream("E:\\Dummy.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	
	}

}
