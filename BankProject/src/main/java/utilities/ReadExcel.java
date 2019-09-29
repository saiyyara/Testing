package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	Workbook wb;
	FileOutputStream fo;

	// to read excel path write constructor
	public ReadExcel(String excelpath) throws Throwable {
		FileInputStream fi = new FileInputStream(excelpath);
		wb = WorkbookFactory.create(fi);
	}

	// count no of rows in a sheet
	public int rowCount(String sheetname) {
		return wb.getSheet(sheetname).getLastRowNum();
	}

	// count no of column in a row
	public int colCount(String sheetname) {
		return wb.getSheet(sheetname).getRow(0).getLastCellNum();
	}

	// get cell data
	public String cellData(String sheetname, int row, int col) {
		String data = "";
		if (wb.getSheet(sheetname).getRow(row).getCell(col).getCellType() == Cell.CELL_TYPE_NUMERIC) {
			// get Numeric Data

			int celldata = (int) wb.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
			// convert int to string
			data = String.valueOf(celldata);
		} else {
			data = wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
		}
		return data;
	}

	// method for writing or inserting
	public void setData(String sheetname, int row, int col, String status, String writexcel) throws Throwable {
		wb.getSheet(sheetname).getRow(row).createCell(col).setCellValue(status);
		fo = new FileOutputStream(writexcel);
		wb.write(fo);
	}

	// method to close files
	public void closeFiles() throws Throwable {
		fo.close();
		wb.close();
	}

	// filling green color
	public void greenColour(String sheetname, int row, int col, String writexcel) throws Throwable {
		Sheet ws = wb.getSheet(sheetname);
		CellStyle style = wb.createCellStyle();
		Font font = wb.createFont();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		// Apply Bold to the Text
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		style.setFont(font);
		ws.getRow(row).getCell(col).setCellStyle(style);
		fo = new FileOutputStream(writexcel);
		wb.write(fo);
	}

	// filling red color
	public void redColour(String sheetname, int row, int col, String writexcel) throws Throwable {
		Sheet ws = wb.getSheet(sheetname);
		CellStyle style = wb.createCellStyle();
		Font font = wb.createFont();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		// Apply Bold to the Text
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		style.setFont(font);
		ws.getRow(row).getCell(col).setCellStyle(style);
		fo = new FileOutputStream(writexcel);
		wb.write(fo);
	}
}
