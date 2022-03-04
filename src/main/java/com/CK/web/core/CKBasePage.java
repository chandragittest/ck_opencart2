package com.CK.web.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CKBasePage {
	WebDriver driver;

	public CKBasePage(WebDriver driver)
	{
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	}

	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}

}
