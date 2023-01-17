package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeTest extends BaseTest {
	
	
	WebDriver driver;
	 CommonUtilities common=new CommonUtilities();
	 String url;
	 String email;
	 String password;
	 String browser;
	 LoginPage login;
	 HomePage Home;
	 
	
	
	
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
		
		
		
	}
	
	
	@Test
	public void tc05userdropdown()
	{
		login.enterIntoUserName(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		Home.clickonuserMenu();
		Home.displaymenuListtab();
	
	}
	
	@Test
	public void tc06validateUserTab() throws Exception
	{
		login.enterIntoUserName(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		Home.clickonuserMenu();
		Home.clickonmyProfile();
		Thread.sleep(5000);
		Home.clickoneditProfile();
		Home.clickonaBout();
		Home.enterlastname();
		Home.clickOnsavebutton();
		Home.clickonpOsts();
		Home.enterPost();
		Thread.sleep(5000);
	    Home.clickonfIle();
	  
    	Home.clickuploadFile();
    	Home.clickToimageupload();
    	
		
		
	}
	
	@Test
	public void tc07validatesettings()
	{
		login.enterIntoUserName(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		Home.clickonuserMenu();
		Home.clickonmySetting();
		Home.clickpersonlTab();
		Home.clickTodisplayandlayout();
		//Home.clickToemail();
		Home.clickTocalender();
		
		
	}
	
	@Test
	public void tc08developerConsole()
	{
		login.enterIntoUserName(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		Home.clickonuserMenu();
		Home.clickdeveloperconsole();
		Home.clickTOclosedeveloperconsole();
		
		
	}
	
	@Test
	public void tc09logOut()
	{
		login.enterIntoUserName(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		Home.clickonuserMenu();
		Home.clicklogOut();
		
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		System.out.println("after method executed");
		takescreenshot(driver);
		driver.close();
}
}
