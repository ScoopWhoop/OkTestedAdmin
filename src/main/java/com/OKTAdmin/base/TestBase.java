package com.OKTAdmin.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	
	 public static Properties prop;
	 public static WebDriver driver;
	 static ChromeOptions copt;
	
	
	public TestBase()
	{
		
		try
		{
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\Shanu\\ScoopWhoop-workspace\\OkTestedAdmin\\src\\main\\java\\com\\OKTAdmin\\config\\Config.properties");
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
			
			//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "false");
			System.setProperty("webdriver.chrome.driver", "E:\\Automation_Tools\\chromedriver_win32 (1)\\chromedriver.exe");
			copt=new ChromeOptions();
			copt.addArguments("--disable-infobars"); 
			driver=new ChromeDriver(copt);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		} 
		else 
		{
			
			System.setProperty("webdriver.gecko.driver", "E:\\Automation_Tools\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();	

		}
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("Url"));
			}
}