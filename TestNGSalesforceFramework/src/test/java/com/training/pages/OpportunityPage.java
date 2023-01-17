package com.training.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class OpportunityPage extends BasePage{

	public OpportunityPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	//Opportunity_Tab
	@FindBy(id="Opportunity_Tab")
	WebElement opportunityTab;
	
	//fcf
	@FindBy(id="fcf")
	WebElement dropDown;
	
	public void clickOpportunityTab() {
		
		opportunityTab.click();
		
		
	}
	
	public void displayOpportunity() {
		
		waitForElement(10, dropDown);
		//dropDown.click();
		Select opportunities=new Select(dropDown);
		List<WebElement> displaydropdwn=opportunities.getOptions();
		
		for(WebElement list1:displaydropdwn)
		{
			System.out.println(list1.getText());
		}
		
	}
	
	//div[@class='pbHeader']/form[@id='hotlist']/table/tbody/tr/td[2]/input[@title='New']
	@FindBy(xpath="//div[@class='pbHeader']/form[@id='hotlist']/table/tbody/tr/td[2]/input[@title='New']")
	WebElement nEw;
	
	//opp3
	@FindBy(id="opp3")
	WebElement oppName;
	//img[contains(@alt,'Account Name Lookup (New Window)')]
	@FindBy(xpath="//img[contains(@alt,'Account Name Lookup (New Window)')]")
	WebElement accName;
	
//	//div[@class='pbBody']/table/tbody/tr[2]/th/a
//	@FindBy(xpath="//div[@class='pbBody']/table/tbody/tr[2]/th/a")
//	WebElement selectaccName;
	
	//div[@class='pbBody']/table/tbody/tr[2]/th[1]/a[contains(@class,'dataCell')]
	@FindBy(xpath="//div[@class='pbBody']/table/tbody/tr[2]/th[1]/a[contains(@class,'dataCell')]")
    WebElement selectaccName;
	
	
	
	public void clickTocreateOpp() {
		waitForElement(10, nEw);
		nEw.click();
		waitForElement(10, oppName);
		oppName.sendKeys("newOPp");
		waitForElement(10, accName);
		accName.click();
		
//		String parentwin=driver.getWindowHandle();
//		System.out.println(parentwin);
//	for(String handle:driver.getWindowHandles())
//	{
//		driver.switchTo().window(handle);
//		System.out.println(handle);
//
//	}
	
	waitForElement(10, selectaccName);
	selectaccName.click();
		//driver.switchTo().window(parentwin);
		
		
		
	}
	
	//a[contains(text(),'Opportunity Pipeline')]
	@FindBy(xpath="//a[contains(text(),'Opportunity Pipeline')]")
	WebElement Opppipeline;
	
	public void clickToOppPipeline()
	{
		
		waitForElement(10, Opppipeline);
		Opppipeline.click();
		System.out.println("clicked on Opp Pipeline");
	}
	
	//a[contains(text(),'Stuck Opportunities')]
	@FindBy(xpath="//a[contains(text(),'Stuck Opportunities')]")
	WebElement stuckOpp;
	public void clickTostuckOpp()
	{
		
		waitForElement(10, Opppipeline);
		stuckOpp.click();
		System.out.println("clicked on stuckOpp");
	}

	
	
	
}
