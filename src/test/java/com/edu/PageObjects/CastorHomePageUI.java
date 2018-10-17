package com.edu.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// TODO: Auto-generated Javadoc
/**
 * The Class CastorHomePageUI.
 */
public class CastorHomePageUI extends BasePage {
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new castor home page UI.
	 *
	 * @param driver
	 *            the driver
	 */
	public CastorHomePageUI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/** The Drpdwn exm. */
	@FindBy(id = "example")
	public WebElement Drpdwn_exm;
	/** The txt box product development name. */
	@FindBy(id = "txtProductName")
	public WebElement txtBox_ProductDevelopmentName;
	/** The sel owning office. */
	@FindBy(id = "owningOffice")
	public WebElement sel_owningOffice;
	/** The sel brand. */
	@FindBy(id = "txtCompanyId")
	public WebElement sel_Brand;
	/** The btn create. */
	@FindBy(xpath = "//a[text()='Create']")
	public WebElement btn_Create;

	/**
	 * Gets the btn product devlopment.
	 *
	 * @return the btn product devlopment
	 */
	public WebElement get_Btn_ProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Create Product Development']"), 10);
	}

	/**
	 * Gets the top result.
	 *
	 * @param office
	 *            the office
	 * @return the top result
	 */
	public WebElement get_TopResult(String office) {
		return expWait.getWhenClickable(
				By.xpath("//a[contains(@href,'emxTree.jsp') and contains(text(),'" + office + "')]"), 10);
	}

	/**
	 * Gets the top search.
	 *
	 * @return the top search
	 */
	public WebElement get_TopSearch() {
		return expWait.getWhenClickable(By.id("GlobalNewTEXT"), 30);
	}

	/**
	 * Gets the top search close.
	 *
	 * @return the top search close
	 */
	public WebElement get_TopSearchClose() {
		return expWait.getWhenClickable(By.id("closeTA"), 30);
	}

	/**
	 * Gets the top search result.
	 *
	 * @return the top search result
	 */
	public List<WebElement> get_TopSearchResult() {
		return expWait.getWhenVisibleList(By.xpath("//a[contains(@href,'emxTree.jsp')]"), 60);
	}

	/**
	 * Gets the top search result.
	 *
	 * @param productID
	 *            the product ID
	 * @param office
	 *            the office
	 * @return the top search result
	 */
	public WebElement get_TopSearchResult(String productID, String office) {
		if (office == null) {
			return expWait.getWhenClickable(
					By.xpath("//a[contains(@href,'emxTree.jsp') and text()='" + productID + "']"), 60);
		} else {
			return expWait.getWhenClickable(
					By.xpath("//a[contains(@href,'emxTree.jsp') and text()='" + productID + " " + office + "']"), 60);
		}
	}

	/**
	 * Gets the frame level 2.
	 *
	 * @return the frame level 2
	 */
	public WebElement get_FrameLevel2() {
		return expWait.getWhenVisible(
				By.xpath("//*[contains(@name,'HMProductDevelopmentBuyerStartPageTabcontentFrame')]"), 90);
	}

	/**
	 * Gets the frame level 3.
	 *
	 * @return the frame level 3
	 */
	public WebElement get_FrameLevel3() {
		return expWait.getWhenVisible(By.xpath("//*[contains(@name,'HMProductDevelopmentBuyerStartPagecontentFrame')]"),
				90);
	}
}
