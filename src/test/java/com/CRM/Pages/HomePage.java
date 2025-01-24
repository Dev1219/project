package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	//Encapsulation
	//Private Data + Public Method
	
	// 3 Steps for creating your own framework (Structure)
	
	private WebDriver driver;
	
	// Initialize driver
	
	public HomePage(WebDriver driver) //baseclass driver
	{
		this.driver =driver;
	}
	
	//Data Member(Locator)
	
	private By link = By.linkText("Sign In");
	
	
	
	// Method (Functionality to test)
	
	
	public String getAppUrl() 
	{
		return driver.getCurrentUrl();
	}
	
	public String getTitle() 
	
	{
		
		return driver.getTitle();
	}
	
	public String getStatusOfLink() 
	{
		driver.findElement(link).click();
		return driver.getCurrentUrl(); 
	}

}
