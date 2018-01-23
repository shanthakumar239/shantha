package com.actitime.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils {
	public static void selectByIndex(WebElement element, int n)
	{
		Select sel = new Select(element);
		sel.selectByIndex(n);
	}
	
	public static void selectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);;
	}
	
	public static void selectByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void deSelectAll(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.deselectAll();
	}
    public static void deSelectByIndex(WebElement element,int n)
    {
    	Select sel=new Select(element);
    	sel.deselectByIndex(n);
    }
    
    public static void isMultiple(WebElement element)
    {
    	Select sel=new Select(element);
    	sel.isMultiple();
    }



}
