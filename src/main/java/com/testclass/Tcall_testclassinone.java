package com.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.baseclasses.LoginBaseClass;
import com.baseclasses.LoginandlogoutBaseclasstrue;
import com.pom.all.Homepagepomclass;

public class Tcall_testclassinone extends LoginBaseClass
{
	@Test
	public void verifyLoginFunctionality() throws IOException
	{		
       System.out.println("apply the validation");
		
	   String expectedTitle = "Swag Labs";    
	   String actualTitle = driver.getTitle();
	
	   if(expectedTitle.equals(actualTitle))
	   {
		   System.out.println("login functionality test case is passed");
	   }
	   else
	   {
		   System.out.println("login functionality test case is failed");
	   }

	
	//@Test
	
	
		Homepagepomclass x = new Homepagepomclass(driver);
		x.clickallproducts();
		System.out.println("all product is add to  cart");
       String exceptedProduct = "6";
		
		String actualProduct =x.allcarttext();
		System.out.println("actual product->"+actualProduct);
		
		System.out.println("apply validation");
		
		if(exceptedProduct.equals(actualProduct))
		{
			System.out.println("Allproduct add to cart case is passed");
		}
		else
		{
			System.out.println("Allproduct add to cart case is failed");
		}

	
	//@Test
	
		Homepagepomclass y = new Homepagepomclass(driver);
		y.clickmenuButton();
		y.clicklogoutButton();
		System.out.println("apply the validation");
		
		   String expectedTitle1 = "Swag Labs";    
		   String actualTitle1 = driver.getTitle();
		
		   if(expectedTitle1.equals(actualTitle1))
		   {
			   System.out.println("logout functionality test case is passed");
		   }
		   else
		   {
			   System.out.println("logout functionality test case is failed");
		   }
		   
	}
	

}
