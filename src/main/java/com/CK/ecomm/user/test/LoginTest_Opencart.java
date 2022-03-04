package com.CK.ecomm.user.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CK.ecomm.user.constant.UserConstant_Opencart;
import com.CK.ecomm.user.page.HomePage;
import com.CK.ecomm.user.page.LoginPage_Opencart;
import com.CK.web.core.CKBaseClass;
import com.CK.web.core.CKBaseWebTest;

public class LoginTest_Opencart extends CKBaseWebTest implements UserConstant_Opencart{

	@Test(groups= {"sanity","master"})
	public void test_Login()
	{
		logger.info(" Starting TC_002_Login ");
		
		try
		{
			driver.get(appURL);
			
			
			logger.info("Home Page Displayed ");
			
			driver.manage().window().maximize();
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account ");
			hp.clickLogin();
			logger.info("Clicked on Login ");
			
			LoginPage_Opencart lp=new LoginPage_Opencart(driver);
			
			lp.setEmail(Email);
			logger.info("Provided Email ");
			
			lp.setPassword(password);
			logger.info("Provided Password ");
			
			lp.clickLogin();
			logger.info("Clicked on Login");
			Thread.sleep(5000);
			
			
			boolean targetpage=lp.isMyAccountPageExists();
			
			if(targetpage)
			{
				logger.info("Login Success ");
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("Login Failed ");
				//captureScreen(driver, "test_Login"); //Capturing screenshot
				Assert.assertTrue(false);
			}
		}	
		catch(Exception e)
		{
			logger.fatal("Login Failed ");
			Assert.fail();
		}
		
		logger.info(" Finished LoginTest_Opencart ");
		
	}
	
	

	
	
}
