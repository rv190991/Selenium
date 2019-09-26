package SeleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop 
{

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable");
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement w1=driver.findElement(By.id("draggable"));
		WebElement w2=driver.findElement(By.id("droppable"));
		new Actions(driver).dragAndDrop(w1, w2).perform();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Selectable")).click();
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		WebElement w = driver.findElement(By.id("selectable"));
		Thread.sleep(3000);
		List<WebElement> lst = driver.findElements(By.tagName("li"));
		new Actions(driver)	
			.keyDown(w, Keys.CONTROL)
			.click(lst.get(2))
			.click(lst.get(3))
			.click(lst.get(5))
			.keyUp(w, Keys.CONTROL)
			.perform();
			
		

	}

}
