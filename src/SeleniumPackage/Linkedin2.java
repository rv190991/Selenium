package SeleniumPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkedin2 
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = new FileInputStream("D:\\Ravi\\Selenium class\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet ws = wb.getSheet("Sheet5");
		
		Row row;
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		for(int r=1;r<=ws.getLastRowNum();r++)
		{
			row = ws.getRow(r);
			driver.get("https://www.linkedin.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()='Join now']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys(row.getCell(0).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.id("last-name")).sendKeys(row.getCell(1).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.id("join-email")).sendKeys(row.getCell(2).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.id("join-password")).sendKeys(row.getCell(3).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.id("submit-join-form-text")).click();
			Thread.sleep(2000);
			//driver.findElement(By.className("recaptcha-checkbox-border")).click();
			//Thread.sleep(3000);
			
			try
			{
				if(driver.findElement(By.xpath("//h3[text()='Security verification']")).isDisplayed())
				{
					System.out.println("Success");
					row.createCell(4).setCellValue("Success");
				}
			}
			catch(Exception e)
			{
				String str = driver.findElement(By.xpath("//strong")).getText();
				System.out.println("Failure");
				row.createCell(4).setCellValue("Failure : "+str);
			}
			
		}
		FileOutputStream fout = new FileOutputStream("D:\\Ravi\\Selenium class\\data.xlsx");
		wb.write(fout);
		wb.close();
		fin.close();
		fout.close();
		driver.close();
		
	}

}
