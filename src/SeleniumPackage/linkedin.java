package SeleniumPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkedin 
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = new FileInputStream("D:\\Ravi\\Selenium class\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet ws = wb.getSheet("Sheet4");
		
		Row row;
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		for(int r=1;r<=ws.getLastRowNum();r++)
		{
			row=ws.getRow(r);
			driver.get("https://www.linkedin.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()='Sign in']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys(row.getCell(0).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys(row.getCell(1).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();
			Thread.sleep(3000);
			
			try
			{
				if(driver.findElement(By.id("feed-tab-icon")).isDisplayed())
				{
					System.out.println("Login is successfull");
					row.createCell(2).setCellValue("Login is successful");
					Thread.sleep(2000);
					driver.findElement(By.id("nav-settings__dropdown-trigger")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Sign out']")).click();
					Thread.sleep(2000);
					
				}
			}
			catch(Exception e)
			{
				String str = driver.findElement(By.id("error-for-password")).getText();
				row.createCell(2).setCellValue("Login is Failed : "+str);
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
