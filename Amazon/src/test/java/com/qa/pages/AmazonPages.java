package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {
	
	WebDriver driver;
	
	@FindBy(id = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")
	WebElement searchBox;
	public WebElement SearchBox() {
		return searchBox;
	}
	
//	@FindBy(xpath="")
//	WebElement mgnbtn;
//	public WebElement MgnBtn() {
//		return mgnbtn;
//	}
//	
	public AmazonPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
