package com.training.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class LeadsPage extends BasePage{

	public LeadsPage(WebDriver driver) {

		super(driver);
	}
	
	//Lead_Tab
	@FindBy(id="Lead_Tab")
	WebElement leadTab;
	
	public void clickToleadTab()
	{
		leadTab.click();
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("clicked on lead");
	}
	
	//fcf
	@FindBy(id="fcf")
	WebElement leadView;
	
	public void clickToSelectView()
	{
		waitForElement(10, leadView);
		Select view=new Select(leadView);
	    List<WebElement> listlead=view.getOptions();
	    for(WebElement list1:listlead)
	    {
	    	System.out.println(list1.getText());
	    }
	}
	
	
	//00BDn000004clkF
	
	//fcf
		@FindBy(id="fcf")
		WebElement leadView1;
		
		//input[@title='Go!']
		@FindBy(xpath="//input[@title='Go!']")
		WebElement gO;
	
	public void clickToSelectTodaylead(){
		
		waitForElement(10, leadView1);
		Select view1=new Select(leadView1);
		//WebElement option= view1.selectByValue("00BDn000004clkF");
	//	String valueselected=option.getText();
		
				//view1.selectByValue("00BDn000004clkF");
	//	System.out.println("Todays lead is selected");
		
		
		
	}
	
	public void clickTogO()
	{
		waitForElement(10, gO);
		gO.click();
	}
	
	//div[@class='pbHeader']/form[@id='hotlist']/table/tbody/tr[1]/td[2]/input[contains(@value,'New')]
	@FindBy(xpath="//div[@class='pbHeader']/form[@id='hotlist']/table/tbody/tr[1]/td[2]/input[contains(@value,'New')]")
	WebElement newLead;
	
	//name_lastlea2
	@FindBy(id="name_lastlea2")
	WebElement lastName;
	
	//lea3
	@FindBy(id="lea3")
	WebElement companyName;
	
	//div[@class='pbHeader']/table/tbody/tr[1]/td[2]/input[@title='Save']
	@FindBy(xpath="//div[@class='pbHeader']/table/tbody/tr[1]/td[2]/input[@title='Save']")
	WebElement saVelead;
	
	public void clickTonewLead()
	{
		waitForElement(10, newLead);
		newLead.click();
		lastName.clear();
		lastName.sendKeys("ABCD1");
		System.out.println("lastName entered");
		companyName.clear();
		companyName.sendKeys("ABCD1");
		System.out.println("companyName entered");
		saVelead.click();
		
	}
	
	
}
