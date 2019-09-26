package SeleniumPackage;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class robot
{

	public static void main(String[] args) throws Exception 
	{
		
				FirefoxDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2019-06/R/eclipse-java-2019-06-R-win32-x86_64.zip");
				
				driver.findElement(By.linkText("eclipse-java-2019-06-R-win32-x86_64.zip")).click();
				
				Thread.sleep(5000);
				
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				
				Thread.sleep(2000);
				
				r.keyPress(KeyEvent.VK_ENTER);


	}

}
