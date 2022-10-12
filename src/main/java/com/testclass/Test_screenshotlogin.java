package com.testclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pom.all.Loginpomclass;
import com.sausedemo.utlity.Class.Screenshot;

public class Test_screenshotlogin {
	@Test
	public void verifyLoginFunctionality() throws IOException, InterruptedException
	{

			System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			System.out.println("Browser is open");
			
			driver.manage().window().maximize();
			System.out.println("Browser is Maximize");
			
			driver.get("https://www.saucedemo.com/");
			System.out.println("Open the URL");
			
			Loginpomclass l= new Loginpomclass(driver);
			l.sendUsername();
			System.out.println("Username is entered");
			l.sendpassword();
			System.out.println("Password is entered");
			l.clickonlogin();
			System.out.println("Login the page");
			Thread.sleep(3000);
			
			Screenshot.TakeScrrenshot(driver,"sausedemologin");
			System.out.println("Screenshot Sucessfully");
			driver.quit();
			
	}

}
