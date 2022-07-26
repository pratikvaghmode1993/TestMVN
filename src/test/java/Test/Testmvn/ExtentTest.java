package Test.Testmvn;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.logging.log4j.*;

public class ExtentTest {
	ExtentReports extent ;
	private static Logger log = LogManager.getLogger(ExtentTest.class.getName());

	@Test
	public void Demo()
	{
	    com.aventstack.extentreports.ExtentTest test =extent.createTest("Initial Demo");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Pratik Vaghmode\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    log.debug("I am debugging");
		driver.get("https://www.jenkins.io/download/");
		log.info("browser opened");
		
		System.out.println(driver.getTitle());
		driver.close();
		
		test.fail("I am failed");
		extent.flush();
	}
	
	@AfterTest
	public void config()
	{
		String path =System.getProperty("user.dir")+"\\reports\\index.html";	
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		
	    extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "pratik");
	}
	
}
