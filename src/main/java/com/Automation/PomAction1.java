package com.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomAction1 {
public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	
	@FindBy(xpath="//a[text()='Tops']")
	private WebElement tops;
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement image;
	
	
	public PomAction1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getTops() {
		return tops;
	}

	public WebElement getImage() {
		return image;
	}


}
