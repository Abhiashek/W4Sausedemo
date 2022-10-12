package com.pom.all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpomclass {
	WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
     @FindBy(xpath = "//input[@id='password']")
     WebElement password;
     public void sendpassword()
     {
    	 password.sendKeys("secret_sauce");
     }
     @FindBy(xpath = "//input[@id='login-button']")
     WebElement Loginbutton;
     public void clickonlogin()
     {
    	 Loginbutton.click();
     }
     public Loginpomclass(WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
     }
     

}
