package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

public class HomePageTestCases extends BaseClass
{
  @Test (priority =1)
  public void verifyUrl() 
  {
	  
	 String actUrl =  hp.getAppUrl();
	 
	 Assert.assertTrue(actUrl.contains("crm"),"Test Fail: URL Not Matched:!");
	 
	 System.out.println("Test Pass: URL Matched! ");
	  
  }
  
  @Test (priority =2)
  public void verifyTitle() 
  {
	  String actTitle = hp.getTitle();
	  Assert.assertTrue(actTitle.contains("Customer"),"Test Fail: Title is Not Matched");
	  System.out.println("Test Pass: Title Matched!!");
  }
  
  @Test (priority =3)
  public void validateSignInLink() {
	  
	 String nextPageUrl= hp.getStatusOfLink();
	 Assert.assertTrue(nextPageUrl.contains("login"),"Test Fail:");
	 System.out.println("Application Navigate to next page");
	 
	 
	 
	  
  }
}
