package com.baseclasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pom.all.Loginpomclass;
import com.sausedemo.utlity.Class.Screenshot;

public class LoginBaseClass {
public WebDriver driver;

 public Logger log = Logger.getLogger("W4SauseDemo");

    @Parameters("browserName")
    
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
    	if(browserName.equals("chrome"))
		{
		    System.setProperty("webdriver.chrome.driver", 
					"./DriverFiles\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("fireFox"))
		{
			System.setProperty("webdriver.gecko.driver", 
				"./DriverFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			log.info("browser is closed");
		}
   PropertyConfigurator.configure("log4j.properties");
		log.info("Browser is opened");
		
		driver.manage().window().maximize();
		log.info("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		log.info("SauceDemo URL is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//take screesnhot
		Screenshot.TakeScrrenshot(driver,"sausedemobrowser");
		
		
		//loginPage elements find +action perform
		
	Loginpomclass x = new Loginpomclass(driver);
		
		x.sendUsername();
		log.info("username is entered");
		
		x.sendpassword();
		log.info("password is entered");
		
		x.clickonlogin();
		log.info("Clicked on login button");
		Screenshot.TakeScrrenshot(driver,"sausedemologin");
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		System.out.println("browser is close");
		System.out.println("End of the programm");
	}

}
