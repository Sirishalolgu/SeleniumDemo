package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.mongodb.assertions.Assertions;
import com.training.base.BasePage;

public class ContactsPage extends BasePage {

	public ContactsPage(WebDriver driver) {
		super(driver);
	}
	

	
	 //table[@class ='list']/tbody/tr[2]/th/a
	//a[@title='Contacts Tab']
	@FindBy(xpath="//a[@title='Contacts Tab']")
	WebElement contactsTab;
	public void clickTocontactsTab()
	{
		contactsTab.click();
	}
	
	//div[@class='pbHeader']/form[@id='hotlist']/table/tbody/tr[1]/td[2]/input[@title='New']
	
	@FindBy(xpath="//div[@class='pbHeader']/form[@id='hotlist']/table/tbody/tr[1]/td[2]/input[@title='New']")
	WebElement neWcontact;
	
	
	//name_lastcon2
	@FindBy(id="name_lastcon2")
	WebElement lastName;
	public void clickToNewcontactsTab()
	{
		waitForElement(10, neWcontact);
		neWcontact.click();
		lastName.clear();
		lastName.sendKeys("new lastname");
		
	}
	
	//a[contains(text(),'Create New View')]
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement createnewView;
	
	
	//fname
	@FindBy(id="fname")
	WebElement viewName;
	
	
	@FindBy(id="devname")
	WebElement uniqueName;
	
	
	//div[@class="pbHeader"]/table/tbody/tr[1]/td[2]/input[contains(@title,'Save')]
	@FindBy(xpath="//div[@class=\"pbHeader\"]/table/tbody/tr[1]/td[2]/input[contains(@title,'Save')]")
	WebElement saveview;
	public void clickToviewContact()
	{
		waitForElement(10, createnewView);
		createnewView.click();
		waitForElement(10, viewName);
		viewName.clear();
		viewName.sendKeys("ABCTesting1");
		waitForElement(10, uniqueName);
		uniqueName.clear();
		uniqueName.sendKeys("uniqueTest2");
		waitForElement(10, saveview);
		saveview.click();
		System.out.println("Clicked on save");
		
	}
	
	//hotlist_mode
	@FindBy(xpath="//select[@id='hotlist_mode']")
	WebElement recentcontact;
	public void clickToviewrecentContact() {
		waitForElement(10, recentcontact);
		Select dropdowncontact=new Select(recentcontact);
		dropdowncontact.selectByVisibleText("Recently Created");
		System.out.println("Recently created is selected");
	}
	
	//select[@id='fcf']
	@FindBy(xpath="//select[@id='fcf']")
	WebElement mycontact;
	public void clickToviewMycontact() {
		waitForElement(10, mycontact);
		Select dropdownMycontact=new Select(mycontact);
		dropdownMycontact.selectByVisibleText("My Contacts");
		
	}
	
	//div[@class='pbBody']/table/tbody/tr[2]/th[contains(@class,'dataCell')]/a
	@FindBy(xpath="//div[@class='pbBody']/table/tbody/tr[2]/th[contains(@class,'dataCell')]/a")
	WebElement contactclick;
	
	public void clickOnaContact() {
		waitForElement(10, contactclick);
		contactclick.click();
		System.out.println("clicked on contact");
	}
	
	//a[contains(text(),'Create New View')]
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement createNewView;
	
	
	
	//devname
	@FindBy(id="devname")
	WebElement uniqueNameView;
	
	//div[contains(text(),' You must enter a value')]
	@FindBy(xpath="//div[contains(text(),' You must enter a value')]")
	WebElement erroMsg;
	
	
	//div[@class='pbHeader']/table/tbody/tr[1]/td[2]/input[@value='Cancel']
	@FindBy(xpath="//div[@class='pbHeader']/table/tbody/tr[1]/td[2]/input[@value='Cancel']")
	WebElement cancel;
	
	
	
	public void clickTocreateNewView() {
		waitForElement(10, createNewView);
		createNewView.click();
		waitForElement(10, uniqueNameView);
		uniqueNameView.clear();
		uniqueNameView.sendKeys("EFGH");
		waitForElement(10, saveview);
		saveview.click();
		System.out.println("Clicked on Save");
		System.out.println(erroMsg.getText());
	}
	
	public void clickTocreateNewViewToCancel() {
		waitForElement(10, createNewView);
		createNewView.click();
		waitForElement(10, viewName);
		viewName.clear();
		viewName.sendKeys("ABCD");
		waitForElement(10, uniqueNameView);
		uniqueNameView.clear();
		uniqueNameView.sendKeys("EFGH");
		cancel.click();
		String expectedValue="ABCD";
		Select dropdownMycontact=new Select(mycontact);
		for(WebElement element:dropdownMycontact.getOptions())
		{
			Assert.assertEquals(element.getText(), expectedValue);
		}
	}
	
	
	//con4
	@FindBy(id="con4")
	WebElement accountName;
	
	
	//div[@class='pbHeader']/table/tbody/tr/td[2]/input[2]
	WebElement saveNew;
	
	//img[@class='lookupIconOn']
	WebElement imgclick;
	
	
	
	
	public void clickToNewcontact()
	{
		waitForElement(10, neWcontact);
		neWcontact.click();
		waitForElement(10, lastName);
		lastName.clear();
	 lastName.sendKeys("Indian");
	 accountName.clear();
	 accountName.sendKeys("Global Media");
	// waitForElement(10, saveNew);
	// saveNew.click();
	 waitForElement(10, imgclick);
	 imgclick.click();
		
	}
	 
	
}
