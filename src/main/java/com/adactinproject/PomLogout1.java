package com.adactinproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogout1 {
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@value='Logout']")
	private WebElement logOut;

	public PomLogout1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogOut() {
		return logOut;
	}

}
