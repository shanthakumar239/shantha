package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.generic.Basepage;

public class LoginPage extends Basepage {
	
	//declaration
	
	@FindBy(id ="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;	
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errMsg;
	
	@FindBy(xpath="//nobr[contains(.,'actiTIME 2017')]")
	private WebElement version;
	
	//Initialization
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	
	//utilization
	
	public void verifyingTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLoginButton()
	{
		loginBTN.click();
	}
	
	public void verifyErrorMessage()
	{
		verifyElement(errMsg);
	}
	
	public void verifyVersion(String eVersion)
	{
		String aVersion = version.getText();
		try
		{
			Assert.assertEquals(aVersion, eVersion);
			Reporter.log("Version Matching: "+aVersion, true);
		}
		catch(Exception e)
		{
			
		}
	}

	

}
