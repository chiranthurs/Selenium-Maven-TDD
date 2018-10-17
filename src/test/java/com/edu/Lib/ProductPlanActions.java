package com.edu.Lib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.edu.PageObjects.ProductPlanPageUI;
import com.google.common.base.Function;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductPlanActions.
 */
public class ProductPlanActions {
	/** The driver. */
	WebDriver driver;
	/** The product plan pg. */
	ProductPlanPageUI productPlanPg;

	/**
	 * Instantiates a new product plan actions.
	 *
	 * @param driver
	 *            the driver
	 */
	public ProductPlanActions(WebDriver driver) {
		productPlanPg = new ProductPlanPageUI(driver);
		this.driver = driver;
	}

	/**
	 * Select full mode.
	 */
	public void SelectFullMode() {
		HandleSpinner();
		productPlanPg.waitForPageTitle("Product Plan", 150000);
		productPlanPg.waitForSyncPage();
		productPlanPg.get_FullMode().isDisplayed();
		productPlanPg.checkWeekSliderSpinnerToDisappear();
		productPlanPg.get_FullMode().click();
		HandleSpinner();
		productPlanPg.reportLog("Full mode selected Successully");
	}

	/**
	 * Select section.
	 *
	 * @param section
	 *            the section
	 */
	public void SelectSection(String section) {
		productPlanPg.SelectElementFromDropdown(productPlanPg.get_SectionDropdown(), "visibleText", section);
		HandleSpinner();
		productPlanPg.reportLog("Section: '" + section + "' selected Successully");
	}

	/**
	 * Select season.
	 *
	 * @param season
	 *            the season
	 */
	public void SelectSeason(String season) {
		productPlanPg.get_Season(season).click();
		HandleSpinner();
		productPlanPg.reportLog("Season: '" + season + "' selected Successully");
	}

	/**
	 * Select department.
	 *
	 * @param department
	 *            the department
	 */
	public void SelectDepartment(String department) {
		productPlanPg.get_Department(department).click();
		HandleSpinner();
		productPlanPg.reportLog("Department: '" + department + "' selected Successully");
	}

	/**
	 * Enter product name.
	 *
	 * @param productName
	 *            the product name
	 */
	public void EnterProductName(String productName) {
		if (productPlanPg.get_CreateProduct_Editor().isDisplayed()) {
			productPlanPg.checkWeekSliderSpinnerToAppear();
			productPlanPg.type(productPlanPg.get_CreateProduct_Editor(), productName);
		}
		productPlanPg.reportLog("Product Name: '" + productName + "' entered Successully");
	}

	/**
	 * Select sell price.
	 *
	 * @param productName
	 *            the product name
	 * @param sellPrice
	 *            the sell price
	 */
	public void SelectSellPrice(String productName, String sellPrice) {
		productPlanPg.get_SelectedTab_Editor().click();
		productPlanPg.doubleClick(productPlanPg.get_SellPrice(productName));
		productPlanPg.get_SellPriceDropdownSelect(productName).sendKeys(sellPrice);
		productPlanPg.reportLog("SellPrice: '" + sellPrice + "' entered Successully");
	}

	/**
	 * Save product from context menu.
	 *
	 * @param productName
	 *            the product name
	 */
	public void SaveProductFromContextMenu(String productName) {
		rightClickOptionSelect(productPlanPg.get_ProductNameLink(productName), "Save Product");
		HandleSpinner();
		productPlanPg.reportLog("Product: '" + productName + "' saved Successully");
	}

	/**
	 * Select created product.
	 *
	 * @param productName
	 *            the product name
	 */
	public void SelectCreatedProduct(String productName) {
		productPlanPg.get_ProductNameLink(productName).click();
		productPlanPg.reportLog("Product: '" + productName + "' selected Successully");
	}

