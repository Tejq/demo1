package com.w3schools;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest { 
	protected WebDriver driver = null;
	//protected HomePage W3 = null;

	@BeforeClass
		public void intibrowser() {
			this.driver =this.getWebDriver();
			//this.W3 = new HomePage(driver);
		}
	
	   @Test
	    public void Login () throws InterruptedException{
	    	
	    }
	}