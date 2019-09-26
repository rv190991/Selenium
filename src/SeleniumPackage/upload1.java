package SeleniumPackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class upload1 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.monster.com");
	}

}
