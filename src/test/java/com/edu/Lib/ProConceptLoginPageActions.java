package com.edu.Lib;

import org.openqa.selenium.WebDriver;

import com.edu.PageObjects.ProConceptLoginPage;
import com.edu.PageObjects.ProductPlanPageUI;

public class ProConceptLoginPageActions {
	/** The driver. */
	WebDriver driver;
	/** The product plan pg. */
	ProConceptLoginPage proConceptLoginPg;
	
	public ProConceptLoginPageActions(WebDriver driver) {
		proConceptLoginPg = new ProConceptLoginPage(driver);
		this.driver = driver;
	}
	
	/**
	 * Instantiates pro concept home page actions.
	 *
	 * @param driver
	 *            the driver
	 */
	/**
	 * Adds the supplier and request.
	 */
	public void loginTo_Proconcept(String UserName, String Password) {
		proConceptLoginPg.get_Txt_Username().sendKeys(UserName);
		proConceptLoginPg.get_Txt_Password().sendKeys(Password);
		proConceptLoginPg.get_Btn_Ok().click();
		proConceptLoginPg.reportLog(proConceptLoginPg.getPageTitle());
		proConceptLoginPg.reportLog("User logged in PRO-CONCEPT successfully");
	}

}