	/**
	 * Creates the sales product.
	 *
	 * @param section
	 *            the section
	 * @param department
	 *            the department
	 * @param season
	 *            the season
	 * @param product
	 *            the product
	 * @param sellPrice
	 *            the sell price
	 */
	public void CreateSalesProduct(String section, String department, String season, String product, String sellPrice) {
		SelectFullMode();
		SelectSection(section);
		SelectSeason(season);
		SelectDepartment(department);
		getProductNameByScrollingDown();
		productPlanPg.checkWeekSliderSpinnerToAppear();
		String productName = GenerateUniqueProductNumber(product);
		EnterProductName(productName);
		SelectSellPrice(productName, sellPrice);
		SaveProductFromContextMenu(productName);
		SelectCreatedProduct(productName);
		productPlanPg.reportLog("Sales Product Created Successfully");
	}

	/**
	 * Adds the product classification.
	 *
	 * @param productClassification
	 *            the product classification
	 */
	public void AddProductClassification(String productClassification) {
		productPlanPg.get_ProductClassificationMissing().click();
		productPlanPg.get_ProductClassificationDropdown().click();
		productPlanPg.get_ProductClassificationDropdown().sendKeys(productClassification);
		selectDropdownOption(productPlanPg.get_ProductClassificationDropdown());
		productPlanPg.reportLog("Product Classification: '" + productClassification + "' Added Successfully");
	}

	/**
	 * Adds the articles.
	 *
	 * @param article1
	 *            the article 1
	 * @param article2
	 *            the article 2
	 */
	public void AddArticles(String article1, String article2) {
		productPlanPg.get_ExpandShowArticleList().click();
		productPlanPg.get_PleaseAddArticles().click();
		productPlanPg.get_ColorCodeTextBoxEditable().sendKeys(article1);
		productPlanPg.checkProductPlanSpinnerToDisappear();
		selectDropdownOption(productPlanPg.get_SelectColorCode(article1));
		productPlanPg.get_ColorCodeTextBoxEditable().sendKeys(article2);
		productPlanPg.checkProductPlanSpinnerToDisappear();
		selectDropdownOption(productPlanPg.get_SelectColorCode(article2));
		productPlanPg.reportLog("Articles: '" + article1 + "' and '" + article2 + "' Added Successfully");
	}

	/**
	 * Adds the graphical appearance.
	 *
	 * @param article1
	 *            the article 1
	 * @param graphicalAppearance
	 *            the graphical appearance
	 */
	public void AddGraphicalAppearance(String article1, String graphicalAppearance) {
		productPlanPg.get_ArticleGraphicalAppearanceMissing().click();
		productPlanPg.get_GraphicalAppearanceTextBox(article1).click();
		productPlanPg.get_GraphicalAppearanceTextBoxEditable().sendKeys(graphicalAppearance);
		productPlanPg.checkWeekSliderSpinnerToAppear();
		selectDropdownOption(productPlanPg.get_GraphicalAppearanceTextBoxSelect(graphicalAppearance));
		productPlanPg.switchToActiveElement();
		productPlanPg.get_AllArticlesCheckbox().click();
		productPlanPg.get_ApplyButton().click();
		productPlanPg.reportLog("Graphical Appearance: '" + graphicalAppearance + "' Added Successfully");
	}

	/**
	 * Adds the IS ws.
	 *
	 * @param weekNo
	 *            the week no
	 */
	public void AddISWs(String weekNo) {
		productPlanPg.get_PleaseSelectISWs().click();
		productPlanPg.get_WeekSelect1(weekNo).click();
		productPlanPg.waitLong(3);
		productPlanPg.get_WeekSelect2(weekNo).click();
		productPlanPg.reportLog("ISW Week: '" + weekNo + "' Added Successfully");
	}

	/**
	 * Adds the IS ws.
	 *
	 * @param weekNo1
	 *            the week no 1
	 * @param weekNo2
	 *            the week no 2
	 */
	public void AddISWs(String weekNo1, String weekNo2) {
		productPlanPg.get_PleaseSelectISWs().click();
		productPlanPg.get_WeekSelect1(weekNo1).click();
		productPlanPg.waitLong(3);
		productPlanPg.get_WeekSelect2(weekNo2).click();
		productPlanPg.reportLog("ISW weeks: '" + weekNo1 + "' and '" + weekNo2 + "' Added Successfully");
	}

