package com.edu.Lib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.edu.PageObjects.ProductDevelopmentDetailPageUI;
import com.edu.PageObjects.ProductDevlopmentMerchantPageUI;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductDevlopmentMerchantActions.
 */
public class ProductDevlopmentMerchantActions {
	/** The driver. */
	WebDriver driver;
	/** The merchant product development pg. */
	ProductDevlopmentMerchantPageUI merchantProductDevelopmentPg;
	/** The product development pg. */
	ProductDevelopmentDetailPageUI productDevelopmentPg;
	/** The parent window. */
	String parentWindow;
	/** The sub window. */
	String subWindow;

	/**
	 * Instantiates a new Product Development Detail Action action.
	 * 
	 * @param driver
	 *            the driver
	 */
	public ProductDevlopmentMerchantActions(WebDriver driver) {
		merchantProductDevelopmentPg = new ProductDevlopmentMerchantPageUI(driver);
		productDevelopmentPg = new ProductDevelopmentDetailPageUI(driver);
		this.driver = driver;
	}

	/**
	 * Open option group link.
	 */
	public void openOptionGroupLink() {
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		merchantProductDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.get_Tab_Options().click();
		merchantProductDevelopmentPg.reportLog("Click on option");
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel2_Options());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		merchantProductDevelopmentPg.get_LinkoptionsTable_Options().click();
	}

	/**
	 * Edits the option group header.
	 *
	 * @param group
	 *            the group
	 * @param type
	 *            the type
	 * @param appearance
	 *            the appearance
	 * @param Country
	 *            the country
	 * @param renameGroup
	 *            the rename group
	 */
	public void editOptionGroupHeader(String group, String type, String appearance, String Country,
			String renameGroup) {
		parentWindow = merchantProductDevelopmentPg.get_CurrentWindowHandle();
		merchantProductDevelopmentPg.getWindowHandle();
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.waitLong(25);
		merchantProductDevelopmentPg.get_EnterEditMode_Options().click();
		merchantProductDevelopmentPg.reportLog("Click on edit mode");
		
		
		
		merchantProductDevelopmentPg.get_productionGroup_Options().isDisplayed();		
		merchantProductDevelopmentPg.get_productionGroup_Options().click();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg.get_productionGroup_Options().click();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		merchantProductDevelopmentPg.get_productionGroup_Options().sendKeys(group);

//		merchantProductDevelopmentPg.get_productionAppearance_Options().findElement(By.xpath("//*[text()='Production Group']/..//*[@class='selectize-input items not-full has-options']/input")).sendKeys(group);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		driver.findElement(By.xpath("//*[@class='highlight' and text()='"+group+"']")).click();	
		
		
		
		
		merchantProductDevelopmentPg.reportLog("Select group : " + group);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		merchantProductDevelopmentPg.get_productionType_Options().click();
		merchantProductDevelopmentPg.get_productionType_Options().sendKeys(type);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		driver.findElement(By.xpath("//*[@class='highlight' and text()='"+type+"']")).click();	
		merchantProductDevelopmentPg.reportLog("Select type : " + type);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		merchantProductDevelopmentPg.get_productionAppearance_Options().click();
		//merchantProductDevelopmentPg.get_productionAppearance_Input().sendKeys(appearance);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		driver.findElement(By.xpath("//div[@class='selectize-dropdown-content']/div[text()='"+appearance+"']")).click();
		//merchantProductDevelopmentPg.keyBoardActions("downenter");
		merchantProductDevelopmentPg.reportLog("Select appearance : " + appearance);
		merchantProductDevelopmentPg.get_CountryofProduction_Options().click();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg.get_CountryofProduction_Input().sendKeys(Country);		
		driver.findElement(By.xpath("//*[@class='highlight' and text()='"+Country+"']")).click();
		merchantProductDevelopmentPg.reportLog("select Country : " + Country);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg
		.executeJs("document.getElementsByName('section0_displayName')[0].setAttribute('type', 'text');");
		merchantProductDevelopmentPg.get_productionGroup_NameChange().click();
		merchantProductDevelopmentPg.get_productionGroup_NameChange().clear();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
//		merchantProductDevelopmentPg.get_productionGroup_NameChange().sendKeys(renameGroup);
//		merchantProductDevelopmentPg.type(merchantProductDevelopmentPg.get_productionGroup_NameChange(), renameGroup);
//		((JavascriptExecutor)driver).executeScript("document.getElementByName('section0_displayName').value='"+ renameGroup +"';");

		
		merchantProductDevelopmentPg
				.executeJs("document.getElementsByClassName('alpaca-control')[0].value='"
						+ renameGroup + "';");
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		WebElement element= driver.findElement(By.xpath("//*[text()='Show/Hide columns']"));
		merchantProductDevelopmentPg.doubleClick(element);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg.get_EnterReadMode_Options().click();
		merchantProductDevelopmentPg.reportLog("Click on read mode");
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
	}

	/**
	 * Adds the BOM.
	 *
	 * @param group
	 *            the group
	 * @param BOMSearchID
	 *            the BOM search ID
	 * @param position
	 *            the position
	 */
	public void addBOM(String group, String BOMSearchID, String position) {
//		merchantProductDevelopmentPg.switchToDefaultContent();
//		merchantProductDevelopmentPg.switchToFrame("content");
//		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
//		merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
//		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel2_OptionsBOM());
//		merchantProductDevelopmentPg.switchToFrame("tableContentFrame");
		merchantProductDevelopmentPg.get_Actions_OptionsBOM().click();
		merchantProductDevelopmentPg.reportLog("Click on BOM");
		merchantProductDevelopmentPg.get_ActionsOptions_OptionsBOM(group).click();
		subWindow = merchantProductDevelopmentPg.get_CurrentWindowHandle();
		merchantProductDevelopmentPg.getWindowHandle();
//		merchantProductDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.get_SearchBarOnChatPopUp().clear();
		productDevelopmentPg.get_SearchBarOnChatPopUp().sendKeys(BOMSearchID);
		productDevelopmentPg.reportLog("Search BOM term : " + BOMSearchID);
		productDevelopmentPg.reportLog("Search in pop up : " + BOMSearchID);
		productDevelopmentPg.get_SearchButtonOnChatPopUp().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.waitLong(10);
		productDevelopmentPg.get_SearchResultLinkOnChatPopUp(BOMSearchID).isDisplayed();
		productDevelopmentPg.get_CheckBoxFromChartPopUp().get(1).click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.get_AddSelectedOnChatPopUp().click();
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.SelectElementFromDropdown(merchantProductDevelopmentPg.get_position_OptionsBOM(),
				"visibleText", position);
		merchantProductDevelopmentPg.get_AddBUtton_OptionsBOM().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		driver.switchTo().window(subWindow);
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();

	}

	/**
	 * Diconnect appearance.
	 *
	 * @param diconnectList
	 *            the diconnect list
	 */
	public void diconnectAppearance(List<String> diconnectList) {
//		merchantProductDevelopmentPg.switchToDefaultContent();
//		merchantProductDevelopmentPg.waitLong(10);
//		merchantProductDevelopmentPg.switchToFrame("content");
//		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
//		merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
//		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
//		merchantProductDevelopmentPg.switchToFrame("tableContentFrame");
//		merchantProductDevelopmentPg.switchToFrame("tableBodyRight");
		for (String string : diconnectList) {
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
			merchantProductDevelopmentPg
					.scrollIntoView(merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(string));
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
			merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(string).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
					+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
					+ "arguments[0].dispatchEvent(evt)";
			js.executeScript(javaScript, merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(string));
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
			merchantProductDevelopmentPg.switchToDefaultContent();
//			merchantProductDevelopmentPg.switchToFrame("content");
//			merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
//			merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
//			driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
//			merchantProductDevelopmentPg.get_disconnect_OptionsBOM().click();
//			merchantProductDevelopmentPg.switchToDefaultContent();
//			merchantProductDevelopmentPg.waitLong(10);
//			merchantProductDevelopmentPg.switchToFrame("content");
//			merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
//			merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
//			driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
//			merchantProductDevelopmentPg.switchToFrame("tableContentFrame");
//			merchantProductDevelopmentPg.switchToFrame("tableBodyRight");
			merchantProductDevelopmentPg.reportLog("Disconnet Appearance : " + string);
		}
		driver.close();
		driver.switchTo().window(parentWindow);
	}

	/**
	 * Disconnect.
	 *
	 * @param colorID
	 *            the color ID
	 */
	public void disconnect(String colorID) {
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
//		merchantProductDevelopmentPg.switchToFrame("content");
//		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
//		merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
//		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
//		merchantProductDevelopmentPg.switchToFrame("tableContentFrame");
//		merchantProductDevelopmentPg.switchToFrame("tableBodyRight");
//		merchantProductDevelopmentPg
//				.scrollIntoView(merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(colorID));
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		try
		{
			merchantProductDevelopmentPg
			.scrollIntoView(merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(colorID));
			merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(colorID).click();
		}
		catch(Exception e)
		{
			
		}
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
//				+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
//				+ "arguments[0].dispatchEvent(evt)";
//		js.executeScript(javaScript, merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(colorID));
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
//		merchantProductDevelopmentPg.switchToDefaultContent();
//		merchantProductDevelopmentPg.switchToFrame("content");
//		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
//		merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
//		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
//		merchantProductDevelopmentPg.executeJs("document.getElementsByClassName('menu-item-label')[1].click();");
		// merchantProductDevelopmentPg.get_disconnect_OptionsBOM().click();
		merchantProductDevelopmentPg.switchToDefaultContent();
	}

	/**
	 * Connect.
	 *
	 * @param string
	 *            the string
	 * @param action
	 *            the action
	 */
	public void connect(String string, String action) {
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.switchToFrame("content");
//		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
//		merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
//		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
//		merchantProductDevelopmentPg.switchToFrame("tableContentFrame");
//		merchantProductDevelopmentPg.switchToFrame("tableBodyRight");
		merchantProductDevelopmentPg
				.scrollIntoView(merchantProductDevelopmentPg.get_OptionDisconnect_OptionsBOM2(string));
		merchantProductDevelopmentPg.waitLong(8);
		// merchantProductDevelopmentPg.get_OptionDisconnect_OptionsBOM(string).click();
		String id;
		try {
			id = merchantProductDevelopmentPg.get_IDTODisconnect(string).getAttribute("id");
		} catch (Exception e) {
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
			id = merchantProductDevelopmentPg.get_IDTODisconnect(string).getAttribute("id");
		}
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("var para = document.createElement(\"input\"); "
//				+ "var node = document.createTextNode(\"This is new\"); "
//				+ "para.appendChild(node); var element = document.getElementById('" + id + "');"
//				+ " element.appendChild(para);");
//		String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
//				+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
//				+ "arguments[0].dispatchEvent(evt)";
//		js.executeScript(javaScript, merchantProductDevelopmentPg.get_OptionDisconnect_OptionsBOM(string));
//		js.executeScript(javaScript, merchantProductDevelopmentPg.get_OptionDisconnect_OptionsBOM(string));
//		js.executeScript(javaScript, merchantProductDevelopmentPg.get_OptionDisconnect_OptionsBOM(string));
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg.switchToDefaultContent();
//		merchantProductDevelopmentPg.switchToFrame("content");
//		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
//		merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
//		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
//		merchantProductDevelopmentPg.executeJs("document.getElementsByClassName('menu-item-label')[0].click();");
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.waitLong(10);
		merchantProductDevelopmentPg.reportLog(action + " : " + string);
	}

	/**
	 * Creates the option group 2 by copy.
	 *
	 * @param optionGroupCopyName
	 *            the option group copy name
	 * @param group
	 *            the group
	 * @param type
	 *            the type
	 * @param appearance
	 *            the appearance
	 * @param Country
	 *            the country
	 */
	public void createOptionGroup2ByCopy(String optionGroupCopyName, String group, String type, String appearance,
			String Country) {
		
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel2_Options());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		merchantProductDevelopmentPg.get_CheckboxOptionCopy().click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel2_Options());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		merchantProductDevelopmentPg.get_Actions_OptionCopy().click();
		merchantProductDevelopmentPg.get_OptionByCopy_CheckboxOptionCopy().click();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel2_Options());
		productDevelopmentPg.switchToFrame("tvcInlineFrame_0");
		merchantProductDevelopmentPg.get_TextoptionGroupName_OptionCopy().sendKeys(optionGroupCopyName);
		merchantProductDevelopmentPg.get_copyButton_OptionCopy().click();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		parentWindow = merchantProductDevelopmentPg.get_CurrentWindowHandle();
		merchantProductDevelopmentPg.getWindowHandle();
		merchantProductDevelopmentPg.switchToDefaultContent();
		driver.manage().window().maximize();
		merchantProductDevelopmentPg.switchToFrame("content");
