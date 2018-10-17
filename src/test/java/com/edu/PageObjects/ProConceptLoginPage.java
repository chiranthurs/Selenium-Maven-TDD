package com.edu.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProConceptLoginPage extends BasePage {
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new products page.
	 *
	 * @param driver
	 *            the driver
	 */
	public ProConceptLoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the Login text box.
	 *
	 * @return the login text box
	 */
	public WebElement get_Txt_Username() {
		return expWait.getWhenClickable(By.xpath(".//*[@id='textfield-1010-inputEl']"), 20);
	}

	/**
	 * Gets the Password text box.
	 *
	 * @return the Password text box
	 */
	public WebElement get_Txt_Password() {
		return expWait.getWhenClickable(
				By.xpath(".//*[@id='textfield-1011-inputEl']"), 20);
	}
	
	/**
	 * Gets the Ok button.
	 *
	 * @return the Ok button
	 */
	public WebElement get_Btn_Ok() {
		return expWait.getWhenClickable(
				By.xpath("(.//*[contains(@id, 'button')])[7]"), 10);
	}

}
