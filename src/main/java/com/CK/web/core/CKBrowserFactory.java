package com.CK.web.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CKBrowserFactory {
	
	public static WebDriver getDriver(String driverType) {
		WebDriver driver = null;

		switch(driverType){
		case "IE":	
			driver = createIEDriver();
			break;
		case "chrome":	
			driver = createChromeDriver();
			break;
		case "firefox":	
			driver = createFirfoxDriver();
			break;
		case "edge":	
			driver = createEdgeDriver();
			break;
		case "safari":	
			driver = createSafariDriver();
			
		default:
		    throw new RuntimeException("Check the correct browser type");	
		}
		return driver;
	}

	private static WebDriver createIEDriver() {
		//set path
		return new InternetExplorerDriver();
	}
	
	private static WebDriver createChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kchan\\Documents\\drivers\\chromedriver.exe");
		return new ChromeDriver();
		
	}

	private static WebDriver createFirfoxDriver() {
		//set path 
		return  new FirefoxDriver();
	}

	private static WebDriver createEdgeDriver() {
	    //set path
		return  new EdgeDriver();
	}

	private static WebDriver createSafariDriver() {
		//set path
		return new SafariDriver();
	}


}
