package com.adactinproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSearchHotel {
	public static WebDriver driver;
	
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(name="room_nos")
	private WebElement noofRooms;
	
	@FindBy(name="adult_room")
	private WebElement adults;
	
	@FindBy(id="child_room")
	private WebElement children;
	
	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private WebElement serach;
	

	public PomSearchHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoofRooms() {
		return noofRooms;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSerach() {
		return serach;
	}

	
	
}
