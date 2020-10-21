package com.OKTAdmin.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OKTAdmin.base.TestBase;
import com.OKTAdmin.pages.OKTAdminLoginPage;
import com.OKTAdmin.pages.OKTAdminPostScreen;
import com.OKTAdmin.utils.CustomListener;
import com.OKTAdmin.utils.TestUtil;


@Listeners(CustomListener.class)
public class OKTAdminPostScreenTest extends TestBase {
	
	public  OKTAdminPostScreen OKTADPS;
	public OKTAdminLoginPage OKTADLP;
	public  TestUtil TU;
	SoftAssert sa;

	public OKTAdminPostScreenTest() {
		
		
		super();
	}


	@BeforeMethod
	public void Setup()
	{
		intilization();
		OKTADPS=new OKTAdminPostScreen();
		OKTADLP=new OKTAdminLoginPage();
		TU=new TestUtil();
	    sa=new SoftAssert();
	}
	
	@Test(priority=0)// TEST CASE-1
	public void verifyPost_Link() throws InterruptedException
	{
		
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(5000);
		
		boolean Post_Link=OKTADPS.Post_Link(); 
		sa.assertEquals(Post_Link, true);
		sa.assertAll(); 
		Thread.sleep(5000);
		 
	}
	
	
	@Test(priority=1)
	public void verifyClickOnPostScreen_Link() throws InterruptedException
	{
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		 

	}

	
	
	@Test(priority=2)
	public void verifyPost_Label() throws InterruptedException
	
	{
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		
		Thread.sleep(5000);
		OKTADPS.PostScreen_Link();
		Thread.sleep(5000);
		String Post_Label=OKTADPS.Posts_Label();
		sa.assertEquals(Post_Label, "Posts", "Posts label is missing"); 
		sa.assertAll(); 
		Thread.sleep(5000);
		 
		 

	}

	

	@Test(priority=3)
	public void verifyCreate_button() throws InterruptedException
	
	{
		Thread.sleep(5000);
		OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		
		Thread.sleep(5000); 
		OKTADPS.PostScreen_Link();
		boolean Create_button=OKTADPS.Create_button();
		sa.assertEquals(Create_button, true); 
		sa.assertAll(); 
		Thread.sleep(5000);
		
		System.out.println("OKTAdminPostScreenTest - Test cases has been executed");
		
		TU.Scrolldown();

	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
