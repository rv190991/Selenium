package SeleniumPackage;

import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class w3school 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
		Thread.sleep(5000);
		/*List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links in the webpage : "+links.size());
		for(int n=0;n<links.size();n++)
			{
				System.out.println("links in the website are :" + links.get(n));
			}*/
		List<WebElement>  lst=driver.findElements(By.tagName("iframe"));
		System.out.println("Total no of frames : "+lst.size());
		for(int i=0;i<lst.size();i++)
		{
		   driver.switchTo().frame(lst.get(i));
		   List<WebElement> ls2=driver.findElements(By.tagName("iframe"));  
		   System.out.println(i +" frame has child frames  :"+ls2.size());
		   driver.switchTo().defaultContent();
		}

	}

}
