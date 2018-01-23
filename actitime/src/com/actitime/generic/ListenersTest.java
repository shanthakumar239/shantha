package com.actitime.generic;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener {
	

		@Override
		public void onTestStart(ITestResult result) 
		{
			
		}

		@Override
		public void onTestSuccess(ITestResult result) 
		{
			
		}

		@Override
		public void onTestFailure(ITestResult result) 
		{
			String name = result.getMethod().getMethodName();
		
			EventFiringWebDriver e = new EventFiringWebDriver(BaseTest.driver);
			File src = e.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenShots/"+name+".png");
			try 
			{
				org.apache.commons.io.FileUtils.copyFile(src, dest);
			} 
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
			
		}

		@Override
		public void onTestSkipped(ITestResult result) 
		{
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
		{
			
		}

		@Override
		public void onStart(ITestContext context) 
		{
			
		}

		@Override
		public void onFinish(ITestContext context) 
		{
			
		}
}
