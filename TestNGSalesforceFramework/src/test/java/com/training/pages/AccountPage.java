package com.training.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.training.base.BasePage;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// a[contains(text(),'Accounts')]
	// userNavButton

	@FindBy(xpath = "//a[contains(text(),'Accounts')]")
	WebElement account;

	@FindBy(id = "//span[contains(text(),'SIRISHA ABCD1')][@class='mruText']")
	WebElement checkUser;
	
	
	//input[contains(@value,'New')]
	@FindBy(xpath="//input[contains(@value,'New')]")
	WebElement nEw;

	//acc2
	//acc6
	 //00NDn000006w7FT
	
	
	@FindBy(id = "acc2")
	WebElement accName;
	
	@FindBy(id="acc6")
	WebElement tYpe;
	
	@FindBy(id="00NDn000006w7FT")
	WebElement priority;
	
	//input[contains(@value,'Save')]
	@FindBy (xpath="//input[contains(@value,'Save')]")
	WebElement saveAcc;
	
	
	public void clickOnAccount() {

		account.click();
		
	}

	public void clickOnCreateAccount()
	{
		waitForElement(10, nEw);
		nEw.click();
		waitForElement(10, accName);
		accName.sendKeys("ABCD test 4");
		System.out.println("Account created");
		Select tYpeselect=new Select(tYpe);
		tYpeselect.selectByValue("Technology Partner");
		
		Select priorityselect=new Select(priority);
		priorityselect.selectByValue("High");
		
		saveAcc.click();
		System.out.println("Clicked on Save");
		
		//String actualUser = checkUser.getText();
		//System.out.println(actualUser);
		//String expectedUser = "SIRISHA ABCD1";
		//Assert.assertEquals(actualUser, expectedUser);

	}
	
	
	// a[contains(text(),'Create New View')]
	
	//fname
	
	//devname

	@FindBy(xpath = "//a[contains(text(),'Create New View')]")
	WebElement createView;
	
	@FindBy(id ="fname")
	WebElement viewName;
	
	@FindBy(id="devname")
	WebElement uniqueName;
	
	//input[contains(@value,'Save')]
	
	@FindBy(xpath="//input[contains(@value,'Save')]")
	WebElement save;

	//iframe[@title='sessionserver']
	WebElement iframeView;
	
	//fcf
	@FindBy(xpath="//select[@class='title']")
	WebElement viewList;
	
	
	public void clickToCreatView() {
		waitForElement(10, createView);
		createView.click();
		//driver.switchTo().frame(iframeView);
		waitForElement(10, viewName);
		viewName.clear();
		viewName.sendKeys("ViewNameTest8");
		String value=viewName.getAttribute("value");
		System.out.println(value);
		uniqueName.clear();
		uniqueName.sendKeys("ABCD10");
		save.click();
		viewList.click();
		Select options=new Select(viewList);
		List<WebElement> optionList=options.getOptions();
		for(WebElement list1:optionList)
		{
			if(list1.getText().equals(value))
			{
				System.out.println("Account name is displayed");
			}
		}
				
			
				
		
		

	}
	//fcf
	@FindBy(id="fcf")
	WebElement selectAccount;
	
	
	
	//a[text()='Edit']
	@FindBy(xpath="//a[text()='Edit']")
	WebElement eDit;
	
	
	//fcol1
	@FindBy(id="fcol1")
	WebElement selectFieLd;
	//fop1
	@FindBy(id="fop1")
	WebElement selctoPerator;
	
	//fval1
	@FindBy(id="fval1")
	WebElement vAlue;
	
	//colselector_select_0
	@FindBy(id="colselector_select_0")
	WebElement selectAccName;
	
	//colselector_select_0_right
	@FindBy(id="colselector_select_0_right")
	WebElement selectArrow;
	
	//div[contains(@class,'pbBottomButtons')]/table/tbody/tr/td[2]/input[contains(@class,'btn primary')]
	@FindBy(xpath="//div[contains(@class,'pbBottomButtons')]/table/tbody/tr/td[2]/input[contains(@class,'btn primary')]")
	WebElement saveAccount;
	
	public void clickToselectAccount()
	{
		
		waitForElement(10, selectAccount);
		Select account=new Select(selectAccount);
		account.selectByVisibleText("ViewNameTest");
		
		
	}
	
	public void clickToeDitViewAccount()
	{
		
		waitForElement(10, eDit);
		eDit.click();
		
		waitForElement(10, viewName);
		viewName.clear();
		viewName.sendKeys("NewViewName");
		
		Select fieLd=new Select(selectFieLd);
		fieLd.selectByValue("ACCOUNT.NAME");
		
		
		
		Select oPerator=new Select(selctoPerator);
		oPerator.selectByValue("c");
		
		vAlue.sendKeys("a");
		
		Select accName = new Select(selectAccName);
		List<WebElement> drpdown = accName.getOptions();
		boolean availableAcc=false;
		boolean availableLastAct=false;
		
		for(WebElement valuename:drpdown)
		{
			if(valuename.getText().equalsIgnoreCase("ACCOUNT NAME"))
			{
				availableAcc=true;
				 System.out.println("Account name is in the dropdown list");
				// selectArrow.click();
				// System.out.println("Account name is transferred");
				 
			}
			//Last Activity
			//System.out.println(list1.getText());
			
			
			if(valuename.getText().equalsIgnoreCase("Last Activity"))
			{
				 availableLastAct=true;
				 System.out.println("Last Activity is in the dropdown list");
				// selectArrow.click();
				// System.out.println("Last Activity is transferred");
				 
			}
		}
		
		if(availableAcc==true)
		{
			accName.selectByValue("ACCOUNT.NAME");
			selectArrow.click();
			System.out.println("Account name is transferred");
		}
		else if(availableLastAct==true)
		{
			accName.selectByValue("ACCOUNT.LAST_ACTIVITY");
			selectArrow.click();
			System.out.println("Last Activity is transferred");
		}
		
		
		saveAccount.click();
		System.out.println("saved");
		
	}
	
	
	//a[contains(text(),'Merge Accounts')]
	
		@FindBy(xpath="//a[contains(text(),'Merge Accounts')]")
		WebElement merge;
		
		
		//srch
		@FindBy(id="srch")
		WebElement search;
		
		//input[@value='Find Accounts' and @class='btn']
		@FindBy(xpath="//input[@value='Find Accounts' and @class='btn']")
		WebElement findAcc;
		
		//div[contains(@class,'pbBody')]/table/tbody/tr[2]/th/input[@id='cid0']
		@FindBy(xpath="//div[contains(@class,'pbBody')]/table/tbody/tr[2]/th/input[@id='cid0']")
		WebElement select1;
		
		//div[contains(@class,'pbBody')]/table/tbody/tr[3]/th/input[@id='cid1']
		
		@FindBy(xpath="//div[contains(@class,'pbBody')]/table/tbody/tr[3]/th/input[@id='cid1']")
		WebElement select2;
		
		//div[@class='pbBottomButtons']/input[@title='Next']
		@FindBy(xpath="//div[@class='pbBottomButtons']/input[@title='Next']")
		WebElement neXt;
		
		//div[@class='pbTopButtons']/input[contains(@title,'Merge')]
		@FindBy(xpath="//div[@class='pbTopButtons']/input[contains(@title,'Merge')]")
		WebElement meRge;
		
		public void clickTomerge() {
			waitForElement(10, merge);
			merge.click();
			search.click();
			search.sendKeys("ABCD");
			findAcc.click();
			System.out.println("Find account is clicked");
			select1.click();
			System.out.println("First acc is selected");
			select2.click();
			System.out.println("second acc is selected");
			neXt.click();
			System.out.println("Next is clicked");
			meRge.click();
			driver.switchTo().alert().accept();
			System.out.println("pop up is accepted");
			
			
		}
		
		//a[contains(text(),'Accounts with last activity > 30 days')]
		@FindBy(xpath="//a[contains(text(),'Accounts with last activity > 30 days')]")
		WebElement accActivity;
		//ext-gen152
		@FindBy(id="ext-gen152")
		WebElement datepick;
		
		
		//div[@id='ext-gen279']/table[@id='ext-gen280']/tbody/tr[1]/td[2]/table[@id='ext-comp-1110']/tbody/tr[2]/td[2]/em[@id='ext-gen286']
		//ext-gen274
		@FindBy(xpath="//div[@id='ext-gen279']/table[@id='ext-gen280']/tbody/tr[1]/td[2]/table[@id='ext-comp-1110']/tbody/tr[2]/td[2]/em[@id='ext-gen286']")
		WebElement dateDropdown;
		
		//div[@id='ext-gen272']/table/tbody/tr[5]/td[2]/a[contains(text(),'Nov')]
		@FindBy(xpath="//div[@id='ext-gen272']/table/tbody/tr[5]/td[2]/a[contains(text(),'Nov')]")
		WebElement selectmonth;
		
		//div[@id='ext-gen272']/table/tbody/tr[6]/td[3]/a[contains(text(),'2022')]
		@FindBy(xpath="//div[@id='ext-gen272']/table/tbody/tr[6]/td[3]/a[contains(text(),'2022')]")
		WebElement selectyear;
		
		//button[contains(text(),'OK ')]
		@FindBy(xpath="//button[contains(text(),'OK ')]")
		WebElement doOk;
		
		public void clickTocreateReport() {
			waitForElement(10, accActivity);
			accActivity.click();
			waitForElement(10, datepick);
			datepick.click();
			waitForElement(20, dateDropdown);
			dateDropdown.click();
			waitForElement(10, selectmonth);
			selectmonth.click();
			doOk.click();
			
			
			
			
		}
		
		
		

}
