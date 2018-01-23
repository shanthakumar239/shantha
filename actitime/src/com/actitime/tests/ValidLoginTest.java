package com.actitime.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.Exceldata;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;
@Listeners(com.actitime.generic.ListenersTest.class)
public class ValidLoginTest extends BaseTest {

	@Test
	public void testvalidloginlogout()
	{
		String title=Exceldata.getData(path,"Login", 1, 0);
		String userName=Exceldata.getData(path, "login", 1, 1);
		String psw=Exceldata.getData(path, "login", 1, 2);
		LoginPage ln=new LoginPage(driver);
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		
		ln.verifyTitle(title);
		ln.enterUserName(userName);
		ln.enterPassword(psw);
		ln.clickLoginButton();
		ep.clickOnLogout();
	}

}
