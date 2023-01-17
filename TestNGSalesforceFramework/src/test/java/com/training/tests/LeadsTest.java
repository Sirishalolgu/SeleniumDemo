package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.LeadsPage;
import com.training.pages.LoginPage;
import com.training.pages.OpportunityPage;
import com.training.utilities.CommonUtilities;

public class LeadsTest extends BaseTest{

	
	WebDriver driver;
	 CommonUtilities common=new CommonUtilities();
	 String url;
	 String email;
	 String password;
	 String browser;
	 LoginPage login;
	 HomePage Home;
	 OpportunityPage Opp;
	 LeadsPage lead;
	 
	 @BeforeMethod
		public void beforeMethod() throws IOException
		{
			email=common.getproperty("email");
			password=common.getproperty("password");
			browser=common.getproperty("browser");
			url=common.getproperty("url");
			driver=getDriver(browser);
			driver.get(url);
			driver.manage().window().maximize();
			login=new LoginPage(driver);
			Home=new HomePage(driver);
			Opp=new OpportunityPage(driver);
			lead=new LeadsPage(driver);
			
		}

	 
	 @Test
		public void tc20LeadTab()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			lead.clickToleadTab();
			System.out.println("TC20 passed");
		}
			
	 
	 @Test
		public void tc21LeadSelectView()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			lead.clickToleadTab();
			lead.clickToSelectView();
			System.out.println("TC21 passed");
		}
	 
	 @Test
		public void tc22LeaddefaultView()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			lead.clickToleadTab();
			lead.clickToSelectTodaylead();
			Home.clicklogOut();
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			lead.clickToleadTab();
			lead.clickTogO();
			
			
			//System.out.println("TC22 passed");
		}
	 
	 
	 @Test
		public void tc23Todaylead()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			lead.clickToleadTab();
			lead.clickToSelectTodaylead();
			Home.clicklogOut();
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			lead.clickToleadTab();
			lead.clickTogO();
			
			//select by value check
			//System.out.println("TC22 passed");
		}
	 
	 @Test
		public void tc24Newlead()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			lead.clickToleadTab();
			lead.clickToSelectTodaylead();
			Home.clicklogOut();
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			lead.clickToleadTab();
			//lead.clickTonewLead();
			
			//System.out.println("TC24 passed");
		}
	 
	// @AfterMethod
//		public void tearDown() {
	//
//			takescreenshot(driver);
//			driver.close();
//		}
}
	 
