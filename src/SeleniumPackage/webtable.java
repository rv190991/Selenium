package SeleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Daily Share Prices")).click();
		Thread.sleep(3000);
		String str;
		List<WebElement> l = driver.findElements(By.xpath("//table[@id='gridSource']/tbody/tr"));
		if(driver.findElement(By.xpath("//table[@id='gridSource']/tbody/tr[not(contains(@style, 'display: none;'))]")).isDisplayed())
		{
			for(int i=0;i<l.size();i++)
			{
				str = driver.findElement(By.xpath("//table[@id='gridSource']/tbody/tr["+(i+1)+"]/td[1]")).getText();
				System.out.println(str);
			}
		}
		else
		{
			System.out.println("End of page 1");
		}

	}

}
