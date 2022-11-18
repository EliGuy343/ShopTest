package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShoppingCart extends BasePage {
	
	public WebDriver driver;
	
	By havePromo = By.cssSelector(".promo-code-button .collapse-button");
	By promoTextBox = By.cssSelector("input[name='discount_name']");
	By promoAddBtn = By.cssSelector("form[method='post'] span");
	By proceedToCheckoutBtn = By.xpath("/html//section[@id='main']/div[@class='cart-grid row']//a[@href='http://teststore.automationtesting.co.uk/order']");
	By deleteItemOne = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
	By deleteItemTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
	By totalValue = By.cssSelector(".cart-total .value");
	
	public ShoppingCart() throws IOException {
		super();
	}
	
	public WebElement getHavePromo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(havePromo);
	}
	
	public WebElement getPromoTextBox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(promoTextBox);
	}
	
	public WebElement getPromoAddBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(promoAddBtn);
	}
	
	public WebElement getProceedCheckoutBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(proceedToCheckoutBtn);
	}
	
	public WebElement getDeleteItemOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(deleteItemOne);
	}
	
	public WebElement getDeleteItemTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(deleteItemTwo);
	}
	
	public WebElement getTotalAmount() throws IOException {
		this.driver = getDriver();
		return driver.findElement(totalValue);
	}
}

