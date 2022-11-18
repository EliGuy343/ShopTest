package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopContentPanel extends BasePage {
	
	public WebDriver driver;
	
	By proceedToCheckoutBtn = By.cssSelector(".cart-content-btn .btn-primary");
	By continueShoppingBtn = By.cssSelector(".cart-content-btn [data-dismiss]");
	
	public ShopContentPanel() throws IOException {
		super();
	}
	
	public WebElement getContinueShoppingBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueShoppingBtn);
	}
	
	public WebElement getProceedToCheckoutBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(proceedToCheckoutBtn);
	}
}
