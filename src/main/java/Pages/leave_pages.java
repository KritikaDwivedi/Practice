package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leave_pages {

	WebDriver driver;
	
	@FindBy(xpath="//span[@title='Leave']")
	public WebElement leaveIcon;
	
	@FindBy(xpath="//a[text()='Apply Leave']")
	public WebElement applyLeave;
	
	@FindBy(xpath="//*[text()='Family Function']")
	public WebElement select;
	
	@FindBy(xpath="//button[text()='Apply']")
	public WebElement apply;
	
	public leave_pages(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
