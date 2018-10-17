package com.edu.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductDevlopmentMerchantPageUI.
 */
public class ProductDevlopmentMerchantPageUI extends BasePage {
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new product devlopment merchant page UI.
	 *
	 * @param driver the driver
	 */
	public ProductDevlopmentMerchantPageUI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/**
	 * Gets the tab options.
	 *
	 * @return the tab options
	 */
	// ******************** Options Tab ********************
	public WebElement get_Tab_Options() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Options')]"), 45);
	}
	

	/**
	 * Gets the production group name change.
	 *
	 * @return the production group name change
	 */
	public WebElement get_productionGroup_NameChange() {
		//return expWait.getWhenClickable(By.xpath("//*[@id='TopPanelTitle']//input"), 45);
		return expWait.getWhenClickable(By.name("section0_displayName"), 45);
	}
	

	/**
	 * Gets the frame level 2 options.
	 *
	 * @return the frame level 2 options
	 */
	public WebElement get_FrameLevel2_Options() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'ReceivedOptionsOverviewGridBrowserConfig')]"),
				45);
	}

	/**
	 * Gets the frame level 3 options.
	 *
	 * @return the frame level 3 options
	 */
	public WebElement get_FrameLevel3_Options() {
		return expWait.getWhenClickable(By.xpath("//iframe[@data-config-id='appearances-list']"), 45);
	}

	/**
	 * Gets the frame level 2 options BOM.
	 *
	 * @return the frame level 2 options BOM
	 */
	public WebElement get_FrameLevel2_OptionsBOM() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'HMTVCBOM')]"), 45);
	}

	/**
	 * Gets the linkoptions table options.
	 *
	 * @return the linkoptions table options
	 */
	public WebElement get_LinkoptionsTable_Options() {
		return expWait.getWhenClickable(By.xpath("//*[@class='optionGroupHeader']//a"), 45);
	}

	/**
	 * Gets the enter edit mode options.
	 *
	 * @return the enter edit mode options
	 */
	public WebElement get_EnterEditMode_Options() {
		return expWait.getWhenClickable(By.xpath("//*[@title='Edit']//i"), 45);
	}

	/**
	 * Gets the enter read mode options.
	 *
	 * @return the enter read mode options
	 */
	public WebElement get_EnterReadMode_Options() {
		//return expWait.getWhenClickable(By.xpath("//*[@title='Enter read mode']"), 45);
		return expWait.getWhenClickable(By.xpath("//*[text()='Save']"), 45);
	}

	/**
	 * Gets the production group options.
	 *
	 * @return the production group options
	 */
	public WebElement get_productionGroup_Options() {
		//return expWait.getWhenClickable(By.id("productionGroup"), 45);
//		return expWait.getWhenClickable(By.xpath("//*[text()='Production Group']/..//*[@class='selectize-input items not-full has-options']"), 45);
		return expWait.getWhenClickable(By.xpath("//*[contains(@data-alpaca-field-path,'productionGroup')]//input"), 45);
	}
	public WebElement get_productionGroup_Input() {
		//return expWait.getWhenClickable(By.id("productionGroup"), 45);
		return expWait.getWhenClickable(By.xpath("//*[text()='Production Group']/..//input"), 45);
	}

	/**
	 * Gets the production type options.
	 *
	 * @return the production type options
	 */
	public WebElement get_productionType_Options() {
		return expWait.getWhenClickable(By.xpath("//*[contains(@data-alpaca-field-path,'productionType')]//input"), 45);
	}
	
	public WebElement get_productionType_Input() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Production Type']/..//input"), 45);
	}

	/**
	 * Gets the production appearance options.
	 *
	 * @return the production appearance options
	 */
	public WebElement get_productionAppearance_Options() {
		//return expWait.getWhenClickable(By.id("productionAppearance"), 45);
		return expWait.getWhenClickable(By.xpath("//*[contains(@data-alpaca-field-path,'productionAppearance')]//input"), 45);
	}
	public WebElement get_productionAppearance_Input() {
		//return expWait.getWhenClickable(By.id("productionAppearance"), 45);
		return expWait.getWhenClickable(By.xpath("//*[text()='Production Appearance']/..//input"), 45);
	}
	
	/**
	 * Gets the production appearance section options.
	 *
	 * @param app the app
	 * @return the production appearance section options
	 */
	public WebElement get_productionAppearanceSection_Options(String app) {
		return expWait.getWhenClickable(By.xpath("//*[@id='productionAppearance']//option[text()='"+app+"']"), 45);
	}
	
	
	/**
	 * Gets the countryof production options.
	 *
	 * @return the countryof production options
	 */
	public WebElement get_CountryofProduction_Options() {
		//return expWait.getWhenClickable(By.xpath("//*[@label='Country of Production']"), 45);
		return expWait.getWhenClickable(By.xpath("//*[contains(@data-alpaca-field-path,'Country_of_Production')]//input"), 45);
	}
	public WebElement get_CountryofProduction_Input() {
		//return expWait.getWhenClickable(By.xpath("//*[@label='Country of Production']"), 45);
		return expWait.getWhenClickable(By.xpath("//*[contains(@data-alpaca-field-path,'Country_of_Production')]//input"), 45);
	}

	/**
	 * Gets the actions options BOM.
	 *
	 * @return the actions options BOM
	 */
	// *************** BOM ***********************
	public WebElement get_Actions_OptionsBOM() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Action']"), 45);
	}

	/**
	 * Gets the actions options options BOM.
	 *
	 * @param group the group
	 * @return the actions options options BOM
	 */
	public WebElement get_ActionsOptions_OptionsBOM(String group) {
		return expWait.getWhenClickable(By.xpath("//li//*[contains(text(),'Add " + group + "')]"), 45);
	}

	/**
	 * Gets the position options BOM.
	 *
	 * @return the position options BOM
	 */
	public WebElement get_position_OptionsBOM() {
		return expWait.getWhenClickable(By.id("position"), 45);
	}

	/**
	 * Gets the adds the B utton options BOM.
	 *
	 * @return the adds the B utton options BOM
	 */
	public WebElement get_AddBUtton_OptionsBOM() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add']"), 45);
	}

	/**
	 * Gets the disconnect options BOM.
	 *
	 * @return the disconnect options BOM
	 */
	public WebElement get_disconnect_OptionsBOM() {
		return expWait.getWhenClickable(By.xpath("//td[text()='Disconnect']"), 45);
	}
	
	/**
	 * Gets the connect options BOM.
	 *
	 * @return the connect options BOM
	 */
	public WebElement get_connect_OptionsBOM() {
		return driver.findElement(By.xpath("//td[text()='Connect']"));
		//return expWait.getWhenClickable(By.xpath("//td[text()='Connect']"), 45);
	}

	/**
	 * Gets the option disconnect image options BOM.
	 *
	 * @param appID the app ID
	 * @return the option disconnect image options BOM
	 */
	public WebElement get_OptionDisconnectImage_OptionsBOM(String appID) {
		//return expWait.getWhenVisible(By.xpath("//div[contains(.,'" + appID + "') and @id='tbrc']//img"), 45);
		try{
		//return expWait.getWhenVisible(By.xpath("//tr[contains(.,'"+appID+"')]//td[contains(@oncontextmenu,'return cellctxm')]/*"), 15);
		return expWait.getWhenVisible(By.xpath("//tr[contains(.,'"+appID+"')]//td//input"), 15);
		//tr[contains(.,'10-201')]//td[@class='dt-head-left unknown optionGroup1 editable']/input
		}catch(Exception e){
			return driver.findElement(By.xpath("//tr[contains(.,'"+appID+"')]//td//input"));
		}

	}
	
	/**
	 * Gets the option disconnect options BOM.
	 *
	 * @param appID the app ID
	 * @return the option disconnect options BOM
	 */
	public WebElement get_OptionDisconnect_OptionsBOM(String appID) {
		return expWait.getWhenVisible(By.xpath("//tr[contains(.,'"+appID+"')]//td//input"), 45);
	}
	
	/**
	 * Gets the option disconnect options BOM 2.
	 *
	 * @param appID the app ID
	 * @return the option disconnect options BOM 2
	 */
	public WebElement get_OptionDisconnect_OptionsBOM2(String appID) {
		return expWait.getWhenVisible(By.xpath("//tr[contains(.,'"+appID+"')]//td//input"), 45);
	}
	
	
	/**
	 * Gets the checkbox option copy.
	 *
	 * @return the checkbox option copy
	 */
	public WebElement get_CheckboxOptionCopy(){
		return expWait.getWhenClickable(By.xpath("//table//td//*[@type='checkbox']"), 45);
	}
	
	/**
	 * Gets the actions option copy.
	 *
	 * @return the actions option copy
	 */
	public WebElement get_Actions_OptionCopy(){
		return expWait.getWhenClickable(By.xpath("//*[text()='Actions']"), 45);
	}
	
	/**
	 * Gets the option by copy checkbox option copy.
	 *
	 * @return the option by copy checkbox option copy
	 */
	public WebElement get_OptionByCopy_CheckboxOptionCopy(){
		return expWait.getWhenClickable(By.xpath("//*[text()='Create Option Group (by copy)']"), 45);
	}
	
	/**
	 * Gets the textoption group name option copy.
	 *
	 * @return the textoption group name option copy
	 */
	public WebElement get_TextoptionGroupName_OptionCopy(){
		return expWait.getWhenClickable(By.id("optionGroupName"), 45);
	}
	
	/**
	 * Gets the copy button option copy.
	 *
	 * @return the copy button option copy
	 */
	public WebElement get_copyButton_OptionCopy(){
		return expWait.getWhenClickable(By.id("copyButton"), 45);
	}
	
	/**
	 * Gets the IDTO disconnect.
	 *
	 * @param appID the app ID
	 * @return the IDTO disconnect
	 */
	public WebElement get_IDTODisconnect(String appID){
		return expWait.getWhenVisible(By.xpath("//tr[contains(.,'"+appID+"')]//td//input"), 45);
	}
	
}
