package com.OKTAdmin.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OKTAdmin.base.TestBase;
import com.OKTAdmin.pages.OKTAdminLoginPage;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForImage_Post;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForLink_Post;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForPoll_Post;
import com.OKTAdmin.pages.OKTAdminPostScreen;
import com.OKTAdmin.utils.TestUtil;

public class OKTAdminPostDetailScreenForImage_PostTest extends TestBase {
	
	public OKTAdminPostDetailScreenForImage_Post OKTADDPSIP;
	public OKTAdminLoginPage OKTADLP;
	public OKTAdminPostScreen OKTADPS;
	public  TestUtil TU;
	SoftAssert sa;

	public OKTAdminPostDetailScreenForImage_PostTest() {
				
		super();
	}

	@BeforeMethod
	public void Setup()
	{
		intilization();
		OKTADDPSIP=new OKTAdminPostDetailScreenForImage_Post();
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
		OKTADDPSIP.Create_button();
		Thread.sleep(60000);

		OKTADDPSIP.Select_PostType(prop.getProperty("PostType_Image"));
		Thread.sleep(50000);
		
		String Media_Preview_Label=OKTADDPSIP.Media_Preview_Label();
		sa.assertEquals(Media_Preview_Label, "Media Preview", "Media Preview label is missing");
		
		String Media_Label=OKTADDPSIP.Media_Label();
		sa.assertEquals(Media_Label, "Media", "Media label is missing");
		
		String Dropdown_PostType_Label=OKTADDPSIP.Dropdown_PostType_Label();
		sa.assertEquals(Dropdown_PostType_Label, "Post Type", "Post Type label is missing");
		
		String Dropdown_User_Label=OKTADDPSIP.Dropdown_User_Label();
		sa.assertEquals(Dropdown_User_Label, "User", "User label is missing");
		
		String Dropdown_Community_Label=OKTADDPSIP.Dropdown_Community_Label();
		sa.assertEquals(Dropdown_Community_Label, "Community", "Community label is missing");
		
		String Description_Label=OKTADDPSIP.Description_Label();
		sa.assertEquals(Description_Label, "Description", "Description label is missing");
		
		sa.assertAll();
		
		Thread.sleep(5000);
				 
	}
	
	@Test(priority=1)
	public void Verify_Multiple_Validation_For_Poll_Post() throws InterruptedException
	{
		
		Thread.sleep(50000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(60000);
		TU.GmailWindow();
		Thread.sleep(60000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADDPSIP.Create_button();
		Thread.sleep(10000);
		
		OKTADDPSIP.Select_PostType(prop.getProperty("PostType_Image"));
		Thread.sleep(5000);
		OKTADDPSIP.PostDetail_Create_button();
		Thread.sleep(5000);
		String Validation_PleaseSelectUser=OKTADDPSIP.Validation_PleaseSelectUser();
		sa.assertEquals(Validation_PleaseSelectUser, "Please select user", "Please select user validation is missing");
		OKTADDPSIP.Select_User(prop.getProperty("User"));
		Thread.sleep(10000);
		
		OKTADDPSIP.PostDetail_Create_button();
		Thread.sleep(60000);
		String Validation_PleaseSelectCommunity=OKTADDPSIP.Validation_PleaseSelectCommunity();
		sa.assertEquals(Validation_PleaseSelectCommunity, "Please select community", "Please select community validation is missing");
		OKTADDPSIP.Select_Community(prop.getProperty("Community"));
		Thread.sleep(10000);
		
		 
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
		OKTADDPSIP.Create_button();
		Thread.sleep(5000);
		
		OKTADDPSIP.Select_PostType(prop.getProperty("PostType_Image"));
		OKTADDPSIP.Select_PostStatus(prop.getProperty("PostStatus"));
		OKTADDPSIP.Select_User(prop.getProperty("User"));
		OKTADDPSIP.Select_Community(prop.getProperty("Community"));
		OKTADDPSIP.Description_Textbox(prop.getProperty("DescriptionImagePost"));
		OKTADDPSIP.PostDetail_Create_button();
		String Validation_FilenameOrFilCannotBeBlank=OKTADDPSIP.Validation_FilenameOrFilCannotBeBlank();
		sa.assertEquals(Validation_FilenameOrFilCannotBeBlank, "Filename or File can not be blank", "Filename or File can not be blank" + " validation is missing");
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
		Thread.sleep(5000);
		OKTADDPSIP.Create_button();
		Thread.sleep(5000);
		
		OKTADDPSIP.Select_PostType(prop.getProperty("PostType_Image"));
		OKTADDPSIP.Select_PostStatus(prop.getProperty("PostStatus"));
		OKTADDPSIP.Select_User(prop.getProperty("User"));
		OKTADDPSIP.Select_Community(prop.getProperty("Community"));
		OKTADDPSIP.Description_Textbox(prop.getProperty("DescriptionImagePost"));
		Thread.sleep(5000);
		
		
		TU.Image_File_Upload();
		
		
		
		Thread.sleep(60000);

		
		boolean Attachment_Media_Preview=OKTADDPSIP.Attachment_Media_Preview();
		sa.assertEquals(Attachment_Media_Preview, true, "Attachment Media preview is missing");
		Thread.sleep(10000);
		sa.assertAll();
		OKTADDPSIP.PostDetail_Create_button();
		Thread.sleep(5000);
		
		System.out.println("OKTAdminPostDetailScreenForImage_PostTest - Test cases has been executed");
	}

	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
