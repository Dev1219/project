package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTestCases extends BaseClass
{
	@BeforeClass
	public void pageSetUp(){
		hp.getStatusOfLink();
	}
	
  @Test
  public void validateLogin() {
	  
	  String url = lp.doLogin("test@gmail.com", "test123");
	  Assert.assertTrue(url.contains("customers"),"Test Fail: Login Fail:");
	  System.out.println("Test Page: Login Successfully!!");
	  
  }
}
