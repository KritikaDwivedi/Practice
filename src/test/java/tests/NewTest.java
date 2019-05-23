package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Nest_PageObject;
import Pages.leave_pages;

public class NewTest{
	WebDriver driver;
	
  @Test(dataProvider="nestLoginCredentials")
  public void login_page(String user, String pass) throws InterruptedException {
	  Nest_PageObject obj1=new Nest_PageObject(driver);
	  obj1.username.sendKeys(user);
	  obj1.password.sendKeys(pass);
	  Actions act=new Actions(driver);
	  act.sendKeys(Keys.ENTER).build().perform();
	  Assert.assertEquals(driver.getTitle(), "Infostretch NEST");
	  Thread.sleep(10);
//	  WebDriverWait wait=new WebDriverWait(driver, 20);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated((By) obj1.logout));
	  driver.switchTo().frame(obj1.logout);
	  obj1.logout.click();
  }
  
  @Test(priority=1)
  public void leave_validation()
  {		
	  leave_pages obj2=new leave_pages(driver);
	  obj2.leaveIcon.click();
	  obj2.applyLeave.click();
	  Actions act=new Actions(driver);
	  act.click(driver.findElement(By.xpath("//div[text()='Select']"))).moveToElement(obj2.select).click().build().perform();	  
	  obj2.apply.click();
	  
  }
  
  @DataProvider(name="nestLoginCredentials")
  public static Object[][] dp()
  {	
	  return new Object[][] {{"ashish.biradar1","Test@1234"},{"tushit.shah","tushit.shah"}};
  
  }
  
  @BeforeTest()
  public void testbase() throws InterruptedException
  {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kritika.dwivedi\\Downloads\\chromedriver.exe"); 
	driver=new ChromeDriver();
	driver.get("http://10.12.40.86/nest_security_testing/#/login");
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(20);
//	WebDriverWait wait=new WebDriverWait(driver, 20);
//	 wait.until(ExpectedConditions.visibilityOfElementLocated((By) Nest_PageObject.password));
	

}
}