//		//merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
//		merchantProductDevelopmentPg.switchToFrame("TopPanelContentFrame");
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		 merchantProductDevelopmentPg.get_productionGroup_Options().isDisplayed();
		 
//		merchantProductDevelopmentPg.SelectElementFromDropdown(
//				merchantProductDevelopmentPg.get_productionGroup_Options(), "visibleText", group);
//		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
//		merchantProductDevelopmentPg.SelectElementFromDropdown(
//				merchantProductDevelopmentPg.get_productionType_Options(), "visibleText", type);
//		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
//		merchantProductDevelopmentPg.SelectElementFromDropdown(
//				merchantProductDevelopmentPg.get_productionAppearance_Options(), "visibleText", appearance);
//		merchantProductDevelopmentPg.SelectElementFromDropdown(
//				merchantProductDevelopmentPg.get_CountryofProduction_Options(), "visibleText", Country);
		 
			merchantProductDevelopmentPg.get_productionGroup_Options().click();
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
			merchantProductDevelopmentPg.get_productionGroup_Options().click();
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
			merchantProductDevelopmentPg.get_productionGroup_Options().clear();
			merchantProductDevelopmentPg.get_productionGroup_Options().sendKeys(group);
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
			driver.findElement(By.xpath("//div[@class='selectize-dropdown single alpaca-control plugin-close_dropdown_on_widget_scroll']//div[text()='"+group+"']")).click();
