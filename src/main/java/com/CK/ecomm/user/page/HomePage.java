package com.CK.ecomm.user.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CK.web.core.CKBasePage;

public class HomePage extends  CKBasePage {
	  private WebDriver driver;

	 
	public HomePage(WebDriver driver) throws InterruptedException
			{
				super(driver);
				//Thread.sleep(TIMEOUT_2000);

				PageFactory.initElements(driver,this);
			}
			//Elements
			@FindBy(xpath="//span[text()='My Account']")
			WebElement lnkMyaccount;
			
			@FindBy(linkText="Register")
			WebElement lnkRegister;
			
			@FindBy(linkText="Login")
			WebElement linkLogin;
			
			//Action Methods
			public void clickMyAccount()
			{
				lnkMyaccount.click();
			}
				
			public void clickRegister()
			{
				lnkRegister.click();
			}
			
			public void clickLogin()
			{
				linkLogin.click();
			}




}
