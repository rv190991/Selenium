package SeleniumPackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hdfc2 
{

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com");
		//driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
		driver.findElement(By.id("loginsubmit")).click();
		
		Thread.sleep(5000);
		
		ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		driver.findElement(By.xpath("(//a[text()='Continue to NetBanking'])[2]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("46663917");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

	}

}
