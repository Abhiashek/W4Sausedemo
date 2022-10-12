package com.testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.all.Homepagepomclass;
import com.pom.all.Loginpomclass;

public class Testclass_logoutfunctionality {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Open the URL");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Loginpomclass x = new Loginpomclass(driver);
		x.sendUsername();
		System.out.println("Usename is entered");
		x.sendpassword();
		System.out.println("Password is entered");
		x.clickonlogin();	
		System.out.println("Login click");
	   
	    
	    Homepagepomclass y = new Homepagepomclass(driver);
	    y.clickmenuButton();
	    System.out.println("menu button click");
	    y.clicklogoutButton();
	    System.out.println("logout button click");
	    System.out.println("apply the validation");
	    String expectedTitle = "Swag Labs";    //dev/BA
		
		   String actualTitle = driver.getTitle();
		
		   if(expectedTitle.equals(actualTitle))
		   {
			   System.out.println("logOut functionality test case is passed");
		   }
		   else
		   {
			   System.out.println("logOut functionality test case is failed");
		   }
Thread.sleep(3000);
		   driver.quit();
	       System.out.println("browser is closed");
	       
	       System.out.println("end of Program");

	}

}
