package com.training.pages;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

import net.bytebuddy.jar.asm.Handle;

public class HomePage extends BasePage {
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement clickonHome;
	
	public void clickonHome()
	{
		waitForElement(10, clickonHome);
		clickonHome.click();
		String actualTitle=driver.getTitle();
		String expectediTitle="Home Page ~ Salesforce - Developer Edition";
		if(actualTitle.equalsIgnoreCase(actualTitle) )
		{
			System.out.println("you are on Home page");
		}
		else
		{
			System.out.println("you are not Home page");
		}
	}

	@FindBy(id="userNavButton")
	WebElement userMenu;
	
	public void clickonuserMenu()
	{
		waitForElement(0, userMenu);
		userMenu.click();
		
	}
	
	
    @FindBy(xpath="//div[@id='userNav-menuItems']")
	WebElement displaymenuList;
//	
	public void displaymenuListtab() {
		
		String menuList=displaymenuList.getText();
		//List<WebElement> displaymenuList=new LinkedList<WebElement>();
		System.out.println(menuList);
	
     }
     
	@FindBy(id="setupLink")
	WebElement setup;
	
	public void clickonSetup()
	{
		
		setup.click();
	}
	
	
	@FindBy(xpath="//a[contains(text(),'My Profile')]")
	WebElement myProfile;
	
	public void clickonmyProfile()
	{
		
		myProfile.click();
	}
	
	
	@FindBy(xpath="//a[contains(@class,'contactInfoLaunch editLink')]")
	WebElement editProfile;
	
