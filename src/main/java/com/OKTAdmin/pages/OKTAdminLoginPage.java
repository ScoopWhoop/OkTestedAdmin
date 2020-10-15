package com.OKTAdmin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OKTAdmin.base.TestBase;

public class OKTAdminLoginPage extends TestBase {
	
	@FindBy(xpath = "//img[@src='https://s4.scoopwhoop.com/v4/newdesignassets/static/sw/newDesign/desktop/images/oktested_new.png']")
	WebElement OKTestedLogo;

    @FindBy(xpath = "//button[@type='button']")
    WebElement LoginWithGoogleButton;
    
    @FindBy(xpath = "//input[@id='identifierId']")
	WebElement GmailEmailOrPhone;
	
	@FindBy(xpath = "//div[@id='identifierNext']")
	WebElement NextButton;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement GmailPassword;
	
	@FindBy(xpath = "//div[@id='passwordNext']")
	WebElement NextButtonPwd;
	
	@FindBy(xpath = "//h5[text()='Welcome']")
	WebElement Welcome_Label;
	
	
    

	public OKTAdminLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
    public String OkTestedAdminLoginPageTitle()
    {
    	return driver.getTitle();
    }
    
    public boolean OKTestedLogo()
    {
    	return OKTestedLogo.isDisplayed();
    }
    
    public void LoginWithGoogleButton() throws InterruptedException
    {
    	Thread.sleep(10000);
    	LoginWithGoogleButton.click();
    }

    public void GmailEmailOrPhone(String EmailOrPhone)
	{
		GmailEmailOrPhone.sendKeys(EmailOrPhone);
	}
	
	public void NextButton()
	{
		NextButton.click();
	}
	
	public void GmailPassword(String Password)
	{
		GmailPassword.sendKeys(Password);
	}
	
	public void NextButtonPwd() {
		
		NextButtonPwd.click();
	}
	
	 public String Welcome_Label()
	    {
	    
		 return Welcome_Label.getText();
		 
	    }
}
