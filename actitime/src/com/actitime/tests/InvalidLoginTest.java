package com.actitime.tests;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.Exceldata;
import com.actitime.pages.LoginPage;

public class InvalidLoginTest extends BaseTest {
	@Test
	public void testInvalidLogin()
	{
		String un=Exceldata.getData(path, "Login", 3, 1);
		String pwd=Exceldata.getData(path, "Login", 3, 2);
		String title=Exceldata.getData(path, "Login", 3, 0);
	
      LoginPage lp=new LoginPage(driver);
      lp.verifyTitle(title);
      lp.enterUserName(un);
      lp.enterPassword(pwd);
      lp.clickLoginButton();
      lp.verifyErrorMessage();
}
}