	/**
	 * Adds the article type.
	 *
	 * @param article1
	 *            the article 1
	 * @param salesType
	 *            the sales type
	 */
	public void AddArticleType(String article1, String salesType) {
		productPlanPg.get_ArticleTypeMissing().click();
		productPlanPg.checkWeekSliderSpinnerToAppear();
		productPlanPg.get_SalesTypeTextBox(article1).click();
		productPlanPg.checkWeekSliderSpinnerToAppear();
		productPlanPg.get_SalesTypeTextBoxEditable().sendKeys(salesType);
		selectDropdownOption(productPlanPg.get_SalesTypeTextBoxSelect(salesType));
		productPlanPg.switchToActiveElement();
		productPlanPg.get_AllArticlesCheckbox().click();
		productPlanPg.get_ApplyButton().click();
		productPlanPg.waitLong(3);
		productPlanPg.reportLog("Article Type: '" + salesType + "' Added Successfully");
	}

	/**
	 * Adds the FM.
	 *
	 * @param article1
	 *            the article 1
	 * @param fmValue
	 *            the fm value
	 */
	public void AddFM(String article1, String fmValue) {
		productPlanPg.get_FMTextbox(article1).click();
		productPlanPg.get_FMTextBoxEditable().sendKeys(fmValue);
		productPlanPg.checkWeekSliderSpinnerToAppear();
		selectDropdownOption(productPlanPg.get_FMTextBoxSelect(fmValue));
		productPlanPg.switchToActiveElement();
		productPlanPg.get_AllArticlesCheckbox().click();
		productPlanPg.get_ApplyButton().click();
		productPlanPg.reportLog("FM: '" + fmValue + "' Added Successfully");
	}

	/**
	 * Adds the product details and customs customer group.
	 *
	 * @param productDetails
	 *            the product details
	 * @param customsCustomerGroup
	 *            the customs customer group
	 */
	public void AddProductDetailsAndCustomsCustomerGroup(String productDetails, String customsCustomerGroup) {
		productPlanPg.get_ExpandShowProductDetails().click();
		productPlanPg.SelectElementFromDropdown(productPlanPg.get_ExpandShowProductDetails(), "visibleText",
				productDetails);
		productPlanPg.SelectElementFromDropdown(productPlanPg.get_CustomsCustomerGroupId(), "visibleText",
				customsCustomerGroup);
		productPlanPg.reportLog("Product Details: '" + productDetails + "' and Customs Customer Groups: '"
				+ customsCustomerGroup + "' added Successfully");
	}

	/**
	 * Save product.
	 */
	public void SaveProduct() {
		productPlanPg.get_SaveProduct().click();
		productPlanPg.checkProductPlanSpinnerToDisappear();
		productPlanPg.waitLong(3);
		productPlanPg.reportLog("Product Saved Successfully");
	}

	/**
	 * Adds the quantity.
	 *
	 * @param Quantity1
	 *            the quantity 1
	 */
	public void AddQuantity(String Quantity1) {
		productPlanPg.doubleClick(productPlanPg.get_Total_excl1());
		productPlanPg.get_Total_excl1Editable().sendKeys(Quantity1);
		productPlanPg.keyBoardActions("enter");
		HandleSpinner();
		productPlanPg.reportLog("Quantity: '" + Quantity1 + "' Added Successfully");
	}

	/**
	 * Adds the quantity.
	 *
	 * @param Quantity1
	 *            the quantity 1
	 * @param Quantity2
	 *            the quantity 2
	 */
	public void AddQuantity(String Quantity1, String Quantity2) {
		productPlanPg.doubleClick(productPlanPg.get_Total_excl1());
		productPlanPg.get_Total_excl1Editable().sendKeys(Quantity1);
		productPlanPg.keyBoardActions("enter");
		HandleSpinner();
		productPlanPg.waitLong(3);
		productPlanPg.checkWeekSliderSpinnerToDisappear();
		productPlanPg.get_Total_excl2().isDisplayed();
		productPlanPg.doubleClick(productPlanPg.get_Total_excl2());
		productPlanPg.get_Total_excl2Editable().isDisplayed();
		productPlanPg.checkWeekSliderSpinnerToAppear();
		productPlanPg.get_Total_excl2Editable().sendKeys(Quantity2);
		productPlanPg.checkWeekSliderSpinnerToAppear();
		productPlanPg.type(productPlanPg.get_Total_excl2Editable(), Quantity2);
		productPlanPg.keyBoardActions("enter");
		productPlanPg.checkWeekSliderSpinnerToAppear();
		productPlanPg.reportLog(
				"******************************************* TEST DATA ************************************************************");
		productPlanPg.reportLog("Quantity1: '" + Quantity1 + "'");
		productPlanPg.reportLog("Quantity2: '" + Quantity2 + "'");
		productPlanPg.reportLog(
				"******************************************************************************************************************");
		productPlanPg.reportLog("Quantities Added Successfully");
	}

