package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	
	@FindBy(xpath="//input[@name='uid']")
	 WebElement txt_uname;
	
	@FindBy(name="password")
	 WebElement txt_pwd;
	
	@FindBy(name="btnLogin")
	 WebElement btn_login;
	
	public void EnterUserName(String uName)
	{
		txt_uname.sendKeys(uName);
	}
	
	public void EnterPassword(String paswd)
	{
		txt_pwd.sendKeys(paswd);
	}
	
	public void ClickLoginButton()
	{
		btn_login.click();
	}
	
}
