package com.CK.web.core;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CKBaseWebTest {
    public WebDriver driver;
	 public Logger logger;//for Logging

	
    String browserType ="chrome";
	//protected WebDriver driver = null;
    
    @BeforeMethod
	public void setup() throws InterruptedException
	
		{
        logger=LogManager.getLogger(this.getClass()); //dynamically get the class name which where is executing the run time

    	driver = CKBrowserFactory.getDriver(browserType);
	    
			 // WebDriverManager.chromedriver().setup(); driver=new ChromeDriver();
			   	  
	    	//driver.get("https://www.google.com/");	
			driver.get("https://demo.opencart.com/");
			driver.manage().window().maximize();


		  	Thread.sleep(4000);  
	    	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  	
		  	
			}
    @AfterMethod
	//    public void cleanup() 
    public void tearDown() 
	{
		//driver.close();
		driver.quit();
		//driver = null;
	}
	

  	

		public String randomestring()
		{
		String generatedString = RandomStringUtils.randomAlphabetic(6);
		return (generatedString);
		}
		
	

	public int randomeNumber()
	{
	String generatedString2 = RandomStringUtils.randomAlphabetic(5);
	return (Integer.parseInt(generatedString2));
	}
			
	

	


}
