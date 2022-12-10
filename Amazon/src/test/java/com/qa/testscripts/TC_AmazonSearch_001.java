package com.qa.testscripts;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;

public class TC_AmazonSearch_001 extends TestBase {
	
	
		
		AmazonPages pages;
		
		@Test
		public void search() throws InterruptedException{
			
			Thread.sleep(5000);
//			pages.SearchBox().click();
//			pages.SearchBox().sendKeys("da vince code");
////			pages.MgnBtn().click();
//			Thread.sleep(5000);
//			String title = driver.getTitle();
			
			((JavascriptExecutor)driver).executeScript("windows.scrollBy(0,document.body.scrollHeight)");
			
		}
}


