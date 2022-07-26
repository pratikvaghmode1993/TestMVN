package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ObjectRepository.HomeAmazonPF;

public class HomeAmazonPFTestcase {
	
	
	@Test
	public void enterSearchText()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Pratik Vaghmode\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.amazon.in/");
	    HomeAmazonPF Hm = new HomeAmazonPF(driver);
	    Hm.SerchText().sendKeys("pratik");
	    Hm.Button().click();
	}

}
