package com.OKTAdmin.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.OKTAdmin.base.TestBase;
import com.OKTAdmin.pages.OKTAdminLoginPage;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForAudio_Post;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForImage_Post;
import com.OKTAdmin.pages.OKTAdminPostDetailScreenForPoll_Post;


public class TestUtil extends TestBase{
	
	OKTAdminLoginPage OKTADLP=new OKTAdminLoginPage();
	OKTAdminPostDetailScreenForImage_Post OKTADPSIP=new OKTAdminPostDetailScreenForImage_Post();
	OKTAdminPostDetailScreenForAudio_Post OKTADDSAP=new OKTAdminPostDetailScreenForAudio_Post();
	OKTAdminPostDetailScreenForPoll_Post OKTADDSPP = new OKTAdminPostDetailScreenForPoll_Post(); 
	
	

		public void GmailWindow() throws InterruptedException {
			
			String SWParentWindow = driver.getWindowHandle();
			System.out.println(SWParentWindow);
			
			Set<String> AllWindow = driver.getWindowHandles();
			int TotalWindows= AllWindow.size();
			System.out.println(TotalWindows);
				
			System.out.println(AllWindow);
			
			for(String Child:AllWindow)
			{
				if(!SWParentWindow.equalsIgnoreCase(Child))
				{
					   driver.switchTo().window(Child);
						//Thread.sleep(5000);
						OKTADLP.GmailEmailOrPhone(prop.getProperty("GmailEmailOrPhone"));
						//Thread.sleep(5000); 
						OKTADLP.NextButton(); 
						//Thread.sleep(5000);
						OKTADLP.GmailPassword(prop.getProperty("GmailPassword"));
						//Thread.sleep(5000); 
						OKTADLP.NextButtonPwd(); 
						//Thread.sleep(5000);
					
				}
			}
			
			driver.switchTo().window(SWParentWindow);
		
	}
	
		public void Image_File_Upload() throws InterruptedException, AWTException
		{

			 // Specify the file location with extension
			 StringSelection sel = new StringSelection("C:\\Users\\Shanu\\Desktop\\OKT-logo.png");
			 
			   // Copy to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 System.out.println("selection" +sel);
			 
			// Wait for 5 seconds
			 Thread.sleep(5000);
			 
			// This will click on Browse button
			 OKTADPSIP.Media_Browse_button();
			 
			 
			 
			 System.out.println("Browse button clicked");
			 
			 // Create object of Robot class
			 Robot robot = new Robot();
			 Thread.sleep(1000);
			      
			  // Press Enter
			 robot.keyPress(KeyEvent.VK_ENTER);
			 
			// Release Enter
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			  // Press CTRL+V
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_V);
			 
			// Release CTRL+V
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyRelease(KeyEvent.VK_V);
			 Thread.sleep(1000);
			        
			         //Press Enter 
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			}
		
		public void Audio_File_Upload() throws InterruptedException, AWTException
		{

			 // Specify the file location with extension
			 StringSelection sel = new StringSelection("C:\\Users\\Shanu\\Desktop\\Audio.mp3");
			 
			   // Copy to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 System.out.println("selection" +sel);
			 
			// Wait for 5 seconds
			 Thread.sleep(5000);
			 
			// This will click on Browse button
			 OKTADDSAP.Media_Browse_button();
			 
			 
			 
			 System.out.println("Browse button clicked");
			 
			 // Create object of Robot class
			 Robot robot = new Robot();
			 Thread.sleep(1000);
			      
			  // Press Enter
			 robot.keyPress(KeyEvent.VK_ENTER);
			 
			// Release Enter
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			  // Press CTRL+V
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_V);
			 
			// Release CTRL+V
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyRelease(KeyEvent.VK_V);
			 Thread.sleep(1000);
			        
			         //Press Enter 
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			}
		

		public void Thumbnail_File_Upload() throws InterruptedException, AWTException
		{

			 // Specify the file location with extension
			 StringSelection sel = new StringSelection("C:\\Users\\Shanu\\Desktop\\OKT-logo.png");
			 
			   // Copy to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 System.out.println("selection" +sel);
			 
			// Wait for 5 seconds
			 Thread.sleep(5000);
			 
			// This will click on Browse button
			 OKTADDSAP.Thumbnail_Browse_button();
			 
			 
			 
			 System.out.println("Browse button clicked");
			 
			 // Create object of Robot class
			 Robot robot = new Robot();
			 Thread.sleep(1000);
			     
			  // Press Enter
			 robot.keyPress(KeyEvent.VK_ENTER);
			 
			// Release Enter
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			  // Press CTRL+V
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_V);
			 
			// Release CTRL+V
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyRelease(KeyEvent.VK_V);
			 Thread.sleep(1000);
			        
			         //Press Enter 
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			}
		

		public void Video_File_Upload() throws InterruptedException, AWTException
		{

			 // Specify the file location with extension
			 StringSelection sel = new StringSelection("C:\\Users\\Shanu\\Desktop\\Video.avi");
			 
			   // Copy to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 System.out.println("selection" +sel);
			 
			// Wait for 5 seconds
			 Thread.sleep(5000);
			 
			// This will click on Browse button
			 OKTADDSAP.Media_Browse_button();
			 
			 
			 
			 System.out.println("Browse button clicked");
			 
			 // Create object of Robot class
			 Robot robot = new Robot();
			 Thread.sleep(1000);
			     
			  // Press Enter
			 robot.keyPress(KeyEvent.VK_ENTER);
			 
			// Release Enter
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			  // Press CTRL+V
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_V);
			 
			// Release CTRL+V
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyRelease(KeyEvent.VK_V);
			 Thread.sleep(1000);
			        
			         //Press Enter 
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			}
		
		public void Poll_File_Upload() throws InterruptedException, AWTException
		{

			 // Specify the file location with extension
			 StringSelection sel = new StringSelection("C:\\Users\\Shanu\\Desktop\\OKT-logo.png");
			 
			   // Copy to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 System.out.println("selection" +sel);
			 
			// Wait for 5 seconds
			 Thread.sleep(5000);
			 
			// This will click on Browse button
			 OKTADDSPP.Media_browse_button();
			 
			 
			 
			 System.out.println("Browse button clicked");
			 
			 // Create object of Robot class
			 Robot robot = new Robot();
			 Thread.sleep(1000);
			     
			  // Press Enter
			 robot.keyPress(KeyEvent.VK_ENTER);
			 
			// Release Enter
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			  // Press CTRL+V
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_V);
			 
			// Release CTRL+V
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyRelease(KeyEvent.VK_V);
			 Thread.sleep(1000);
			        
			         //Press Enter 
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			}
		
		
		public  static void FailedTestcaseScreensShot(String ScreenShot)
		
		{
			
			File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try {
				
				FileUtils.copyFile(file, new File("./ScreenShots/"+ScreenShot+".png"));
				
			    }
			    catch (IOException e) 
			{
				
				e.printStackTrace();
		    }		
			
		}
		
		public void Scrolldown()
		
		{
			System.out.println("1");
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)", "");
			System.out.println("2");
			
		}
			
			
			
		
		


}
