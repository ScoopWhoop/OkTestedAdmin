package com.OKTAdmin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.OKTAdmin.base.TestBase;

public class OKTAdminPostDetailScreenForImage_Post extends TestBase {

    
    @FindBy(xpath = "//a[@href='/post-create']")
	WebElement Create_button;
    
    @FindBy(xpath = "//select[@name='type']")
	WebElement PostType_Text_Dropdown;
    
    @FindBy(xpath = "//select[@name='status']")
	WebElement PostStatus_Active_Dropdown;
    
    @FindBy(xpath = "//select[@name='user_id']")
  	WebElement User_Dropdown;
    
    @FindBy(xpath = "//select[@name='community_id']")
  	WebElement Community_Dropdown;
    
    @FindBy(xpath = "//input[@name='description']")
  	WebElement Description_Textbox;
    
    @FindBy(xpath ="//button[text()=' Create ']")
    WebElement PostDetail_Create_button;
    
    @FindBy(xpath = "//div[text()='Please select user']")
    WebElement Validation_PleaseSelectUser;
    
    @FindBy(xpath = "//div[text()='Please select community']")
    WebElement Validation_PleaseSelectCommunity;
    
    @FindBy(xpath = "//div[text()='Filename or File can not be blank']")
    WebElement Validation_FilenameOrFilCannotBeBlank;
    
    @FindBy(xpath = "//div[text()='Created successfully']")
    WebElement Validation_CreatedSuccessfully;
    
    @FindBy(xpath = "//label[text()='Media Preview']")
    WebElement Media_Preview_Label;
    
    
    @FindBy(xpath = "//label[text()='Media']")
    WebElement Media_Label;
    
    @FindBy(xpath ="//label[text()='Post Type']")
    WebElement Dropdown_PostType_Label;
    
    @FindBy(xpath ="//label[text()='Post Status']")
    WebElement Dropdown_PostStatus_Label;
	
    @FindBy(xpath ="//label[text()='User']")
    WebElement Dropdown_User_Label;
    
    @FindBy(xpath ="//label[text()='Community']")
    WebElement Dropdown_Community_Label;
	
    @FindBy(xpath ="//label[text()='Description']")
    WebElement Description_Label;
    
    @FindBy(xpath = "//div[@class='position-relative clr-grey custom custom-file']")
    WebElement Media_Browse_button;
    
    
    @FindBy(xpath ="//img[@class='img-thumbnail']")
    WebElement Attachment_Media_Preview;
    
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//a[@class='text-dark']")
    WebElement ThreeDotIcon;
    

    @FindBy(xpath = "//a[@class='dropdown-item']")
    WebElement EditOption;
    
    @FindBy(xpath = "//textarea[@name='description']")
  	WebElement UpdatedDescription_Textbox;
    
    @FindBy(xpath = "//div[text()='Updated successfully']")
    WebElement Validation_UpdatedSuccessfully;
    
    @FindBy(xpath = "//div[@class='col']//button[@type='button']")
    WebElement Update_button;
   
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//div[contains(text(),'Image Post')]")
    WebElement Image_Post_Name_OR_Description_On_Post_List;
    
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//span[contains(text(),'Active')]")
    WebElement Image_Post_Active_Status_On_Post_List;
   
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//span[contains(text(),' Community name:')]")
    WebElement Image_Post_Community_Name_Label_On_Post_List;
    
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//span[contains(text(),'Ok Tested')]")
    WebElement Image_Post_Community_Name_On_Post_List;
    
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//span[contains(text(),'  User:')]")
    WebElement Image_Post_User_Label_On_Post_List;
    
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//span[contains(text(),'Avi Gupta')]")
    WebElement Image_Post_User_Name_On_Post_List;
    
    
    
	public OKTAdminPostDetailScreenForImage_Post()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Create_button() throws InterruptedException
	{
		 Thread.sleep(5000);
		 Create_button.click();
	
	}
	
	public void Select_PostType(String PostType) throws InterruptedException
	{
		 Thread.sleep(5000);
		 Select select=new Select(PostType_Text_Dropdown);
		 select.selectByVisibleText(PostType);
		
	}
	
