package com.CK.ecomm.user.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CK.ecomm.user.constant.UserConstant_Opencart;
import com.CK.ecomm.user.page.HomePage;
import com.CK.ecomm.user.page.RegistrationPage_OpenCart;
import com.CK.web.core.CKBaseWebTest;

public class RegistrationTest_Opencart  extends CKBaseWebTest  implements UserConstant_Opencart{



	//@Test(groups={"regression","master"})
	@Test
    public void test_account_Registration()
    {
   	 logger.info("Strating RegistrationTest_Opencart");
   	try
   	{
   		driver.get(appURL);//dynamically get data from the properties file
   		logger.info("Home Page Displayed ");
   	 
   		driver.manage().window().maximize();
		
		 
   		HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account ");
			hp.clickRegister();
			logger.info("Clicked on Register ");
			
			RegistrationPage_OpenCart regpage =new RegistrationPage_OpenCart(driver);
   	 regpage.setFirstName("Dolly");
   	 logger.info("Provided First Name ");
   	 
   	 regpage.setLastName("suma");
   	 logger.info("Provided Last Name ");
   	 
   	regpage.setEmail(randomestring()+"@gmail.com");//randomly generated the email
   	 logger.info("Provided Email ");
   	 
   	 regpage.setTelephone("1234567890");
   	 logger.info("Provided Telephone ");
   	 
		 regpage.setPassword(password);
		logger.info("Provided Password ");
		
		 regpage.setConfirmPassword(password);
		logger.info("Provided Confrmed Password ");
		
   	 regpage.setPrivacyPolicy();
   	 logger.info("Set Privacy Policy ");
   	 
   	 regpage.clickContinue();
   	 logger.info("Clicked on Continue ");
   	 
   	     	 Thread.sleep(5000);
   	 
        String confmsg=regpage.getConfirmationMsg();
        
      if(confmsg.equals("Your Account Has Been Created!"))
       	     // if(confmsg.equals("Your Account Has Been Created!"))//Intensely failing
		{
       	 logger.info("Account Registration Success ");
			  Assert.assertTrue(true);
		}
		else
		{
			
			//captureScreen(driver, "test_account_Registration"); //Capturing screenshot in the screenshot folder==>we mentioned caputescreen method in the base class

			logger.error("Account Registration Failed ");
		    Assert.assertTrue(false);
			
		}
   	}
   	catch(Exception e)
   	{
   	logger.fatal("Account Registration Failed");//Fatal means blocker
   	Assert.fail();
   	
   	}
   	logger.info("Finished RegistrationPage_OpenCart");
   	
    }
    
    





	
}
