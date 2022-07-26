package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAmazonPF {
	WebDriver driver;

	public HomeAmazonPF(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="twotabsearchtextbox")
	WebElement serchText;
	
	@FindBy(id="nav-search-submit-button")
	WebElement button;
	
	
	
	
	public WebElement SerchText()
	{
		return serchText;
	}
	
	public WebElement Button()
	{
		return button;
	}
}
