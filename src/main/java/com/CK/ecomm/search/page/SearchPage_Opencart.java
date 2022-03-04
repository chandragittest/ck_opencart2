package com.CK.ecomm.search.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.CK.ecomm.search.constant.SearchConstant_Opencart;
import com.CK.web.core.CKBasePage;

public class SearchPage_Opencart extends  CKBasePage implements SearchConstant_Opencart {
	
	//Locators
	@FindBy(how=How.NAME, name=SEARCH_BOX_NAME_LOCATOR)
	WebElement searchBoxElm;
	@FindBy(how=How.NAME, name=SEARCH_BTN_NAME_LOCATOR)
	WebElement searchbtnElm;
	

	//Actions
	public SearchPage_Opencart(WebDriver driver) throws InterruptedException {
		super(driver);
		//Thread.sleep(TIMEOUT_2000);
        PageFactory.initElements(driver,this);

	}

	public void setSearchBoxData(String searchWord) {
		searchBoxElm.sendKeys(searchWord);
	}
	
	public void Clicksearchbtn() {
		searchbtnElm.click();
	}
	
	public void performGoogleSearch(String SearchWord) throws InterruptedException {
		setSearchBoxData(SearchWord);
		//Thread.sleep(TIMEOUT_2000);
		searchbtnElm.submit();
	}
	
	
   }
