package com.eg.shoptest;

import java.io.IOException;


import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.Homepage;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomepage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends Hooks{

	public AddRemoveItemBasketTest() throws IOException {
		super();
	}

	@Test
	public void AddRemoveItem() throws InterruptedException, IOException {
		Homepage home = new Homepage();
		
		Thread.sleep(2000);
		home.getToggle().click();
		
		Thread.sleep(2000);
		home.getTestStoreLink().click();
		
		Thread.sleep(2000);
		ShopHomepage  shopHome = new ShopHomepage();
		shopHome.getProdOne().click();
		
		Thread.sleep(2000);
		ShopProductPage shopProd = new ShopProductPage();
		Select option = new Select(shopProd.getSizeDropDownMenu());
		option.selectByVisibleText("M");
		shopProd.getQuantityIncrease().click();
		shopProd.getAddToCartBtn().click();
		
		Thread.sleep(2000);
		ShopContentPanel cPanel = new ShopContentPanel();
		cPanel.getContinueShoppingBtn().click();
		shopProd.getHomepageLink().click();
		shopHome.getProdTwo().click();
		
		
		Thread.sleep(2000);
		Select optionProdTwo = new Select(shopProd.getSizeDropDownMenu());
		optionProdTwo.selectByVisibleText("M");
		shopProd.getQuantityIncrease().click();
		shopProd.getAddToCartBtn().click();
		cPanel.getProceedToCheckoutBtn().click();
		
		Thread.sleep(2000);
		ShoppingCart cart = new ShoppingCart();
		cart.getDeleteItemTwo().click();
		
		waitForElementInvisible(cart.getDeleteItemTwo(), 120);

		Assert.assertEquals(cart.getTotalAmount().getText(),"$45.24");
	}




}
