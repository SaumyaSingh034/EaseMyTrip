package com.easemytrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.Base;

public class EMT_LandingPage extends Base{
	
	
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
	
	public EMT_LandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	//Action Methods
	
	
	public String getTitleofPage()
	{
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public void clickOnLogin()
	{
		Actions a = new Actions(driver);
		a.moveToElement(myAccount);
		loginBtn.click();
		
	}
	
	public void loginWithValidCredentials(String input)
	{
		email_mobileLogin.sendKeys(input);
		continueBtn.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
