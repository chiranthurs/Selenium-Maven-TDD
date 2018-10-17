package com.edu.Lib;

import org.openqa.selenium.WebDriver;

import com.edu.PageObjects.ProConceptProductPage;

public class ProConceptProductPageActions {
	/** The driver. */
	WebDriver driver;
	/** The proconcept Product pg. */
	ProConceptProductPage productPg;

	/**
	 * Instantiates a new product creation actions.
	 *
	 * @param driver
	 *            the driver
	 */
	public ProConceptProductPageActions(WebDriver driver) {
		productPg = new ProConceptProductPage(driver);
		this.driver = driver;
	}
	
	public void Create_Product() {
		productPg.get_Btn_Add().click();
		productPg.get_Txtbox_Secondary_Reference().sendKeys("Test2");
		productPg.get_Txtbox_Short_Description().sendKeys("Test2");
	}

	
	


}
