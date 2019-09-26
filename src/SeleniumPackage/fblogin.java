package SeleniumPackage;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class fblogin 
{

	public void test() throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		Pattern UID = new Pattern("D:\\Ravi\\Selenium class\\UID.PNG");
		Pattern PWD = new Pattern("E:\\Ravi\\Selenium class\\PWD.PNG");
		Pattern Login = new Pattern("E:\\Ravi\\Selenium class\\Login.PNG");
		
		Screen s = new Screen();
		
		s.type(UID, "ravikiran.dbz@gmail.com");
		Thread.sleep(1000);
		s.type(PWD, "kritika22");
		Thread.sleep(1000);
		s.click(Login);

	}

}
