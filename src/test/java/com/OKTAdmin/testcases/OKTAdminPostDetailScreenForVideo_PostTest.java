package com.OKTAdmin.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OKTAdmin.base.TestBase;
import com.OKTAdmin.pages.OKTAdminLoginPage;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForAudio_Post;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForImage_Post;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForLink_Post;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForPoll_Post;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForVideo_Post;
import com.OKTAdmin.pages.OKTAdminPostScreen;
import com.OKTAdmin.utils.CustomListener;
import com.OKTAdmin.utils.TestUtil;

@Listeners(CustomListener.class)
public class OKTAdminPostDetailScreenForVideo_PostTest extends TestBase {
	
	public OKTAdminPostDetailScreenForVideo_Post OKTADDSVP;
	public OKTAdminLoginPage OKTADLP;
	public OKTAdminPostScreen OKTADPS;
	public  TestUtil TU;
	SoftAssert sa;

	public OKTAdminPostDetailScreenForVideo_PostTest() {
		
		
		super();
	}

	@BeforeMethod
	public void Setup()
	{
		intilization();
		OKTADDSVP=new OKTAdminPostDetailScreenForVideo_Post();
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
		Thread.sleep(5000);
		OKTADDSVP.Create_button();
		Thread.sleep(5000);

		OKTADDSVP.Select_PostType(prop.getProperty("PostType_Video"));
		Thread.sleep(5000);
		
		String Media_Preview_Label=OKTADDSVP.Media_Preview_Label();
		sa.assertEquals(Media_Preview_Label, "Media Preview", "Media Preview label is missing");
		
		String Thumbnail_Preview_Label=OKTADDSVP.Thumbnail_Preview_Label();
		sa.assertEquals(Thumbnail_Preview_Label, "Thumbnail Preview", "Thumbnail Preview label is missing");
		
		String Media_Label=OKTADDSVP.Media_Label();
		sa.assertEquals(Media_Label, "Media", "Media label is missing");
		
		String Thumbnail_Label=OKTADDSVP.Thumbnail_Label();
		sa.assertEquals(Thumbnail_Label, "Thumbnail", "Thumbnail label is missing");
		
		String Dropdown_PostType_Label=OKTADDSVP.Dropdown_PostType_Label();
		sa.assertEquals(Dropdown_PostType_Label, "Post Type", "Post Type label is missing");
		
		String Dropdown_User_Label=OKTADDSVP.Dropdown_User_Label();
		sa.assertEquals(Dropdown_User_Label, "User", "User label is missing");
		
		String Dropdown_Community_Label=OKTADDSVP.Dropdown_Community_Label();
		sa.assertEquals(Dropdown_Community_Label, "Community", "Community label is missing");
		
		String Description_Label=OKTADDSVP.Description_Label();
		sa.assertEquals(Description_Label, "Description", "Description label is missing");
		
		sa.assertAll();
		
		Thread.sleep(5000);
				 
	}
	
	@Test(priority=1)// TEST CASE-1
	public void Verify_Multiple_Validation_For_Video_Post() throws InterruptedException
	{
		
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADDSVP.Create_button();
		Thread.sleep(5000);
		
		OKTADDSVP.Select_PostType(prop.getProperty("PostType_Video"));
		Thread.sleep(5000);
		OKTADDSVP.PostDetail_Create_button();
		Thread.sleep(5000);
		String Validation_PleaseSelectUser=OKTADDSVP.Validation_PleaseSelectUser();
		sa.assertEquals(Validation_PleaseSelectUser, "Please select user", "Please select user validation is missing");
		OKTADDSVP.Select_User(prop.getProperty("User"));
		Thread.sleep(5000);
		
		OKTADDSVP.PostDetail_Create_button();
		Thread.sleep(5000);
		String Validation_PleaseSelectCommunity=OKTADDSVP.Validation_PleaseSelectCommunity();
		sa.assertEquals(Validation_PleaseSelectCommunity, "Please select community", "Please select community validation is missing");
		OKTADDSVP.Select_Community(prop.getProperty("Community"));
		Thread.sleep(5000);
		
		 
	}
	
	
	@Test(priority=2)
	public void Verify_Validation_Video_Post() throws InterruptedException
	{
		
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADDSVP.Create_button();
		Thread.sleep(5000);
		
		OKTADDSVP.Select_PostType(prop.getProperty("PostType_Video"));
		OKTADDSVP.Select_PostStatus(prop.getProperty("PostStatus"));
		OKTADDSVP.Select_User(prop.getProperty("User"));
		OKTADDSVP.Select_Community(prop.getProperty("Community"));
		OKTADDSVP.Description_Textbox(prop.getProperty("DescriptionVideoPost"));
		OKTADDSVP.PostDetail_Create_button();
		String Validation_FilenameOrFilCannotBeBlank=OKTADDSVP.Validation_FilenameOrFilCannotBeBlank();
		sa.assertEquals(Validation_FilenameOrFilCannotBeBlank, "Filename or File can not be blank", "Filename or File can not be blank" + " validation is missing");
		Thread.sleep(5000);
		sa.assertAll();
				 
	}
	
	
	
	
	@Test(priority=3)
	public void CreateAndUpdate_Video_Post() throws InterruptedException, AWTException
	{
		
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADDSVP.Create_button();
		Thread.sleep(5000);
		
		OKTADDSVP.Select_PostType(prop.getProperty("PostType_Video"));
		OKTADDSVP.Select_PostStatus(prop.getProperty("PostStatus"));
		OKTADDSVP.Select_User(prop.getProperty("User"));
		OKTADDSVP.Select_Community(prop.getProperty("Community"));
		OKTADDSVP.Description_Textbox(prop.getProperty("DescriptionVideoPost"));
		Thread.sleep(5000);
	
		
		TU.Video_File_Upload();
		Thread.sleep(5000);
		boolean Attachment_Media_Preview=OKTADDSVP.Attachment_Media_Preview();
		sa.assertEquals(Attachment_Media_Preview, true, "Attachment Media preview is missing");
		Thread.sleep(5000);
		
		TU.Thumbnail_File_Upload();
		Thread.sleep(5000);
		boolean Attachment_Thumbnail_Preview=OKTADDSVP.Attachment_Thumbnail_Preview();
		sa.assertEquals(Attachment_Thumbnail_Preview, true, "Attachment Thumbnail preview is missing");
		Thread.sleep(5000);
		sa.assertAll();
		OKTADDSVP.PostDetail_Create_button();
		Thread.sleep(5000);
		
		String Validation_CreatedSuccessfully=OKTADDSVP.Validation_CreatedSuccessfully();
		sa.assertEquals(Validation_CreatedSuccessfully, "Created successfully", "Created successfully");
		Thread.sleep(5000);
		sa.assertAll();
		
		System.out.println("OKTAdminPostDetailScreenForVideo_PostTest - Test cases has been executed");
		
        Thread.sleep(5000);
		
		OKTADDSVP.TextPostsEdit();
		
		OKTADDSVP.UpdateDescription_Textbox(prop.getProperty("UpdateDescriptionVideoPost"));
		
		OKTADDSVP.Updatebutton();
		
		Thread.sleep(5000);
		
		String Validation_UpdatedSuccessfully=OKTADDSVP.Validation_UpdatedSuccessfully();
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
