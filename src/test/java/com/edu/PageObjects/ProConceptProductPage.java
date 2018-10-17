package com.edu.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProConceptProductPage extends BasePage {
	
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new products page.
	 *
	 * @param driver
	 *            the driver
	 */
	public ProConceptProductPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	
	public WebElement get_Btn_Add() {
		return expWait.getWhenClickable(By.xpath("//div[1]/table/tbody/tr/td[1]/a"), 30);
	}

	public WebElement get_Txtbox_Secondary_Reference() {
		return expWait.getWhenClickable(By.xpath("(.//*[@class='x-form-field x-form-text'])[9]"), 10);
	}

	public WebElement get_Txtbox_Short_Description() {
		return expWait.getWhenClickable(By.xpath("(.//*[@class='x-form-field x-form-text'])[6]"), 10);
	}


}
