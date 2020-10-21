package com.OKTAdmin.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.OKTAdmin.base.TestBase;

public class OKTAdminPostDetailScreen extends TestBase {

    
    @FindBy(xpath = "//a[@href='/post-create']")
	WebElement Create_button;
    
    @FindBy(xpath ="//label[text()='Post Type']")
    WebElement PostType_Label;
    
    @FindBy(xpath ="//label[text()='Post Status']")
    WebElement PostStatus_Label;
	
    @FindBy(xpath ="//label[text()='User']")
    WebElement User_Label;
    
    @FindBy(xpath ="//label[text()='Community']")
    WebElement Community_Label;
	
    @FindBy(xpath ="//label[text()='Description']")
    WebElement Description_Label;
    
    @FindBy(xpath ="//input[@placeholder='Enter title / description']")
    WebElement Placeholder_Text;
    
    @FindBy(xpath ="//button[text()=' Create ']")
    WebElement PostDetail_Create_button;
    
    @FindBy(xpath ="//button[@class='back-btn btn btn-link']")
    WebElement PostDetail_back_button;
    
    @FindBy(xpath ="//select[@name='type']")
    WebElement PostType_Dropdown;
    
    @FindBy(xpath ="//select[@name='status']")
    WebElement PostStatus_Dropdown;
    
    @FindBy(xpath ="//select[@name='user_id']")
    WebElement User_Dropdown;
    
    @FindBy(xpath ="//select[@name='community_id']")
    WebElement Community_Dropdown;
    
    @FindBy(xpath ="//input[@name='description']")
    WebElement Desscription_Textbox;
   
    
    
	public OKTAdminPostDetailScreen()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Create_button() throws InterruptedException
	{
		 Thread.sleep(5000);
		 Create_button.click();
		
	}
	
	public String PostType_Label()
	{
		          
		return PostType_Label.getText();
		
	}
	
	public String PostStatus_Label()
	{
		          
		return PostStatus_Label.getText();
		
	}
	
	public String User_Label()
	{
		          
		return User_Label.getText();
		
	}
	
	public String Community_Label()
	{
		          
		return Community_Label.getText();
		
	}
	
	public String Description_Label()
	{
		          
		return Description_Label.getText();
		
	}
	
	public String Placeholder_Text()
	{
		          
		return Placeholder_Text.getText();
		
	}
	
	public void PostDetail_Create_button()
	{
		          
		 PostDetail_Create_button.click();
		
	}
	
	
	public void PostDetail_back_button()
	{
		          
		PostDetail_back_button.click();
		
	}
	
	public boolean PostDetail_back_button_Visibility()
	{
		          
		return PostDetail_back_button.isDisplayed();
		
	}
	
	public void Total_PostType_Dropdown_Value()
	
	{
		          
		Select select =new Select(PostType_Dropdown);
		
		List<WebElement> Total_PostType_Dropdown_Value= select.getOptions();
		int Total_PostType_Dropdown_Value_Size= Total_PostType_Dropdown_Value.size();
		System.out.println(Total_PostType_Dropdown_Value_Size);
		
		for(WebElement ele: Total_PostType_Dropdown_Value)
		{
			String Total_PostType_Dropdown_Value_Name=ele.getText();
			System.out.println(Total_PostType_Dropdown_Value_Name);
		}
		               
	}
	
	public void Createbutton_BackgroundColor()
	{
		String Createbutton_backgroundColor=PostDetail_Create_button.getCssValue("background-color");
		System.out.println(Createbutton_backgroundColor);
		String Createbutton_backgroundColor_HexFormat=Color.fromString(Createbutton_backgroundColor).asHex();
		System.out.println(Createbutton_backgroundColor_HexFormat);
	}
	
}
