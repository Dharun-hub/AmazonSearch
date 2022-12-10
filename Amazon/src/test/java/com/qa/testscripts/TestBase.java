package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;  

public class TestBase {
	
	WebDriver driver;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setup(String Browser, String Url) {
		
		if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get(Url);
		driver.manage().window().maximize();
	}
	
//	@AfterClass
//	public void TearDown() {
//		driver.close();
//	}

}
