package com.testclass;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclasses.LoginandlogoutBaseclasstrue;

public class Tc02_VerifyLogout_functionalitry extends LoginandlogoutBaseclasstrue
{
	@Test(enabled=true)
	public void verifyLogoutfunctionality()
	{
		
		System.out.println("apply the validation");
		
		   String expectedTitle = "Swag Labs";    //dev/BA	
		   String actualTitle = driver.getTitle();
		
		  Assert.assertEquals(actualTitle, expectedTitle);
	}
	

}
