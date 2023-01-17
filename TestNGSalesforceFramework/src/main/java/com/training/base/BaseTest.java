package com.training.base;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.training.utilities.Constants.USER_DIR;
import static com.training.utilities.Constants.FILE_SEPARATOR;
import static com.training.utilities.Constants.SCREENSHOT_PATH;





public class BaseTest {
	
	private WebDriver driver;
	
	public WebDriver getDriver(String browser)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		
		
		return driver;
	}
	
	public void takescreenshot(WebDriver driver)  {
		
		TakesScreenshot screenshot= ((TakesScreenshot)driver);
		File scrfile=screenshot.getScreenshotAs(OutputType.FILE);
		
		Date currentDate=new Date();
		String timeStamp=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentDate);
		
		//String reportFilepath=System.getProperty("user.dir");
//		String fileseparator=System.getProperty("file.separator");
//		String reportFilepath=System.getProperty("user.dir")+fileseparator+"Screenshots";
		
		
		String reportFilepath= USER_DIR+FILE_SEPARATOR+SCREENSHOT_PATH;
		//System.out.println(reportFilepath);
		String filename="Salesforce"+timeStamp+".png";
		
		//yyyy-MM-dd HH-mm-ss		
				
		//String spath=reportFilepath+fileseparator+"Screenshots\\Salesforce"+timeStamp+".png";
		
		
		//String spath=reportFilepath+fileseparator+"Salesforce"+timeStamp+".png";
		
		
		String spath=reportFilepath+FILE_SEPARATOR+filename;
		
		
		File destFile=new File(spath);
		try {
			FileUtils.copyFile(scrfile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	

}
