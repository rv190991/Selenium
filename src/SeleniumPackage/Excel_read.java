package SeleniumPackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_read 
{
	@Test
	public void read() throws Exception
	{
		FileInputStream fin = new FileInputStream("D:\\Ravi\\Selenium class\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		Row row;
		for(int i=0; i<=ws.getLastRowNum();i++)
		{
			row = ws.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				System.out.print(" "+row.getCell(j));
			}
			System.out.println("");
			
		}
		wb.close();
		fin.close();

	}

}
