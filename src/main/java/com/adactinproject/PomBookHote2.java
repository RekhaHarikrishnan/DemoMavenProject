package com.adactinproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomBookHote2 {
	public static WebDriver driver;
	
	@FindBy(xpath="(//input[@class='reg_input'])[1]")
	private WebElement firstName;
	
	@FindBy(name="last_name")
	private WebElement lastName;
	
	@FindBy(name="address")
	private WebElement addresss;
	
	@FindBy(id="cc_num")
	private WebElement creditcardNo;
	
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement creditcardType;
	
	@FindBy(name="cc_exp_month")
	private WebElement expiryDate;
	
	@FindBy(id="cc_exp_year")
	private WebElement expirtyear;
	
	@FindBy(id="cc_cvv")
	private WebElement CvvNumber;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement bookNow;

	
	public PomBookHote2(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddresss() {
		return addresss;
	}

	public WebElement getCreditcardNo() {
		return creditcardNo;
	}

	public WebElement getCreditcardType() {
		return creditcardType;
	}

	public WebElement getExpiryDate() {
		return expiryDate;
	}

	public WebElement getExpirtyear() {
		return expirtyear;
	}

	public WebElement getCvvNumber() {
		return CvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	
}
