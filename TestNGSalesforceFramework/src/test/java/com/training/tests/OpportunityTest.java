package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.pages.OpportunityPage;
import com.training.utilities.CommonUtilities;

public class OpportunityTest extends BaseTest {
	
	
	 WebDriver driver;
	 CommonUtilities common=new CommonUtilities();
	 String url;
	 String email;
	 String password;
	 String browser;
	 LoginPage login;
	 HomePage Home;
	 OpportunityPage Opp;
	 
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
			
		}
			@Test
			public void tc15opportunitydropdown()
			{
				login.enterIntoUserName(email);
				login.enterIntoPassword(password);
				login.clickOnLogin();
				Opp.clickOpportunityTab();
				Opp.displayOpportunity();
				System.out.println("TC15 passed");
			
			}
			
			@Test
			public void tc16creatAopportunity()
			{
				login.enterIntoUserName(email);
				login.enterIntoPassword(password);
				login.clickOnLogin();
				Opp.clickOpportunityTab();
				Opp.clickTocreateOpp();
				
				//System.out.println("TC16 passed");
			    //unable to click popup window
			}
			
			@Test
			public void tc17opportunityReport()
			{
				login.enterIntoUserName(email);
				login.enterIntoPassword(password);
				login.clickOnLogin();
				Opp.clickOpportunityTab();
				Opp.clickToOppPipeline();
				System.out.println("TC17 passed");
			    
			}
			
			@Test
			public void tc18opportunityReport()
			{
				login.enterIntoUserName(email);
				login.enterIntoPassword(password);
				login.clickOnLogin();
				Opp.clickOpportunityTab();
				Opp.clickTostuckOpp();
				System.out.println("TC18 passed");
			    
			}
			
			
			@Test
			public void tc19opportunityReport()
			{
				login.enterIntoUserName(email);
				login.enterIntoPassword(password);
				login.clickOnLogin();
				Opp.clickOpportunityTab();
				//div[@class='lbBody']/form/table/tbody/tr[1]/th[@scope='row']
				//System.out.println("TC19 passed");
			    
			}
			
		//	@AfterMethod
//			public void tearDown() {
		//
//				takescreenshot(driver);
//				driver.close();
//			}


}
