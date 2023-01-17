package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.ContactsPage;
import com.training.pages.HomePage;
import com.training.pages.LeadsPage;
import com.training.pages.LoginPage;
import com.training.pages.OpportunityPage;
import com.training.utilities.CommonUtilities;

public class ContactsTest extends BaseTest {
	
	
	WebDriver driver;
	 CommonUtilities common=new CommonUtilities();
	 String url;
	 String email;
	 String password;
	 String browser;
	 LoginPage login;
	 HomePage Home;
	 OpportunityPage Opp;
	 ContactsPage contact;
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
			contact=new ContactsPage(driver);
			
		}

	 @Test
		public void tc25opportunitydropdown()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			contact.clickTocontactsTab();
			contact.clickToNewcontactsTab();
			//account name to be added
		
		}
	 
	 @Test
		public void tc26viewContact()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			contact.clickTocontactsTab();
			contact.clickToviewContact();
			System.out.println("TC26 passed");
		
		}
	 
	 @Test
		public void tc27RecentContact()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			contact.clickTocontactsTab();
			contact.clickToviewrecentContact();
			System.out.println("TC27 passed");
		
		}
	 
	 
	 @Test
		public void tc28viewMyContact()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			contact.clickTocontactsTab();
			contact.clickToviewMycontact();
			System.out.println("TC28 passed");
		
		}
	 
	 
	 
	 @Test
		public void tc29ViewAcontact()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			contact.clickTocontactsTab();
			contact.clickOnaContact();
			System.out.println("TC29 passed");
		
		}
	 
	 
	 @Test
		public void tc30ErrorMessage()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			contact.clickTocontactsTab();
			contact.clickTocreateNewView();
			System.out.println("TC30 passed");
		
		}
	 
	 @Test
		public void tc31CancelMessage()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			contact.clickTocontactsTab();
			contact.clickTocreateNewViewToCancel();
			System.out.println("TC31 passed");
		
		}
	 
	 @Test
		public void tc32NewContact()
		{
			login.enterIntoUserName(email);
			login.enterIntoPassword(password);
			login.clickOnLogin();
			contact.clickTocontactsTab();
			contact.clickToNewcontact();
			System.out.println("TC32 passed");
		
		}
	 
	 
	 
}
