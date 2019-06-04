package com.Test.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
	
	
	public static WebDriver driver;
	public String URL="https://opensource-demo.orangehrmlive.com/";
	public String UserName="Admin";
	public String Password="admin123";
	
	@BeforeClass
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(URL);
		  System.out.println("launched");
}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

}