package com.edu.Lib;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.edu.PageObjects.CNGZProductDevlopmentMerchantPageUI;
import com.edu.PageObjects.CNGZProductDevlopmentMerchantSamplePageUI;
import com.edu.PageObjects.ProductDevelopmentDetailPageUI;

// TODO: Auto-generated Javadoc
/**
 * The Class CNGZProductDevlopmentMerchantSampleActions.
 */
public class CNGZProductDevlopmentMerchantSampleActions {
	/** The driver. */
	WebDriver driver;
	/** The cngz product development pg. */
	CNGZProductDevlopmentMerchantPageUI cngzProductDevelopmentPg;
	/** The product development pg. */
	ProductDevelopmentDetailPageUI productDevelopmentPg;
	/** The cngz sample pg. */
	CNGZProductDevlopmentMerchantSamplePageUI cngzSamplePg;
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
	public CNGZProductDevlopmentMerchantSampleActions(WebDriver driver) {
		cngzProductDevelopmentPg = new CNGZProductDevlopmentMerchantPageUI(driver);
		productDevelopmentPg = new ProductDevelopmentDetailPageUI(driver);
		cngzSamplePg = new CNGZProductDevlopmentMerchantSamplePageUI(driver);
		this.driver = driver;
	}

	/**
	 * Sample register sample.
	 */
	public void sampleRegister_sample() {
		cngzProductDevelopmentPg.waitLong(5);
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_Samples().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_Sample());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel2_Sample());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.get_OrderSample().click();
		parentWindow = cngzSamplePg.get_CurrentWindowHandle();
		cngzProductDevelopmentPg.getWindowHandle();
		cngzSamplePg.switchToDefaultContent();
		cngzSamplePg.get_DevlopmentRadio().click();
		cngzSamplePg.SelectElementFromDropdown(cngzSamplePg.get_SampleTypeRadioButton(), "visibleText",
				"Quotation Sample");
		cngzSamplePg.get_RemoveExtraLine().click();
		cngzSamplePg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.get_NoOfQuant().get(0).sendKeys("1");
		cngzSamplePg.get_Date().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		// productDevelopmentPg.get_CalanderIcon().click();
		// productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		productDevelopmentPg.SelectElementFromDropdown(productDevelopmentPg.get_DatePickerDropDown().get(1),
				"visibleText", "" + (Calendar.getInstance().get(Calendar.YEAR) + 1));
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		productDevelopmentPg.SelectElementFromDropdown(productDevelopmentPg.get_DatePickerDropDown().get(0), "index",
				"" + Calendar.getInstance().get(Calendar.MONTH));
		productDevelopmentPg.get_DatefromCal().click();
		cngzSamplePg.get_PurposeOfSample().click();
		cngzSamplePg.get_PurposeOfSample().sendKeys("Fit and details");
		cngzSamplePg.get_Supplier().click();
		cngzSamplePg.get_SupplierOptions().click();
		cngzSamplePg.SelectElementFromDropdown(cngzSamplePg.get_ltCondition(), "visibleText", "1");
		cngzSamplePg.get_SupplierComment().click();
		cngzSamplePg.get_SupplierComment().sendKeys("Creating a sample");
		cngzSamplePg.get_Save().click();
		driver.switchTo().window(parentWindow);
	}

	/**
	 * Send order sample.
	 */
	public void sendOrderSample() {
		cngzProductDevelopmentPg.waitLong(5);
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_Sample());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel2_Sample());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.get_CheckBox().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_Sample());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel2_Sample());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.get_SendOrderSample().click();
		parentWindow = cngzSamplePg.get_CurrentWindowHandle();
		cngzSamplePg.getWindowHandle();
		cngzSamplePg.switchToDefaultContent();
		cngzSamplePg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.get_Mail_To().get(0).click();
		cngzSamplePg.get_ToCreateNew().click();
		cngzSamplePg.get_Mail_ModalWindow().get(0).click();
		cngzSamplePg.get_Mail_ModalWindow().get(0).sendKeys("Automation"
				+ new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime()) + "@gmail.com");
		cngzSamplePg.get_Mail_ModalWindow().get(1).click();
		cngzSamplePg.get_Mail_ModalWindow().get(1).sendKeys("Automation");
		cngzSamplePg.get_Mail_ModalWindow().get(2).click();
		cngzSamplePg.get_Mail_ModalWindow().get(2).sendKeys("Test");
		cngzSamplePg.get_Mail_ModalWindow().get(3).click();
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("body")).sendKeys("Creating a sample");
		cngzSamplePg.switchToDefaultContent();
		cngzSamplePg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.get_MailSend().click();
		cngzSamplePg.get_MailSendConfirmationMessage().isDisplayed();
		driver.close();
		driver.switchTo().window(parentWindow);
	}

	/**
	 * Sample register.
	 *
	 * @param supplier
	 *            the supplier
	 */
	public void sampleRegister(String supplier) {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_Sample());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Sample());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.get_Sample().click();
		cngzSamplePg.get_SampleRegister().click();
		parentWindow = cngzSamplePg.get_CurrentWindowHandle();
		cngzSamplePg.getWindowHandle();
		cngzSamplePg.switchToDefaultContent();
		cngzSamplePg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.SelectElementFromDropdown(cngzSamplePg.get_SampleSupplierDropdown(), "visibleText", supplier);
		cngzSamplePg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.get_CheckAllCheckBox().click();
		cngzSamplePg.checkWeekSliderSpinnerToAppear();
		cngzSamplePg.get_moveToRight().click();
		cngzSamplePg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.get_RegisterButton().click();
		cngzSamplePg.waitLong(8);
		driver.switchTo().window(parentWindow);
	}

	/**
	 * Click on sample link and enter measurement and fit report.
	 */
	public void clickOnSampleLinkAndEnterMeasurementAndFitReport() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_Sample());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Sample());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.waitLong(5);
		cngzSamplePg.get_SampleLink().click();
		parentWindow = cngzSamplePg.get_CurrentWindowHandle();
		cngzSamplePg.getWindowHandle();
		cngzSamplePg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("detailsDisplay");
		cngzProductDevelopmentPg.switchToFrame("tvcTabs0_samplePODashboardcontentFrame");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel4_Sample());
		cngzSamplePg.get_AddMeasurement().click();
		childWindow = cngzSamplePg.get_CurrentWindowHandle();
		cngzSamplePg.getWindowHandle();
		cngzSamplePg.switchToDefaultContent();
		cngzSamplePg.get_MeasurementValue().click();
		cngzSamplePg.get_MeasurementValue().sendKeys("4");
		String comment = "½ btm mment is too big but supplier will improve in next round.";
		cngzSamplePg.get_MeasurementComment().click();
		cngzSamplePg.get_MeasurementComment().sendKeys(comment);
		cngzSamplePg.get_MeasurementAdd().click();
		driver.switchTo().window(childWindow);
		cngzSamplePg.get_EditAll().click();
		cngzSamplePg.get_CommentTextArea().click();
		comment = "Hello," + "\n1)	Mments are within tolerance, except for ½-btm and that will be improved."
				+ "\n2)	Some puckering at armhole will be improved." + "\n3)	Btm hem is not even, will be improved."
				+ "\n4)	Pls advise what making you would like to have on bottom hem. Mock-up attatched with the sample for your selection."
				+ "\nPls advise your fitting comments and what sample you would like to see next." + "\nBR,"
				+ "\nTechnician";
		cngzSamplePg.get_CommentTextArea().sendKeys(comment);
		cngzSamplePg.checkWeekSliderSpinnerToAppear();
		cngzSamplePg.scrollIntoView(cngzSamplePg.get_ReadMode());
		cngzSamplePg.get_ReadMode().click();
		// ****************************
		cngzSamplePg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("detailsDisplay");
		cngzProductDevelopmentPg.switchToFrame("tvcTabs0_samplePODashboardcontentFrame");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel5_Sample());
		cngzSamplePg.get_AddDetails().click();
		cngzSamplePg.checkWeekSliderSpinnerToAppear();
		cngzSamplePg.get_AddDetails_Master().click();
		cngzSamplePg.scrollIntoView(cngzSamplePg.get_AddDetails_Master_Option("Lining"));
		cngzSamplePg.get_AddDetails_Master_Option("Lining").click();
		cngzSamplePg.scrollIntoView(cngzSamplePg.get_AddDetails_Master_Option("Other"));
		cngzSamplePg.get_AddDetails_Master_Option("Other").click();
		cngzSamplePg.get_AddDetails_AddSelected().click();
		cngzSamplePg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.get_AddDetails_DetailsName().click();
		cngzSamplePg.get_AddDetails_DetailsName().sendKeys("Shell");
		for (WebElement element : cngzSamplePg.get_AddDetails_Comments()) {
			element.click();
			element.sendKeys("Quantity is OK.");
		}
		for (WebElement element : cngzSamplePg.get_AddDetails_DropdownsStatus()) {
			cngzSamplePg.SelectElementFromDropdown(element, "visibleText", "OK");
		}
		cngzSamplePg.get_AddDetails_ReadMode().click();
		driver.close();
		driver.switchTo().window(parentWindow);
		cngzSamplePg.switchToDefaultContent();
	}

	/**
	 * Choose handover till GPOO merch.
	 */
	public void chooseHandoverTillGPOOMerch() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_Sample());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Sample());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.waitLong(5);
		cngzSamplePg.get_SelectAll().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_Sample());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Sample());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.get_Sample().click();
		cngzSamplePg.get_SampleHandOver().click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzSamplePg.SelectElementFromDropdown(cngzSamplePg.get_AddDetails_DropdownsStatus().get(0), "visibleText",
				"GPOO");
		productDevelopmentPg.get_PublishButton().click();
		cngzProductDevelopmentPg.waitLongMin(1);
	}

	/**
	 * Edits the sample from GPOO.
	 */
	public void editSampleFromGPOO() {
		cngzProductDevelopmentPg.waitLong(5);
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_Samples().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_Sample());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Sample());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.waitLong(5);
		cngzSamplePg.get_SampleLink().click();
		parentWindow = cngzSamplePg.get_CurrentWindowHandle();
		cngzSamplePg.getWindowHandle();
		cngzSamplePg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("detailsDisplay");
		cngzProductDevelopmentPg.switchToFrame("tvcTabs0_samplePODashboardcontentFrame");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel4_Sample());
		cngzSamplePg.get_EditAll().click();
		cngzSamplePg.get_CommentTextArea().click();
		String comment = "Hello," + "\nAgree w comments fr CNGZ. Pls also check sleeve length." + "\nBR,"
				+ "\nGPO Fit Responsible";
		cngzSamplePg.get_CommentTextArea().sendKeys(comment);
		cngzSamplePg.get_ReadMode().click();
		cngzSamplePg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("detailsDisplay");
		cngzProductDevelopmentPg.switchToFrame("tvcTabs0_samplePODashboardcontentFrame");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel5_Sample());
		cngzSamplePg.get_EditAll().click();
		cngzSamplePg.get_Commet().click();
		comment = "Hello," + "\nSample looks nice over all. No need to comment on colour."
				+ "\nLining feels a bit stiff, pls check and comment, tks." + "\nBR," + "\nGPO Merch";
		cngzSamplePg.get_Commet().sendKeys(comment);
		cngzSamplePg.get_ReadMode().click();
		driver.close();
		driver.switchTo().window(parentWindow);
		cngzSamplePg.switchToDefaultContent();
	}

	/**
	 * Handover to SEBO.
	 */
	public void handoverToSEBO() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_Sample());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Sample());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.waitLong(5);
		cngzSamplePg.get_SelectAll().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_Sample());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Sample());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzSamplePg.get_Sample().click();
		cngzSamplePg.get_SampleHandOver().click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzSamplePg.SelectElementFromDropdown(cngzSamplePg.get_AddDetails_DropdownsStatus().get(0), "visibleText",
				"SEBO");
		try {
			cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
			productDevelopmentPg.switchToDefaultContent();
			productDevelopmentPg.switchToFrame("content");
			productDevelopmentPg.switchToFrame("overlayContentFrame");
			driver.switchTo().frame(1);
			try {
				Actions act = new Actions(driver);
				act.doubleClick(driver.findElement(By.tagName("body"))).build().perform();
				driver.findElement(By.tagName("body")).sendKeys(" ");
			} catch (Exception ex) {
				Reporter.log(ex.getMessage());
			}
			addComment("Hi");
			addComment("Pls find sample comments, tks");
			addComment("BR,");
			addComment("GPO Merch");
			productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		} catch (Exception e) {
			Reporter.log(e.getMessage());
		}
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.switchToFrame("overlayContentFrame");
		productDevelopmentPg.get_PublishButton().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
	}

	public void addComment(String comment) {
		String script = "var para = document.createElement(\"p\");" + "var node = document.createTextNode('" + comment
				+ "');" + "para.appendChild(node);" + "var ele = document.getElementsByTagName('body')[0];"
				+ "ele.appendChild(para);";
		productDevelopmentPg.executeJs(script);
	}
}
