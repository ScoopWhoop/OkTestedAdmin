package com.OKTAdmin.base;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import io.github.bonigarcia.wdm.WebDriverManager;




public class TestBase {
	
	 public static Properties prop;
	 public static WebDriver driver;
	 static ChromeOptions copt;
	
	
	public TestBase()
	{
		
		try
		{
			prop=new Properties();
			InputStream fis=getClass().getClassLoader().getResourceAsStream("Config.properties");
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static void intilization()

	{
		  
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
	         //WebDriverManager.chromedriver().setup();
			//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "false");
		//	System.setProperty("webdriver.chrome.driver", "E:\\Automation_Tools\\chromedriver_win32 (1)\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

	        //options.addArguments("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4103.97 Safari/537.36");
	        options.setHeadless(true);
	         // Must maximize Chrome by `start-maximized`
	        options.addArguments("start-maximized");
	        //options.addArguments("--window-size=1200,800");
			driver=new ChromeDriver(options);
			//driver.manage().window().fullscreen();
			
		} 
		else 
		{
			
			System.setProperty("webdriver.gecko.driver", "E:\\Automation_Tools\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();	

		}
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("Url"));
			}
}