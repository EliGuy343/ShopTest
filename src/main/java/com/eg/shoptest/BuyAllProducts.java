package com.eg.shoptest;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.Homepage;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomepage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

public class BuyAllProducts extends BasePage {

	public BuyAllProducts() throws IOException {
		super();
	}

	@Test
	public void buyMultipleProductsTest() throws InterruptedException {
		Homepage home = new Homepage(driver);
		
		Thread.sleep(2000);
		home.getToggle().click();
		
		Thread.sleep(2000);
		home.getTestStoreLink().click();
		
		Thread.sleep(2000);
		ShopHomepage  shopHome = new ShopHomepage(driver);
		shopHome.getProdOne().click();
		
		Thread.sleep(2000);
		ShopProductPage shopProd = new ShopProductPage(driver);
		shopProd.getAddToCartBtn().click();
		
		Thread.sleep(2000);
		ShopContentPanel cPanel = new ShopContentPanel(driver);
		cPanel.getContinueShoppingBtn().click();
		shopProd.getHomepageLink().click();
		
		Thread.sleep(2000);
		shopHome.getProdTwo().click();
		
		Thread.sleep(2000);
		shopProd = new ShopProductPage(driver);
		shopProd.getAddToCartBtn().click();
		
		Thread.sleep(2000);
		cPanel = new ShopContentPanel(driver);
		cPanel.getContinueShoppingBtn().click();
		shopProd.getHomepageLink().click();
		
		Thread.sleep(2000);
		shopHome.getProdThree().click();
		
		Thread.sleep(2000);
		shopProd = new ShopProductPage(driver);
		shopProd.getAddToCartBtn().click();
		
		Thread.sleep(2000);
		cPanel = new ShopContentPanel(driver);
		cPanel.getContinueShoppingBtn().click();
		shopProd.getHomepageLink().click();
		
		Thread.sleep(2000);
		shopHome.getProdFour().click();
		
		Thread.sleep(2000);
		shopProd = new ShopProductPage(driver);
		shopProd.getAddToCartBtn().click();
		
		Thread.sleep(2000);
		cPanel = new ShopContentPanel(driver);
		cPanel.getContinueShoppingBtn().click();
		shopProd.getHomepageLink().click();
		
		Thread.sleep(2000);
		shopHome.getProdFive().click();
		
		Thread.sleep(2000);
		shopProd = new ShopProductPage(driver);
		shopProd.getAddToCartBtn().click();
		
		Thread.sleep(2000);
		cPanel = new ShopContentPanel(driver);
		cPanel.getContinueShoppingBtn().click();
		shopProd.getHomepageLink().click();
		
		Thread.sleep(2000);
		shopHome.getProdSix().click();
		
		Thread.sleep(2000);
		shopProd = new ShopProductPage(driver);
		shopProd.getAddToCartBtn().click();
		
		Thread.sleep(2000);
		cPanel = new ShopContentPanel(driver);
		cPanel.getContinueShoppingBtn().click();
		shopProd.getHomepageLink().click();
		
		Thread.sleep(2000);
		shopHome.getProdSeven().click();
		
		Thread.sleep(2000);
		shopProd = new ShopProductPage(driver);
		shopProd.getAddToCartBtn().click();
		
		Thread.sleep(2000);
		cPanel = new ShopContentPanel(driver);
		cPanel.getContinueShoppingBtn().click();
		shopProd.getHomepageLink().click();
		
		Thread.sleep(2000);
		shopHome.getProdEight().click();
		
		Thread.sleep(2000);
		shopProd = new ShopProductPage(driver);
		shopProd.getAddToCartBtn().click();
		
		Thread.sleep(2000);
		cPanel = new ShopContentPanel(driver);
		cPanel.getProceedToCheckoutBtn().click();
		
		Thread.sleep(2000);
		ShoppingCart cart = new ShoppingCart(driver);
		Assert.assertEquals(cart.getTotalAmount().getText(),"$177.54");
			
	}
}