	public void clickoneditProfile() 
	{
		
	//	waitForElement(10, editProfile);
		editProfile.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement aBout;
	
	@FindBy(id="contactInfoContentId")
	WebElement iframeEdit;
	
	public void clickonaBout()
	
	
	{   
		waitForElement(10, iframeEdit);
		driver.switchTo().frame(iframeEdit);
		
		
		waitForElement(10, aBout);
		aBout.click();
		

		
	}
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	public void enterlastname()
	{
		lastname.clear();
		lastname.sendKeys("ABCD1");
	}
	
	@FindBy(id="contactInfoX")
	WebElement cancelaBout;
	
	@FindBy(xpath="//input[@value='Save All']")
	WebElement savebutton;
	
	public void clickOnsavebutton()
	{
		savebutton.click();
		
		
	}
	
	public void clickoncancelaBout()
	{
		
		cancelaBout.click();
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Post')]")
	WebElement pOsts;
	
	public void clickonpOsts()
	{
		
		pOsts.click();
	}
	
	//iframe[@class='cke_wysiwyg_frame cke_reset']
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement iframePost;
	
		
	//body[contains(text(),'Share an update, @mention someone...')]
	
	@FindBy(xpath="//body[contains(text(),'Share an update, @mention someone...')]")
	WebElement editPost;
	
	
	//publishersharebutton
	
	
	@FindBy(id="publishersharebutton")
	WebElement clickShare;
	
	public void enterPost() {
		
		driver.switchTo().frame(iframePost);
		editPost.sendKeys("Post1 testing");
		
		
		driver.switchTo().defaultContent();
		waitForElement(10, clickShare);
		clickShare.click();
	}
	
	@FindBy(xpath="//a[@id='publisherAttachContentPost']")
	WebElement fIle;
	
	public void clickonfIle()
	{
		waitForElement(10, fIle);
		fIle.click();
	}
	
	
	
	//chatterUploadFileAction
	//chatterFile
	
	@FindBy(id="chatterUploadFileAction")
	WebElement uploadFile;
	
	@FindBy(xpath="//input[contains(@id,'chatterFile')]")
	WebElement chooseFile;
	
	//publishersharebutton
	@FindBy(id="publishersharebutton")
	WebElement shareFile;
	
	//displayBadge
	
	
	
	
	
	public void clickuploadFile() 
	{
		uploadFile.click();
		System.out.println("clicked on upload file");
		try
		{
		waitForElement(20, chooseFile);
		chooseFile.sendKeys("C:\\Users\\cnudr\\OneDrive\\Desktop\\Dummy.txt");
		shareFile.click();
		
		
//		String text=chooseFile.getText();
//		System.out.println(text);
		//chooseFile.click();
		}
		catch (Exception e) {
			
			System.out.println(e);
			// TODO: handle exception
		}
		//driver.get("C:\\Users\\cnudr\\OneDrive\\Desktop\\Dummy");
		
		
	}
	
	@FindBy(id="displayBadge")
	WebElement imageupload;
	
	//uploadLink
	@FindBy(id="uploadLink")
	WebElement imageupdate;
	
	//iframe[contains(@id,'uploadPhotoContentId')]
	@FindBy(xpath="//iframe[contains(@id,'uploadPhotoContentId')]")
	WebElement imageframe;
	
	//input[contains(@id,'j_id0:uploadFileForm:uploadInputFile')]
	@FindBy(xpath="//input[contains(@id,'j_id0:uploadFileForm:uploadInputFile')]")
	WebElement choosephoto;
	
	//j_id0:uploadFileForm:uploadBtn
	@FindBy(id="j_id0:uploadFileForm:uploadBtn")
	WebElement savepic;
	//photo
	@FindBy(xpath="//div[contains(@class,'imgCrop_selArea')]")
	WebElement croppic;
	
	//j_id0:j_id7:save
	@FindBy(id="j_id0:j_id7:save")
	WebElement savePic;
	
	public void clickToimageupload() {
		
		Actions action=new Actions(driver);
		action.moveToElement(imageupload).build().perform();
		imageupdate.click();
	//	Actions action1=new Actions(driver);
		driver.switchTo().frame(imageframe);
		waitForElement(20, choosephoto);
		choosephoto.sendKeys("C:\\Users\\cnudr\\OneDrive\\Desktop\\tree.jpeg");
		savepic.click();
		waitForElement(10, croppic);
		action.dragAndDropBy(croppic, 30, 220).perform();
		System.out.println("image cropped");
		savePic.click();
		System.out.println("cropped image saved");
		
		
	}
	
	
	@FindBy(id="publisherAttachContentPost")
	WebElement lInk;
	
	public void clickonlInk()
	{
		
		lInk.click();
	}


	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement lOgout;
	
	public void clickonlOgout()
	{
		
		lOgout.click();
	}

	
	@FindBy(xpath="//a[contains(text(),'My Settings')]")
	WebElement mySetting;
	
	public void clickonmySetting() {
		mySetting.click();
	}
	
	//PersonalInfo_font
	//LoginHistory_font
	//a[contains(text(),'Download login history for last six months')]
	
	@FindBy(id="PersonalInfo_font")
	WebElement personlTab;
	@FindBy(id="LoginHistory_font")
	WebElement loginHistory;
	@FindBy(xpath="//a[contains(text(),'Download login history for last six months')]")
	WebElement downloadHistory;
	
	
	
	
	
	public void clickpersonlTab() {
		waitForElement(10,personlTab );
		personlTab.click();
		loginHistory.click();
		downloadHistory.click();
	}
	
	
	
	//DisplayAndLayout_font
		@FindBy(id="DisplayAndLayout_font")
		WebElement displayandlayout;
	//CustomizeTabs_font
		@FindBy(id="CustomizeTabs_font")
		WebElement customiseTab;
		
		//p4
		@FindBy(id="p4")
		WebElement customdropdown;
		
		//duel_select_0
		@FindBy(id="duel_select_0")
		WebElement availableTabdropdown;
		
		//duel_select_0_right
		@FindBy(id="duel_select_0_right")
		WebElement add;
		
		
		//duel_select_1
		@FindBy(id="duel_select_1")
		WebElement checktab;
		
		//input[contains(@title,'Save')]
		@FindBy(xpath="//input[contains(@title,'Save')]")
		WebElement save;
		
		//duel_select_1
		@FindBy(id="duel_select_1")
		WebElement verifyTabs;
		
		public void clickTodisplayandlayout()
		{
			displayandlayout.click();
			customiseTab.click();
			Select custom=new Select(customdropdown);
			custom.selectByVisibleText("Salesforce Chatter");
			System.out.println("Salesforce Chatter is selected");
			Select availabletab=new Select(availableTabdropdown);
			availabletab.selectByValue("report");
			System.out.println("report is selected");
			add.click();
			System.out.println("clicked on add");
		//	List<WebElement> 	
			
			
			save.click();
			System.out.println("clicked on save");
			displayandlayout.click();
			customiseTab.click();
			String tabs=verifyTabs.getText();
			System.out.println(tabs);
			
			
			
		}
		
		
		
		//EmailSetup_font
		@FindBy(id="EmailSetup_font")
		WebElement email;
		//EmailSettings_font
		@FindBy(id="EmailSettings_font")
		WebElement emailSetting;
		
		//sender_name
		@FindBy(id="sender_name")
		WebElement emailname;
		
		
		
		//sender_email
		@FindBy(id="sender_email")
		WebElement emailAdress;
		
		//auto_bcc1
		@FindBy(id="auto_bcc1")
		WebElement automatic;
		
		//input[contains(@value,'Save')] 
		@FindBy(xpath="//input[contains(@value,'Save')]")
		WebElement emailsave;
		
		public void clickToemail()
		{
			email.click();
			emailSetting.click();
			System.out.println("clicked on email setting");
			emailname.clear();
			emailname.sendKeys("new name");
			emailAdress.clear();
			emailAdress.sendKeys("sirishalolgu2811@gmail.com");
			automatic.click();
			emailsave.click();
			System.out.println("email setting saved");
			
			
			
			
			
		}
		
		
		//CalendarAndReminders_font
				@FindBy(id="CalendarAndReminders_font")
				WebElement calender;
				
				//Reminders_font
				@FindBy(id="Reminders_font")
				WebElement activity;
				
				//testbtn
				@FindBy(id="testbtn")
				WebElement test;
		
		
		public void clickTocalender() {
			
			calender.click();
			activity.click();
			test.click();
			System.out.println("calender setting saved");
			
		}
	
	//a[contains(text(),'Developer Console')]
	@FindBy(xpath="//a[contains(text(),'Developer Console')]")
	WebElement developerconsole;
	
	public void clickdeveloperconsole()
	{
		developerconsole.click();
		
	}
	
	public void clickTOclosedeveloperconsole()
	{
		
		for(String handle:driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
		}
		
		driver.close();
		System.out.println("Developer console is closed");
		
	}
	
	
	
	//a[contains(text(),'Logout')]
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logOut;
	
	
	
	public void clicklogOut() {
		logOut.click();
	}
	
	
	
	
}
