package com.OKTAdmin.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OKTAdmin.base.TestBase;
import com.OKTAdmin.pages.OKTAdminLoginPage;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForAudio_Post;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForImage_Post;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForLink_Post;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForPoll_Post;
import com.OKTAdmin.pages.OKTAdminPostScreen;
import com.OKTAdmin.utils.TestUtil;

public class OKTAdminPostDetailScreenForAudio_PostTest extends TestBase {
	
	public OKTAdminPostDetailScreenForAudio_Post OKTADDSAP;
	public OKTAdminLoginPage OKTADLP;
	public OKTAdminPostScreen OKTADPS;
	public  TestUtil TU;
	SoftAssert sa;

	public OKTAdminPostDetailScreenForAudio_PostTest() {
		
		
		super();
	}

	
	@BeforeMethod
	public void Setup()
	{
		intilization();
		OKTADDSAP=new OKTAdminPostDetailScreenForAudio_Post();
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
		Thread.sleep(90000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(50000);
		OKTADDSAP.Create_button();
		Thread.sleep(60000);

		OKTADDSAP.Select_PostType(prop.getProperty("PostType_Audio"));
		Thread.sleep(5000);
		
		String Media_Preview_Label=OKTADDSAP.Media_Preview_Label();
		sa.assertEquals(Media_Preview_Label, "Media Preview", "Media Preview label is missing");
		
		String Thumbnail_Preview_Label=OKTADDSAP.Thumbnail_Preview_Label();
		sa.assertEquals(Thumbnail_Preview_Label, "Thumbnail Preview", "Thumbnail Preview label is missing");
		
		String Attachment_Media_Label=OKTADDSAP.Attachment_Media_Label();
		sa.assertEquals(Attachment_Media_Label, "Media", "Media label is missing");
		
		String Attachment_Thumbnail_Label=OKTADDSAP.Attachment_Thumbnail_Label();
		sa.assertEquals(Attachment_Thumbnail_Label, "Thumbnail", "Thumbnail label is missing");
		
		String Dropdown_PostType_Label=OKTADDSAP.Dropdown_PostType_Label();
		sa.assertEquals(Dropdown_PostType_Label, "Post Type", "Post Type label is missing");
		
		String Dropdown_User_Label=OKTADDSAP.Dropdown_User_Label();
		sa.assertEquals(Dropdown_User_Label, "User", "User label is missing");
		
		String Dropdown_Community_Label=OKTADDSAP.Dropdown_Community_Label();
		sa.assertEquals(Dropdown_Community_Label, "Community", "Community label is missing");
		
		String Description_Label=OKTADDSAP.Description_Label();
		sa.assertEquals(Description_Label, "Description", "Description label is missing");
		
		sa.assertAll();
		
		Thread.sleep(5000);
				 
	}
	
	@Test(priority=1)// TEST CASE-1
	public void Verify_Multiple_Validation_For_Audio_Post() throws InterruptedException
	{
	
		Thread.sleep(50000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(60000);
		TU.GmailWindow();
		Thread.sleep(60000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADDSAP.Create_button();
		Thread.sleep(60000);
		
		OKTADDSAP.Select_PostType(prop.getProperty("PostType_Audio"));
		Thread.sleep(5000);
		OKTADDSAP.PostDetail_Create_button();
		Thread.sleep(5000);
		String Validation_PleaseSelectUser=OKTADDSAP.Validation_PleaseSelectUser();
		sa.assertEquals(Validation_PleaseSelectUser, "Please select user", "Please select user validation is missing");
		OKTADDSAP.Select_User(prop.getProperty("User"));
		Thread.sleep(10000);
		
		OKTADDSAP.PostDetail_Create_button();
		Thread.sleep(5000);
		String Validation_PleaseSelectCommunity=OKTADDSAP.Validation_PleaseSelectCommunity();
		sa.assertEquals(Validation_PleaseSelectCommunity, "Please select community", "Please select community validation is missing");
		OKTADDSAP.Select_Community(prop.getProperty("Community"));
		Thread.sleep(10000);
		
		 
	}
	
	
	@Test(priority=2)
	public void Verify_Validation_Audio_Post() throws InterruptedException
	{
		
		Thread.sleep(50000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(60000);
		TU.GmailWindow();
		Thread.sleep(60000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADDSAP.Create_button();
		Thread.sleep(60000);
		
		OKTADDSAP.Select_PostType(prop.getProperty("PostType_Audio"));
		OKTADDSAP.Select_PostStatus(prop.getProperty("PostStatus"));
		OKTADDSAP.Select_User(prop.getProperty("User"));
		OKTADDSAP.Select_Community(prop.getProperty("Community"));
		OKTADDSAP.Description_Textbox(prop.getProperty("DescriptionAudioPost"));
		OKTADDSAP.PostDetail_Create_button();
		String Validation_FilenameOrFilCannotBeBlank=OKTADDSAP.Validation_FilenameOrFilCannotBeBlank();
		sa.assertEquals(Validation_FilenameOrFilCannotBeBlank, "Filename or File can not be blank", "Filename or File can not be blank" + " validation is missing");
		Thread.sleep(10000);
		sa.assertAll();
				 
	}
	
	
	
	
	@Test(priority=3)
	public void Create_Audio_Post() throws InterruptedException, AWTException
	{
		
		Thread.sleep(50000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(60000);
		TU.GmailWindow();
		Thread.sleep(60000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(50000);
		OKTADDSAP.Create_button();
		Thread.sleep(60000);
		
		OKTADDSAP.Select_PostType(prop.getProperty("PostType_Audio"));
		OKTADDSAP.Select_PostStatus(prop.getProperty("PostStatus"));
		OKTADDSAP.Select_User(prop.getProperty("User"));
		OKTADDSAP.Select_Community(prop.getProperty("Community"));
		OKTADDSAP.Description_Textbox(prop.getProperty("DescriptionAudioPost"));
		Thread.sleep(5000);
	
		
		TU.Audio_File_Upload();
		Thread.sleep(90000);
		boolean Attachment_Media_Preview=OKTADDSAP.Attachment_Media_Preview();
		sa.assertEquals(Attachment_Media_Preview, true, "Attachment Media preview is missing");
		Thread.sleep(10000);
		
		TU.Thumbnail_File_Upload();
		Thread.sleep(90000);
		boolean Attachment_Thumbnail_Preview=OKTADDSAP.Attachment_Thumbnail_Preview();
		sa.assertEquals(Attachment_Thumbnail_Preview, true, "Attachment Thumbnail preview is missing");
		Thread.sleep(10000);
		sa.assertAll();
		OKTADDSAP.PostDetail_Create_button();
		Thread.sleep(5000);
		
		String Validation_CreatedSuccessfully=OKTADDSAP.Validation_CreatedSuccessfully();
		sa.assertEquals(Validation_CreatedSuccessfully, "Created successfully", "Created successfully validation is missing");
		Thread.sleep(5000);
		sa.assertAll();
		
		System.out.println("OKTAdminPostDetailScreenForAudio_PostTest - Test cases has been executed");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}


}
