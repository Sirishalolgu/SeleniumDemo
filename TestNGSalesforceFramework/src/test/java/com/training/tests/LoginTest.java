package com.training.tests;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.log4j.xml.*;
import com.training.log.*;
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

public class LoginTest extends BaseTest {

	WebDriver driver;
	CommonUtilities common = new CommonUtilities();
	String url;
	String email;
	String wrongemail;
	String password;
	String wrongpassword;
	String browser;
	LoginPage login;
	HomePage Home;

	@BeforeMethod
	public void beforeMethod() throws IOException {
		email = common.getproperty("email");
		wrongemail = common.getproperty("wrongemail");
		password = common.getproperty("password");
		wrongpassword = common.getproperty("wrongpassword");
		browser = common.getproperty("browser");
		url = common.getproperty("url");
		driver = getDriver(browser);
		driver.get(url);
		
		driver.manage().window().maximize();
		login = new LoginPage(driver);
		Home = new HomePage(driver);
		DOMConfigurator.configure("log4j.xml");

	}

	@Test
	public void tC01Loginerror() {
		login.enterIntoUserName(email);
		login.clearPassword();

		login.clickOnLogin();

		login.displaymessagePwd();

			
	}

	@Test
	public void tc02validUserName() {
		login.enterIntoUserName(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		Home.clickonHome();

	}

	@Test
	public void tc03rememberMe() throws Exception {
		login.enterIntoUserName(email);
		login.enterIntoPassword(password);
		login.clickOnrememberMe();
		login.clickOnLogin();
		Home.clickonuserMenu();
		Home.clickonlOgout();
		Thread.sleep(5000);
		login.checkUsername();

	}

	@Test
	public void tc4aForgotpassword() {
		login.clickonforgotPwd();
		login.sendresetpwd();

	}

	@Test
	public void tc4bForgotpassword() {
		login.enterIntoUserName(wrongemail);
		login.enterIntoPassword(wrongpassword);
		login.clickOnLogin();
		login.displayerrormesg();

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		
		takescreenshot(driver);
		driver.close();
		System.out.println("after method executed");
	}

}
