package com.OKTAdmin.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OKTAdmin.base.TestBase;
import com.OKTAdmin.pages.OKTAdminLoginPage;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForPoll_Post;
import com.OKTAdmin.pages.OKTAdminPostScreen;
import com.OKTAdmin.utils.TestUtil;

public class OKTAdminPostDetailScreenForPoll_PostTest extends TestBase {
	
	public OKTAdminPostDetailScreenForPoll_Post OKTADPDSPP;
	public OKTAdminLoginPage OKTADLP;
	public OKTAdminPostScreen OKTADPS;
	public  TestUtil TU;
	SoftAssert sa;

	public OKTAdminPostDetailScreenForPoll_PostTest() {
		
		
		super();
	}


	@BeforeMethod
	public void Setup()
	{
		intilization();
		OKTADPDSPP=new OKTAdminPostDetailScreenForPoll_Post();
		OKTADLP=new OKTAdminLoginPage();
		OKTADPS=new OKTAdminPostScreen();
		TU=new TestUtil();
	    sa=new SoftAssert();
	}
	
	@Test(priority=0)
	public void Verify_Labels() throws InterruptedException
	{
		
		Thread.sleep(50000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(60000);
		TU.GmailWindow();
		Thread.sleep(60000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(50000);
		OKTADPDSPP.Create_button();
		Thread.sleep(50000);

		OKTADPDSPP.Select_PostType(prop.getProperty("PostType_Poll"));
		Thread.sleep(5000);
		
		String Media_Preview_Label=OKTADPDSPP.Media_Preview_Label();
		sa.assertEquals(Media_Preview_Label, "Media Preview", "Media Preview label is missing");
		
		String Attachment_Media_Label=OKTADPDSPP.Media_Label();
		sa.assertEquals(Attachment_Media_Label, "Media", "Media label is missing");
		
		String Dropdown_PostType_Label=OKTADPDSPP.Dropdown_PostType_Label();
		sa.assertEquals(Dropdown_PostType_Label, "Post Type", "Post Type label is missing");
		
		String Dropdown_User_Label=OKTADPDSPP.Dropdown_User_Label();
		sa.assertEquals(Dropdown_User_Label, "User", "User label is missing");
		
		String Dropdown_Community_Label=OKTADPDSPP.Dropdown_Community_Label();
		sa.assertEquals(Dropdown_Community_Label, "Community", "Community label is missing");
		
		String Description_Label=OKTADPDSPP.Description_Label();
		sa.assertEquals(Description_Label, "Description", "Description label is missing");
		
		sa.assertAll();
		
		Thread.sleep(5000);
				 
	}
	
	@Test(priority=1)// TEST CASE-1
	public void Verify_Multiple_Validation_For_Poll_Post() throws InterruptedException
	{
		
		Thread.sleep(50000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(60000);
		TU.GmailWindow();
		Thread.sleep(60000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADPDSPP.Create_button();
		Thread.sleep(10000);
		
		OKTADPDSPP.Select_PostType(prop.getProperty("PostType_Poll"));
		Thread.sleep(5000);
		OKTADPDSPP.PostDetail_Create_button();
		Thread.sleep(5000);
		String Validation_PleaseSelectUser=OKTADPDSPP.Validation_PleaseSelectUser();
		sa.assertEquals(Validation_PleaseSelectUser, "Please select user", "Please select user validation is missing");
		OKTADPDSPP.Select_User(prop.getProperty("User"));
		Thread.sleep(10000);
		
		OKTADPDSPP.PostDetail_Create_button();
		Thread.sleep(5000);
		String Validation_PleaseSelectCommunity=OKTADPDSPP.Validation_PleaseSelectCommunity();
		sa.assertEquals(Validation_PleaseSelectCommunity, "Please select community", "Please select community validation is missing");
		OKTADPDSPP.Select_Community(prop.getProperty("Community"));
		Thread.sleep(10000);
		
		OKTADPDSPP.PostDetail_Create_button();
		Thread.sleep(10000);
		String Validation_DescriptionCannotBeBlank=OKTADPDSPP.Validation_DescriptionCannotBeBlank();
		sa.assertEquals(Validation_DescriptionCannotBeBlank, "Description cannot be blank", "Description cannot be blank validation is missing");
		Thread.sleep(10000);
		sa.assertAll();
		 
	}

	
	@Test(priority=2)
	public void Verify_Validation_Poll_Post() throws InterruptedException
	{
		
		Thread.sleep(50000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(60000);
		TU.GmailWindow();
		Thread.sleep(60000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADPDSPP.Create_button();
		Thread.sleep(5000);
		
		OKTADPDSPP.Select_PostType(prop.getProperty("PostType_Poll"));
		OKTADPDSPP.Select_PostStatus(prop.getProperty("PostStatus"));
		OKTADPDSPP.Select_User(prop.getProperty("User"));
		OKTADPDSPP.Select_Community(prop.getProperty("Community"));
		OKTADPDSPP.Description_Textbox(prop.getProperty("DescriptionPollPost"));
		OKTADPDSPP.PostDetail_Create_button();
		Thread.sleep(30000);
		String Validation_PleaseAddAtLeastTwoChoices=OKTADPDSPP.Validation_PleaseAddAtLeastTwoChoices();
		sa.assertEquals(Validation_PleaseAddAtLeastTwoChoices, "Please add at least two choices", "Please add at least two choices validation is missing");
		Thread.sleep(10000);
		sa.assertAll();
				 
	}
	
	@Test(priority=3)
	public void Create_Poll_Post() throws InterruptedException, AWTException
	{
		
		Thread.sleep(50000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(60000);
		TU.GmailWindow();
		Thread.sleep(60000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(60000);
		OKTADPDSPP.Create_button();
		Thread.sleep(5000);
		
		OKTADPDSPP.Select_PostType(prop.getProperty("PostType_Poll"));
		OKTADPDSPP.Select_PostStatus(prop.getProperty("PostStatus"));
		OKTADPDSPP.Select_User(prop.getProperty("User"));
		OKTADPDSPP.Select_Community(prop.getProperty("Community"));
		OKTADPDSPP.Description_Textbox(prop.getProperty("DescriptionPollPost"));
		Thread.sleep(5000);
		OKTADPDSPP.Choice_button();
		Thread.sleep(5000);
		OKTADPDSPP.Choice_Textbox_1(prop.getProperty("PollOption1"));
		Thread.sleep(5000);
		OKTADPDSPP.Choice_button();
		Thread.sleep(5000);
		OKTADPDSPP.Choice_Textbox_2(prop.getProperty("PollOption2"));
		
		Thread.sleep(60000);
		
		TU.Poll_File_Upload();
		
		Thread.sleep(60000);
		
		boolean Attachment_Media_Preview=OKTADPDSPP.Attachment_Media_Preview();
		sa.assertEquals(Attachment_Media_Preview, true, "Attachment Media Preview is missing");
		Thread.sleep(60000);
		OKTADPDSPP.PostDetail_Create_button();
	
		Thread.sleep(5000);
		
		String Validation_CreatedSuccessfully=OKTADPDSPP.Validation_CreatedSuccessfully();
		sa.assertEquals(Validation_CreatedSuccessfully, "Created successfully", "Created successfully validation is missing");
		Thread.sleep(5000);
		sa.assertAll();
		
		System.out.println("OKTAdminPostDetailScreenForPoll_PostTest - Test cases has been executed");

	}


	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
