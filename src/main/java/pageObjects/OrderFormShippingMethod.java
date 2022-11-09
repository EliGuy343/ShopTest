package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormShippingMethod {
	
	public WebDriver driver;
	
	By deliveryMsgTextBox = By.cssSelector("textarea#delivery_message");
	By continueBtn = By.cssSelector("[name='confirmDeliveryOption']");
	
	public OrderFormShippingMethod(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getDeliveryMsgTextBox() {
		return driver.findElement(deliveryMsgTextBox);
	}
	
	public WebElement getContinueBtn()  {
		return driver.findElement(continueBtn);
	}
}
