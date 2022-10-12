package com.baseclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pom.all.Homepagepomclass;
import com.pom.all.Loginpomclass;
import com.sausedemo.utlity.Class.Screenshot;

public class LoginandlogoutBaseclasstrue {
public WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo URL is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//take screesnhot
		Screenshot.TakeScrrenshot(driver,"sausedemobrowser");
		
		
		//loginPage elements find +action perform
		
	Loginpomclass x = new Loginpomclass(driver);
		
		x.sendUsername();
		System.out.println("username is entered");
		
		x.sendpassword();
		System.out.println("Password is entered");
		
		x.clickonlogin();
		System.out.println("Clicked on login button");
		Screenshot.TakeScrrenshot(driver,"sausedemologin");
		
		
		Thread.sleep(5000);
	Homepagepomclass y =new Homepagepomclass(driver);
	y.clickmenuButton();
	System.out.println("Clicked on menu button");
	y.clicklogoutButton();
	System.out.println("Clicked on logout button ");
	Screenshot.TakeScrrenshot(driver,"sausedemologout");
	}
	
	@AfterMethod
	public void tearDown()
	{
		   driver.quit();
	       System.out.println("browser is closed");
	       
	       System.out.println("end of Program");	
	}


}
