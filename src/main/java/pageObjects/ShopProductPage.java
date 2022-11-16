package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopProductPage {
	
	public WebDriver driver;
	
	By sizeDropDownMenu = By.cssSelector("[data-product-attribute='1']");
	By quantityIncrease = By.cssSelector(".touchspin-up");
	By quantityDecrease = By.cssSelector(".touchspin-down");
	By addToCartBtn = By.cssSelector(".add-to-cart.btn.btn-primary");
	By homepageLink = By.xpath("//span[.='Home']");
	By selectBlack = By.cssSelector("li:nth-of-type(2) > label > input[name='group[2]']");
	By selectWhite = By.cssSelector("li:nth-of-type(1) > label > input[name='group[2]']");
	
	public ShopProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSizeDropDownMenu() {
		return driver.findElement(sizeDropDownMenu);
	}
	
	public WebElement getQuantityIncrease() {
		return driver.findElement(this.quantityIncrease);
	}
	
	public WebElement getQuantityDecrease() {
		return driver.findElement(this.quantityDecrease);
	}
	
	public WebElement getAddToCartBtn() {
		return driver.findElement(this.addToCartBtn);
	}
	
	public WebElement getHomepageLink() {
		return driver.findElement(homepageLink);
	}
	
	public WebElement getSelectBlack() {
		return driver.findElement(selectBlack);
	}
	
	public WebElement getSelectWhite() {
		return driver.findElement(selectWhite);
	}
	
}