	/**
	 * Adds the version.
	 */
	public void AddVersion() {
		productPlanPg.get_Version().click();
		productPlanPg.checkWeekSliderSpinnerToDisappear();
		productPlanPg.doubleClick(productPlanPg.get_VersionCell());
		productPlanPg.checkWeekSliderSpinnerToAppear();
		productPlanPg.get_VersionCellEditable().clear();
		productPlanPg.get_VersionCellEditable().sendKeys("1");
		productPlanPg.checkWeekSliderSpinnerToAppear();
		productPlanPg.get_VersionCellAutocomplete("1").click();
		productPlanPg.get_allMarketsIsChecked().click();
		productPlanPg.get_allArticlesIsChecked().click();
		productPlanPg.get_Apply().click();
		productPlanPg.reportLog("Version Added Successfully");
	}

	/**
	 * Wait for article number display.
	 */
	public void WaitForArticleNumberDisplay() {
		waitForElementPresentWithPageRefresh();
		productPlanPg.reportLog("Article Number Displayed Successfully");
	}

	/**
	 * Ready to order.
	 */
	public void ReadyToOrder() {
		productPlanPg.get_SelectPlan().click();
		productPlanPg.get_FormatCheckbox().click();
		productPlanPg.get_BuyAllPMs().click();
		productPlanPg.checkProductPlanSpinnerToDisappear();
		productPlanPg.checkWeekSliderSpinnerToAppear();
		try {
			productPlanPg.get_ReadyToOrder().click();
			productPlanPg.checkProductPlanSpinnerToDisappear();
		} catch (Exception e) {
			productPlanPg.waitLong(5);
			productPlanPg.get_ReadyToOrder().click();
		}
		HandleSpinner();
		productPlanPg.reportLog("Ready To Order Successfully");
	}

	/**
	 * Close order.
	 */
	public void CloseOrder() {
		productPlanPg.get_ProductClose().click();
		productPlanPg.reportLog("Order Closed Successfully");
	}

	/**
	 * Adds the article rough plan.
	 *
	 * @param productName
	 *            the product name
	 * @param weekno1
	 *            the weekno 1
	 * @param weekno2
	 *            the weekno 2
	 * @param Quantity1
	 *            the quantity 1
	 * @param Quantity2
	 *            the quantity 2
	 */
	public void AddArticleRoughPlan(String productName, String weekno1, String weekno2, String Quantity1,
			String Quantity2) {
		getProductNameByScrollingDown();
		productPlanPg.get_Arrow(productName).click();
		productPlanPg.checkProductPlanSpinnerToDisappear();
		for (int i = 0; i <= 3; i++) {
			productPlanPg.keyBoardActions("down");
		}
		WebElement temp = driver
				.findElement(By.xpath("(//*[contains(@class,'ag-pinned')]//*[contains(@class,'-row') and contains(.,'"
						+ productName + "')])[1]"));
		int rowNo = Integer.parseInt(temp.getAttribute("row"));
		WebElement rowclick1 = driver.findElement(By.xpath(
				"//*[@row='" + (rowNo + 1) + "']//*[@colid='w" + weekno1 + "']//*[contains(@class,'-quantity')]"));
		Actions act = new Actions(driver);
		act.doubleClick(rowclick1).build().perform();
		driver.findElement(By.xpath(
				"//*[@row='" + (rowNo + 1) + "']//*[@colid='w" + weekno1 + "']//*[contains(@class,'-quantity')]"))
				.sendKeys(Quantity1);
		productPlanPg.keyBoardActions("tab");
		rowclick1 = driver.findElement(By.xpath(
				"//*[@row='" + (rowNo + 2) + "']//*[@colid='w" + weekno2 + "']//*[contains(@class,'-quantity')]"));
		act = new Actions(driver);
		act.doubleClick(rowclick1).build().perform();
		driver.findElement(By.xpath(
				"//*[@row='" + (rowNo + 2) + "']//*[@colid='w" + weekno2 + "']//*[contains(@class,'-quantity')]"))
				.sendKeys(Quantity2);
		productPlanPg.checkWeekSliderSpinnerToAppear();
		productPlanPg.type(driver.findElement(By.xpath(
				"//*[@row='" + (rowNo + 2) + "']//*[@colid='w" + weekno2 + "']//*[contains(@class,'-quantity')]")),
				Quantity2);
		productPlanPg.keyBoardActions("tab");
	}

