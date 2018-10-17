package com.edu.Lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.edu.PageObjects.ProConceptHomePage;

public class ProConceptHomePageActions
{
	/** The driver. */
	WebDriver driver;
	/** The product plan pg. */
	ProConceptHomePage ProConceptHomePg;

	/**
	 * Instantiates pro concept home page actions.
	 *
	 * @param driver
	 *            the driver
	 */
	public ProConceptHomePageActions(WebDriver driver) {
		ProConceptHomePg = new ProConceptHomePage(driver);
		this.driver = driver;
	}
	
	/**
	 * Adds the supplier and request.
	 */
	public void navigateTo_Logistics_GoodsManagement_GoodsDevelopment_Products() {
		ProConceptHomePg.get_Btn_CompaniesClose().click();
		ProConceptHomePg.get_Btn_ERP().click();
		ProConceptHomePg.moveToElement(ProConceptHomePg.get_Logistics());
		ProConceptHomePg.get_Logistics().click();
		ProConceptHomePg.moveToElement(ProConceptHomePg.get_GoodsManagement());
		ProConceptHomePg.get_GoodsManagement().click();
		ProConceptHomePg.moveToElement(ProConceptHomePg.get_GoodsDevelopment());
		ProConceptHomePg.get_GoodsDevelopment().click();
		ProConceptHomePg.get_Products().click();
		ProConceptHomePg.waitForElementToDisappear(By.xpath(".//*[@id='loadingText']"), 10);
		ProConceptHomePg.reportLog("User navigated to Product Page successfully");	
				
	}
	
	
	
}
