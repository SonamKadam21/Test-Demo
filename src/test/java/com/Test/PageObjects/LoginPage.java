package com.Test.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	 public LoginPage(WebDriver rdriver){
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
		 
	 }


@FindBy(id="txtUsername")
WebElement userName1;


@FindBy(name="txtPassword")
WebElement userPassword1;

@FindBy(name="Submit")
WebElement submitButton;


public void enterLoginName(String uname)
{
	userName1.sendKeys(uname);
	
	
}

public void enterLoginPassword(String Pname)
{
	userPassword1.sendKeys(Pname);
	
	
}

public void enterLoginButton()
{
	submitButton.click();
	
	
}
}
