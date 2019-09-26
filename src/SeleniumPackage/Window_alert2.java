package SeleniumPackage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_alert2 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		/*Thread.sleep(5000);
		
		ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<lst.size();i++)
		{
			driver.switchTo().window(lst.get(i));
			if(driver.getTitle().contains("Naukri")==false)
				{
					driver.close();
				}
		}*/
		
		Thread.sleep(3000);
		new Actions(driver).moveToElement(driver.findElement(By.id("uploadBtnCont"))).click().perform();
		Thread.sleep(5000);
		
		Robot r = new Robot();
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection("E:\\Ravi\\Docs\\resumes\\RV1991 - Resume.docx"), null);  // copied the text into clipboard memory
		r.keyPress(KeyEvent.VK_CONTROL);   // paste the text from clipboard   ctrl + v
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);


	}

}
