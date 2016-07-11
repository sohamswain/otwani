package com.solestruck.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {
	
	
	WebDriver driver;
	
	public LoginPageNew(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(id ="email_login_new") //without HOW using
	WebElement username;
	
	@FindBy(how=How.ID, using="pass_new") //using HOW is a standard use
	WebElement password;
	
	@FindBy(how=How.ID, using="login_signIn") 
	WebElement login_button;
	
	@FindBy(how=How.XPATH, using=".//*[@id='signIn_form']/ul/li[3]/a[1]") 
	WebElement forgot_password;
	
	public void login_solestruck(String uid, String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		login_button.click();
	}

}
