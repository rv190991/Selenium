package SeleniumPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class login_validation 
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = new FileInputStream("D:\\Ravi\\Selenium class\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet ws = wb.getSheet("Sheet2");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Row row;
		String str;
		for(int r=1;r<=ws.getLastRowNum();r++)
		{
			row=ws.getRow(r);
			
				driver.get("https://login.yahoo.com/config/login");
				driver.findElement(By.name("username")).sendKeys(row.getCell(0).getStringCellValue());
				driver.findElement(By.name("signin")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("password")).sendKeys(row.getCell(1).getStringCellValue());
				driver.findElement(By.name("verifyPassword")).click();
				Thread.sleep(1000);
				
				try
				{
					if(driver.findElement(By.id("uh-search-box")).isDisplayed())
					{
						//System.out.println("inside if loop");
						row.createCell(2).setCellValue("Login is success");
						WebElement w = driver.findElement(By.xpath("//span[text()='Ravi kiran']"));
						Actions a = new Actions(driver);
						a.moveToElement(w).perform();
						Thread.sleep(1000);
						driver.findElement(By.xpath("//a[@aria-label='Sign out']")).click();
						Thread.sleep(2000);
					}
				}
				catch(Exception e)
				{
					str=driver.findElement(By.xpath("//p[@class='error-msg']")).getText();
					row.createCell(2).setCellValue("Login is failed  : "+str);
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
