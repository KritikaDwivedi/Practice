package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nest_PageObject{
	 WebDriver driver;
		@FindBy(id="username")
		public WebElement username;
		
		@FindBy(name="password")
		public WebElement password;
		
		@FindBy(xpath="//div[@title='Log out']//img")
		public WebElement logout;
		
		public Nest_PageObject(WebDriver driver)
		{
			 this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		 
		
		
	}
	

