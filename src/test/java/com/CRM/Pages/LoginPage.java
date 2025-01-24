package com.CRM.Pages;

import org.openqa.selenium.By;
import com.CRM.Utility.*;


import org.openqa.selenium.WebDriver;

import com.CRM.Utility.UtilityScreenshot;

public class LoginPage {
	
	private WebDriver driver;
	
	//Intialize driver
	
	public LoginPage(WebDriver driver) //Base Class Session Driver
	{
		
		this.driver=driver;
		
	}
	
	
	//Locators
	
	private By email = By.id("email-id");
	private By pwd =  By.id("password");
	private By submit= By.name("submit-name");
	
	// Methods
	
	public String doLogin(String em , String ps)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(pwd).sendKeys(ps);
		driver.findElement(submit).click();
		UtilityScreenshot.getscreenshot(driver);
		return driver.getCurrentUrl();
	}
	
	
	
	
	

}
