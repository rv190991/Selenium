package Yahoo_Prg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MainClass 
{
  public static WebDriver driver; 
  
  public static String spath="d:\\sel_aug19\\images\\";
  public static ExtentHtmlReporter htmlreport;
  public static ExtentReports ext;
  public static ExtentTest log;

  @BeforeSuite
  public void initializeReport()
  {
	  System.out.println("======before suite");
	   htmlreport = new ExtentHtmlReporter("d:\\sel_aug19\\yahooreport.html");
	   ext = new ExtentReports();
	   ext.attachReporter(htmlreport);
	   ext.setSystemInfo("Host Name", "Venkatgn");
	   ext.setSystemInfo("Environment", "Test Env");
	   ext.setSystemInfo("User Name", "Venkat");
	   
	   htmlreport.config().setDocumentTitle("Yahoo");
	   htmlreport.config().setReportName("Yahoo Functional Testing");
	   htmlreport.config().setTestViewChartLocation(ChartLocation.TOP);
	   htmlreport.config().setTheme(Theme.STANDARD);
  }
  
  @AfterSuite
  public void updaterport()
  {
	   ext.flush();   //update all the data in the report and save
	   try
	   {
	   Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
	   Runtime.getRuntime().exec("taskkill /f /im geckodriver.exe");
	   }catch(Exception e) {}
  }
}
