package com.edu.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductPlanPageUI.
 */
public class ProductPlanPageUI extends BasePage
{
	/** The driver. */
	WebDriver driver;
	
	/**
	 * Instantiates a new product plan page UI.
	 *
	 * @param driver the driver
	 */
	public ProductPlanPageUI(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
	}
	
	/**
	 * Gets the full mode.
	 *
	 * @return the full mode
	 */
	public WebElement get_FullMode() 
	{
		return expWait.getWhenVisibleWithOutImplicit(By.xpath("//button[contains(text(),'Full')]"), 50);
	}
	
/*	public WebElement get_ProductsButton() 
	{
		return expWait.getWhenClickable(By.xpath("//div[@class='btn-group pp-menu-button']/button[1]"), 45);
		
	}*/
	
	/**
 * Gets the load spinner.
 *
 * @return the load spinner
 */
public WebElement get_LoadSpinner() 
	{
		return expWait.getWhenClickable(By.xpath("//div[@id='loadingSpinner']"), 45);
	}
	
	/** The get products button. */
	@FindBy(xpath = "//div[@class='btn-group pp-menu-button']/button[1]")
	public List<WebElement> get_ProductsButton;
	

	/** The get carry over product icon. */
	@FindBy(xpath = "//*[@title='Create Carry Over Product']")
	public List<WebElement> get_CarryOverProductIcon;
	
	/**
	 * Gets the store icon.
	 *
	 * @return the store icon
	 */
	public WebElement get_StoreIcon() 
	{
		return expWait.getWhenClickable(By.xpath("//*[@class='icon channel-icon-Store']/.."), 45);
	}
	
	/**
	 * Gets the section dropdown.
	 *
	 * @return the section dropdown
	 */
	public WebElement get_SectionDropdown() 
	{
		return expWait.getWhenClickable(By.xpath("//*[@ng-model='sectionModel']"), 45);
	}
	
	/**
	 * Gets the department.
	 *
	 * @param department the department
	 * @return the department
	 */
	public WebElement get_Department(String department) 
	{
		return expWait.getWhenClickable(By.xpath("//*[contains(text(),'"+department+"')]"), 45);
	}

	/**
	 * Gets the season.
	 *
	 * @param season the season
	 * @return the season
	 */
	public WebElement get_Season(String season) 
	{
		return expWait.getWhenClickable(By.xpath("//*[contains(text(),'"+season+"')]"), 45);
	}
	
	/**
	 * Gets the scroller.
	 *
	 * @return the scroller
	 */
	public WebElement get_scroller() 
	{
		//return expWait.getWhenClickable(By.xpath("(//div[@colid='w21']/span)[1]"), 60);
		return expWait.getWhenClickable(By.xpath("(//div[contains(@colid,'w2') or contains(@colid,'w0') or contains(@colid,'w1') or contains(@colid,'w3') or contains(@colid,'w4')]/span)[1]"), 60);
	}
	
	/**
	 * Gets the scroller list.
	 *
	 * @return the scroller list
	 */
	public List<WebElement> get_scrollerList() 
	{
//		return expWait.getWhenVisibleList(By.xpath("(//div[@colid='w21'])"), 45);
		return driver.findElements(By.xpath("(//div[@colid='w21'])"));
	}
	
	/**
	 * Gets the temp.
	 *
	 * @return the temp
	 */
	public WebElement get_temp()
	{
		return driver.findElement(By.xpath(".//*[@id='center']//*[@class='ag-pinned-left-cols-container']//*[text()='Create product']"));
	}
	
	/**
	 * Gets the creates the product 1.
	 *
	 * @return the creates the product 1
	 */
	public WebElement get_CreateProduct_1() 
	{
		return expWait.getWhenClickable(By.xpath(".//*[@id='center']//*[@class='ag-pinned-left-cols-container']//*[text()='Create product']"), 45);
	}
	
	/**
	 * Gets the creates the product to edit.
	 *
	 * @return the creates the product to edit
	 */
	public WebElement get_CreateProductToEdit() 
	{
		return expWait.getWhenClickable(By.xpath(".//*[@id='center']//*[@class='ag-pinned-left-cols-container']//*[text()='Create product']"), 45);
	}
	
	/**
	 * Gets the creates the product 2.
	 *
	 * @return the creates the product 2
	 */
	public WebElement get_CreateProduct_2() 
	{
		return expWait.getWhenVisibleWithOutImplicit(By.xpath("(.//*[@id='center']//*[@class='ag-body-container']//div[@colid='w20'])[20]"), 45);
	}
	
