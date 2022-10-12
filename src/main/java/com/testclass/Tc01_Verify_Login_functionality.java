package com.testclass;

//import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import com.baseclasses.LoginandlogoutBaseclasstrue;

public class Tc01_Verify_Login_functionality extends LoginandlogoutBaseclasstrue
{
	@Test
	public void verifyLoginFunctionality() throws IOException
	{		
       System.out.println("apply the validation");
	   String expectedTitle = "Swag Labs";    //dev/BA	
	   String actualTitle = driver.getTitle();
	   
	
		 Assert.assertEquals(actualTitle,expectedTitle);
		 
		 

	}
	
	


}
