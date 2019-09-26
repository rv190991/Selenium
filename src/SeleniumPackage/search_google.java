package SeleniumPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class search_google 
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = new FileInputStream("E:\\Ravi\\Selenium class\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet ws = wb.getSheet("Sheet3");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Row row;
		String str;
		String s;
		for(int r=1;r<=ws.getLastRowNum();r++)
		{
			row = ws.getRow(r);
			for(int c=0;c<row.getLastCellNum()-1;c++)
			{
				s = row.getCell(c).getStringCellValue();
				driver.findElement(By.name("q")).sendKeys(s);
				Actions a = new Actions(driver);
				a.sendKeys(Keys.ENTER).perform();
				Thread.sleep(2000);
				str = driver.findElement(By.id("resultStats")).getText();
				System.out.println("The number of results for "+s+" is: "+str);
				row.createCell(1).setCellValue(str);
				driver.navigate().back();
			}
			
		}
		
		FileOutputStream fout = new FileOutputStream("E:\\Ravi\\Selenium class\\data.xlsx");
		wb.write(fout);
		wb.close();
		fin.close();
		fout.close();
		driver.close();
		
		
	}

}