	/**
	 * Gets the creates the product editor.
	 *
	 * @return the creates the product editor
	 */
	public WebElement get_CreateProduct_Editor() 
	{
		return expWait.getWhenClickable(By.xpath("//div[@colid='productName']//input"), 45);
	}
	
	/**
	 * Gets the selected tab editor.
	 *
	 * @return the selected tab editor
	 */
	public WebElement get_SelectedTab_Editor() 
	{
		return expWait.getWhenClickable(By.xpath("//*[@class='active']/a"), 45);
	}
	
	
	/**
	 * Gets the sell price.
	 *
	 * @param productName the product name
	 * @return the sell price
	 */
	public WebElement get_SellPrice(String productName) 
	{
		return expWait.getWhenClickable(By.xpath("//*[contains(text(),'"+productName+"')]//parent::span//parent::span//parent::div//following-sibling::div[@colid='sellPrice']/span"), 45);
	}
	
	/**
	 * Gets the sell price dropdown select.
	 *
	 * @param productName the product name
	 * @return the sell price dropdown select
	 */
	public WebElement get_SellPriceDropdownSelect(String productName)
	{
		return expWait.getWhenClickable(By.xpath("//*[contains(text(),'"+productName+"')]//parent::span//parent::span//parent::div//following-sibling::div[@colid='sellPrice']/input"), 45);
	}
	
	/**
	 * Gets the sell price text box.
	 *
	 * @return the sell price text box
	 */
	public WebElement get_SellPriceTextBox()
	{
		return expWait.getWhenClickable(By.xpath("//input[@id='sellPrice9134b360-f556-4a14-d9a3-fcc1b23d8b0d']"), 45);
	}
	
	/**
	 * Gets the arrow.
	 *
	 * @param productName the product name
	 * @return the arrow
	 */
	public WebElement get_Arrow(String productName) 
	{
		return expWait.getWhenClickable(By.xpath("//div[contains(.,'"+productName+"') and contains(@class,'ag-cell')]/preceding-sibling::*[1]/*"), 45);
	}
	
	/**
	 * Gets the color code.
	 *
	 * @return the color code
	 */
	public WebElement get_ColorCode() 
	{
		return expWait.getWhenClickable(By.xpath("//div[@colid='productName']/span[@class='cell-fill article-name-container is-new']"), 45);
	}
	
	/**
	 * Gets the color code editor.
	 *
	 * @return the color code editor
	 */
	public WebElement get_ColorCodeEditor() 
	{
		return expWait.getWhenClickable(By.xpath("//div[@colid='productName']/input[@class='editor-text ui-autocomplete-input']"), 45);
	}
	
	/**
	 * Gets the product name link.
	 *
	 * @param productName the product name
	 * @return the product name link
	 */
	public WebElement get_ProductNameLink(String productName) 
	{
		return expWait.getWhenClickable(By.xpath("//div[@colid='productName']//span[contains(text(),'"+productName+"')]"), 45);
	}
	
	/**
	 * Gets the product classification missing.
	 *
	 * @return the product classification missing
	 */
	public WebElement get_ProductClassificationMissing() 
	{
		return expWait.getWhenClickable(By.xpath("//a[contains(text(),'Product Classification missing')]"), 45);
	}
	
	/**
	 * Gets the please add articles.
	 *
	 * @return the please add articles
	 */
	public WebElement get_PleaseAddArticles() 
	{
		return expWait.getWhenClickable(By.xpath("//a[contains(text(),'Please add Articles')]"), 45);
	}
	
	/**
	 * Gets the please select IS ws.
	 *
	 * @return the please select IS ws
	 */
	public WebElement get_PleaseSelectISWs() 
	{
		return expWait.getWhenClickable(By.xpath("//a[contains(text(),'Please select ISWs')]"), 45);
	}
	
	/**
	 * Gets the article graphical appearance missing.
	 *
	 * @return the article graphical appearance missing
	 */
	public WebElement get_ArticleGraphicalAppearanceMissing() 
	{
		return expWait.getWhenClickable(By.xpath("//a[contains(text(),'Article Graphical Appearance missing')]"), 45);
	}
	
	/**
	 * Gets the article type missing.
	 *
	 * @return the article type missing
	 */
	public WebElement get_ArticleTypeMissing() 
	{
		return expWait.getWhenClickable(By.xpath("//a[contains(text(),'Article Type missing')]"), 45);
	}
	
