package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageYoutube {

       WebDriver driver;
       public HomePageYoutube(WebDriver driver)
       {
    	   this.driver=driver;
       }
       By searchname = By.id("container");
       
       public WebElement  EnterSearch()
       {
    	   return driver.findElement(searchname);
       }
       
       public By Searchlocator()
       {
    	   return searchname;
       }
}
