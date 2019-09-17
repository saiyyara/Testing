package seleniumpro;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSec {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fi=new FileInputStream("E:\\Employee.xlsx");
		XSSFWorkbook    wb=new XSSFWorkbook(fi);
		XSSFSheet       ws=wb.getSheetAt(0);
		XSSFRow         r=ws.getRow(0);
		int rc=ws.getLastRowNum();
		for(int i=1;i<=rc;i++)
		{
			if(i%2==0)
			{
			ws.getRow(i).createCell(2).setCellValue("Pass");
			}
			else
			{
				ws.getRow(i).createCell(2).setCellValue("Fail");
			}
		}
		fi.close();
		FileOutputStream fo=new FileOutputStream("E:\\Employee.xlsx");
		wb.write(fo);
		wb.close();
		fo.close();
	}

}
