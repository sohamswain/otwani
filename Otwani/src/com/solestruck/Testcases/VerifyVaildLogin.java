package com.solestruck.Testcases;

import helper.BrowserFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.solestruck.Pages.LoginPageNew;

public class VerifyVaildLogin {
	
	@Test
	public void checkValidUser() throws InterruptedException
	{
		
		//will launch browser and specific url
		WebDriver driver= BrowserFactory.startBrowser("firefox", "http://www.solestruck.com/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.findElement(By.id("myaccount")).click();
		
		//created page object using Page Factory
		LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
		
		//Call the method
		login_page.login_solestruck("sohamswain@gmail.com", "soham");
		
		
	}

}
 