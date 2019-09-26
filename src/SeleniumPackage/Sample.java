package SeleniumPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample 
{

		  @BeforeTest
		  public void f3()
		  {
			  System.out.println("=======common code=======");
		  }
		  @Test(priority=1)
		  public void userreg()
		  {
			  System.out.println("new user register");
		  }	  
		  @Test(priority=2)
		  public void login()
		  {
			  System.out.println("code for login");	  
		  }
	 

}