	/**
	 * Gets the color code text box.
	 *
	 * @return the color code text box
	 */
	public WebElement get_ColorCodeTextBox() 
	{
		return expWait.getWhenClickable(By.xpath("//span[@class='article-name-container']"), 45);
	}
	
	/**
	 * Gets the color code text box editable.
	 *
	 * @return the color code text box editable
	 */
	public WebElement get_ColorCodeTextBoxEditable() 
	{
		return expWait.getWhenClickable(By.xpath("//*[@class='slick-cell l1 r1 colour-code active editable']/input[1]"), 45);
			
		
	}
	
	/**
	 * Gets the select color code.
	 *
	 * @param Article the article
	 * @return the select color code
	 */
	public WebElement get_SelectColorCode(String Article) 
	{
		//return expWait.getWhenClickable(By.xpath("//*[contains(@class,'colour-editor')]//*[text()='"+Article+"']"), 45);
		return expWait.getWhenClickable(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li[contains(.,'"+Article+"')]"), 45);	
		
	}
	
	/**
	 * Gets the product classification dropdown.
	 *
	 * @return the product classification dropdown
	 */
	public WebElement get_ProductClassificationDropdown() 
	{
		return expWait.getWhenClickable(By.xpath("//*[@class='product-classification']/input"), 45);
	}
	
	
	
	/**
	 * Gets the graphical appearance text box.
	 *
	 * @param articleName the article name
	 * @return the graphical appearance text box
	 */
	public WebElement get_GraphicalAppearanceTextBox(String articleName) 
	{
		return expWait.getWhenClickable(By.xpath("//span[contains(text(),'"+articleName+"')]//parent::span//parent::div//following::div[@class='slick-cell l6 r6 graphical-appearance']/span"), 45);
	}
	
	/**
	 * Gets the graphical appearance text box editable.
	 *
	 * @return the graphical appearance text box editable
	 */
	public WebElement get_GraphicalAppearanceTextBoxEditable() 
	{
		return expWait.getWhenClickable(By.xpath("//input[@class='editor-text ui-autocomplete-input']"), 45);
	}
	
	/**
	 * Gets the graphical appearance text box select.
	 *
	 * @param graphicalName the graphical name
	 * @return the graphical appearance text box select
	 */
	public WebElement get_GraphicalAppearanceTextBoxSelect(String graphicalName) 
	{
		//return expWait.getWhenClickable(By.xpath("//a[text()='"+graphicalName+"']"), 45);
		return expWait.getWhenClickable(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li[contains(.,'"+graphicalName+"')]"), 45);	
	}
	
	/**
	 * Gets the all articles checkbox.
	 *
	 * @return the all articles checkbox
	 */
	public WebElement get_AllArticlesCheckbox() 
	{
		return expWait.getWhenClickable(By.xpath("//input[@class='check-all-box']"), 45);
	}
	
	/**
	 * Gets the apply button.
	 *
	 * @return the apply button
	 */
	public WebElement get_ApplyButton() 
	{
		return expWait.getWhenClickable(By.xpath("//button[contains(text(),'Apply')]"), 45);
	}
	
	/**
	 * Gets the week select 1.
	 *
	 * @param weekNo the week no
	 * @return the week select 1
	 */
	public WebElement get_WeekSelect1(String weekNo) 
	{
		return expWait.getWhenClickable(By.xpath("//div[@class='ui-widget-content slick-row even article-row']//span[contains(text(),'"+weekNo+"')]"), 45);
	}
	
	/**
	 * Gets the week select 2.
	 *
	 * @param weekNo the week no
	 * @return the week select 2
	 */
	public WebElement get_WeekSelect2(String weekNo) 
	{
		return expWait.getWhenVisible(By.xpath("//div[@class='ui-widget-content slick-row odd article-row']//span[contains(text(),'"+weekNo+"')]"), 45);
	}
	
	/**
	 * Gets the article type text box.
	 *
	 * @param weekNo the week no
	 * @return the article type text box
	 */
	public WebElement get_ArticleTypeTextBox(String weekNo) 
	{
		return expWait.getWhenClickable(By.xpath("//div[@class='ui-widget-content slick-row odd article-row']//span[contains(text(),'"+weekNo+"')]"), 45);
	}
	
	/**
	 * Gets the sales type text box.
	 *
	 * @param articleName the article name
	 * @return the sales type text box
	 */
	public WebElement get_SalesTypeTextBox(String articleName) 
	{
		//return expWait.getWhenClickable(By.xpath("//span[contains(text(),'"+articleName+"')]//parent::span//parent::div//following::div[@class='slick-cell l9 r9 sales-type']/span"), 45);
		return expWait.getWhenVisible(By.xpath("//span[contains(text(),'"+articleName+"')]//parent::span//parent::div//following::div[@class='slick-cell l9 r9 sales-type']/span"), 45);
	}
	
	/**
	 * Gets the sales type text box editable.
	 *
	 * @return the sales type text box editable
	 */
	public WebElement get_SalesTypeTextBoxEditable() 
	{
		return expWait.getWhenClickable(By.xpath("//input[@class='editor-text ui-autocomplete-input']"), 45);
	}
	
	/**
	 * Gets the sales type text box select.
	 *
	 * @param salestype the salestype
	 * @return the sales type text box select
	 */
	public WebElement get_SalesTypeTextBoxSelect(String salestype) 
	{
		return expWait.getWhenClickable(By.xpath("//a[text()='"+salestype+"']"), 45);
	}
	
	/**
	 * Gets the FM textbox.
	 *
	 * @param articleName the article name
	 * @return the FM textbox
	 */
	public WebElement get_FMTextbox(String articleName) 
	{
		return expWait.getWhenClickable(By.xpath("//span[contains(text(),'"+articleName+"')]//parent::span//parent::div//following::div[@class='slick-cell l10 r10 flow-matrix']/span"), 45);		
	}
	
	/**
	 * Gets the FM text box editable.
	 *
	 * @return the FM text box editable
	 */
	public WebElement get_FMTextBoxEditable() 
	{
		return expWait.getWhenClickable(By.xpath("//input[@class='editor-text ui-autocomplete-input']"), 45);
	}
	
	/**
	 * Gets the FM text box select.
	 *
	 * @param FMvalue the f mvalue
	 * @return the FM text box select
	 */
	public WebElement get_FMTextBoxSelect(String FMvalue) 
	{
		return expWait.getWhenClickable(By.xpath("//a[text()='"+FMvalue+"']"), 45);
	}
	
	/**
	 * Gets the expand show product details.
	 *
	 * @return the expand show product details
	 */
	public WebElement get_ExpandShowProductDetails() 
	{
		return expWait.getWhenClickable(By.xpath("//select[contains(@ng-change,'changeTypeOfConstructionId')]"), 45);
	}
	
	/**
	 * Gets the expand show article list.
	 *
	 * @return the expand show article list
	 */
	public WebElement get_ExpandShowArticleList() 
	{
		return expWait.getWhenClickable(By.xpath("(//span[@title='Show Article List'])[1]"), 45);
	}
	
	/**
	 * Gets the type of construction id.
	 *
	 * @return the type of construction id
	 */
	public WebElement get_TypeOfConstructionId() 
	{
		return expWait.getWhenClickable(By.xpath("//*[@ng-model='product.typeOfConstructionId']"), 45);
	}
	
	/**
	 * Gets the customs customer group id.
	 *
	 * @return the customs customer group id
	 */
	public WebElement get_CustomsCustomerGroupId() 
	{
		return expWait.getWhenClickable(By.xpath("//*[@ng-model='product.customsCustomerGroupId']"), 45);
		
	}
	
	/**
	 * Gets the total excl 1.
	 *
	 * @return the total excl 1
	 */
	public WebElement get_Total_excl1() 
	{
		return expWait.getWhenClickable(By.xpath("(//*[contains(@class,'ag-cell-value sum-article-quantity')])[1]"), 45);		
	}
	
	/**
	 * Gets the total excl 1 editable.
	 *
	 * @return the total excl 1 editable
	 */
	public WebElement get_Total_excl1Editable() 
	{
		return expWait.getWhenClickable(By.xpath("(//*[contains(@class,'ag-cell-value sum-article-quantity')])[1]/input"), 45);		
	}
	
	/**
	 * Gets the total excl 2.
	 *
	 * @return the total excl 2
	 */
	public WebElement get_Total_excl2() 
	{
		return expWait.getWhenClickable(By.xpath("(//*[contains(@class,'ag-cell-value sum-article-quantity')])[2]"), 45);		
	}
	
	/**
	 * Gets the total excl 2 editable.
	 *
	 * @return the total excl 2 editable
	 */
	public WebElement get_Total_excl2Editable() 
	{
		return expWait.getWhenClickable(By.xpath("(//*[contains(@class,'ag-cell-value sum-article-quantity')])[2]/input"), 45);		
	}
	
	/**
	 * Gets the save product.
	 *
	 * @return the save product
	 */
	public WebElement get_SaveProduct() 
	{
		return expWait.getWhenClickable(By.xpath("//*[@ng-click='saveProduct()']"), 45);		
	}
	
	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public WebElement get_Version() 
	{
		return expWait.getWhenClickable(By.xpath("//button[contains(text(),' Version')]"), 45);		
	}
	
	/**
	 * Gets the version cell.
	 *
	 * @return the version cell
	 */
	public WebElement get_VersionCell() 
	{
		return expWait.getWhenClickable(By.xpath("(//*[@class='ag-body-container']//*[contains(@class,'version-column')])[1]"), 45);		
	}
	
	/**
	 * Gets the version cell editable.
	 *
	 * @return the version cell editable
	 */
	public WebElement get_VersionCellEditable() 
	{
		return expWait.getWhenClickable(By.xpath("(//*[@class='ag-body-container']//*[contains(@class,'version-column')])[1]/input"), 45);		
	}
	
	/**
	 * Gets the version cell autocomplete.
	 *
	 * @param option the option
	 * @return the version cell autocomplete
	 */
	public WebElement get_VersionCellAutocomplete(String option) 
	{
		return expWait.getWhenClickable(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li[contains(.,'"+option+"')]"), 45);		
	}
	
	/**
	 * Gets the all markets is checked.
	 *
	 * @return the all markets is checked
	 */
	public WebElement get_allMarketsIsChecked() 
	{
		return expWait.getWhenClickable(By.xpath("//*[@id='ArticleMultiApplyModal']//input[@ng-checked='allMarketsIsChecked']"), 45);		
	}
	
	/**
	 * Gets the all articles is checked.
	 *
	 * @return the all articles is checked
	 */
	public WebElement get_allArticlesIsChecked() 
	{
		return expWait.getWhenClickable(By.xpath("//*[@id='ArticleMultiApplyModal']//input[@ng-checked='allArticlesIsChecked']"), 45);		
	}
	
	/**
	 * Gets the apply.
	 *
	 * @return the apply
	 */
	public WebElement get_Apply() 
	{
		return expWait.getWhenClickable(By.xpath("//*[@id='ArticleMultiApplyModal']//button[text()='Apply']"), 45);		
	}
	
	/**
	 * Gets the select plan.
	 *
	 * @return the select plan
	 */
	public WebElement get_SelectPlan() 
	{
		return expWait.getWhenClickable(By.xpath("//button//*[contains(text(),'Select Plan')]"), 45);		
	}
	
	/**
	 * Gets the format checkbox.
	 *
	 * @return the format checkbox
	 */
	public WebElement get_FormatCheckbox() 
	{
		return expWait.getWhenClickable(By.xpath("(//*[@id='agHeaderCellLabel']//*[@type='checkbox'])[1]"), 45);		
	}

	/**
	 * Gets the buy all P ms.
	 *
	 * @return the buy all P ms
	 */
	public WebElement get_BuyAllPMs() 
	{
		return expWait.getWhenClickable(By.xpath("//button//*[contains(text(),'Buy all PMs')]"), 45);		
	}
	
	/**
	 * Gets the ready to order.
	 *
	 * @return the ready to order
	 */
	public WebElement get_ReadyToOrder() 
	{
		return expWait.getWhenVisible(By.xpath("//button[text()='Ready to Order']"), 45);		
	}
	
	/**
	 * Gets the article display.
	 *
	 * @return the article display
	 */
	public WebElement get_ArticleDisplay() 
	{
		return driver.findElement(By.xpath("(//div[@class='slick-cell l7 r7 sales-product-number']//span[contains(text(),'00')])[1]"));
	}
	
	/**
	 * Gets the product close.
	 *
	 * @return the product close
	 */
	public WebElement get_ProductClose() 
	{
		return driver.findElement(By.xpath("//button[@id='product-card-close']"));
	}
	
	/**
	 * Gets the save.
	 *
	 * @return the save
	 */
	public WebElement get_Save() 
	{
		return expWait.getWhenClickable(By.linkText("Save"), 45);	
	}
	
	
}


