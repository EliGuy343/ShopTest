package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopProductPage extends BasePage {
	
	public WebDriver driver;
	
	By sizeDropDownMenu = By.cssSelector("[data-product-attribute='1']");
	By quantityIncrease = By.cssSelector(".touchspin-up");
	By quantityDecrease = By.cssSelector(".touchspin-down");
	By addToCartBtn = By.cssSelector(".add-to-cart.btn.btn-primary");
	By homepageLink = By.xpath("//span[.='Home']");
	By selectBlack = By.cssSelector("li:nth-of-type(2) > label > input[name='group[2]']");
	By selectWhite = By.cssSelector("li:nth-of-type(1) > label > input[name='group[2]']");
	
	public ShopProductPage() throws IOException {
		super();
	}
	
	public WebElement getSizeDropDownMenu() throws IOException {
		this.driver = getDriver();
		return driver.findElement(sizeDropDownMenu);
	}
	
	public WebElement getQuantityIncrease() throws IOException {
		this.driver = getDriver();
		return driver.findElement(this.quantityIncrease);
	}
	
	public WebElement getQuantityDecrease() throws IOException {
		this.driver = getDriver();
		return driver.findElement(this.quantityDecrease);
	}
	
	public WebElement getAddToCartBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(this.addToCartBtn);
	}
	
	public WebElement getHomepageLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(homepageLink);
	}
	
	public WebElement getSelectBlack() throws IOException {
		this.driver = getDriver();
		return driver.findElement(selectBlack);
	}
	
	public WebElement getSelectWhite() throws IOException {
		this.driver = getDriver();
		return driver.findElement(selectWhite);
	}
	
}
