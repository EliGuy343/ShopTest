package com.eg.shoptest;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.Homepage;
import pageObjects.OrderFormDelivery;
import pageObjects.OrderFormPayment;
import pageObjects.OrderFormPersInfo;
import pageObjects.OrderFormShippingMethod;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomepage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;


@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends BasePage {

	public OrderCompleteTest() throws IOException {
		super();
	}
	
	@Test
	public void endToEndTest() throws InterruptedException {
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
		cPanel.getProceedToCheckoutBtn().click();
		
		ShoppingCart cart = new ShoppingCart(driver);
		cart.getHavePromo().click();
		cart.getPromoTextBox().sendKeys("20OFF");
		cart.getPromoAddBtn().click();
		
		Thread.sleep(3000);
		cart.getProceedCheckoutBtn().click();
		
		Thread.sleep(3000);
		OrderFormPersInfo orderPersInfo = new OrderFormPersInfo(driver);
		orderPersInfo.getTitleMr().click();
		orderPersInfo.getFirstNameField().sendKeys("John");
		orderPersInfo.getLastnameField().sendKeys("Smith");
		orderPersInfo.getEmailField().sendKeys("GoblinFacedGhoulBelowDeck@TownLibrary.com");
		orderPersInfo.getTermsConditionsCheckbox().click();
		orderPersInfo.getContinueBtn().click();
		
		Thread.sleep(3000);
		OrderFormDelivery orderDelivery = new OrderFormDelivery(driver);
		orderDelivery.getAddressField().sendKeys("123 Main Street");
		orderDelivery.getCityField().sendKeys("Houston");
		Select state = new Select(orderDelivery.getStateDropdown());
		state.selectByVisibleText("Texas");
		orderDelivery.getPostcodeField().sendKeys("12345");
		orderDelivery.getContinueBtn().click();
		
		Thread.sleep(3000);
		OrderFormShippingMethod shipMethod = new OrderFormShippingMethod(driver);
		shipMethod.getDeliveryMsgTextBox().sendKeys("Yeah, just leave it in the red shade which has the delivery markings on it. Also Please don't touch the skull door, it's not for you.");
		shipMethod.getContinueBtn().click();
		
		Thread.sleep(3000);
		OrderFormPayment orderPay = new OrderFormPayment(driver);
		orderPay.getPayByCheckRadioBtn().click();
		orderPay.getTermsConditionsCheckbox().click();
		orderPay.getOrderBtn().click();
		
		Thread.sleep(3000);
	}
}
