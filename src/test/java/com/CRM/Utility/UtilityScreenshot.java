package com.CRM.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityScreenshot {
	
	public static void getscreenshot(WebDriver driver) {

		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir")+"//screenshot//Test"+System.currentTimeMillis()+".png");
		
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
