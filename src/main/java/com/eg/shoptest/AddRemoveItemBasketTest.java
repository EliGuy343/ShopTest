package com.eg.shoptest;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.Homepage;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomepage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends BasePage{

	public AddRemoveItemBasketTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setup() throws IOException {
		driver = getDriver();
		driver.get(getUrl());
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	}
	
	@Test
	public void AddRemoveItem() throws InterruptedException {
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
		Select option = new Select(shopProd.getSizeDropDownMenu());
		option.selectByVisibleText("M");
		shopProd.getQuantityIncrease().click();
		shopProd.getAddToCartBtn().click();
		
		Thread.sleep(2000);
		ShopContentPanel cPanel = new ShopContentPanel(driver);
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
		ShoppingCart cart = new ShoppingCart(driver);
		cart.getDeleteItemTwo().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.invisibilityOf(cart.getDeleteItemTwo()));
		
		Assert.assertEquals(cart.getTotalAmount().getText(),"$45.24");
	}
}
