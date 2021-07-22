package com.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomAutomation1 {
	public static WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement signIn;
	
	@FindBy(xpath="(//input[@data-validate='isEmail'])[2]")
	private WebElement email;
	
	@FindBy(name="passwd")
	private WebElement password;
	
	@FindBy(name="SubmitLogin")
	private WebElement logIn;
	
	public PomAutomation1(WebDriver driver2) {
	
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	

}



