package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.AccountPage;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.utilities.CommonUtilities;

public class AccountTest extends BaseTest{
	
	
	WebDriver driver;
	CommonUtilities common=new CommonUtilities();
	String browser;
	String url;
	LoginPage login;
	HomePage Home;
	String email;
	String password;
	AccountPage Account;
	

	@BeforeMethod
	public void beforeMethod() throws Exception
	{   browser=common.getproperty("browser");
		url=common.getproperty("url");
		driver=getDriver(browser);
		driver.get(url);
		driver.manage().window().maximize();
		login=new LoginPage(driver);
		Home=new HomePage(driver);
		Account=new AccountPage(driver);
		email=common.getproperty("email");
		password=common.getproperty("password");
		
		
	}
	
	
	@Test
	public void tc10CreateAccount()
	{
		login.enterIntoUserName(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		Account.clickOnAccount();
		Account.clickOnCreateAccount();
		System.out.println("TC10 complete");
	}
	
	
	@Test
	public void tc11CreateNewView()
	{
		login.enterIntoUserName(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		Account.clickOnAccount();
		Account.clickToCreatView();
		System.out.println("TC11 complete");
	}
	
	@Test
	public void tc12editView()
	{
		
		login.enterIntoUserName(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		Account.clickOnAccount();
		Account.clickToselectAccount();
		Account.clickToeDitViewAccount();
	
		
	}
	
	
	@Test
	public void tc13mergeAccounts() 
	
	{
		
		login.enterIntoUserName(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		Account.clickOnAccount();
		Account.clickOnCreateAccount();
		Account.clickOnAccount();
		Account.clickTomerge();
		
	}
	
	@Test
	public void tc14AccountReport() 
	
	{
		
		login.enterIntoUserName(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		Account.clickOnAccount();
		Account.clickTocreateReport();		
	}
	
	
}
 