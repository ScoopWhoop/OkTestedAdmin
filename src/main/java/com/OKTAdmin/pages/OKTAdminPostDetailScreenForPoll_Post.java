package com.OKTAdmin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.OKTAdmin.base.TestBase;

public class OKTAdminPostDetailScreenForPoll_Post extends TestBase {

    
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
    
    @FindBy(xpath = "//div[text()='Description cannot be blank']")
    WebElement Validation_DescriptionCannotBeBlank;
    
    @FindBy(xpath = "//div[text()='Created successfully']")
    WebElement Validation_CreatedSuccessfully;
    
    @FindBy(xpath = "//button[@class='rounded-pill btn btn-outline-info btn-sm']")
    WebElement Choice_button;
    
    @FindBy(xpath = "//input[@name='name']")
    WebElement Choice_Textbox_1;
    
    @FindBy(xpath = "//label[@class='label form-label']//following-sibling::input[2]")
    WebElement Choice_Textbox_2;
    
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
    
    @FindBy(xpath = "//div[text()='Please add at least two choices']")
    WebElement Validation_PleaseAddAtLeastTwoChoices;
    
    
    @FindBy(xpath = "//label[text()='Media Preview']")
    WebElement Media_Preview_Label;
    

    @FindBy(xpath = "//label[text()='Media']")
    WebElement Media_Label;
    
    @FindBy(xpath ="//img[@class='img-thumbnail']")
    WebElement Attachment_Media_Preview;
    
    @FindBy(xpath = "//div[@class='position-relative clr-grey custom custom-file']")
    WebElement Media_Browse_button;
    
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//a[@class='text-dark']")
    WebElement ThreeDotIcon;
    

    @FindBy(xpath = "//a[@class='dropdown-item']")
    WebElement EditOption;
    
    @FindBy(xpath = "//textarea[@name='description']")
  	WebElement UpdatedDescription_Textbox;
    
    @FindBy(xpath = "//div[text()='Updated successfully']")
    WebElement Validation_UpdatedSuccessfully;
    
    @FindBy(xpath = "//div[@class='col']//button[contains(text(),'Update')]")
    WebElement Update_button;
    

    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//div[contains(text(),'Poll Post')]")
    WebElement Poll_Post_Name_OR_Description_On_Post_List;
    
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//span[contains(text(),'Active')]")
    WebElement Poll_Post_Active_Status_On_Post_List;
   
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//span[contains(text(),' Community name:')]")
    WebElement Poll_Post_Community_Name_Label_On_Post_List;
    
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//span[contains(text(),'Ok Tested')]")
    WebElement Poll_Post_Community_Name_On_Post_List;
    
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//span[contains(text(),'  User:')]")
    WebElement Poll_Post_User_Label_On_Post_List;
    
    @FindBy(xpath = "//div[@class='mt-2 list-group']//div[@class='list-group-item'][1]//span[contains(text(),'Avi Gupta')]")
    WebElement Poll_Post_User_Name_On_Post_List;
    
   
    
    
	public OKTAdminPostDetailScreenForPoll_Post()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Choice_button() throws InterruptedException
	{
		 Thread.sleep(5000);
		 Choice_button.click();
		
	}
	
	public void Choice_Textbox_1(String PollOption1) throws InterruptedException
	{
		 Thread.sleep(5000);
		 Choice_Textbox_1.sendKeys(PollOption1);
		
	}
	

	public void Choice_Textbox_2(String PollOption2) throws InterruptedException
	{
		 Thread.sleep(5000);
		 Choice_Textbox_2.sendKeys(PollOption2);
		
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
	
	public String Validation_DescriptionCannotBeBlank() throws InterruptedException
	{
		 Thread.sleep(5000);
		 return Validation_DescriptionCannotBeBlank.getText();
	}
	
	public String Validation_PleaseAddAtLeastTwoChoices() throws InterruptedException
	{
		 return Validation_PleaseAddAtLeastTwoChoices.getText();
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
	
	public String Media_Label() throws InterruptedException
	{
		 Thread.sleep(5000);
		 return Media_Label.getText();
	}
	
	public String Media_Preview_Label() throws InterruptedException
	{
			 return Media_Preview_Label.getText();
	}
	
	public String Validation_CreatedSuccessfully() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Validation_CreatedSuccessfully.getText();
	  }
	
	
	
	public String Dropdown_PostType_Label() throws InterruptedException
	{
		 Thread.sleep(5000);
		 return Dropdown_PostType_Label.getText();
	}
	
	public void Media_browse_button() throws InterruptedException
	{
		Media_Browse_button.click();
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
		 Thread.sleep(2000);
		 Update_button.click();
	  }
	
	public String Validation_UpdatedSuccessfully() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Validation_UpdatedSuccessfully.getText();
	  }
	
	

	public String Poll_Post_Name_OR_Description_On_Post_List() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Poll_Post_Name_OR_Description_On_Post_List.getText();
	  }
	
	public String Poll_Post_Active_Status_On_Post_List() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Poll_Post_Active_Status_On_Post_List.getText();
	  }
	

	public String Poll_Post_Community_Name_Label_On_Post_List() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Poll_Post_Community_Name_Label_On_Post_List.getText();
	  }
	
	public String Poll_Post_Community_Name_On_Post_List() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Poll_Post_Community_Name_On_Post_List.getText();
	  }
	

	public String Poll_Post_User_Label_On_Post_List() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Poll_Post_User_Label_On_Post_List.getText();
	  }
	
	public String Poll_Post_User_Name_On_Post_List() throws InterruptedException
	  {
		 Thread.sleep(5000);
		 return Poll_Post_User_Name_On_Post_List.getText();
	  }

	
		               
	}
		               
	

