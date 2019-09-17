package seleniumpro;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fi=new FileInputStream("E:\\Dummy.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Login");
		XSSFRow   r=ws.getRow(0);
		//System.out.println(r); 
		int rc=ws.getLastRowNum();
		int cc=r.getLastCellNum();
		System.out.println("No of Rows are::"+rc+"\t\t"+"No of columns in 1st Row::"+cc); 
		for(int i=1;i<=rc;i++)
		{
			String username=ws.getRow(i).getCell(0).getStringCellValue();
			String password=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"\t "+password);
		}
		wb.close();
		fi.close();
	}

}
