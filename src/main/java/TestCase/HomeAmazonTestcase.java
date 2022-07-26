package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ObjectRepository.HomeAmazon;

public class HomeAmazonTestcase {
	
	
	@Test
	public void SerachTextEnter()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Pratik Vaghmode\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.amazon.in/");
	    HomeAmazon Ha = new HomeAmazon(driver);
	    Ha.EnterTextSearch().sendKeys("power bank");
	    Ha.Button().click();
	}

}
