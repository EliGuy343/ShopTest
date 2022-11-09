package com.eg.shoptest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.Homepage;
import pageObjects.ShopHomepage;

public class OrderCompleteTest extends BasePage {

	public OrderCompleteTest() throws IOException {
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
	public void endToEndTest() throws InterruptedException {
		Homepage home = new Homepage(driver);
		Thread.sleep(2000);
		home.getToggle().click();
		Thread.sleep(2000);
		home.getTestStoreLink().click();
		Thread.sleep(2000);
		ShopHomepage  shopHome = new ShopHomepage(driver);
		shopHome.getProdOne().click();
	}

}
