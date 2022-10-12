package com.testclass;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclasses.LoginBaseClass;
import com.pom.all.Homepagepomclass;

public class Tc04_Verifyallproductcartbutton extends LoginBaseClass
{
	@Test
	public void verifyallproductfunctionality()
	{
		Homepagepomclass x = new Homepagepomclass(driver);
		x.clickallproducts();
		System.out.println("all product is add to  cart");
       String exceptedProduct = "6";
		
		String actualProduct =x.allcarttext();
		System.out.println("actual product->"+actualProduct);
		
		System.out.println("apply validation");
		
		
		 Assert.assertEquals(actualProduct,exceptedProduct);
	}

}
