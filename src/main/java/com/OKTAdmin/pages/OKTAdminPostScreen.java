package com.OKTAdmin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OKTAdmin.base.TestBase;

public class OKTAdminPostScreen extends TestBase {
	
	@FindBy(xpath = "//a[@href='/posts']")
	WebElement PostScreen_Link;
	
    @FindBy(xpath = "//h3[text()='Posts']")
    WebElement Posts_Label;
    
    @FindBy(xpath = "//a[@href='/post-create']")
	WebElement Create_button;
	
	
    

	public OKTAdminPostScreen()
	{
		PageFactory.initElements(driver, this);
	}
	
    
    public boolean Post_Link()
    {
    	return PostScreen_Link.isDisplayed();
    }
    
    
    public void PostScreen_Link() throws InterruptedException
    {
    	Thread.sleep(5000);
    	PostScreen_Link.click();
    }

    public String Posts_Label()
	{
		return Posts_Label.getText();
	}
	
	public boolean Create_button()
	{
		          
		return Create_button.isDisplayed();
		
	}
	
	
}