//			driver.findElement(By.xpath("//*[@class='highlight' and text()='"+group+"']")).click();				
			merchantProductDevelopmentPg.reportLog("Select group : " + group);
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
			merchantProductDevelopmentPg.get_productionType_Options().click();
			merchantProductDevelopmentPg.get_productionType_Options().clear();
			merchantProductDevelopmentPg.get_productionType_Options().sendKeys(type);
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
			driver.findElement(By.xpath("//div[@class='selectize-dropdown single alpaca-control plugin-close_dropdown_on_widget_scroll']//div[text()='"+type+"']")).click();
//			driver.findElement(By.xpath("//*[@class='highlight' and text()='"+type+"']")).click();	
			merchantProductDevelopmentPg.reportLog("Select type : " + type);
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
			merchantProductDevelopmentPg.get_productionAppearance_Options().click();
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
			merchantProductDevelopmentPg.get_productionAppearance_Options().clear();
			driver.findElement(By.xpath("//div[@class='selectize-dropdown single alpaca-control plugin-close_dropdown_on_widget_scroll']//div[text()='"+appearance+"']")).click();
			merchantProductDevelopmentPg.reportLog("Select appearance : " + appearance);
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
			merchantProductDevelopmentPg.get_CountryofProduction_Options().click();
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
			merchantProductDevelopmentPg.get_CountryofProduction_Options().clear();
			merchantProductDevelopmentPg.get_CountryofProduction_Input().sendKeys(Country);
			driver.findElement(By.xpath("//div[@class='selectize-dropdown single alpaca-control plugin-close_dropdown_on_widget_scroll']//div[text()='"+Country+"']")).click();
