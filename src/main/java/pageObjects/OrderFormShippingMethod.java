package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormShippingMethod extends BasePage {
	
	public WebDriver driver;
	
	By deliveryMsgTextBox = By.cssSelector("textarea#delivery_message");
	By continueBtn = By.cssSelector("[name='confirmDeliveryOption']");
	
	public OrderFormShippingMethod() throws IOException {
		super();
	}
	
	public WebElement getDeliveryMsgTextBox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(deliveryMsgTextBox);
	}
	
	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
}
