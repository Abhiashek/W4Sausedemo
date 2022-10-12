package com.testclass;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclasses.LoginBaseClass;
import com.pom.all.Homepagepomclass;

public class Tc03_Verifyoneaddtocartbuttonfunctionilty extends LoginBaseClass
{
	@Test
	public void verifyproductfunctionality()
	{
		Homepagepomclass x = new Homepagepomclass(driver);
		x.clickoneproduct();
		System.out.println("One product is add to  cart");
       String exceptedProduct = "1";
		
		String actualProduct =x.carttext();
		System.out.println("actual product->"+actualProduct);
		
		System.out.println("apply validation");
		
		 Assert.assertEquals(actualProduct,exceptedProduct);

	}
}
