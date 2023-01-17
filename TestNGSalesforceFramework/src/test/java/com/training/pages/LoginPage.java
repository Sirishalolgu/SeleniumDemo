package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.training.base.BasePage;

public class LoginPage extends BasePage {

	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	@FindBy(id="username")
	WebElement Username;
	
	

	public void enterIntoUserName(String stremail)
	{
		waitForElement(10, Username);
		Username.sendKeys(stremail);
	}
	
	@FindBy(id="password")
	WebElement password;
	
	public void enterIntoPassword(String strPassword)
	{
		
		
		password.sendKeys(strPassword);
		
			
	}
	
	@FindBy(id="password")
	WebElement clearpassword;
	
	public void clearPassword()
	{
		
		
		password.clear();
		
			
	}
	
	@FindBy(id="error")
	WebElement messagePwd;
	
	public void displaymessagePwd()
	{
		waitForElement(10,messagePwd);
		String message=messagePwd.getText();
		System.out.println(message);
	}
	
	
	@FindBy(id="Login")
	WebElement clickLogin;
	
	public void clickOnLogin()
	{
		clickLogin.click();
	}
	
	
	@FindBy(xpath="//label[contains(text(),'Remember me')]")
	WebElement rememberMe;
	
	public void clickOnrememberMe()
	{
		rememberMe.click();
	}
	
	
	@FindBy(id="forgot_password_link")
	WebElement forgotPwd;
	
	public void clickonforgotPwd()
	{
		forgotPwd.click();
		
	}
	
	@FindBy(xpath="//span[contains(@id,'idcard-identity')]")
	WebElement validUsername;
	
	public void checkUsername()
	{
		
        String actualUsername=validUsername.getText();
        System.out.println(actualUsername);
        waitForElement(20, validUsername);
		String expectedUsername="selenium@techarch.com";
		Assert.assertEquals(actualUsername, expectedUsername);
		
//		if(actualUsername.equalsIgnoreCase(expectedUsername))
//		{
//			System.out.println("Username is displayed");
//
//		}
//		else
//		{
//			System.out.println("Username is not displayed");
//
//		}
	}
	
	
	@FindBy(id="un")
	WebElement resetpwd;
	@FindBy(id="continue")
	WebElement continuepwd;
	@FindBy(xpath="//p[contains(text(),'sent you an email')]")
	WebElement messagepwd;
	
	public void sendresetpwd() {
		
		resetpwd.sendKeys("selenium@techarch.com");
		continuepwd.click();
		String displaymessage=messagepwd.getText();
		System.out.println(displaymessage);
		
	}
	
	@FindBy(id="error")
	WebElement messageAdmin;
	public void displayerrormesg() {
		String display=messageAdmin.getText();
		System.out.println(display);
	}
}
