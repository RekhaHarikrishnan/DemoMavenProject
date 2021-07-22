package com.adactin;

import org.openqa.selenium.WebDriver;

import com.Automation.Base_Class;
import com.adactinproject.PomBookHote2;
import com.adactinproject.PomContinue;
import com.adactinproject.PomLogin;
import com.adactinproject.PomLogout1;
import com.adactinproject.PomSearchHotel;

public class AdactinProject extends Base_Class {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=browserLaunch("chrome");
		openUrl("https://adactinhotelapp.com/");
		implicitlyWaitMethod();
		
		//logIn
		PomLogin p = new PomLogin(driver);
		sendTheValues(p.getUserName(), "Rekha123");
		sendTheValues(p.getPassword(), "Vibin@@16");
		clickTheButton(p.getLogIn());
		
		//SerachHotel
		PomSearchHotel psh = new PomSearchHotel(driver);
		
		dropdownUsingValue(psh.getLocation(), "Melbourne");
		dropdownUsingText(psh.getHotels(), "Hotel Hervey");
		dropdownUsingIndex(psh.getRoomType(), 2);
		dropdownUsingValue(psh.getNoofRooms(), "4");
		dropdownUsingValue(psh.getAdults(),"3");
		dropdownUsingValue(psh.getChildren(), "2");
		clickTheButton(psh.getSerach());
		
		//Radio Button
		
		PomContinue pc = new PomContinue(driver);
		clickCheckBox(pc.getButton());
		clickTheButton(pc.getContinue2());
		
		
		//BookNow
		PomBookHote2 pbh = new PomBookHote2(driver);
		implicitlyWaitMethod();
		sendTheValues(pbh.getFirstName(), "Rekha");
		sendTheValues(pbh.getLastName(), "Harikrishnan");
		sendTheValues(pbh.getAddresss(),"No:A1,Vishmya Homes,ch-126");
		sendTheValues(pbh.getCreditcardNo(), "123456789101121325");
		dropdownUsingValue(pbh.getCreditcardType(), "MAST");
		dropdownUsingIndex(pbh.getExpiryDate(), 3);
		dropdownUsingText(pbh.getExpirtyear(), "2016");
		sendTheValues(pbh.getCvvNumber(), "123654");
		clickTheButton(pbh.getBookNow());
		
		//Logout
		
		PomLogout1 pl = new PomLogout1(driver);
		implicitlyWaitMethod();
		clickTheButton(pl.getLogOut());
		
	}

}
