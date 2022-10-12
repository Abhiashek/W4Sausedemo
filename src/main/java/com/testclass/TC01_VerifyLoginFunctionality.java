package com.testclass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclasses.LoginBaseClass;

public class TC01_VerifyLoginFunctionality extends LoginBaseClass
{
	
	
	
	@Test
	public void verifyLoginfunctionality() throws InterruptedException
	{
		
	System.out.println("apply the validation");	
	String expectedtitle="Swag Labs";
	String actualtitle=driver.getTitle();
	if(expectedtitle.equals(actualtitle))
	{
		System.out.println("Loginfunctionality test case pass");
	}
	else
	{
		System.out.println("Loginfunctionality test case fail");
	}
	}
	
	
	
}
