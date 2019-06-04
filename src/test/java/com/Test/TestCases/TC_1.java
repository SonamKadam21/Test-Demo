package com.Test.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Test.PageObjects.LoginPage;

public class TC_1 extends BaseClass {
	
	
	@Test
	public void loginTest() throws InterruptedException {
		//driver.get(URL);
		LoginPage Lp=new LoginPage(driver);
		Lp.enterLoginName(UserName);
		Thread.sleep(3000);
		Lp.enterLoginPassword(Password);
		
		Lp.enterLoginButton();
		
		if (driver.getTitle().equals("OrangeHRM")) {
			
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		
	}
	
	

}