	public void Select_PostStatus(String PostStatus) throws InterruptedException
	{
		 Thread.sleep(5000);
		 Select select=new Select(PostStatus_Active_Dropdown);
		 select.selectByVisibleText(PostStatus);
		
	}
	
	
	public void Select_User(String User) throws InterruptedException
	{
		 Thread.sleep(5000);
		 Select select=new Select(User_Dropdown);
		 select.selectByVisibleText(User);
		
	}
	
	public void Select_Community(String Community) throws InterruptedException
	{
		 Thread.sleep(5000);
		 Select select=new Select(Community_Dropdown);
		 select.selectByVisibleText(Community);
		
	}
	
	public void Description_Textbox(String Description) throws InterruptedException
	{
		 Thread.sleep(5000);
		 Description_Textbox.sendKeys(Description);
	}
	
	
	public String Validation_PleaseSelectUser() throws InterruptedException
	{
		 return Validation_PleaseSelectUser.getText();
	}
	
	public String Validation_PleaseSelectCommunity() throws InterruptedException
	{
		 return Validation_PleaseSelectCommunity.getText();
	}
	
	public String Validation_FilenameOrFilCannotBeBlank() throws InterruptedException
	{
		 Thread.sleep(5000);
		 return Validation_FilenameOrFilCannotBeBlank.getText();
	}
	
	public String Validation_CreatedSuccessfully() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Validation_CreatedSuccessfully.getText();
	  }
	
	
	public void Media_Browse_button() throws InterruptedException
	{
		 Thread.sleep(5000);
		 Media_Browse_button.click();
	}

	
	public String Media_Label() throws InterruptedException
	{
		 Thread.sleep(5000);
		 return Media_Label.getText();
	}

	
	public String Media_Preview_Label() throws InterruptedException
	{
		 Thread.sleep(5000);
		 return Media_Preview_Label.getText();
	}
	
	
	public String Dropdown_PostType_Label() throws InterruptedException
	{
		 Thread.sleep(5000);
		 return Dropdown_PostType_Label.getText();
	}
	
	
	public String Dropdown_User_Label() throws InterruptedException
	{
		 Thread.sleep(5000);
		 return Dropdown_User_Label.getText();
	}
	
	public String Dropdown_Community_Label() throws InterruptedException
	{
		 Thread.sleep(5000);
		 return Dropdown_Community_Label.getText();
	}
	

	public String Description_Label() throws InterruptedException
	{
		 Thread.sleep(5000);
		 return Description_Label.getText();
	}
	
	public boolean Attachment_Media_Preview() throws InterruptedException
	{
		 Thread.sleep(5000);
		 return Attachment_Media_Preview.isDisplayed();
	}
	
	
	public void PostDetail_Create_button() throws InterruptedException
	{
		PostDetail_Create_button.click();
	}

	public void TextPostsEdit() throws InterruptedException
	{
			
		ThreeDotIcon.click();
		Thread.sleep(5000);
		EditOption.click();
	}
	

	public void UpdateDescription_Textbox(String UpdateDescription) throws InterruptedException
	{
		 Thread.sleep(5000);
		 UpdatedDescription_Textbox.clear();
		 UpdatedDescription_Textbox.sendKeys(UpdateDescription);
	}
	
	

	public void Updatebutton() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 Update_button.click();
	  }
	
	public String Validation_UpdatedSuccessfully() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Validation_UpdatedSuccessfully.getText();
	  }
	

	
	public String Image_Post_Name_OR_Description_On_Post_List() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Image_Post_Name_OR_Description_On_Post_List.getText();
	  }
	
	public String Image_Post_Active_Status_On_Post_List() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Image_Post_Active_Status_On_Post_List.getText();
	  }
	

	public String Image_Post_Community_Name_Label_On_Post_List() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Image_Post_Community_Name_Label_On_Post_List.getText();
	  }
	
	public String Image_Post_Community_Name_On_Post_List() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Image_Post_Community_Name_On_Post_List.getText();
	  }
	

	public String Image_Post_User_Label_On_Post_List() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Image_Post_User_Label_On_Post_List.getText();
	  }
	
	public String Image_Post_User_Name_On_Post_List() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Image_Post_User_Name_On_Post_List.getText();
	  }

	
	
		
}
		               
	
	

