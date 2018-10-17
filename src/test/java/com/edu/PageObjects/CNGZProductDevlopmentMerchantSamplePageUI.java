package com.edu.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// TODO: Auto-generated Javadoc
/**
 * The Class CNGZProductDevlopmentMerchantSamplePageUI.
 */
public class CNGZProductDevlopmentMerchantSamplePageUI extends BasePage {
	
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new CNGZ product devlopment merchant sample page UI.
	 *
	 * @param driver the driver
	 */
	public CNGZProductDevlopmentMerchantSamplePageUI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/**
	 * Gets the order sample.
	 *
	 * @return the order sample
	 */
	public WebElement get_OrderSample() {
		return expWait.getWhenClickable(By.xpath(".//*[@id='toolbar-container']//*[text()='Order Sample']"), 45);
	}

	/**
	 * Gets the sample.
	 *
	 * @return the sample
	 */
	public WebElement get_Sample() {
		return expWait.getWhenClickable(By.xpath(".//*[@id='toolbar-container']//*[text()='Sample']"), 45);
	}

	/**
	 * Gets the sample register.
	 *
	 * @return the sample register
	 */
	public WebElement get_SampleRegister() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Register Sample']"), 45);
	}
	
	/**
	 * Gets the sample hand over.
	 *
	 * @return the sample hand over
	 */
	public WebElement get_SampleHandOver() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Handover Samples']"), 45);
	}

	/**
	 * Gets the sample supplier dropdown.
	 *
	 * @return the sample supplier dropdown
	 */
	public WebElement get_SampleSupplierDropdown() {
		return expWait.getWhenClickable(By.xpath("//*[@id='supplierId']"), 45);
	}

	/**
	 * Gets the check all check box.
	 *
	 * @return the check all check box
	 */
	public WebElement get_CheckAllCheckBox() {
		return expWait.getWhenClickable(By.xpath("//*[@id='checkAllLeft']"), 45);
	}

	/**
	 * Gets the move to right.
	 *
	 * @return the move to right
	 */
	public WebElement get_moveToRight() {
		return expWait.getWhenClickable(By.xpath("//*[@id='moveToRight']"), 45);
	}

	/**
	 * Gets the register button.
	 *
	 * @return the register button
	 */
	public WebElement get_RegisterButton() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Register']"), 45);
	}

	/**
	 * Gets the send order sample.
	 *
	 * @return the send order sample
	 */
	public WebElement get_SendOrderSample() {
		return expWait.getWhenClickable(By.xpath(".//*[@id='toolbar-container']//*[text()='Send Sample Order']"), 45);
	}

	/**
	 * Gets the devlopment radio.
	 *
	 * @return the devlopment radio
	 */
	public WebElement get_DevlopmentRadio() {
		return expWait.getWhenClickable(By.xpath("//*[@id='developmentContext']"), 45);
	}

	/**
	 * Gets the sample type radio button.
	 *
	 * @return the sample type radio button
	 */
	public WebElement get_SampleTypeRadioButton() {
		return expWait.getWhenClickable(By.xpath("//select[contains(@ng-options,'sampleType')]"), 45);
	}

	/**
	 * Gets the removes the extra line.
	 *
	 * @return the removes the extra line
	 */
	public WebElement get_RemoveExtraLine() {
		return expWait.getWhenClickable(
				By.xpath("//span[contains(.,'Extra lining') and @class='ng-scope']//*[@ng-hide='$select.disabled']"),
				45);
	}

	/**
	 * Gets the no of quant.
	 *
	 * @return the no of quant
	 */
	public List<WebElement> get_NoOfQuant() {
		return expWait.getWhenVisibleList(By.xpath("//td[contains(@ng-repeat,'appearance.quantities')]//input"), 45);
	}

	/**
	 * Gets the mail to.
	 *
	 * @return the mail to
	 */
	public List<WebElement> get_Mail_To() {
		return expWait.getWhenVisibleList(By.xpath("//ul//input"), 45);
	}

	/**
	 * Gets the mail modal window.
	 *
	 * @return the mail modal window
	 */
	public List<WebElement> get_Mail_ModalWindow() {
		return expWait.getWhenVisibleList(By.xpath("//*[@class='modal-content']//input"), 45);
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public WebElement get_Date() {
		return expWait.getWhenClickable(By.xpath("//*[@id='datepicker_0']"), 45);
	}

	/**
	 * Gets the purpose of sample.
	 *
	 * @return the purpose of sample
	 */
	public WebElement get_PurposeOfSample() {
		return expWait.getWhenClickable(By.xpath("//*[@id='purposeOfSample_0']"), 45);
	}

	/**
	 * Gets the supplier.
	 *
	 * @return the supplier
	 */
	public WebElement get_Supplier() {
		return expWait.getWhenClickable(By.xpath("//*[@id='supplier_0']//input"), 45);
	}

	/**
	 * Gets the supplier options.
	 *
	 * @return the supplier options
	 */
	public WebElement get_SupplierOptions() {
		return expWait.getWhenClickable(By.xpath("//a/*[contains(text(),'Hop Lun')]"), 45);
	}

	/**
	 * Gets the lt condition.
	 *
	 * @return the lt condition
	 */
	public WebElement get_ltCondition() {
		return expWait.getWhenClickable(By.xpath("//*[contains(@ng-options,'ltCondition')]"), 45);
	}

	/**
	 * Gets the supplier comment.
	 *
	 * @return the supplier comment
	 */
	public WebElement get_SupplierComment() {
		return expWait.getWhenClickable(By.xpath("//*[@id='supplierComment_0_0']"), 45);
	}

	/**
	 * Gets the save.
	 *
	 * @return the save
	 */
	public WebElement get_Save() {
		return expWait.getWhenClickable(By.xpath("//*[@id='saveButton']"), 45);
	}

	/**
	 * Gets the check box.
	 *
	 * @return the check box
	 */
	public WebElement get_CheckBox() {
		return expWait.getWhenClickable(By.xpath("//form//input[@name='emxTableRowId']"), 45);
	}

	/**
	 * Gets the to create new.
	 *
	 * @return the to create new
	 */
	public WebElement get_ToCreateNew() {
		return expWait.getWhenClickable(By.xpath("//li//*[contains(.,'Create New Contact')]"), 45);
	}

	/**
	 * Gets the mail send.
	 *
	 * @return the mail send
	 */
	public WebElement get_MailSend() {
		return expWait.getWhenClickable(By.xpath("//*[@id='sendButtonId']"), 45);
	}

	/**
	 * Gets the mail send confirmation message.
	 *
	 * @return the mail send confirmation message
	 */
	public WebElement get_MailSendConfirmationMessage() {
		return expWait.getWhenClickable(By.xpath("//*[contains(text(),'window to continue')]"), 45);
	}

	/**
	 * Gets the sample link.
	 *
	 * @return the sample link
	 */
	public WebElement get_SampleLink() {
		return expWait.getWhenClickable(By.xpath("//tr[contains(.,'Quotation Sample')]//a"), 45);
	}
	
	/**
	 * Gets the adds the measurement.
	 *
	 * @return the adds the measurement
	 */
	public WebElement get_AddMeasurement() {
		return expWait.getWhenClickable(By.xpath("//*[@id='AddMeasurement']"), 45);
	}
	
	/**
	 * Gets the measurement value.
	 *
	 * @return the measurement value
	 */
	public WebElement get_MeasurementValue() {
		return expWait.getWhenVisible(By.xpath("//tr[contains(.,'Bottom')]//input[@class='measuredValue']"), 45);
	}
	
	/**
	 * Gets the measurement add.
	 *
	 * @return the measurement add
	 */
	public WebElement get_MeasurementAdd() {
		return expWait.getWhenClickable(By.xpath("//a[text()='Add']"), 45);
	}
	
	/**
	 * Gets the measurement comment.
	 *
	 * @return the measurement comment
	 */
	public WebElement get_MeasurementComment() {
		return expWait.getWhenClickable(By.xpath(".//*[@id='commentsTextArea']"), 45);
	}
	
	
	/**
	 * Gets the edits the all.
	 *
	 * @return the edits the all
	 */
	public WebElement get_EditAll() {
		return expWait.getWhenClickable(By.xpath(".//*[text()='Edit All']"), 45);
	}
	
	
	/**
	 * Gets the read mode.
	 *
	 * @return the read mode
	 */
	public WebElement get_ReadMode() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Read Mode']"), 45);
	}
	
	
	/**
	 * Gets the comment text area.
	 *
	 * @return the comment text area
	 */
	public WebElement get_CommentTextArea() {
		return expWait.getWhenClickable(By.xpath("//*[@id='comment']//textarea"), 45);
	}
	
	/**
	 * Gets the adds the details.
	 *
	 * @return the adds the details
	 */
	public WebElement get_AddDetails() {
		return expWait.getWhenClickable(By.xpath("//*[@id='AddDetail']"), 45);
	}
	
	/**
	 * Gets the adds the details master.
	 *
	 * @return the adds the details master
	 */
	public WebElement get_AddDetails_Master() {
		return expWait.getWhenClickable(By.xpath("//*[contains(text(),'Master')]"), 45);
	}
	
	/**
	 * Gets the adds the details master option.
	 *
	 * @param option the option
	 * @return the adds the details master option
	 */
	public WebElement get_AddDetails_Master_Option(String option) {
		return expWait.getWhenVisible(By.xpath("//*[contains(@class,'panel panel-default') and contains(.,'Master')]//*[contains(text(),'"+option+"')]/preceding-sibling::*"), 45);
	}
	
	/**
	 * Gets the adds the details add selected.
	 *
	 * @return the adds the details add selected
	 */
	public WebElement get_AddDetails_AddSelected() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Selected']"), 45);
	}
	
	/**
	 * Gets the adds the details details name.
	 *
	 * @return the adds the details details name
	 */
	public WebElement get_AddDetails_DetailsName() {
		return expWait.getWhenClickable(By.xpath("//*[contains(.,'Detail Name') and @class='ng-scope']/input"), 45);
	}
	
	/**
	 * Gets the adds the details comments.
	 *
	 * @return the adds the details comments
	 */
	public List<WebElement> get_AddDetails_Comments() {
		return expWait.getWhenVisibleList(By.xpath("//textarea"), 45);
	}
	
	/**
	 * Gets the adds the details dropdowns status.
	 *
	 * @return the adds the details dropdowns status
	 */
	public List<WebElement> get_AddDetails_DropdownsStatus() {
		return expWait.getWhenVisibleList(By.xpath("//select"), 45);
	}
	
	/**
	 * Gets the adds the details read mode.
	 *
	 * @return the adds the details read mode
	 */
	public WebElement get_AddDetails_ReadMode() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Read Mode']"), 45);
	}
	
	/**
	 * Gets the select all.
	 *
	 * @return the select all
	 */
	public WebElement get_SelectAll() {
		return expWait.getWhenClickable(By.xpath("//*[@name='tvcSelectAll']"), 45);
	}
	
	/**
	 * Gets the commet.
	 *
	 * @return the commet
	 */
	public WebElement get_Commet() {
		return expWait.getWhenClickable(By.xpath("//*[@data-ng-controller='TextCommentsCtrl']//textarea"), 45);
	}
	
	
}
