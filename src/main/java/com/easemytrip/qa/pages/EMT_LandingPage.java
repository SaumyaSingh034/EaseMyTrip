package com.easemytrip.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClass.Base;

public class EMT_LandingPage extends Base{
	
	WebDriver driver;
	
	//Object Repository
	
	@FindBy(id = "spnMyAcc")
	WebElement myAccount;
	
	@FindBy(id="shwlogn")
	WebElement loginBtn;
	
	@FindBy(id="txtEmail")
	WebElement email_mobileLogin;
	
	@FindBy(id="shwotp")
	WebElement continueBtn;
	
	
	
	//Constructor
	
	
	
	
	//Action Methods
	
	
	
	
	
	

}
