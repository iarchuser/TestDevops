package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@Listeners(testcases.TestcaseListeners.class)
public class LoginTest extends BaseClass {
	
	
	
	private String username = config.getUsername();
	private String password = config.getPassword();
	
	private WebElement txt_uname;
	private WebElement txt_pwd;
	private WebElement btn_Login;
	
	
	
	
	@Test(priority=1)
	public void test_EnterUser()
	{
		txt_uname = driver.findElement(By.xpath("//input[@name='uid']"));;
		txt_uname.sendKeys(username);
	}
	
	@Test(priority=2)
	public void test_EnterPassword()
	{
		txt_pwd = driver.findElement(By.name("password")); 
		txt_pwd.sendKeys(password);
	}
	
	@Test(priority=3)
	public void test_Login()
	{
		btn_Login  = driver.findElement(By.name("btnLogin"));
		btn_Login.click();
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
		
	}

}
