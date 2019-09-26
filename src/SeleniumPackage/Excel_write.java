package SeleniumPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_write 
{
	@Test
	public void write() throws Exception 
	{
		FileInputStream fin = new FileInputStream("D:\\Ravi\\Selenium class\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		Row row = ws.createRow(0);
		row.createCell(0).setCellValue("Selenium");
		row.createCell(1).setCellValue("Java");
		row.createCell(2).setCellValue("SQL");
		row.createCell(3).setCellValue("QTP");
		row.createCell(4).setCellValue("A");
		row.createCell(5).setCellValue("B");
		row.createCell(6).setCellValue("C");
		row.createCell(7).setCellValue("D");
		
		row = ws.createRow(1);
		row.createCell(0).setCellValue("1");
		row.createCell(1).setCellValue("2");
		row.createCell(2).setCellValue("3");
		row.createCell(3).setCellValue("4");
		row.createCell(4).setCellValue("5");
		row.createCell(5).setCellValue("6");
		row.createCell(6).setCellValue("7");
		row.createCell(7).setCellValue("8");
		
		FileOutputStream fout = new FileOutputStream("D:\\Ravi\\Selenium class\\data.xlsx");
		wb.write(fout);
		wb.close();
		fin.close();
		fout.close();

	}

}
