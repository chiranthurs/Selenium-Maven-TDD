package com.edu.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductDevelopmentDetailPageUI.
 */
public class ProductDevelopmentDetailPageUI extends BasePage {
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new product development detail page UI.
	 *
	 * @param driver the driver
	 */
	public ProductDevelopmentDetailPageUI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/**
	 * Gets the edits the product devlopment.
	 *
	 * @return the edits the product devlopment
	 */
	public WebElement get_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//li[@title='Edit']/a/i"), 150);
	}

	/**
	 * Gets the weight edit product devlopment.
	 *
	 * @return the weight edit product devlopment
	 */
	public WebElement get_Weight_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[contains(@name,'Weight')]"), 15);
	}
	
	/**
	 * Gets the season edit product devlopment.
	 *
	 * @return the season edit product devlopment
	 */
	public WebElement get_Season_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Season']/following-sibling::div"), 15);
	}

	/**
	 * Gets the season option edit product devlopment.
	 *
	 * @param season the season
	 * @return the season option edit product devlopment
	 */
	public WebElement get_Season_option_EditProductDevlopment(String season) {
		return expWait.getWhenClickable(By.xpath("//*[@class='option' and text()='" + season + "']"), 45);
	}

	/**
	 * Gets the department edit product devlopment.
	 *
	 * @return the department edit product devlopment
	 */
	public WebElement get_Department_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Department']/following-sibling::div"), 45);
	}

	/**
	 * Gets the department option edit product devlopment.
	 *
	 * @param Department the department
	 * @return the department option edit product devlopment
	 */
	public WebElement get_Department_option_EditProductDevlopment(String Department) {
		return expWait.getWhenClickable(By.xpath("//*[@class='option active']"), 45);
		// return
		// expWait.getWhenClickable(By.xpath("//*[contains(@class,'option')]//*[text()='"+Department+"']"),
		// 45);
	}

	/**
	 * Gets the concept edit product devlopment.
	 *
	 * @return the concept edit product devlopment
	 */
	public WebElement get_Concept_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Concept']/following-sibling::div"), 45);
	}

	/**
	 * Gets the concept option edit product devlopment.
	 *
	 * @param Concept the concept
	 * @return the concept option edit product devlopment
	 */
	public WebElement get_Concept_option_EditProductDevlopment(String Concept) {
		checkWeekSliderSpinnerToAppear();
		return driver.findElement(By.xpath("//*[@class='option active']/*"));
		// return expWait.getWhenVisible(By.xpath("//*[@class='option
		// active']/*"), 45);
		// return
		// expWait.getWhenClickable(By.xpath("//*[contains(@class,'option')]//*[text()='"+Concept+"']"),
		// 45);
	}

	/**
	 * Gets the product type edit product devlopment.
	 *
	 * @return the product type edit product devlopment
	 */
	public WebElement get_ProductType_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Product Type']/following-sibling::div"), 45);
	}

	/**
	 * Gets the product type option edit product devlopment.
	 *
	 * @param ProductType the product type
	 * @return the product type option edit product devlopment
	 */
	public WebElement get_ProductType_option_EditProductDevlopment(String ProductType) {
		return expWait.getWhenClickable(By.xpath("//*[@class='option active']"), 45);
//		 return
//		 expWait.getWhenClickable(By.xpath("//*[contains(@class,'option')]//*[text()='"+Concept+"']"),
//		 45);
	}

	/**
	 * Gets the purposeof development edit product devlopment.
	 *
	 * @return the purposeof development edit product devlopment
	 */
	public WebElement get_PurposeofDevelopment_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//textarea[contains(@name,'purpose')]"), 45);
	}

	/**
	 * Gets the value driver edit product devlopment.
	 *
	 * @return the value driver edit product devlopment
	 */
	public WebElement get_valueDriver_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//textarea[contains(@name,'value')]"), 45);
	}

	/**
	 * Gets the notes edit product devlopment.
	 *
	 * @return the notes edit product devlopment
	 */
	public WebElement get_notes_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//textarea[contains(@name,'notes')]"), 45);
	}

	/**
	 * Gets the phase edit product devlopment.
	 *
	 * @return the phase edit product devlopment
	 */
	public WebElement get_Phase_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Phase']/following-sibling::div"), 45);
	}

	/**
	 * Gets the phase option edit product devlopment.
	 *
	 * @param Phase the phase
	 * @return the phase option edit product devlopment
	 */
	public WebElement get_Phase_option_EditProductDevlopment(String Phase) {
		return expWait.getWhenClickable(By.xpath("//*[@class='option' and text()='" + Phase + "']"), 45);
	}

	/**
	 * Gets the target price edit product devlopment.
	 *
	 * @return the target price edit product devlopment
	 */
	public WebElement get_TargetPrice_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[contains(@name,'targetPrice')]"), 45);
	}

	/**
	 * Gets the currency edit product devlopment.
	 *
	 * @return the currency edit product devlopment
	 */
	public WebElement get_Currency_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Currency']/following-sibling::div"), 45);
	}

	/**
	 * Gets the currency option edit product devlopment.
	 *
	 * @param currency the currency
	 * @return the currency option edit product devlopment
	 */
	public WebElement get_Currency_option_EditProductDevlopment(String currency) {
		return expWait.getWhenClickable(By.xpath("//*[@class='option' and text()='" + currency + "']"), 45);
	}

	/**
	 * Gets the save edit product devlopment.
	 *
	 * @return the save edit product devlopment
	 */
	public WebElement get_Save_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Save']"), 45);
	}

	/**
	 * Gets the season info.
	 *
	 * @param season the season
	 * @return the season info
	 */
	public WebElement get_SeasonInfo(String season) {
		return expWait.getWhenVisible(By.xpath("//span[text()='" + season + "']"), 45);
	}
	
	/**
	 * Gets the season info CNZG.
	 *
	 * @param season the season
	 * @return the season info CNZG
	 */
	public WebElement get_SeasonInfoCNZG(String season) {
		return expWait.getWhenVisible(By.xpath("//*[text()='" + season + "']"), 45);
	}

	// **************************Plan / Delivery
	/**
	 * Gets the tab plan delivery.
	 *
	 * @return the tab plan delivery
	 */
	// ***********************************************************
	public WebElement get_Tab_PlanDelivery() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Plan/Delivery')]"), 45);
	}

	/**
	 * Gets the frame level 2 plan delivery.
	 *
	 * @return the frame level 2 plan delivery
	 */
	public WebElement get_FrameLevel2_PlanDelivery() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'ProductDeliveryDynamicColumnsPageConfig')]"),
				45);
	}

	/**
	 * Gets the adds the row tab plan delivery.
	 *
	 * @return the adds the row tab plan delivery
	 */
	public WebElement get_AddRow_Tab_PlanDelivery() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Row']"), 45);
	}

	/**
	 * Gets the new row text araes.
	 *
	 * @return the new row text araes
	 */
	public List<WebElement> get_NewRowTextAraes() {
		return expWait.getWhenVisibleList(By.xpath("//table//input[@type='text']"), 300);
	}

	/**
	 * Gets the date picker drop down.
	 *
	 * @return the date picker drop down
	 */
	public List<WebElement> get_DatePickerDropDown() {
		return expWait.getWhenVisibleList(By.xpath("//*[@id='ui-datepicker-div']//select"), 60);
	}

	/**
	 * Gets the datefrom cal.
	 *
	 * @return the datefrom cal
	 */
	public WebElement get_DatefromCal() {
		return expWait.getWhenVisible(By.xpath(".//*[@id='ui-datepicker-div']//a[text()='3']"), 10);
	}
	

	/**
	 * Gets the datefrom cal today.
	 *
	 * @return the datefrom cal today
	 */
	public WebElement get_DatefromCalToday() {
		return expWait.getWhenVisible(By.xpath("//*[@id='ui-datepicker-div']//*[contains(@class,'ui-datepicker-today')]//a"), 45);
	}
	
	
	
	/**
	 * Gets the datefrom cal.
	 *
	 * @param day the day
	 * @return the datefrom cal
	 */
	public WebElement get_DatefromCal(String day) {
		return expWait.getWhenVisible(By.xpath(".//*[@id='ui-datepicker-div']//a[text()='"+day+"']"), 10);
	}

	/**
	 * Gets the calander icon.
	 *
	 * @return the calander icon
	 */
	public WebElement get_CalanderIcon() {
		return expWait.getWhenClickable(By.xpath("//*[@class='ui-datepicker-trigger']"), 45);
	}

	/**
	 * Gets the save plan delivery.
	 *
	 * @return the save plan delivery
	 */
	public WebElement get_SavePlanDelivery() {
		return expWait.getWhenVisible(By.xpath("//img[contains(@src,'toreadmode')]"), 10);
	}
	
	/**
	 * Gets the product ID.
	 *
	 * @return the product ID
	 */
	public WebElement get_ProductID() {
		return expWait.getWhenVisible(By.xpath("//label[text()='ID']/following-sibling::*"), 45);
	}
	
	
	
	// ******************** Description Tab ********************

	/**
	 * Gets the tab description.
	 *
	 * @return the tab description
	 */
	public WebElement get_Tab_Description() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Description')]"), 45);
	}

	/**
	 * Gets the actions description actions.
	 *
	 * @return the actions description actions
	 */
	public WebElement get_Actions_DescriptionActions() {
		return expWait.getWhenClickable(
				By.xpath("//header[contains(.,'Attachments - Active')]/following-sibling::*//*[text()='Actions']"),
				45);
	}

	/**
	 * Gets the adds the documents description actions.
	 *
	 * @return the adds the documents description actions
	 */
	public WebElement get_AddDocuments_DescriptionActions() {
		return expWait.getWhenClickable(
				By.xpath(
						"//header[contains(.,'Attachments - Active')]/following-sibling::*//*[contains(text(),'Add Document')]"),
				45);
	}

	/**
	 * Gets the check box description actions.
	 *
	 * @return the check box description actions
	 */
	public WebElement get_CheckBox_DescriptionActions() {
		return expWait.getWhenClickable(By.xpath("//tbody//*[contains(@class,'select-row')]"), 45);
	}

	/**
	 * Gets the convert document description actions.
	 *
	 * @return the convert document description actions
	 */
	public WebElement get_ConvertDocumentDescriptionActions() {
		return expWait.getWhenClickable(
				By.xpath(
						"//header[contains(.,'Attachments - Active')]/following-sibling::*//*[text()='Convert Document']"),
				45);
	}

	/**
	 * Gets the image added description actions.
	 *
	 * @return the image added description actions
	 */
	public WebElement get_ImageAdded_DescriptionActions() {
		return expWait.getWhenClickable(By.xpath("//*[@class='tile']/img"), 45);
	}
	// ***************** Fit Descriptions **********************************

	/**
	 * Gets the fit descriptions description actions.
	 *
	 * @return the fit descriptions description actions
	 */
	public WebElement get_FitDescriptions_DescriptionActions() {
		return expWait.getWhenClickable(
				By.xpath(
						"//header[contains(.,'Attachments - Active')]/following-sibling::*//*[text()='Fit Descriptions']"),
				45);
	}

	/**
	 * Gets the adds the or copy M chart description actions.
	 *
	 * @return the adds the or copy M chart description actions
	 */
	public WebElement get_AddOrCopyMChart_DescriptionActions() {
		return expWait.getWhenClickable(
				By.xpath(
						"//header[contains(.,'Attachments - Active')]/following-sibling::*//*[contains(text(),'Add or Copy M-chart')]"),
				90);
	}

	/**
	 * Gets the search bar on chat pop up.
	 *
	 * @return the search bar on chat pop up
	 */
	public WebElement get_SearchBarOnChatPopUp() {
		return expWait.getWhenClickable(By.id("txtTextSearch"), 45);
	}

	/**
	 * Gets the search button on chat pop up.
	 *
	 * @return the search button on chat pop up
	 */
	public WebElement get_SearchButtonOnChatPopUp() {
		return expWait.getWhenClickable(By.className("btn-search"), 45);
	}

	/**
	 * Gets the search result link on chat pop up.
	 *
	 * @param chartID the chart ID
	 * @return the search result link on chat pop up
	 */
	public WebElement get_SearchResultLinkOnChatPopUp(String chartID) {
		return expWait.getWhenVisible(By.xpath("//a[contains(text(),'" + chartID + "')]"), 45);
	}
	
	/**
	 * Gets the search result link on chat pop up CNGZ.
	 *
	 * @param chartID the chart ID
	 * @return the search result link on chat pop up CNGZ
	 */
	public WebElement get_SearchResultLinkOnChatPopUpCNGZ(String chartID) {
		return expWait.getWhenClickable(By.xpath("//*[contains(text(),'" + chartID + "')]"), 45);
	}

	/**
	 * Gets the check box from chart pop up.
	 *
	 * @return the check box from chart pop up
	 */
	public List<WebElement> get_CheckBoxFromChartPopUp() {
		return expWait.getWhenVisibleList(By.xpath("//*[@type='checkbox']"), 60);
	}
	
	public WebElement get_CheckBoxFromChartPopUpBoard() {
		//return expWait.getWhenClickable(By.xpath("(//*[@type='checkbox'])[1]"), 45);
		return expWait.getWhenClickable(By.name("tvcSelectAll"),30);
	}
		

	/**
	 * Gets the adds the selected on chat pop up.
	 *
	 * @return the adds the selected on chat pop up
	 */
	public WebElement get_AddSelectedOnChatPopUp() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Selected']"), 45);
	}

	/**
	 * Gets the details table attachments.
	 *
	 * @param chartID the chart ID
	 * @return the details table attachments
	 */
	public WebElement get_DetailsTableAttachments(String chartID) {
		return expWait.getWhenClickable(By.xpath("//tbody//*[contains(text(),'" + chartID + "')]"), 60);
	}

	/**
	 * Gets the list image added description actions.
	 *
	 * @return the list image added description actions
	 */
	public List<WebElement> get_ListImageAdded_DescriptionActions() {
		return expWait.getWhenVisibleList(By.xpath("//*[@class='tile']/img"), 45);
	}

	/**
	 * Gets the appearance tab.
	 *
	 * @return the appearance tab
	 */
	// ******************** Create Appearance ********************************
	public WebElement get_AppearanceTab() {
		return expWait.getWhenClickable(By.xpath("//*[contains(text(),'Create A')]"), 45);
	}

	/**
	 * Gets the number of appearances.
	 *
	 * @return the number of appearances
	 */
	public WebElement get_numberOfAppearances() {
		return expWait.getWhenClickable(By.id("numberOfAppearances"), 45);
	}

	/**
	 * Gets the number of appearances add row.
	 *
	 * @return the number of appearances add row
	 */
	public WebElement get_numberOfAppearances_AddRow() {
		return expWait.getWhenClickable(By.id("addRow"), 45);
	}

	/**
	 * Gets the code text box appearance pop up.
	 *
	 * @return the code text box appearance pop up
	 */
	public List<WebElement> get_CodeTextBox_AppearancePopUp() {
		return expWait.getWhenVisibleList(By.xpath("//*[contains(@id,'colorName') and @type='text']"), 45);
	}

	/**
	 * Gets the code text box auto complete text appearance pop up.
	 *
	 * @param appCode the app code
	 * @return the code text box auto complete text appearance pop up
	 */
	public WebElement get_CodeTextBox_AutoCompleteText_AppearancePopUp(String appCode) {
		return expWait
				.getWhenClickable(By.xpath("//*[contains(@style,'color') and contains(text(),'" + appCode + "')]"), 100);
	}

	/**
	 * Gets the graphical appearance appearance pop up.
	 *
	 * @return the graphical appearance appearance pop up
	 */
	public List<WebElement> get_GraphicalAppearance_AppearancePopUp() {
		return expWait.getWhenVisibleList(By.xpath("//*[@name='graphicalAppearanceId']"), 45);
	}

	/**
	 * Gets the creates the button appearance tab.
	 *
	 * @return the creates the button appearance tab
	 */
	public WebElement get_CreateButton_AppearanceTab() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Create']"), 45);
	}

	/**
	 * Gets the color code appearance tab.
	 *
	 * @param colorID the color ID
	 * @return the color code appearance tab
	 */
	public WebElement get_ColorCode_AppearanceTab(String colorID) {
		return expWait.getWhenClickable(By.xpath("//div[contains(@id,'Appearances')]//*[contains(text(),'" + colorID + "')]"),
				45);
	}

	// ******************** Component Developments
	/**
	 * Gets the actions component developments tab.
	 *
	 * @return the actions component developments tab
	 */
	// ********************************
	public WebElement get_Actions_ComponentDevelopmentsTab() {
		return expWait.getWhenClickable(By.xpath("//*[@data-title='Component Developments']//*[text()='Actions']"), 45);
	}

	/**
	 * Gets the adds the component development component developments tab.
	 *
	 * @return the adds the component development component developments tab
	 */
	public WebElement get_AddComponentDevelopment_ComponentDevelopmentsTab() {
		return expWait.getWhenClickable(
				By.xpath("	//*[@data-title='Component Developments']//*[text()='Add Component Development']"), 45);
	}

	/**
	 * Gets the txt text search box.
	 *
	 * @return the txt text search box
	 */
	public WebElement get_txtTextSearchBox() {
		return expWait.getWhenClickable(By.id("txtTextSearch"), 45);
	}

	/**
	 * Gets the search button.
	 *
	 * @return the search button
	 */
	public WebElement get_SearchButton() {
		return expWait.getWhenClickable(By.id("mx_btn-search"), 45);
	}

	/**
	 * Gets the component developments tab tabel content.
	 *
	 * @param componentDevelopment the component development
	 * @return the component developments tab tabel content
	 */
	public WebElement get_ComponentDevelopmentsTabTabelContent(String componentDevelopment) {
		return expWait.getWhenClickable(
				By.xpath("//*[@data-title='Component Developments']//*[text()='" + componentDevelopment + "']"), 45);
	}

	// *********************** addLabel
	/**
	 * Gets the tab labeland packaging.
	 *
	 * @return the tab labeland packaging
	 */
	// *******************************************
	public WebElement get_Tab_LabelandPackaging() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Label and Packaging')]"), 45);
	}

	/**
	 * Gets the actions tab labeland packaging.
	 *
	 * @return the actions tab labeland packaging
	 */
	public WebElement get_Actions_Tab_LabelandPackaging() {
		return expWait.getWhenClickable(By.xpath("//*[@data-title='Label and Packaging']//*[text()='Actions']"), 45);
	}

	/**
	 * Gets the adds the label tab labeland packaging.
	 *
	 * @return the adds the label tab labeland packaging
	 */
	public WebElement get_AddLabel_Tab_LabelandPackaging() {
		return expWait.getWhenClickable(By.xpath("//*[@data-title='Label and Packaging']//*[text()='Add Label']"), 45);
	}

	/**
	 * Gets the labeland packaging tab tabel content.
	 *
	 * @param labelID the label ID
	 * @return the labeland packaging tab tabel content
	 */
	public WebElement get_LabelandPackagingTabTabelContent(String labelID) {
		return expWait.getWhenClickable(
				By.xpath("//*[@data-title='Label and Packaging']//*[contains(text(),'" + labelID + "')]"), 45);
	}

	/**
	 * Gets the search result link on label pop up.
	 *
	 * @param labelID the label ID
	 * @return the search result link on label pop up
	 */
	public WebElement get_SearchResultLinkOnLabelPopUp(String labelID) {
		return expWait.getWhenClickable(By.xpath("//td[text()='" + labelID + "']"), 45);
	}

	/**
	 * Gets the adds the icon image.
	 *
	 * @return the adds the icon image
	 */
	// ************ Add Image *****************
	public WebElement get_AddIcon_Image() {
		return expWait.getWhenClickable(By.xpath("//*[@title='Manage Images']/a"), 45);
	}

	/**
	 * Gets the image season dropdown image pop up.
	 *
	 * @return the image season dropdown image pop up
	 */
	public WebElement get_imageSeasonDropdown_ImagePopUp() {
		return expWait.getWhenClickable(By.id("imageSeasonId"), 45);
	}

	/**
	 * Gets the image department dropdown image pop up.
	 *
	 * @return the image department dropdown image pop up
	 */
	public WebElement get_imageDepartmentDropdown_ImagePopUp() {
		return expWait.getWhenClickable(By.id("imageDepartmentId"), 45);
	}

	/**
	 * Gets the image name image pop up.
	 *
	 * @return the image name image pop up
	 */
	public WebElement get_imageName_ImagePopUp() {
		return expWait.getWhenClickable(By.id("imageNameId"), 45);
	}

	/**
	 * Gets the apply button image pop up.
	 *
	 * @return the apply button image pop up
	 */
	public WebElement get_ApplyButton_ImagePopUp() {
		return expWait.getWhenClickable(By.id("applyProductDevelopmentButton"), 45);
	}

	/**
	 * Gets the search button image pop up.
	 *
	 * @return the search button image pop up
	 */
	public WebElement get_searchButton_ImagePopUp() {
		return expWait.getWhenClickable(By.id("searchButton"), 45);
	}

	/**
	 * Gets the image search result image.
	 *
	 * @return the image search result image
	 */
	public WebElement get_ImageSearchResult_Image() {
		return expWait.getWhenClickable(By.xpath("//img[@class='SetImageOverlayBackgroundImage']"), 45);
	}

	/**
	 * Gets the image on discription image.
	 *
	 * @return the image on discription image
	 */
	public WebElement get_ImageOnDiscription_Image() {
		return expWait.getWhenClickable(By.xpath("//*[@class='primaryImage']//img"), 45);
	}

	/**
	 * Gets the tab office.
	 *
	 * @return the tab office
	 */
	// ***************************office *********************
	public WebElement get_Tab_Office() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Office')]"), 45);
	}

	/**
	 * Gets the adds the office tab office.
	 *
	 * @return the adds the office tab office
	 */
	public WebElement get_AddOffice_Tab_Office() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Office']"), 45);
	}

	/**
	 * Gets the adds the office text.
	 *
	 * @param office the office
	 * @return the adds the office text
	 */
	public WebElement get_AddOfficeText(String office) {
		return expWait.getWhenClickable(By.xpath("//*[text()='Name: " + office + "']"), 45);
	}

	/**
	 * Gets the adds the office text ID.
	 *
	 * @param office the office
	 * @return the adds the office text ID
	 */
	public WebElement get_AddOfficeTextID(String office) {
		return expWait.getWhenClickable(By.xpath("//*[text()='Name: " + office + "']/../.."), 45);
	}

	/**
	 * Gets the adds the office text ID check box.
	 *
	 * @param officeID the office ID
	 * @return the adds the office text ID check box
	 */
	public WebElement get_AddOfficeTextIDCheckBox(String officeID) {
		return driver.findElement(By.xpath(".//*[@id='" + officeID + "']/td"));
	}

	/**
	 * Gets the frame level 2 office goal.
	 *
	 * @return the frame level 2 office goal
	 */
	public WebElement get_FrameLevel2_OfficeGoal() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'OfficeGoalOverviewPageConfig')]"), 45);
	}

	/**
	 * Gets the adds the selected office goal.
	 *
	 * @return the adds the selected office goal
	 */
	public WebElement get_AddSelected_OfficeGoal() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Selected']"), 45);
	}

	/**
	 * Gets the adds the office tabel content office goal.
	 *
	 * @param office the office
	 * @return the adds the office tabel content office goal
	 */
	public WebElement get_AddOfficeTabelContent_OfficeGoal(String office) {
		return expWait.getWhenClickable(By.xpath("//table//td[text()='" + office + "']"), 45);
	}
	// *******publishToMerchant*************************************
	
	/**
	 * Gets the office checkbox.
	 *
	 * @return the office checkbox
	 */
	public WebElement get_OfficeCheckbox(){
		return expWait.getWhenClickable(By.xpath("//input[@name='emxTableRowId']"), 20);
	}
	
	/**
	 * Gets the publish tab office.
	 *
	 * @return the publish tab office
	 */
	public WebElement get_Publish_Tab_Office() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Publish']"), 45);
	}
	
	/**
	 * Gets the to text box publish tab office.
	 *
	 * @return the to text box publish tab office
	 */
	public List<WebElement> get_ToTextBoxPublish_Tab_Office() {
		return expWait.getWhenVisibleList(By.xpath("//input[contains(@class,'ui-select-search')]"), 45);
	}
	
	/**
	 * Gets the suggestions office pop up.
	 *
	 * @param office the office
	 * @return the suggestions office pop up
	 */
	public WebElement get_Suggestions_OfficePopUp(String office){
		return expWait.getWhenClickable(By.xpath("//span[contains(text(),'("+office+")')]"), 20);
	}
	
	/**
	 * Gets the publish button.
	 *
	 * @return the publish button
	 */
	public WebElement get_PublishButton() {
		return expWait.getWhenClickable(By.id("saveButton"), 45);
	}
	
	/**
	 * Gets the publish status tab office.
	 *
	 * @return the publish status tab office
	 */
	public WebElement get_PublishStatus_Tab_Office() {
		return expWait.getWhenClickable(By.xpath("//table//*[contains(text(),'Initiated')]"), 45);
	}
	
}
