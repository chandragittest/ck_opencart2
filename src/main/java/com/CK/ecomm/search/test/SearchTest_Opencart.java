package com.CK.ecomm.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CK.ecomm.search.constant.SearchConstant_Opencart;
import com.CK.ecomm.search.page.SearchPage_Opencart;
import com.CK.web.core.CKBaseWebTest;

public class SearchTest_Opencart extends CKBaseWebTest implements SearchConstant_Opencart {
	
		@Test
		public void testwithStringData() throws InterruptedException {
	    SearchPage_Opencart searchpage = new SearchPage_Opencart(driver);
		searchpage.performGoogleSearch(JAVA_BOOK_TEST_DATA);
			  
		//validations title, urls, some tesxt
		 Assert.assertEquals(searchpage.getTitle(),"Java book - Google Search");
 	     Assert.assertTrue(searchpage.getCurrentUrl().startsWith("https://www.google.com/search?q=Java"));
		}
		
		@Test
		public void testwithBlankData() throws InterruptedException {
		SearchPage_Opencart searchpage = new SearchPage_Opencart(driver);
		searchpage.performGoogleSearch("");
			
			    
		}
		
		@Test
		public void testwithNumberData(
				) throws InterruptedException {
		SearchPage_Opencart searchpage = new SearchPage_Opencart(driver);
		searchpage.performGoogleSearch("12344");
			    
			    
		}
		@Test
		public void testwithSpecialChaacters() throws InterruptedException{
		SearchPage_Opencart searchpage = new SearchPage_Opencart(driver);
		searchpage.performGoogleSearch("$%&");
			
		}


	

}
