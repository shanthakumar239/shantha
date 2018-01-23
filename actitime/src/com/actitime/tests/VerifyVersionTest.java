package com.actitime.tests;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.Exceldata;
import com.actitime.pages.LoginPage;

public class VerifyVersionTest extends BaseTest {
@Test
public void testVerifyVersion()
{
	String title=Exceldata.getData(path, "Login", 1, 0);
	String userName=Exceldata.getData(path, "login", 1, 1);
	String psw=Exceldata.getData(path, "login", 1, 2);
	String version=Exceldata.getData(path, "Login", 1, 3);
	LoginPage lp=new LoginPage(driver);
	
	//verify title of LoginPage
	lp.verifyingTitle(title);
	
	//verify version
	lp.verifyVersion(version);
	
	lp.enterUserName(userName);
	lp.enterPassword(psw);
}
}
