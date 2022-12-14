package com.eg.shoptest;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.OrderFormDelivery;
import pageObjects.OrderFormPayment;
import pageObjects.OrderFormPersInfo;
import pageObjects.OrderFormShippingMethod;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomepage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

public class MakeOrderByBank extends Hooks {

	public MakeOrderByBank() throws IOException {
		super();
	}
	
	@Test
	public void makeOrderByBank() throws InterruptedException, IOException {
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
		option.selectByVisibleText("L");
		shopProd.getQuantityIncrease().click();
		shopProd.getSelectBlack().click();
		shopProd.getAddToCartBtn().click();
		
		Thread.sleep(2000);
		ShopContentPanel cPanel = new ShopContentPanel();
		cPanel.getProceedToCheckoutBtn().click();
		
		ShoppingCart cart = new ShoppingCart();
		cart.getHavePromo().click();
		cart.getPromoTextBox().sendKeys("20OFF");
		cart.getPromoAddBtn().click();
		
		Thread.sleep(2000);
		cart.getProceedCheckoutBtn().click();
		
		Thread.sleep(2000);
		OrderFormPersInfo orderPersInfo = new OrderFormPersInfo();
		orderPersInfo.getTitleMr().click();
		orderPersInfo.getFirstNameField().sendKeys("John");
		orderPersInfo.getLastnameField().sendKeys("Smith");
		orderPersInfo.getEmailField().sendKeys("BackSlugLoggers@loggers.com");
		orderPersInfo.getTermsConditionsCheckbox().click();
		orderPersInfo.getContinueBtn().click();
		
		Thread.sleep(2000);
		OrderFormDelivery orderDelivery = new OrderFormDelivery();
		orderDelivery.getAddressField().sendKeys("123 Main Street");
		orderDelivery.getCityField().sendKeys("Houston");
		Select state = new Select(orderDelivery.getStateDropdown());
		state.selectByVisibleText("Texas");
		orderDelivery.getPostcodeField().sendKeys("12345");
		orderDelivery.getContinueBtn().click();
		
		Thread.sleep(2000);
		OrderFormShippingMethod shipMethod = new OrderFormShippingMethod();
		shipMethod.getDeliveryMsgTextBox().sendKeys("Just leave at the door, if I'm not home");
		shipMethod.getContinueBtn().click();
		
		Thread.sleep(2000);
		OrderFormPayment orderPay = new OrderFormPayment();
		orderPay.getPayByWireRadioBtn().click();
		orderPay.getTermsConditionsCheckbox().click();
		orderPay.getOrderBtn().click();
		
		Thread.sleep(2000);
		
	}

}
