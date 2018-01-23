package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.actitime.generic.Basepage;

public class EnterTimeTrackPage extends Basepage {
	@FindBy(id="logoutLink")
	private WebElement logoutBTN;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_support']")
    private WebElement helpbtn;
	
	@FindBy(xpath="//a[.='About your actiTIME']")
    private WebElement about_timeTrack;
	
	 @FindBy(xpath="//span[.='(build 40004)']")
	    private WebElement buildNum;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogout()
	{
		logoutBTN.click();
	}
    
    public void help()
    {
    	helpbtn.click();
    }
    
    public void aboutTimeTrack()
    {
    	about_timeTrack.click();
    }
    
    public void varifyBuildNum(String exptBuild)
    {
    	String actBuild=buildNum.getText();
    	Assert.assertEquals(actBuild, exptBuild);
    }
}
