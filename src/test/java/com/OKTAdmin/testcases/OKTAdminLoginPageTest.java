package com.OKTAdmin.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OKTAdmin.base.TestBase;
import com.OKTAdmin.pages.OKTAdminLoginPage;
import com.OKTAdmin.utils.TestUtil;

public class OKTAdminLoginPageTest extends TestBase {
	
	public  OKTAdminLoginPage OKTADLP;
	public  TestUtil TU;
	SoftAssert sa;
	
	
	public OKTAdminLoginPageTest() {
		
		super();
	}


	@BeforeMethod
	public void Setup()
	{
		intilization();
		OKTADLP=new OKTAdminLoginPage();
		TU=new TestUtil();
	    sa=new SoftAssert();
	}
	
	@Test(priority=0)
	public void verifyOkTestedAdminLoginPageTitle() throws InterruptedException
	{
		Thread.sleep(30000);
		String OkTestedAdminLoginPageTitle=OKTADLP.OkTestedAdminLoginPageTitle();
		sa.assertEquals(OkTestedAdminLoginPageTitle, "OKT Admin");
		sa.assertAll();
		Thread.sleep(5000);
	}
	

	@Test(priority=1)
	public void verifyOKTestedLogo() throws InterruptedException
	{
		Thread.sleep(30000);
		boolean OKTestedLogo=OKTADLP.OKTestedLogo();
		sa.assertEquals(OKTestedLogo,   true,"OK tested logo is missing on login page");
		sa.assertAll();
		Thread.sleep(5000);

	}
	
	
	@Test(priority=2,enabled = false)
	public  void  LoginInnOKTestedAdmin() throws InterruptedException
	{
	
		Thread.sleep(30000);
	    OKTADLP.LoginWithGoogleButton();
		Thread.sleep(5000);
		TU.GmailWindow();
		Thread.sleep(40000);
		String Welcome_Label=OKTADLP.Welcome_Label();
		sa.assertEquals(Welcome_Label, "Welcome","Welcome_label is missing on dashboard or not able to login due to login failure Welcome label is missing");
		sa.assertAll();
		Thread.sleep(5000);
		
		System.out.println("OKTAdminLoginPageTest - Test cases has been executed");
	}
	
	
	

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

	

}
