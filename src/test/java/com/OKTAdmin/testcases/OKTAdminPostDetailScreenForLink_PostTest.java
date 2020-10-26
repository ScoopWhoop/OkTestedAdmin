package com.OKTAdmin.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OKTAdmin.base.TestBase;
import com.OKTAdmin.pages.OKTAdminLoginPage;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForLink_Post;
import com.OKTAdmin.pages.OKTAdminPostScreen;
import com.OKTAdmin.utils.CustomListener;
import com.OKTAdmin.utils.TestUtil;

@Listeners(CustomListener.class)
public class OKTAdminPostDetailScreenForLink_PostTest extends TestBase {
	
	public OKTAdminPostDetailScreenForLink_Post OKTADPDSLP;
	public OKTAdminLoginPage OKTADLP;
	public OKTAdminPostScreen OKTADPS;
	public  TestUtil TU;
	SoftAssert sa;

	public OKTAdminPostDetailScreenForLink_PostTest() {
		
		super();
	}


	@BeforeMethod
	public void Setup()
	{
		intilization();
		OKTADPDSLP=new OKTAdminPostDetailScreenForLink_Post();
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
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(50000);
		OKTADPDSLP.Create_button();
		Thread.sleep(5000);

		OKTADPDSLP.Select_PostType(prop.getProperty("PostType_Link"));
		Thread.sleep(5000);
		
		String Dropdown_PostType_Label=OKTADPDSLP.Dropdown_PostType_Label();
		sa.assertEquals(Dropdown_PostType_Label, "Post Type", "Post Type label is missing");
		
		String Dropdown_User_Label=OKTADPDSLP.Dropdown_User_Label();
		sa.assertEquals(Dropdown_User_Label, "User", "User label is missing");
		
		String Dropdown_Community_Label=OKTADPDSLP.Dropdown_Community_Label();
		sa.assertEquals(Dropdown_Community_Label, "Community", "Community label is missing");
		
		String Description_Label=OKTADPDSLP.Description_Label();
		sa.assertEquals(Description_Label, "Description", "Description label is missing");
		
		sa.assertAll();
		
		Thread.sleep(5000);
				 
	}
	
	
	@Test(priority=1)
	public void Verify_Multiple_Validation_For_Link_Post() throws InterruptedException
	{
		
		Thread.sleep(50000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADPDSLP.Create_button();
		Thread.sleep(5000);
		
		OKTADPDSLP.Select_PostType(prop.getProperty("PostType_Link"));
		Thread.sleep(5000);
		OKTADPDSLP.PostDetail_Create_button();
		String Validation_PleaseSelectUser=OKTADPDSLP.Validation_PleaseSelectUser();
		sa.assertEquals(Validation_PleaseSelectUser, "Please select user", "Please select user validation is missing");
		Thread.sleep(10000);
		OKTADPDSLP.Select_User(prop.getProperty("User"));
		Thread.sleep(5000);
		
		OKTADPDSLP.PostDetail_Create_button();
		String Validation_PleaseSelectCommunity=OKTADPDSLP.Validation_PleaseSelectCommunity();
		sa.assertEquals(Validation_PleaseSelectCommunity, "Please select community", "Please select community validation is missing");
		OKTADPDSLP.Select_Community(prop.getProperty("Community"));
		Thread.sleep(5000);
		 
	}
	
	
	@Test(priority=2)
	public void Verify_Validation_Link_Post() throws InterruptedException
	{
		
		Thread.sleep(50000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADPDSLP.Create_button();
		Thread.sleep(5000);
		
		OKTADPDSLP.Select_PostType(prop.getProperty("PostType_Link"));
		OKTADPDSLP.Select_PostStatus(prop.getProperty("PostStatus"));
		OKTADPDSLP.Select_User(prop.getProperty("User"));
		OKTADPDSLP.Select_Community(prop.getProperty("Community"));
		OKTADPDSLP.Description_Textbox(prop.getProperty("DescriptionLinkPost"));
		OKTADPDSLP.PostDetail_Create_button();
		String Validation_LinkCannotBeBlank=OKTADPDSLP.Validation_LinkCannotBeBlank();
		sa.assertEquals(Validation_LinkCannotBeBlank, "link can not be blank", "Link can not be blank validation is missing");
		Thread.sleep(5000);
		sa.assertAll();
				 
	}
	
	@Test(priority=3)
	public void CreateAndUpdate_Link_Post() throws InterruptedException
	{
		
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADPDSLP.Create_button();
		Thread.sleep(5000);
		
		OKTADPDSLP.Select_PostType(prop.getProperty("PostType_Link"));
		OKTADPDSLP.Select_PostStatus(prop.getProperty("PostStatus"));
		OKTADPDSLP.Select_User(prop.getProperty("User"));
		OKTADPDSLP.Select_Community(prop.getProperty("Community"));
		OKTADPDSLP.Description_Textbox(prop.getProperty("DescriptionLinkPost"));
		OKTADPDSLP.LinkUrl_Textbox(prop.getProperty("LinkUrl"));
		OKTADPDSLP.PostDetail_Create_button();
		Thread.sleep(5000);
		
		String Validation_CreatedSuccessfully=OKTADPDSLP.Validation_CreatedSuccessfully();
		sa.assertEquals(Validation_CreatedSuccessfully, "Created successfully", "Created successfully validation is missing");
		Thread.sleep(5000);
		sa.assertAll();
		
		System.out.println("OKTAdminPostDetailScreenForLink_PostTest - Test cases has been executed");
		   
		Thread.sleep(5000);
		
		String Verify_Link_Post_Name_OR_Description_On_Post_List=OKTADPDSLP.Link_Post_Name_OR_Description_On_Post_List();
		sa.assertEquals(Verify_Link_Post_Name_OR_Description_On_Post_List, "Link Post");
		
		String Verify_Link_Post_Active_Status_On_Post_List=OKTADPDSLP.Link_Post_Active_Status_On_Post_List();
		sa.assertEquals(Verify_Link_Post_Active_Status_On_Post_List, "Active");
		
		String Verify_Link_Post_Community_Name_Label_On_Post_List=OKTADPDSLP.Link_Post_Community_Name_Label_On_Post_List();
		sa.assertEquals(Verify_Link_Post_Community_Name_Label_On_Post_List, "Community name:");
		
		String Verify_Link_Post_Community_Name_On_Post_List=OKTADPDSLP.Link_Post_Community_Name_On_Post_List();
		sa.assertEquals(Verify_Link_Post_Community_Name_On_Post_List, "Ok Tested");

		String Verify_Link_Post_User_Label_On_Post_List=OKTADPDSLP.Link_Post_User_Label_On_Post_List();
		sa.assertEquals(Verify_Link_Post_User_Label_On_Post_List, "User:");
		
		String Verify_Link_Post_User_Name_On_Post_List=OKTADPDSLP.Link_Post_User_Name_On_Post_List();
		sa.assertEquals(Verify_Link_Post_User_Name_On_Post_List, "Avi Gupta");
		Thread.sleep(5000);

		
		OKTADPDSLP.TextPostsEdit();
		
		OKTADPDSLP.UpdateDescription_Textbox(prop.getProperty("UpdateDescriptionLinkPost"));
		
		OKTADPDSLP.Updatebutton();
		
		
		Thread.sleep(5000);
		
		String Validation_UpdatedSuccessfully=OKTADPDSLP.Validation_UpdatedSuccessfully();
		sa.assertEquals(Validation_UpdatedSuccessfully, "Updated successfully", "Updated successfully");
		Thread.sleep(5000);
		sa.assertAll();


	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
