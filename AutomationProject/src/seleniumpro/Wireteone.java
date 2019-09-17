package seleniumpro;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Wireteone {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fi=new FileInputStream("E:\\Employee.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Login");
		XSSFRow   r=ws.getRow(0);
		int rc=ws.getLastRowNum();
		int cc=r.getLastCellNum();
		System.out.println("No of rows::"+rc);
		System.out.println("No of columns in rows::"+cc);
		//String Employee=ws.getRow(1).getCell(0).getStringCellValue();
		//String Job=ws.getRow(1).getCell(1).getStringCellValue();
		for(int i=0;i<=rc;i++)
		{
			String Employee=ws.getRow(i).getCell(0).getStringCellValue();
			String Job=ws.getRow(i).getCell(1).getStringCellValue();
		System.out.println(Employee+"\t"+Job);
		}
		wb.close();
		fi.close();
	}

}
