package com.automate;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

//import org.basedemo.PomAction;
//import org.basedemo.PomAutomation;
//import org.basedemo.PomClick;
//import org.basedemo.PomFrame;
//import org.openqa.selenium.WebDriver;

import com.Automation.Base_Class;
import com.Automation.PomAction1;
import com.Automation.PomAutomation1;
import com.Automation.PomClick1;
import com.Automation.PomFrame1;

public class DemoAutomationProect extends Base_Class{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
	
	driver = browserLaunch("CHROME");
    openUrl("http://automationpractice.com/index.php");
	implicitlyWaitMethod();
	//SignIn
	PomAutomation1 pa = new PomAutomation1(driver);
    clickTheButton(pa.getSignIn());
    sendTheValues(pa.getEmail(),"vibin123@gmail.com" );
    sendTheValues(pa.getPassword(), "jenishaa");
   	clickTheButton(pa.getLogIn());
	
	//Mouse Action
	PomAction1 pam = new PomAction1(driver);
	mouseOverAction(pam.getWomen());
	clickTheButton(pam.getTops());
	clickTheButton(pam.getImage());
	
	//Frame
	PomFrame1 pf = new PomFrame1(driver);
	frameUsingIndex(0);
	clickTheButton(pf.getAddToCart());
	Thread.sleep(3000);
	quitFrame();
	
	//click Option
	
	PomClick1 pc = new PomClick1(driver);
	clickTheButton(pc.getProceed());
	clickTheButton(pc.getProceed1());
	clickTheButton(pc.getProceed2());
	clickCheckBox(pc.getCheckBox());
	clickTheButton(pc.getProceed3());
	clickTheButton(pc.getBank());
	clickTheButton(pc.getConfirm());
	
	//Screenshot
	
	takeScreenshot("C:\\Users\\ranjithrekha\\eclipse-workspace-new\\DemoProjectMaven\\Screenshot/index");
	
	}
}
	
	
	


