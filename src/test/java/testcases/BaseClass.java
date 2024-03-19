package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.ReadConfig;

public class BaseClass {
	protected WebDriver driver;
	ReadConfig config = new ReadConfig();
	
	private String url = config.getURL();;
	
	@BeforeClass()
	public void setup() throws InterruptedException
	{
		System.setProperty("Webdreiver.chrome.driver","./Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser launched");
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page");
	}
	
	@AfterClass()
	public void teardown()
	{
		driver.quit();
	}

}
