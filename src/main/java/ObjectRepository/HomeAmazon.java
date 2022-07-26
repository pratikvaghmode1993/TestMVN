package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeAmazon {
	WebDriver driver;
	
	public HomeAmazon(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By searchProduct = By.xpath("//input[@type='text']");
	By Button = By.id("nav-search-submit-button");
	
	public WebElement EnterTextSearch() {
		return driver.findElement(searchProduct);
	}
	
	public WebElement Button()
	{
		return driver.findElement(Button);
	}

}
