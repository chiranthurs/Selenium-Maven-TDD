package com.edu.Lib;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.edu.PageObjects.CNGZProductDevlopmentMerchantPageUI;
import com.edu.PageObjects.ProductDevelopmentDetailPageUI;

// TODO: Auto-generated Javadoc
/**
 * The Class CNGZProductDevlopmentMerchantActions.
 */
public class CNGZProductDevlopmentMerchantActions {
	/** The driver. */
	WebDriver driver;
	
	/** The cngz product development pg. */
	CNGZProductDevlopmentMerchantPageUI cngzProductDevelopmentPg;
	
	/** The product development pg. */
	ProductDevelopmentDetailPageUI productDevelopmentPg;
	/** The parent window. */
	String parentWindow;
	
	/** The child window. */
	String childWindow;

	/**
	 * Instantiates a new Product Development Detail Action action.
	 * 
	 * @param driver
	 *            the driver
	 */
	public CNGZProductDevlopmentMerchantActions(WebDriver driver) {
		cngzProductDevelopmentPg = new CNGZProductDevlopmentMerchantPageUI(driver);
		productDevelopmentPg = new ProductDevelopmentDetailPageUI(driver);
		this.driver = driver;
	}

	/**
	 * Adds the supplier and request.
	 */
	public void addSupplierAndRequest() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_SupplierAndRequest().click();
	}

	/**
	 * Adds the supplier.
	 *
	 * @param supplierID the supplier ID
	 */
	public void addSupplier(String supplierID) {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.waitLong(5);
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel2_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_AddSupplier_SupplierAndRequest().isEnabled();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.get_AddSupplier_SupplierAndRequest().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		parentWindow = cngzProductDevelopmentPg.get_CurrentWindowHandle();
		cngzProductDevelopmentPg.getWindowHandle();
		driver.switchTo().defaultContent();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_SearchBarOnChatPopUp().isDisplayed();
		productDevelopmentPg.get_SearchBarOnChatPopUp().clear();
		productDevelopmentPg.get_SearchBarOnChatPopUp().sendKeys(supplierID);
		productDevelopmentPg.reportLog("Search in pop up : " + supplierID);
		productDevelopmentPg.get_SearchButtonOnChatPopUp().click();
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		productDevelopmentPg.get_SearchButtonOnChatPopUp().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.get_SearchResultLinkOnChatPopUpCNGZ(supplierID).isDisplayed();
		productDevelopmentPg.get_CheckBoxFromChartPopUp().get(1).click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.get_AddSelectedOnChatPopUp().click();
		productDevelopmentPg.reportLog("Add selected Machat");
		driver.switchTo().window(parentWindow);
	}

	/**
	 * Adds the options.
	 */
	public void addOptions() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_Options().click();
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_Options().isDisplayed();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_CheckBox_Options());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
				+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
				+ "arguments[0].dispatchEvent(evt)";
		js.executeScript(javaScript, cngzProductDevelopmentPg.get_CheckBox_Options());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.get_CreateOption_Options().click();
	}

	/**
	 * Edits the details add information and save.
	 *
	 * @param country the country
	 */
	

	public void editDetailsAddInformationAndSave(String country) {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		parentWindow = cngzProductDevelopmentPg.get_CurrentWindowHandle();
		cngzProductDevelopmentPg.getWindowHandle();
		cngzProductDevelopmentPg.switchToDefaultContent();
		driver.manage().window().maximize();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel_SupplierPopUp());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		driver.switchTo().frame("TopPanelContentFrame");
		// cngzProductDevelopmentPg.switchToFrame("TopPanelContentFrame");
		cngzProductDevelopmentPg.get_edit_Options().click();
		cngzProductDevelopmentPg.get_SMV_Options().isDisplayed();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		// cngzProductDevelopmentPg.get_CountryDropDown_Options().get(0).click();
		// cngzProductDevelopmentPg.get_CountryDropDown_Options().get(0).sendKeys("China");
		// cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		// cngzProductDevelopmentPg.get_CountryDropDown_Options().get(1).click();
		// cngzProductDevelopmentPg.get_CountryDropDown_Options().get(1).sendKeys("China");
		// cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		// cngzProductDevelopmentPg.get_CountryDropDown_Options().get(2).click();
		// cngzProductDevelopmentPg.get_CountryDropDown_Options().get(2).sendKeys("China");
		// cngzProductDevelopmentPg.SelectElementFromDropdown(cngzProductDevelopmentPg.get_ProductionDropDown(),
		// "visibleText", country);
		// cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		// cngzProductDevelopmentPg.SelectElementFromDropdown(cngzProductDevelopmentPg.get_ProductionDropDown1(),
		// "visibleText", country);
		// cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		// cngzProductDevelopmentPg.SelectElementFromDropdown(cngzProductDevelopmentPg.get_ProductionDropDown2(),
		// "visibleText", country);
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDown());
		cngzProductDevelopmentPg.get_ProductionDropDown().click();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDownOptions());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_ProductionDropDownOptions().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDown());
		cngzProductDevelopmentPg.get_ProductionDropDown1().click();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDownOptions1());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_ProductionDropDownOptions1().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDown());
		cngzProductDevelopmentPg.get_ProductionDropDown2().click();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDownOptions2());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_ProductionDropDownOptions2().click();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDown());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		// cngzProductDevelopmentPg.get_editreadmode_Options().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		try{
			cngzProductDevelopmentPg.executeJs("frames[2].frames[0].frames[2].frames[0].document.getElementsByClassName('actions')[0].children[1].click();");
		}catch(Exception e){
			cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		}
		
		try{
			cngzProductDevelopmentPg.executeJs("frames[2].frames[0].frames[2].frames[0].document.getElementsByClassName('actions')[0].children[1].click();");
		}catch(Exception e){
			cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		}
		
		// Actions act = new Actions(driver);
		// act.sendKeys(Keys.PAGE_UP).build().perform();
		//
		// cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDown());
		// cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		// cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_editreadmode_Options());
		//
		// cngzProductDevelopmentPg.get_editreadmode_Options().click();
		// cngzProductDevelopmentPg.switchToDefaultContent();
		// cngzProductDevelopmentPg.equals("frames[2].frames[0].frames[2].frames[0].document.getElementsByClassName('actions')[0].children[1].click();");
		//
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel_SupplierPopUp());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		cngzProductDevelopmentPg.switchToFrame("TopPanelContentFrame");
//		Actions act = new Actions(driver);
//		act.sendKeys(cngzProductDevelopmentPg.get_edit_Options(), Keys.HOME);
//		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
//		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_edit_Options());
//		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
//		cngzProductDevelopmentPg.get_edit_Options().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
	}

	
	
	
	public void editDetailsAddInformationAndSave1(String country) {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		parentWindow = cngzProductDevelopmentPg.get_CurrentWindowHandle();
		cngzProductDevelopmentPg.getWindowHandle();
		cngzProductDevelopmentPg.switchToDefaultContent();
		driver.manage().window().maximize();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel_SupplierPopUp());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		driver.switchTo().frame("TopPanelContentFrame");
		String value;
		cngzProductDevelopmentPg.get_edit_Options().click();
		cngzProductDevelopmentPg.get_SMV_Options().isDisplayed();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDown());
		cngzProductDevelopmentPg.get_ProductionDropDown().click();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDownOptions());
		value=cngzProductDevelopmentPg.get_ProductionDropDownOptions().getAttribute("value");
		cngzProductDevelopmentPg.executeJs("document.getElementsByTagName('select')[0].value='"+value+"';");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_ProductionDropDownOptions().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDown());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_ProductionDropDown1().click();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDownOptions1());
		value=cngzProductDevelopmentPg.get_ProductionDropDownOptions1().getAttribute("value");
		cngzProductDevelopmentPg.executeJs("document.getElementsByTagName('select')[0].value='"+value+"';");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_ProductionDropDownOptions1().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDown());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_ProductionDropDown2().click();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDownOptions2());
		value=cngzProductDevelopmentPg.get_ProductionDropDownOptions2().getAttribute("value");
		cngzProductDevelopmentPg.executeJs("document.getElementsByTagName('select')[0].value='"+value+"';");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDown());

		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.executeJs(
				"frames[2].frames[0].frames[2].frames[0].document.getElementsByClassName('actions')[0].children[1].click();");
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel_SupplierPopUp());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		cngzProductDevelopmentPg.switchToFrame("TopPanelContentFrame");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.get_edit_Options().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
	}

	/**
	 * Adds the BOMCNGZ.
	 *
	 * @param placement the placement
	 * @param country the country
	 */
	public void addBOMCNGZ(String placement, String country) {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevelBOM_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_BOM_Options().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevelBOM_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_Action_BOM_Options().click();
		cngzProductDevelopmentPg.get_ActionEdit_BOM_Options().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		childWindow = cngzProductDevelopmentPg.get_CurrentWindowHandle();
		cngzProductDevelopmentPg.getWindowHandle();
		cngzProductDevelopmentPg.switchToDefaultContent();
		driver.manage().window().maximize();
		cngzProductDevelopmentPg.SelectElementFromDropdown(cngzProductDevelopmentPg.get_placement_BOM_Options(),
				"visibleText", placement);
		cngzProductDevelopmentPg.SelectElementFromDropdown(cngzProductDevelopmentPg.get_countryOfOrigin_BOM_Options(),
				"visibleText", country);
		cngzProductDevelopmentPg.get_Update_BOM_Options().click();
		cngzProductDevelopmentPg.waitLong(10);
		driver.switchTo().alert().accept();
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		cngzProductDevelopmentPg.waitLong(5);
	}

	/**
	 * Adds the cost.
	 */
	public void addCost() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevelCost_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_AddCost_Options().isEnabled();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_AddCost_Options());
		cngzProductDevelopmentPg.get_AddCost_Options().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		childWindow = cngzProductDevelopmentPg.get_CurrentWindowHandle();
		cngzProductDevelopmentPg.getWindowHandle();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.get_Date_OptionsCost().click();
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		productDevelopmentPg.SelectElementFromDropdown(productDevelopmentPg.get_DatePickerDropDown().get(1),
				"visibleText", "" + (Calendar.getInstance().get(Calendar.YEAR) + 1));
		productDevelopmentPg.SelectElementFromDropdown(productDevelopmentPg.get_DatePickerDropDown().get(0), "index",
				"" + Calendar.getInstance().get(Calendar.MONTH));
		productDevelopmentPg.get_DatefromCal().click();
		productDevelopmentPg.reportLog("Enter information in created row under plan delivery");
		cngzProductDevelopmentPg.get_Aggregated_OptionsCost().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.executeJs("document.getElementById('totalSumId').value='';");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_SumTotal_OptionsCost().sendKeys("10");
		cngzProductDevelopmentPg.get_SaveCost_OptionsCost().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		driver.switchTo().window(childWindow);
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
	}

	/**
	 * Adds the cost.
	 *
	 * @param Material the material
	 * @param Trim the trim
	 * @param Labour the labour
	 * @param Finishing the finishing
	 * @param Labels the labels
	 * @param Overhead the overhead
	 */
	public void addCost(String Material, String Trim, String Labour, String Finishing, String Labels, String Overhead) {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevelCost_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_AddCost_Options().isEnabled();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_AddCost_Options());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.get_AddCost_Options().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		childWindow = cngzProductDevelopmentPg.get_CurrentWindowHandle();
		cngzProductDevelopmentPg.getWindowHandle();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.get_Date_OptionsCost().click();
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		// productDevelopmentPg.SelectElementFromDropdown(productDevelopmentPg.get_DatePickerDropDown().get(1),
		// "visibleText", "" + (Calendar.getInstance().get(Calendar.YEAR) + 1));
		// productDevelopmentPg.SelectElementFromDropdown(productDevelopmentPg.get_DatePickerDropDown().get(0),
		// "index",
		// "" + Calendar.getInstance().get(Calendar.MONTH));
		// productDevelopmentPg.get_DatefromCal().click();
		productDevelopmentPg.get_DatefromCalToday().click();
		productDevelopmentPg.reportLog("Enter information in created row under plan delivery");
		cngzProductDevelopmentPg.get_Aggregated_OptionsCost().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.executeJs("document.getElementById('totalSumId').value='';");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		for (int i = 1; i < 7; i++) {
			cngzProductDevelopmentPg
					.executeJs("document.getElementsByClassName('costTable')[0].getElementsByTagName('tr')[" + i
							+ "].getElementsByTagName('td')[1].getElementsByTagName('input')[0].value='';");
		}
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_Material_OptionsCost().sendKeys(Material);
		cngzProductDevelopmentPg.get_Trim_OptionsCost().sendKeys(Trim);
		cngzProductDevelopmentPg.get_CMT_OptionsCost().sendKeys(Labour);
		cngzProductDevelopmentPg.get_FinishingProcessing_OptionsCost().sendKeys(Finishing);
		cngzProductDevelopmentPg.get_LabelsPackaging_OptionsCost().sendKeys(Labels);
		cngzProductDevelopmentPg.get_OverheadProfit_OptionsCost().sendKeys(Overhead);
		cngzProductDevelopmentPg.get_SaveCost_OptionsCost().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		driver.switchTo().window(childWindow);
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
	}

	/**
	 * Lock withpadlock.
	 */
	public void LockWithpadlock() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		cngzProductDevelopmentPg.get_IMGLock_OptionsCost().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_SecuredRadio().click();
		cngzProductDevelopmentPg.get_Change().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		cngzProductDevelopmentPg.get_Lock().click();
		cngzProductDevelopmentPg.waitLong(8);
		cngzProductDevelopmentPg.switchToDefaultContent();
		driver.close();
		driver.switchTo().window(parentWindow);
	}

	/**
	 * Lock withpadlock qutioned.
	 */
	public void LockWithpadlockQutioned() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		cngzProductDevelopmentPg.get_IMGLock_OptionsCost().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_QuotationRadio().click();
		cngzProductDevelopmentPg.get_Change().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		cngzProductDevelopmentPg.get_Lock().click();
		cngzProductDevelopmentPg.waitLong(8);
		cngzProductDevelopmentPg.switchToDefaultContent();
		driver.close();
		driver.switchTo().window(parentWindow);
	}

	/**
	 * Select and handover option.
	 */
	public void SelectAndHandoverOption() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_Options().isDisplayed();
		cngzProductDevelopmentPg.get_CheckBox_Options().click();
		cngzProductDevelopmentPg.waitLong(4);
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_HandOverOption().click();
		cngzProductDevelopmentPg.waitLong(2);
	}

	/**
	 * Hand over publish.
	 */
	public void HandOverPublish() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_saveButton_Handover().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.get_HandoverVerify().isDisplayed();
	}

	/**
	 * Adds the options extra line.
	 */
	// ******************** Adding option 2 ************************
	public void addOptionsExtraLine() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_Options().click();
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLine().isDisplayed();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLine());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
				+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
				+ "arguments[0].dispatchEvent(evt)";
		js.executeScript(javaScript, cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLine());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.get_CreateOption_Options().click();
	}

	/**
	 * Select and handover option extra line.
	 */
	public void SelectAndHandoverOptionExtraLine() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLine().isDisplayed();
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLine().click();
		cngzProductDevelopmentPg.waitLong(4);
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_HandOverOption().click();
		cngzProductDevelopmentPg.waitLong(2);
	}

	/**
	 * Hand over publish extra line.
	 */
	public void HandOverPublishExtraLine() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_saveButton_Handover().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		// cngzProductDevelopmentPg.get_HandoverVerifyExtraLine().isDisplayed();
	}

	/**
	 * Adds the options CRYSTAL supplier.
	 */
	// ******************** Adding option 4 ************************
	public void addOptionsCRYSTALSupplier() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_Options().click();
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		try{
			cngzProductDevelopmentPg.get_CheckBox_OptionsCRYSTALSupplier().isDisplayed();
		}catch(Exception e){
			cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
			cngzProductDevelopmentPg.get_CheckBox_OptionsCRYSTALSupplier().isDisplayed();

		}
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_CheckBox_OptionsCRYSTALSupplier());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
				+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
				+ "arguments[0].dispatchEvent(evt)";
		js.executeScript(javaScript, cngzProductDevelopmentPg.get_CheckBox_OptionsCRYSTALSupplier());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.get_CreateOption_Options().click();
	}

	/**
	 * Select and handover option CRYSTAL line supplier.
	 */
	public void SelectAndHandoverOptionCRYSTALLineSupplier() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_OptionsCRYSTALSupplier().isDisplayed();
		cngzProductDevelopmentPg.get_CheckBox_OptionsCRYSTALSupplier().click();
		cngzProductDevelopmentPg.waitLong(4);
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_HandOverOption().click();
		cngzProductDevelopmentPg.waitLong(2);
	}

	/**
	 * Hand over publish CRYSTAL line supplier.
	 */
	public void HandOverPublishCRYSTALLineSupplier() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_saveButton_Handover().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.get_HandoverVerifyCrystalExtraLine().isDisplayed();
	}

	/**
	 * Adds the options extra line supplier.
	 */
	// ******************** Adding option 3 ************************
	public void addOptionsExtraLineSupplier() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_Options().click();
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier().isDisplayed();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
				+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
				+ "arguments[0].dispatchEvent(evt)";
		js.executeScript(javaScript, cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.get_CreateOption_Options().click();
	}

	/**
	 * Select and handover option extra line supplier.
	 */
	public void SelectAndHandoverOptionExtraLineSupplier() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier().isDisplayed();
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier().click();
		cngzProductDevelopmentPg.waitLong(4);
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_HandOverOption().click();
		cngzProductDevelopmentPg.waitLong(2);
	}

	/**
	 * Hand over publish extra line supplier.
	 */
	public void HandOverPublishExtraLineSupplier() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_saveButton_Handover().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.get_HandoverVerifyExtraLineSupplier().isDisplayed();
		cngzProductDevelopmentPg.waitLongMin(1);
	}

	public void addComment(String comment) {
		String script = "var para = document.createElement(\"p\");" + "var node = document.createTextNode('" + comment
				+ "');" + "para.appendChild(node);" + "var ele = document.getElementsByTagName('body')[0];"
				+ "ele.appendChild(para);";
		productDevelopmentPg.executeJs(script);
	}
	/**
	 * Cngz handover hop lun.
	 * frames[1].frames[2].frames[0].document.getElementsByTagName('body')
	 */
	public void cngzHandoverHopLun() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_Options().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.get_Tab_Options().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_Options().isDisplayed();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_CheckBox_Options());
		cngzProductDevelopmentPg.get_CheckBox_Options().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLine().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_Handover().click();
		try{
			cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
			cngzProductDevelopmentPg.switchToDefaultContent();
			cngzProductDevelopmentPg.switchToFrame("content");
			cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
			driver.switchTo().frame(1);	
			
			try{
				Actions act = new Actions(driver);
				act.doubleClick(driver.findElement(By.tagName("body"))).build().perform();
				
				driver.findElement(By.tagName("body")).sendKeys(" ");
				
			}catch(Exception ex){
				Reporter.log(ex.getMessage());
			}
			
			
			addComment("Hi");
			addComment("Pls find options for Daisy lace top. One for regular lining and one for extra lining.");
			addComment("Pls approve, tks!");
			addComment("BR, Merch");
			productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		}catch(Exception e){
			Reporter.log(e.getMessage());
		}
		
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		
		cngzProductDevelopmentPg.get_HandoverButton().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.waitLong(8);
	}

	/**
	 * Cngz handover CRYSTALMARTIN.
	 */
	public void cngzHandoverCRYSTALMARTIN() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier().isDisplayed();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier());
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_CheckBox_OptionsCRYSTALSupplier().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_Handover().click();
		try{
			cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
			cngzProductDevelopmentPg.switchToDefaultContent();
			cngzProductDevelopmentPg.switchToFrame("content");
			cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
			driver.switchTo().frame(1);	
			
			try{
				Actions act = new Actions(driver);
				act.doubleClick(driver.findElement(By.tagName("body"))).build().perform();
				
				driver.findElement(By.tagName("body")).sendKeys(" ");
				
			}catch(Exception ex){
				Reporter.log(ex.getMessage());
			}
			
			
			addComment("Hi");
			addComment("Pls find option for Daisy Lace top regular lining and one for extra lining. ");
			addComment("Pls let us know if price is OK.");
			addComment("BR, Merch");
			productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		}catch(Exception e){
			Reporter.log(e.getMessage());
		}
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_HandoverButton().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.waitLongMin(1);	}

	/**
	 * Sebo handover RTO.
	 */
	public void seboHandoverRTO() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_Options().click();
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_OptionsSEBO().isDisplayed();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_CheckBox_OptionsSEBO());
		cngzProductDevelopmentPg.get_CheckBox_OptionsSEBO().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSEBO().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_ProceedSEBO().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_ProceedSEBOLink().click();
		cngzProductDevelopmentPg.waitLong(8);
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_HandoverButton().click();
		cngzProductDevelopmentPg.waitLongMin(1);
	}

	/**
	 * Gpoo handover RTO.
	 */
	public void gpooHandoverRTO() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_Options().click();
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_Options().isDisplayed();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_CheckBox_Options());
		cngzProductDevelopmentPg.get_CheckBox_Options().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLine().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.get_ProceedSEBO().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_ProceedSEBOLink().click();
		cngzProductDevelopmentPg.waitLong(8);
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_HandoverButton().click();
		cngzProductDevelopmentPg.waitLongMin(1);
	}
}
