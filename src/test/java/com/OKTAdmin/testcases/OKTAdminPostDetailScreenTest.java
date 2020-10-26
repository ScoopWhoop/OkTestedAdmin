package com.OKTAdmin.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OKTAdmin.base.TestBase;
import com.OKTAdmin.pages.OKTAdminLoginPage;
import com.OKTAdmin.pages.OKTAdminPostDetailScreen;
import com.OKTAdmin.pages.OKTAdminPostScreen;
import com.OKTAdmin.utils.CustomListener;
import com.OKTAdmin.utils.TestUtil;

@Listeners(CustomListener.class)
public class OKTAdminPostDetailScreenTest extends TestBase {
	
	public  OKTAdminPostDetailScreen OKTADPDS;
	public OKTAdminLoginPage OKTADLP;
	public OKTAdminPostScreen OKTADPS;
	public  TestUtil TU;
	SoftAssert sa;

	public OKTAdminPostDetailScreenTest() {
		
		
		super();
	}


	@BeforeMethod
	public void Setup()
	{
		intilization();
		OKTADPDS=new OKTAdminPostDetailScreen();
		OKTADLP=new OKTAdminLoginPage();
		OKTADPS=new OKTAdminPostScreen();
		TU=new TestUtil();
	    sa=new SoftAssert();
	}
	
	@Test(priority=0)// TEST CASE-1
	public void Click_On_Create_button() throws InterruptedException
	{
	
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADPDS.Create_button();
		Thread.sleep(5000);
		boolean Back_button=OKTADPDS.PostDetail_back_button_Visibility();
		sa.assertEquals(Back_button, true, "We are verify back button to check Create button is redirecting to Post detail screen ");
		sa.assertAll();
		 
	}
	
	
	@Test(priority=1)
	public void verify_All_PostDetail_Label() throws InterruptedException
	{
		
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADPDS.Create_button();
		Thread.sleep(5000);
		
		String PostType_Label=OKTADPDS.PostType_Label();
		sa.assertEquals(PostType_Label, "Post Type","Post Type label is missing");
		
		String PostStatus_Label=OKTADPDS.PostStatus_Label();
		sa.assertEquals(PostStatus_Label, "Post Status","Post Status label is missing");
		
		String User_Label=OKTADPDS.User_Label();
		sa.assertEquals(User_Label, "User","User label is missing");
		
		String Community_Label=OKTADPDS.Community_Label();
		sa.assertEquals(Community_Label, "Community","Community label is missing");
		
		String Description_Label=OKTADPDS.Description_Label();
		sa.assertEquals(Description_Label, "Description","Description label is missing");
		
		sa.assertAll();

	}
	
	@Test(priority=2)
	public void Verify_DefaultdropdownValue() throws InterruptedException
	
	{
	
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		OKTADPDS.Create_button();
		Thread.sleep(5000);
		String DefaultPostTypedropdownValue=OKTADPDS.DefaultPostTypedropdownValue();
		System.out.println("DefaultPostTypedropdownValue is : "  +  DefaultPostTypedropdownValue);
		sa.assertEquals(DefaultPostTypedropdownValue, "Text");
		
		String DefaultPostStatusdropdownValue=OKTADPDS.DefaultPostStatusdropdownValue();
		System.out.println("DefaultPostStatusdropdownValue is : "  +  DefaultPostStatusdropdownValue);
		sa.assertEquals(DefaultPostStatusdropdownValue, "Active");
		 
		String DefaultUserdropdownValue=OKTADPDS.DefaultUserdropdownValue();
		System.out.println("DefaultUserdropdownValue is : "  +  DefaultUserdropdownValue);
		sa.assertEquals(DefaultUserdropdownValue, "Please choose");
		
		String DefaultCommunitydropdownValue=OKTADPDS.DefaultCommunitydropdownValue();
		System.out.println("DefaultCommunitydropdownValue is : "  +  DefaultCommunitydropdownValue);
		sa.assertEquals(DefaultCommunitydropdownValue, "Please choose");
		
	}

	
	
	@Test(priority=3)
	public void verify_Total_All_Dropdown_Value() throws InterruptedException
	
	{
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();  
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		OKTADPDS.Create_button();
		Thread.sleep(5000);
		
		OKTADPDS.Total_PostType_Dropdown_Value();
		Thread.sleep(5000);
		OKTADPDS.Total_PostStatus_Dropdown_Value();
		OKTADPDS.Total_User_Dropdown_Value();
		OKTADPDS.Total_Community_Dropdown_Value();
		
		
		 String Verify_Createbutton_BackgroundColor_In_Hex_Format=OKTADPDS.Createbutton_BackgroundColor();
		 sa.assertEquals(Verify_Createbutton_BackgroundColor_In_Hex_Format, "#17a2b8");
		 sa.assertAll();
		
		System.out.println("OKTAdminPostDetailScreenTest - Test cases has been executed");


	}

	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
