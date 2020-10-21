package com.OKTAdmin.base;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import io.github.bonigarcia.wdm.managers.PhantomJsDriverManager;




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
			
			File chromeDriver=new File("E://Automation_Tools//chromedriver_win32 (1)//chromedriver.exe");
	         //WebDriverManager.chromedriver().setup();
			//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "false");
			//System.setProperty("webdriver.chrome.driver", prop.getProperty("driver.exe"));
			System.setProperty("webdriver.chrome.driver",chromeDriver.getAbsolutePath());

			//System.setProperty("phantomjs.binary.path", "E:\\Automation_Tools\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");

	        //ChromeOptions options = new ChromeOptions();
			//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

	        //options.addArguments("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4103.97 Safari/537.36");
	       // options.addArguments("--headless");
	       // options.addArguments("--start-maximized");
	       // options.addArguments("--window-size=1920,1080");
			driver=new ChromeDriver();
			//driver=(WebDriver) new PhantomJSDriver();
		
			
		}
		
		else if (prop.getProperty("browser").equalsIgnoreCase("Firefox"))
			
		{
			
			System.setProperty("webdriver.gecko.driver", "E:\\Automation_Tools\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();	

		}
		
		else if (prop.getProperty("browser").equalsIgnoreCase("IE")) 
				
		{
			
			System.setProperty("webdriver.ie.driver", "E:\\Automation_Tools\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		    driver=new InternetExplorerDriver();
		}
		 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("Url"));
		
		
	 }
}