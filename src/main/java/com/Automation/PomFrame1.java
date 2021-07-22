package com.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomFrame1 {
public static WebDriver driver;
	
	@FindBy(xpath="//button[@class='exclusive']")
	private WebElement addToCart;

	public PomFrame1(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
}



