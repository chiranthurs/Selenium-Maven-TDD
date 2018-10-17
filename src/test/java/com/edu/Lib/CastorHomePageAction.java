package com.edu.Lib;

import org.openqa.selenium.WebDriver;

import com.edu.PageObjects.CastorHomePageUI;
import com.edu.PageObjects.CastorLoginPageUI;

// TODO: Auto-generated Javadoc
/**
 * The Class CastorHomePageAction.
 */
public class CastorHomePageAction {
	/** The castor page UI. */
	CastorLoginPageUI castorLoginPg;
	
	/** The castor home pg. */
	CastorHomePageUI castorHomePg;
	/** The driver. */
	WebDriver driver;
	
	/** The parent window. */
	String parentWindow;

	/**
	 * Instantiates a new Castor login page action.
	 * 
	 * @param driver
	 *            the driver
	 */
	public CastorHomePageAction(WebDriver driver) {
		castorLoginPg = new CastorLoginPageUI(driver);
		castorHomePg = new CastorHomePageUI(driver);
		this.driver = driver;
	}

	/**
	 * Login to castor.
	 *
	 * @param userName
	 *            the user name
	 * @param password
	 *            the password
	 */
	public void loginToCastor(String userName, String password) {
		castorLoginPg.checkWeekSliderSpinnerToDisappear();
		castorLoginPg.get_Txt_Username().sendKeys(userName);
		castorLoginPg.get_Txt_Password().sendKeys(password);
		castorLoginPg.get_ButtonSignIN().click();
		castorLoginPg.reportLog("Login to application with " + userName + "/" + password);
	}
	
	/**
	 * Sync page.
	 */
	public void syncPage(){
		castorHomePg.waitLongMin(1);
	}

	/**
	 * Switch to frame to get create product development.
	 */
	public void switchToFrameToGetCreateProductDevelopment() {
		castorHomePg.switchToDefaultContent();
		castorHomePg.switchToFrame("content");
		castorHomePg.switchToFrame(castorHomePg.get_FrameLevel2().getAttribute("name"));
		castorHomePg.switchToFrame(castorHomePg.get_FrameLevel3().getAttribute("name"));
		castorHomePg.checkWeekSliderSpinnerToDisappear();
		castorHomePg.switchToFrame("tableContentFrame");
		castorLoginPg.reportLog("Switch to frames to intercat with product devlopment");
	}

	
	public void ClickOnProductDevlopment(){
		try{
		castorHomePg.switchToDefaultContent();
		castorHomePg.switchToFrame("content");
		castorLoginPg.get_ProductDevlopmentTab().click();
		}catch(Exception e){
			
		}
	}
	/**
	 * Click on product development.
	 */
	public void clickOnProductDevelopment() {
		castorHomePg.get_Btn_ProductDevlopment().isEnabled();
		castorHomePg.checkWeekSliderSpinnerToDisappear();
		castorHomePg.get_Btn_ProductDevlopment().click();
		castorLoginPg.reportLog("Click on product devlopment link");
	}

	/**
	 * Switch to create product development pop up and enter information.
	 *
	 * @param productName the product name
	 * @param office the office
	 */
	public void switchToCreateProductDevelopmentPopUpAndEnterInformation(String productName, String office) {
		parentWindow = castorHomePg.get_CurrentWindowHandle();
		castorHomePg.getWindowHandle();
		castorHomePg.txtBox_ProductDevelopmentName.sendKeys(productName);
		try{
			castorHomePg.SelectElementFromDropdown(castorHomePg.sel_owningOffice, "visibleText", office);
//			castorHomePg.SelectElementFromDropdown(castorHomePg.sel_Brand, "visibleText", "HM");
		}catch(Exception e){
			
		}
		castorHomePg.btn_Create.click();
		driver.switchTo().window(parentWindow);
		driver.switchTo().defaultContent();
		castorLoginPg.reportLog("Product Name :" + productName + " and office :" + office);
	}

	/**
	 * Perform product ID search.
	 *
	 * @param productID the product ID
	 * @param office the office
	 */
	public void performProductIDSearch(String productID, String office) {
		castorHomePg.switchToDefaultContent();
		castorHomePg.get_TopSearch().clear();
		castorHomePg.get_TopSearch().click();
		castorHomePg.get_TopSearch().sendKeys(productID);
		castorHomePg.checkWeekSliderSpinnerToDisappear();
		castorHomePg.switchToFrame("gsFrame");
		castorHomePg.switchToFrame("tableContentFrame");
		castorHomePg.switchToFrame("tableBodyRight");
		
		if (office == null) {
			
			castorHomePg.get_TopSearchResult(productID,office).click();
		} else {
			castorHomePg.get_TopSearchResult(productID,office).click();

		}
		castorHomePg.reportLog("Search for "+productID+" "+office+" click and navigate.");
		castorHomePg.switchToDefaultContent();
		castorHomePg.checkWeekSliderSpinnerToAppear();
		castorHomePg.executeJs("document.getElementById('closeTA').click();");
	}
	
	/**
	 * Perform product ID search other 1.
	 *
	 * @param productID the product ID
	 * @param office the office
	 */
	public void performProductIDSearchOther1(String productID, String office) {
		castorHomePg.switchToDefaultContent();
		castorHomePg.get_TopSearch().clear();
		castorHomePg.get_TopSearch().click();
		castorHomePg.get_TopSearch().sendKeys(productID);
		castorHomePg.checkWeekSliderSpinnerToDisappear();
		castorHomePg.switchToFrame("gsFrame");
		castorHomePg.switchToFrame("tableContentFrame");
		castorHomePg.switchToFrame("tableBodyRight");
		castorHomePg.get_TopResult(office).click();
		castorHomePg.switchToDefaultContent();
		castorHomePg.checkWeekSliderSpinnerToAppear();
		castorHomePg.executeJs("document.getElementById('closeTA').click();");
	}
}
