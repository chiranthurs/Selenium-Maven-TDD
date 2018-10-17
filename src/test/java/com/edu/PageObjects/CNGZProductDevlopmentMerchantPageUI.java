package com.edu.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// TODO: Auto-generated Javadoc
/**
 * The Class CNGZProductDevlopmentMerchantPageUI.
 */
public class CNGZProductDevlopmentMerchantPageUI extends BasePage {
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new CNGZ product devlopment merchant page UI.
	 *
	 * @param driver
	 *            the driver
	 */
	public CNGZProductDevlopmentMerchantPageUI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/**
	 * Gets the tab supplier and request.
	 *
	 * @return the tab supplier and request
	 */
	public WebElement get_Tab_SupplierAndRequest() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Supplier and Request')]"), 45);
	}

	/**
	 * Gets the frame level 2 supplier.
	 *
	 * @return the frame level 2 supplier
	 */
	public WebElement get_FrameLevel2_Supplier() {
		return expWait.getWhenClickable(
				By.xpath("//iframe[contains(@src,'AssignedProductDevelopmentSupplierPageConfig')]"), 45);
	}

	/**
	 * Gets the frame level 3 supplier.
	 *
	 * @return the frame level 3 supplier
	 */
	public WebElement get_FrameLevel3_Supplier() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'ReceivedOptionsOverviewGridBrowserConfig')]"),
				45);
	}

	/**
	 * Gets the frame level 2 sample.
	 *
	 * @return the frame level 2 sample
	 */
	public WebElement get_FrameLevel2_Sample() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'2FSamplesOrderedPage')]"), 45);
	}

	/**
	 * Gets the frame level 3 sample.
	 *
	 * @return the frame level 3 sample
	 */
	public WebElement get_FrameLevel3_Sample() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'2FSamplesReceived')]"), 45);
	}

	/**
	 * Gets the frame level 4 sample.
	 *
	 * @return the frame level 4 sample
	 */
	public WebElement get_FrameLevel4_Sample() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'fitreport')]"), 45);
	}

	/**
	 * Gets the frame level 5 sample.
	 *
	 * @return the frame level 5 sample
	 */
	public WebElement get_FrameLevel5_Sample() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'detailreport')]"), 45);
	}

	/**
	 * Gets the frame level 1 sample.
	 *
	 * @return the frame level 1 sample
	 */
	public WebElement get_FrameLevel1_Sample() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'SamplesDashboard.xml')]"), 45);
	}

	/**
	 * Gets the frame level BO M supplier.
	 *
	 * @return the frame level BO M supplier
	 */
	public WebElement get_FrameLevelBOM_Supplier() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'3Aproductdevelopment')]"), 45);
	}

	/**
	 * Gets the frame level cost supplier.
	 *
	 * @return the frame level cost supplier
	 */
	public WebElement get_FrameLevelCost_Supplier() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'2FProductOptionCostInquiry')]"), 45);
	}

	/**
	 * Gets the frame level 1 supplier pop up.
	 *
	 * @return the frame level 1 supplier pop up
	 */
	public WebElement get_FrameLevel1_SupplierPopUp() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'2FProductOptionTopPanel')]"), 45);
	}

	/**
	 * Gets the frame level supplier pop up.
	 *
	 * @return the frame level supplier pop up
	 */
	public WebElement get_FrameLevel_SupplierPopUp() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'ApparelAccelerator&StringResourceFileId')]"),
				45);
	}

	/**
	 * Gets the adds the supplier supplier and request.
	 *
	 * @return the adds the supplier supplier and request
	 */
	public WebElement get_AddSupplier_SupplierAndRequest() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Supplier']"), 45);
	}

	/**
	 * Gets the tab options.
	 *
	 * @return the tab options
	 */
	public WebElement get_Tab_Options() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Options')]"), 45);
	}

	/**
	 * Gets the tab samples.
	 *
	 * @return the tab samples
	 */
	public WebElement get_Tab_Samples() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Samples')]"), 45);
	}

	/**
	 * Gets the check box options.
	 *
	 * @return the check box options
	 */
	public WebElement get_CheckBox_Options() {
		return expWait.getWhenClickable(
				By.xpath("(//div[contains(.,'Regular lining')]/following-sibling::*//table//tr//td[3]//input)[1]"), 45);
	}

	/**
	 * Gets the check box options extra line.
	 *
	 * @return the check box options extra line
	 */
	public WebElement get_CheckBox_OptionsExtraLine() {
		return expWait.getWhenClickable(
				By.xpath("(//div[contains(.,'Regular lining')]/following-sibling::*//table//tr//td[3]//input)[2]"), 45);
	}

	/**
	 * Gets the check box options extra line supplier.
	 *
	 * @return the check box options extra line supplier
	 */
	public WebElement get_CheckBox_OptionsExtraLineSupplier() {
		return expWait.getWhenClickable(
				By.xpath("(//div[contains(.,'Regular lining')]/following-sibling::*//table//tr//td[4]//input)[1]"), 45);
	}

	/**
	 * Gets the check box options CRYSTAL supplier.
	 *
	 * @return the check box options CRYSTAL supplier
	 */
	public WebElement get_CheckBox_OptionsCRYSTALSupplier() {
		return expWait.getWhenClickable(
				By.xpath("(//div[contains(.,'Regular lining')]/following-sibling::*//table//tr//td[4]//input)[2]"), 45);
	}

	/**
	 * Gets the check box options SEBO.
	 *
	 * @return the check box options SEBO
	 */
	public WebElement get_CheckBox_OptionsSEBO() {
		return expWait.getWhenClickable(
				By.xpath("(//div[contains(.,'Daisy Lace top')]/following-sibling::*//table//tr//input)[1]"), 45);
	}

	/**
	 * Gets the check box options extra line SEBO.
	 *
	 * @return the check box options extra line SEBO
	 */
	public WebElement get_CheckBox_OptionsExtraLineSEBO() {
		return expWait.getWhenClickable(
				By.xpath("(//div[contains(.,'Daisy Lace top')]/following-sibling::*//table//tr//input)[2]"), 45);
	}

	/**
	 * Gets the creates the option options.
	 *
	 * @return the creates the option options
	 */
	public WebElement get_CreateOption_Options() {
		return expWait.getWhenClickable(By.xpath("//td[text()='Create Option']"), 45);
	}

	/**
	 * Gets the edits the options.
	 *
	 * @return the edits the options
	 */
	public WebElement get_edit_Options() {
		return expWait.getWhenVisible(By.xpath("//*[@title='Enter edit mode']"), 45);
	}

	/**
	 * Gets the editreadmode options.
	 *
	 * @return the editreadmode options
	 */
	public WebElement get_editreadmode_Options() {
		return expWait.getWhenClickable(By.xpath("//*[@title='Enter read mode']"), 45);
	}

	/**
	 * Gets the SM V options.
	 *
	 * @return the SM V options
	 */
	public WebElement get_SMV_Options() {
		return expWait.getWhenClickable(By.xpath(".//input[@id='minutesToProduce']"), 45);
	}

	/**
	 * Gets the country drop down options.
	 *
	 * @return the country drop down options
	 */
	public List<WebElement> get_CountryDropDown_Options() {
		return expWait.getWhenVisibleList(By.xpath("//select"), 45);
	}

	/**
	 * Gets the check box BO M options.
	 *
	 * @return the check box BO M options
	 */
	public WebElement get_CheckBox_BOM_Options() {
		return expWait.getWhenClickable(By.xpath("//input[@name='emxTableRowId']"), 45);
	}

	/**
	 * Gets the action BO M options.
	 *
	 * @return the action BO M options
	 */
	public WebElement get_Action_BOM_Options() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Action']"), 45);
	}

	/**
	 * Gets the action edit BO M options.
	 *
	 * @return the action edit BO M options
	 */
	public WebElement get_ActionEdit_BOM_Options() {
		return expWait.getWhenClickable(By.xpath("//li//*[text()='Edit']"), 45);
	}

	/**
	 * Gets the placement BO M options.
	 *
	 * @return the placement BO M options
	 */
	public WebElement get_placement_BOM_Options() {
		return expWait.getWhenClickable(By.id("placement"), 45);
	}

	/**
	 * Gets the country of origin BO M options.
	 *
	 * @return the country of origin BO M options
	 */
	public WebElement get_countryOfOrigin_BOM_Options() {
		return expWait.getWhenClickable(By.id("countryOfOrigin"), 45);
	}

	/**
	 * Gets the update BO M options.
	 *
	 * @return the update BO M options
	 */
	public WebElement get_Update_BOM_Options() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Update']"), 45);
	}

	/**
	 * Gets the adds the cost options.
	 *
	 * @return the adds the cost options
	 */
	public WebElement get_AddCost_Options() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Cost']"), 45);
	}

	/**
	 * Gets the date options cost.
	 *
	 * @return the date options cost
	 */
	public WebElement get_Date_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//*[@class='opdDiv notDelivery']//*[@class='ui-datepicker-trigger']"),
				45);
	}

	/**
	 * Gets the aggregated options cost.
	 *
	 * @return the aggregated options cost
	 */
	public WebElement get_Aggregated_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//*[@id='costTypeAggregatedId']"), 45);
	}

	/**
	 * Gets the sum total options cost.
	 *
	 * @return the sum total options cost
	 */
	public WebElement get_SumTotal_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//*[@id='totalSumId']"), 45);
	}

	/**
	 * Gets the save cost options cost.
	 *
	 * @return the save cost options cost
	 */
	public WebElement get_SaveCost_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Save Cost']"), 45);
	}

	/**
	 * Gets the material options cost.
	 *
	 * @return the material options cost
	 */
	public WebElement get_Material_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//tr[contains(.,'Material')]//input[contains(@class,'costInput')]"),
				45);
	}

	/**
	 * Gets the trim options cost.
	 *
	 * @return the trim options cost
	 */
	public WebElement get_Trim_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//tr[contains(.,'Trim')]//input[contains(@class,'costInput')]"), 45);
	}

	/**
	 * Gets the CM T options cost.
	 *
	 * @return the CM T options cost
	 */
	public WebElement get_CMT_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//tr[contains(.,'CMT')]//input[contains(@class,'costInput')]"), 45);
	}

	/**
	 * Gets the finishing processing options cost.
	 *
	 * @return the finishing processing options cost
	 */
	public WebElement get_FinishingProcessing_OptionsCost() {
		return expWait.getWhenClickable(
				By.xpath("//tr[contains(.,'Finishing & Processing')]//input[contains(@class,'costInput')]"), 45);
	}

	/**
	 * Gets the labels packaging options cost.
	 *
	 * @return the labels packaging options cost
	 */
	public WebElement get_LabelsPackaging_OptionsCost() {
		return expWait.getWhenClickable(
				By.xpath("//tr[contains(.,'Labels & Packaging')]//input[contains(@class,'costInput')]"), 45);
	}

	/**
	 * Gets the overhead profit options cost.
	 *
	 * @return the overhead profit options cost
	 */
	public WebElement get_OverheadProfit_OptionsCost() {
		return expWait.getWhenClickable(
				By.xpath("//tr[contains(.,'Overhead & Profit')]//input[contains(@class,'costInput')]"), 45);
	}

	/**
	 * Gets the IMG lock options cost.
	 *
	 * @return the IMG lock options cost
	 */
	public WebElement get_IMGLock_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//*[@id='TopPanelControl_3']/img"), 45);
	}

	/**
	 * Gets the secured radio.
	 *
	 * @return the secured radio
	 */
	public WebElement get_SecuredRadio() {
		return expWait.getWhenClickable(By.xpath("//*[@value='Secured']"), 45);
	}

	/**
	 * Gets the quotation radio.
	 *
	 * @return the quotation radio
	 */
	public WebElement get_QuotationRadio() {
		return expWait.getWhenClickable(By.xpath("//*[@value='Quotation']"), 45);
	}

	/**
	 * Gets the change.
	 *
	 * @return the change
	 */
	public WebElement get_Change() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Change']"), 45);
	}

	/**
	 * Gets the lock.
	 *
	 * @return the lock
	 */
	public WebElement get_Lock() {
		return expWait.getWhenClickable(By.xpath("//*[@title='Lock Option Version']"), 45);
	}

	/**
	 * Gets the lock version new.
	 *
	 * @return the lock version new
	 */
	public WebElement get_LockVersionNew() {
		return expWait.getWhenClickable(By.xpath("//*[@title='Create New Option Version']"), 45);
	}

	/**
	 * Gets the save button handover.
	 *
	 * @return the save button handover
	 */
	public WebElement get_saveButton_Handover() {
		return expWait.getWhenClickable(By.id("saveButton"), 45);
	}

	/**
	 * Gets the handover verify.
	 *
	 * @return the handover verify
	 */
	public WebElement get_HandoverVerify() {
		return expWait.getWhenClickable(
				By.xpath(
						"(//div[contains(.,'Regular lining')]/following-sibling::*//table//tr//td[3]//input)[1]/../../following-sibling::*//*[@title='Handover Received']"),
				45);
	}

	/**
	 * Gets the handover verify extra line.
	 *
	 * @return the handover verify extra line
	 */
	public WebElement get_HandoverVerifyExtraLine() {
		return expWait.getWhenClickable(
				By.xpath(
						"(//div[contains(.,'Regular lining')]/following-sibling::*//table//tr//td[3]//input)[2]/../../following-sibling::*//*[@title='Handover Received']"),
				45);
	}

	/**
	 * Gets the handover verify crystal extra line.
	 *
	 * @return the handover verify crystal extra line
	 */
	public WebElement get_HandoverVerifyCrystalExtraLine() {
		return expWait.getWhenClickable(
				By.xpath(
						"(//div[contains(.,'Regular lining')]/following-sibling::*//table//tr//td[4]//input)[2]/../../following-sibling::*//*[@title='Handover Received']"),
				45);
	}

	/**
	 * Gets the handover verify extra line supplier.
	 *
	 * @return the handover verify extra line supplier
	 */
	public WebElement get_HandoverVerifyExtraLineSupplier() {
		return expWait.getWhenClickable(
				By.xpath(
						"(//div[contains(.,'Regular lining')]/following-sibling::*//table//tr//td[4]//input)[1]/../../following-sibling::*//*[@title='Handover Received']"),
				60);
	}

	/**
	 * Gets the hand over option.
	 *
	 * @return the hand over option
	 */
	public WebElement get_HandOverOption() {
		return expWait.getWhenClickable(By.xpath("//li//*[text()='Handover Option']"), 45);
	}

	/**
	 * Gets the production drop down.
	 *
	 * @return the production drop down
	 */
	public WebElement get_ProductionDropDown() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Country of Production']/following-sibling::*/select"),
				45);
	}

	/**
	 * Gets the production drop down 1.
	 *
	 * @return the production drop down 1
	 */
	public WebElement get_ProductionDropDown1() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Country of Delivery']/following-sibling::*/select"), 45);
	}

	/**
	 * Gets the production drop down 2.
	 *
	 * @return the production drop down 2
	 */
	public WebElement get_ProductionDropDown2() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Country of Origin']/following-sibling::*/select"), 45);
	}

	/**
	 * Gets the production drop down options.
	 *
	 * @return the production drop down options
	 */
	public WebElement get_ProductionDropDownOptions() {
		return expWait.getWhenClickable(
				By.xpath("//*[text()='Country of Production']/following-sibling::*/select/*[text()='China']"), 45);
	}

	/**
	 * Gets the production drop down options 1.
	 *
	 * @return the production drop down options 1
	 */
	public WebElement get_ProductionDropDownOptions1() {
		return expWait.getWhenClickable(
				By.xpath("//*[text()='Country of Delivery']/following-sibling::*/select/*[text()='China']"), 45);
	}

	/**
	 * Gets the production drop down options 2.
	 *
	 * @return the production drop down options 2
	 */
	public WebElement get_ProductionDropDownOptions2() {
		return expWait.getWhenClickable(
				By.xpath("//*[text()='Country of Origin']/following-sibling::*/select/*[text()='China']"), 45);
	}

	/**
	 * Gets the handover.
	 *
	 * @return the handover
	 */
	public WebElement get_Handover() {
		return expWait.getWhenClickable(By.xpath("//li//*[text()='Handover Option']"), 45);
	}

	/**
	 * Gets the handover button.
	 *
	 * @return the handover button
	 */
	public WebElement get_HandoverButton() {
		return expWait.getWhenClickable(By.id("saveButton"), 45);
	}

	/**
	 * Gets the handover to SEBO.
	 *
	 * @return the handover to SEBO
	 */
	public WebElement get_HandoverToSEBO() {
		return expWait.getWhenClickable(
				By.xpath(
						"(//div[contains(.,'Regular lining')]/following-sibling::*//table//tr//td[3]//input)[2]/../../following-sibling::*//*[contains(.,'SEBO')]//img"),
				45);
	}

	/**
	 * Gets the proceed SEBO.
	 *
	 * @return the proceed SEBO
	 */
	public WebElement get_ProceedSEBO() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Proceed']"), 45);
	}

	/**
	 * Gets the proceed SEBO link.
	 *
	 * @return the proceed SEBO link
	 */
	public WebElement get_ProceedSEBOLink() {
		return expWait.getWhenClickable(By.xpath("//*[@class='content-wrapper']//*[text()='Proceed']"), 45);
	}
}
