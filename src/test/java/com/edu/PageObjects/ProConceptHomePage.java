package com.edu.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProConceptHomePage extends BasePage{
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new products page.
	 *
	 * @param driver
	 *            the driver
	 */
	public ProConceptHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Gets the companies popup.
	 *
	 * @return the companies popup
	 */
	public WebElement get_Btn_CompaniesClose() {
		return expWait.getWhenClickable(By.xpath(".//*[@class='x-tool-img x-tool-close']"), 10);
	}

	/**
	 * Gets the ERP Menu.
	 *
	 * @return the ERP Menu
	 */
	public WebElement get_Btn_ERP() {
		return expWait.getWhenClickable(By.xpath("//*[text()='ERP']"), 10);
	}

	/**
	 * Gets the Logistics.
	 *
	 * @return the Logistics
	 */
	public WebElement get_Logistics() {
		return expWait.getWhenClickable(
				By.xpath("//*[text()='Logistics']"), 10);
	}
	
	/**
	 * Gets the GoodsManagement.
	 *
	 * @return the GoodsManagement
	 */
	public WebElement get_GoodsManagement() {
		return expWait.getWhenClickable(
				By.xpath("//*[text()='Goods management']"), 10);
	}
	
	/**
	 * Gets the GoodsDevelopment.
	 *
	 * @return the GoodsDevelopment
	 */
	public WebElement get_GoodsDevelopment() {
		return expWait.getWhenClickable(
				By.xpath("//*[text()='Goods development']"), 10);
	}
	
	/**
	 * Gets the Product.
	 *
	 * @return the Product
	 */
	public WebElement get_Products() {
		return expWait.getWhenClickable(
				By.xpath("//*[text()='Products']"), 10);
	}
}
