package seleniumpro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteByInterface {

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fi=new FileInputStream("E:\\Employee.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		Sheet ws=wb.getSheetAt(0);
		int rc=ws.getLastRowNum();
		System.out.println("No of Rows::"+rc);
		for(int i=1;i<=rc;i++)
		{
			String Employee=ws.getRow(i).getCell(0).getStringCellValue();
			String Job=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(Employee+"\t"+Job);
			ws.getRow(i).createCell(2).setCellValue("Fail"); 
		}
		fi.close();
		FileOutputStream fo=new FileOutputStream("F:\\Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}

}
