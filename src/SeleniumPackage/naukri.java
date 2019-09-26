package SeleniumPackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class naukri 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(5000);
		
		ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<lst.size();i++)
		{
			driver.switchTo().window(lst.get(i));
			if(driver.getTitle().contains("Naukri")==false)
				{
					driver.close();
				}
		}

	}

}