//			driver.findElement(By.xpath("//*[@class='highlight' and text()='"+Country+"']")).click();
			merchantProductDevelopmentPg.reportLog("select Country : " + Country);
		 		 
		 
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg.reportLog("Create option gropu by copy");
		merchantProductDevelopmentPg.reportLog("Select group : " + group);
		merchantProductDevelopmentPg.reportLog("Select type : " + type);
		merchantProductDevelopmentPg.reportLog("Select appearance : " + appearance);
		merchantProductDevelopmentPg.reportLog("Select Country : " + Country);
	}
	
	public void switchToContentFrame(){
	driver.switchTo().defaultContent();
		merchantProductDevelopmentPg.switchToFrame("content");

	}

	/**
	 * Save header.
	 */
	public void saveHeader() {
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
		merchantProductDevelopmentPg.switchToFrame("TopPanelContentFrame");
		merchantProductDevelopmentPg.get_EnterReadMode_Options().click();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		driver.close();
		driver.switchTo().window(parentWindow);
		merchantProductDevelopmentPg.switchToDefaultContent();
	}

	/**
	 * Adds the office.
	 *
	 * @param office
	 *            the office
	 */
	public void addOffice(String office) {
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.get_Tab_Office().click();
		productDevelopmentPg.reportLog("Add office clicked");
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_OfficeGoal());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_AddOffice_Tab_Office().click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_OfficeGoal());
		productDevelopmentPg.switchToFrame("tvcInlineFrame_0");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.executeJs("document.getElementById('"
				+ productDevelopmentPg.get_AddOfficeTextID(office).getAttribute("id").replaceAll("r", "l")
				+ "').childNodes[0].childNodes[0].click();");
		productDevelopmentPg.reportLog("Select office check box checked :" + office);
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_OfficeGoal());
		productDevelopmentPg.switchToFrame("tvcInlineFrame_0");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.get_AddSelected_OfficeGoal().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_OfficeGoal());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.waitLong(15);
		productDevelopmentPg.get_AddOfficeTabelContent_OfficeGoal(office).isDisplayed();
		productDevelopmentPg.reportLog("Verify office Added");
	}

	/**
	 * Click on option group link.
	 */
	public void clickOnOptionGroupLink() {
		merchantProductDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.get_Tab_Options().click();
		productDevelopmentPg.switchToDefaultContent();
	}
}
