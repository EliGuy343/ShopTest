package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopContentPanel {
	
	public WebDriver driver;
	
	By proceedToCheckoutBtn = By.cssSelector(".cart-content-btn .btn-primary");
	By continueShoppingBtn = By.xpath("//button[contains(text(),'continue')]");
	
	public ShopContentPanel(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getContinueShoppingBtn() {
		return driver.findElement(continueShoppingBtn);
	}
	
	public WebElement getProceedToCheckoutBtn() {
		return driver.findElement(proceedToCheckoutBtn);
	}
}
