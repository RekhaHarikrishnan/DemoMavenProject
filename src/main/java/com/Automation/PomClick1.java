package com.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClick1 {
public static WebDriver driver;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed1;
	
	@FindBy(name="processAddress")
	private WebElement proceed2;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(name="processCarrier")
	private WebElement proceed3;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bank;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm;
	
	
	
	public PomClick1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getProceed1() {
		return proceed1;
	}

	public WebElement getProceed2() {
		return proceed2;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getProceed3() {
		return proceed3;
	}

	public WebElement getBank() {
		return bank;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	


}