	/**
	 * Adds the article rough plan.
	 *
	 * @param productName
	 *            the product name
	 * @param weekno2
	 *            the weekno 2
	 * @param Quantity2
	 *            the quantity 2
	 */
	public void AddArticleRoughPlan(String productName, String weekno2, String Quantity2) {
		getProductNameByScrollingDown();
		productPlanPg.get_Arrow(productName).click();
		productPlanPg.checkProductPlanSpinnerToDisappear();
		for (int i = 0; i <= 3; i++) {
			productPlanPg.keyBoardActions("down");
		}
		WebElement temp = driver
				.findElement(By.xpath("(//*[contains(@class,'ag-pinned')]//*[contains(@class,'-row') and contains(.,'"
						+ productName + "')])[1]"));
		int rowNo = Integer.parseInt(temp.getAttribute("row"));
		WebElement rowclick1 = driver.findElement(By.xpath(
				"//*[@row='" + (rowNo + 2) + "']//*[@colid='w" + weekno2 + "']//*[contains(@class,'-quantity')]"));
		Actions act = new Actions(driver);
		act.doubleClick(rowclick1).build().perform();
		driver.findElement(By.xpath(
				"//*[@row='" + (rowNo + 2) + "']//*[@colid='w" + weekno2 + "']//*[contains(@class,'-quantity')]"))
				.sendKeys(Quantity2);
		productPlanPg.checkWeekSliderSpinnerToAppear();
		productPlanPg.type(driver.findElement(By.xpath(
				"//*[@row='" + (rowNo + 2) + "']//*[@colid='w" + weekno2 + "']//*[contains(@class,'-quantity')]")),
				Quantity2);
		productPlanPg.keyBoardActions("tab");
		productPlanPg.get_Arrow(productName).click();
		productPlanPg.reportLog("Quantities Added Successfully for Week: '" + weekno2 + "'");
	}

	/**
	 * Save product after adding rough plan.
	 *
	 * @param productName
	 *            the product name
	 */
	public void SaveProductAfterAddingRoughPlan(String productName) {
		productPlanPg.waitLong(2);
		productPlanPg.get_ProductNameLink(productName).click();
		productPlanPg.get_SaveProduct().click();
		productPlanPg.checkProductPlanSpinnerToDisappear();
		productPlanPg.waitLong(3);
		productPlanPg.reportLog("Product: '" + productName + "' saved Successfully");
	}

	/**
	 * Generate unique product number.
	 *
	 * @param product
	 *            the product
	 * @return the string
	 */
	// ===========================CUSTOM FUNCTIONS SPECIFIC TO PRODUCT
	// PLAN====================================
	public String GenerateUniqueProductNumber(String product) {
		String productName = product + new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
		System.setProperty("productPlanProductName", productName);
		return productName;
	}

	/**
	 * Select dropdown option.
	 *
	 * @param selectElement
	 *            the select element
	 */
	public void selectDropdownOption(WebElement selectElement) {
		productPlanPg.waitLong(1);
		try {
			productPlanPg.keyBoardActions("down");
			productPlanPg.keyBoardActions("enter");
		} catch (Exception e) {
			selectElement.click();
		}
	}

