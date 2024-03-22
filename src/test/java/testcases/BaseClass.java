package testcases;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;

public class BaseClass {
	protected WebDriver driver;
	ReadConfig config = new ReadConfig();
	
	private String url = config.getURL();;
	
	@BeforeClass()
	public void setup() throws InterruptedException
	{
		//System.setProperty("Webdreiver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
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
	
	public void sendKeys(WebDriver driver, WebElement element, int i, String value)
	{
		Duration duration = Duration.of(i, ChronoUnit.SECONDS);
		new WebDriverWait(driver, duration).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

}
