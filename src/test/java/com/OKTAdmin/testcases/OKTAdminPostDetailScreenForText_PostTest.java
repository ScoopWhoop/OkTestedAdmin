package com.OKTAdmin.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OKTAdmin.base.TestBase;
import com.OKTAdmin.pages.OKTAdminLoginPage;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForText_Post;
import com.OKTAdmin.pages.OKTAdminPostScreen;
import com.OKTAdmin.utils.CustomListener;
import com.OKTAdmin.utils.TestUtil;

@Listeners(CustomListener.class)
public class OKTAdminPostDetailScreenForText_PostTest extends TestBase {
	
	public  OKTAdminPostDetailScreenForText_Post OKTADPDSTP;
	public OKTAdminLoginPage OKTADLP;
	public OKTAdminPostScreen OKTADPS;
	public  TestUtil TU;
	SoftAssert sa;

	public OKTAdminPostDetailScreenForText_PostTest() {
		
		
		super();
	}

	@BeforeMethod
	public void Setup()
	{
		intilization();
		OKTADPDSTP=new OKTAdminPostDetailScreenForText_Post();
		OKTADLP=new OKTAdminLoginPage();
		OKTADPS=new OKTAdminPostScreen();
		TU=new TestUtil();
	    sa=new SoftAssert();
	}
	

	@Test(priority=0)
	public void Verify_Labels() throws InterruptedException
	{
		
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(60000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();                                        
		Thread.sleep(5000);
		OKTADPDSTP.Create_button();
		Thread.sleep(5000);

		OKTADPDSTP.Select_PostType(prop.getProperty("PostType_Text"));
		Thread.sleep(5000);
		
		String Dropdown_PostType_Label=OKTADPDSTP.Dropdown_PostType_Label();
		sa.assertEquals(Dropdown_PostType_Label, "Post Type", "Post Type label is missing");
		
		String Dropdown_User_Label=OKTADPDSTP.Dropdown_User_Label();
		sa.assertEquals(Dropdown_User_Label, "User", "User label is missing");
		
		String Dropdown_Community_Label=OKTADPDSTP.Dropdown_Community_Label();
		sa.assertEquals(Dropdown_Community_Label, "Community", "Community label is missing");
		
		String Description_Label=OKTADPDSTP.Description_Label();
		sa.assertEquals(Description_Label, "Description", "Description label is missing");
		
		sa.assertAll();
		
		Thread.sleep(5000);
				 
	}
	
	@Test(priority=1)
	public void Verify_Multiple_Validation_For_Text_Post() throws InterruptedException
	{

		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADPDSTP.Create_button();
		Thread.sleep(5000);
		
		OKTADPDSTP.Select_PostType(prop.getProperty("PostType_Text"));
		
		OKTADPDSTP.PostDetail_Create_button();
		String Validation_PleaseSelectUser=OKTADPDSTP.Validation_PleaseSelectUser();
		sa.assertEquals(Validation_PleaseSelectUser, "Please select user", "Please select user validation is missing");
		OKTADPDSTP.Select_User(prop.getProperty("User"));
		Thread.sleep(5000);
		
		OKTADPDSTP.PostDetail_Create_button();
		String Validation_PleaseSelectCommunity=OKTADPDSTP.Validation_PleaseSelectCommunity();
		sa.assertEquals(Validation_PleaseSelectCommunity, "Please select community", "Please select community validation is missing");
		OKTADPDSTP.Select_Community(prop.getProperty("Community"));
		Thread.sleep(5000);
		
		OKTADPDSTP.PostDetail_Create_button();
		String Validation_DescriptionCannotBeBlank=OKTADPDSTP.Validation_DescriptionCannotBeBlank();
		sa.assertEquals(Validation_DescriptionCannotBeBlank, "Description can not be blank", "Description can not be blank validation is missing");
		Thread.sleep(5000);
		sa.assertAll();
		 
	}
	
	
	@Test(priority=2)
	public void CreateAndUpdate_Text_Post() throws InterruptedException
	{
		
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADPDSTP.Create_button();
		Thread.sleep(5000);
		
		OKTADPDSTP.Select_PostType(prop.getProperty("PostType_Text"));
		OKTADPDSTP.Select_PostStatus(prop.getProperty("PostStatus"));
		OKTADPDSTP.Select_User(prop.getProperty("User"));
		OKTADPDSTP.Select_Community(prop.getProperty("Community"));
		OKTADPDSTP.Description_Textbox(prop.getProperty("DescriptionTextPost"));
		OKTADPDSTP.PostDetail_Create_button();
		Thread.sleep(5000);
		
		String Validation_CreatedSuccessfully=OKTADPDSTP.Validation_CreatedSuccessfully();
		sa.assertEquals(Validation_CreatedSuccessfully, "Created successfully", "Created successfully");
		Thread.sleep(5000);
		sa.assertAll();
		
		String Verify_Audio_Post_Name_OR_Description_On_Post_List=OKTADPDSTP.Text_Post_Name_OR_Description_On_Post_List();
		sa.assertEquals(Verify_Audio_Post_Name_OR_Description_On_Post_List, "Text Post");
		
		String Verify_Audio_Post_Active_Status_On_Post_List=OKTADPDSTP.Text_Post_Active_Status_On_Post_List();
		sa.assertEquals(Verify_Audio_Post_Active_Status_On_Post_List, "Active");
		
		String Verify_Audio_Post_Community_Name_Label_On_Post_List=OKTADPDSTP.Text_Post_Community_Name_Label_On_Post_List();
		sa.assertEquals(Verify_Audio_Post_Community_Name_Label_On_Post_List, "Community name:");
		
		String Verify_Audio_Post_Community_Name_On_Post_List=OKTADPDSTP.Text_Post_Community_Name_On_Post_List();
		sa.assertEquals(Verify_Audio_Post_Community_Name_On_Post_List, "Ok Tested");

		String Verify_Audio_Post_User_Label_On_Post_List=OKTADPDSTP.Text_Post_User_Label_On_Post_List();
		sa.assertEquals(Verify_Audio_Post_User_Label_On_Post_List, "User:");
		
		String Verify_Audio_Post_User_Name_On_Post_List=OKTADPDSTP.Text_Post_User_Name_On_Post_List();
		sa.assertEquals(Verify_Audio_Post_User_Name_On_Post_List, "Avi Gupta");
		
		
		Thread.sleep(5000);
		
		OKTADPDSTP.TextPostsEdit();
		
		OKTADPDSTP.UpdateDescription_Textbox(prop.getProperty("UpdateDescriptionTextPost"));
		
		OKTADPDSTP.Updatebutton();
		
		Thread.sleep(5000);
		
		String Validation_UpdatedSuccessfully=OKTADPDSTP.Validation_UpdatedSuccessfully();
		sa.assertEquals(Validation_UpdatedSuccessfully, "Updated successfully", "Updated successfully");
		Thread.sleep(5000);
		sa.assertAll();

		System.out.println("OKTAdminPostDetailScreenForText_PostTest - Test cases has been executed");

	}


	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
