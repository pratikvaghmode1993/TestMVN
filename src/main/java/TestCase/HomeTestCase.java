package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjectRepository.HomePageYoutube;

public class HomeTestCase {
	
	@Test
	public void EnterSerachKeyWord()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Pratik Vaghmode\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.youtube.com/");
	    HomePageYoutube hp =  new HomePageYoutube(driver);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.presenceOfElementLocated(hp.Searchlocator()));
		 */
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	  //set the text
	  jsExecutor.executeScript("document.getElementById('search').value='testuser'");
	    
	   
	  
	    
	}

}
