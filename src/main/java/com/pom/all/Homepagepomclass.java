package com.pom.all;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagepomclass {
	WebDriver driver;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	WebElement menuButton;
	public void clickmenuButton()
	{
		menuButton.click();
	}
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement logoutButton;
	public void clicklogoutButton()
	{
		logoutButton.click();
	}
	
	public Homepagepomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	 private WebElement addtocartbutton;
	public void clickoneproduct()
	{
		addtocartbutton.click();
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cart;
	public String carttext()
	{
		String a=cart.getText();
		return a;
		
	}
	
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement>allproducts;
	public void clickallproducts()
	{
		for(WebElement abhi :allproducts )
		{
			abhi.click();
		}
		
	}
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement allcart;
	public String allcarttext()
	{
		String b=allcart.getText();
		return b;
		
	}
	
	
	
	

}