	/**
	 * Handle spinner.
	 */
	public void HandleSpinner() {
		try {
			if (productPlanPg.get_LoadSpinner().isDisplayed()) {
				productPlanPg.checkProductPlanSpinnerToDisappear();
			}
		} catch (Exception e) {
			productPlanPg.reportLog("Page loading failed");
		}
	}

	/**
	 * Right click option select.
	 *
	 * @param selectElement
	 *            the select element
	 * @param contextMenuOption
	 *            the context menu option
	 */
	public void rightClickOptionSelect(WebElement selectElement, String contextMenuOption) {
		Actions oAction = new Actions(driver);
		oAction.moveToElement(selectElement);
		oAction.contextClick(selectElement).build()
				.perform(); /* this will perform right click */
		WebElement elementOpen = driver.findElement(By.linkText(
				contextMenuOption)); /*
										 * This will select menu after right click
										 */
		elementOpen.click();
	}

	/**
	 * Go to end of page.
	 */
	public void goToEndOfPage() {
		try {
			productPlanPg.get_scroller().click();
			List<WebElement> listWebEle = null;
			listWebEle = driver.findElements(By.xpath("//div[@tabindex='-1' And @colid='articleCount']"));
			int rowCount = listWebEle.size();
			for (int i = 0; i < rowCount; i++) {
				productPlanPg.keyBoardActions("down");
			}
			productPlanPg.waitLong(3);
			productPlanPg.doubleClick(productPlanPg.get_CreateProduct_1());
		} catch (Exception e) {
			for (int i = 0; i < 150; i++) {
				productPlanPg.keyBoardActions("down");
			}
			productPlanPg.waitLong(3);
			productPlanPg.doubleClick(productPlanPg.get_CreateProduct_1());
		}
	}

	/**
	 * Wait for element present with page refresh.
	 */
	public void waitForElementPresentWithPageRefresh() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(15, TimeUnit.MINUTES)
				.pollingEvery(10, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				driver.navigate().refresh();
				return driver.findElement(By.xpath(
						"(//div[@class='slick-cell l7 r7 sales-product-number']//span[contains(text(),'00')])[1]"));
			}
		});
	}

	/**
	 * Gets the product name by scrolling down.
	 *
	 * @return the product name by scrolling down
	 */
	public void getProductNameByScrollingDown() {
		try {
			productPlanPg.get_scroller().isDisplayed();
			productPlanPg.checkProductPlanSpinnerToDisappear();
			productPlanPg.get_scroller().click();
			for (int i = 0; i < 150; i++) {
				productPlanPg.keyBoardActions("down");
			}
			productPlanPg.waitLong(3);
			productPlanPg.doubleClick(productPlanPg.get_CreateProduct_1());
		} catch (Exception e) {
			for (int i = 0; i < 150; i++) {
				productPlanPg.keyBoardActions("down");
			}
			productPlanPg.waitLong(3);
			productPlanPg.doubleClick(productPlanPg.get_CreateProduct_1());
		}
	}

	/**
	 * Gets the row count of div.
	 *
	 * @param xpath
	 *            the xpath
	 * @return the row count of div
	 */
	public int getRowCountOfDiv(String xpath) {
		List<WebElement> listWebEle = null;
		listWebEle = driver.findElements(By.xpath("//div[@colid='total']"));
		int rowCount = listWebEle.size() - 4;
		return rowCount;
	}

	/**
	 * Sets the property value.
	 *
	 * @param productName
	 *            the new property value
	 */
	public void setPropertyValue(String productName) {
		Properties prop = new Properties();
		OutputStream output = null;
		try {
			output = new FileOutputStream("config.properties");
			// set the properties value
			prop.setProperty("ProductName", productName);
			// save properties to project root folder
			prop.store(output, null);
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Gets the property value.
	 *
	 * @param keyName
	 *            the key name
	 * @return the property value
	 */
	public String getPropertyValue(String keyName) {
		Properties prop = new Properties();
		InputStream input = null;
		String keyValue = null;
		try {
			input = new FileInputStream("config.properties");
			// load a properties file
			prop.load(input);
			// get the property value and print it out
			keyValue = prop.getProperty(keyName);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return keyValue;
	}
}
