package com.edu.Test;

import static com.edu.Utilities.YamlReader.getYamlValue;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.edu.CoreTestBase.TestSessionInitiator;
import com.edu.Utilities.YamlReader;

/**
 * The Class CastorProductDevlopmentTest.
 */
public class Init_CastorProductDevlopmentTest {
	/** The test. */
	TestSessionInitiator test;
	/** The course key. */
	String courseKey;
	/** The environment. */
	String environment;
	/** The product. */
	String product;
	/** The activity name. */
	String activityName;
	String productID;
	String dataFile = "EDU_TestDataQA.yml";

	/**
	 * Sets the up class.
	 */
	@BeforeClass
	public void setUpClass() {
		System.out.println("\n##############################################################################");
		System.out.println("################ Castor Product Devlopment Test #############");
		System.out.println("##############################################################################\n\n");
		System.out.println("Test Name: setUpClass");
		System.setProperty("browser", "firefox");
		test = new TestSessionInitiator(System.getProperty("datafile", "dataFile"));
	}

	/**
	 * TC 001 login to castor.
	 *
	 * @throws FileNotFoundException
	 *             the file not found exception
	 */
	@Test
	@Parameters({ "username", "password" })
	public void TC001_loginToCastor(String username, String password) throws FileNotFoundException {
		test.launchUrl(getYamlValue("castorUrl"));
		test.castorHome.loginToCastor(username, password);
	}

	/**
	 * TC 002 create product development.
	 */
	@Test(dependsOnMethods = "TC001_loginToCastor")
	public void TC002_CreateProductDevelopment() {
		test.castorHome.switchToFrameToGetCreateProductDevelopment();
		test.castorHome.clickOnProductDevelopment();
		String productName = getYamlValue("productDevlopment.productName");
		test.castorHome.switchToCreateProductDevelopmentPopUpAndEnterInformation(productName,
				getYamlValue("productDevlopment.office"));
	}

	/**
	 * TC 003 edit product development header.
	 */
	@Test(dependsOnMethods = "TC002_CreateProductDevelopment")
	@Parameters({ "season", "product type", "department" })
	public void TC003_EditProductDevelopmentHeader(String season, String producttype, String department) {
		test.productDevlopmet.editProductDevelopment();
		test.productDevlopmet.selectSeason(season);
		test.productDevlopmet.selectDepartment(department);
		test.productDevlopmet.selectProductType(producttype);
		test.productDevlopmet.enterPurposeOfDevelopment(getYamlValue("productDevlopment.purposeOfDev"));
		test.productDevlopmet.enterValueDriver(getYamlValue("productDevlopment.valueDriver"));
		test.productDevlopmet.enterNotes(getYamlValue("productDevlopment.notes"));
		test.productDevlopmet.selectPhase(getYamlValue("productDevlopment.phase"));
		test.productDevlopmet.enterTargetPrice(getYamlValue("productDevlopment.targetPrice"));
		test.productDevlopmet.selectCurrency(getYamlValue("productDevlopment.Currency"));
		test.productDevlopmet.saveProductDevelopmentEdit(getYamlValue("productDevlopment.season"));
	}

	/**
	 * TC 004 plan deliver add row and save.
	 */
	@Test(dependsOnMethods = "TC003_EditProductDevelopmentHeader")
	public void TC004_PlanDeliverAddRowAndSave() {
		test.productDevlopmet.planDeliveryAddRow();
		test.productDevlopmet.enterInformationInNewRowPlanDelivery(getYamlValue("AddRowPlanDelivery.Quantity"),
				getYamlValue("AddRowPlanDelivery.Date"));
		test.productDevlopmet.saveCreatedRowInPlanDelivery();
		this.productID = test.productDevlopmet.get_ProductID();
	}

	/**
	 * TC 005 fit description add or copy mchart.
	 */
	@Test(dependsOnMethods = "TC004_PlanDeliverAddRowAndSave")
	public void TC005_FitDescriptionAddOrCopyMchart() {
		test.productDevlopmet.navigateToDescriptionTab();
		test.productDevlopmet.addNewDocumentUnderActions();
		test.productDevlopmet.selectAndConvertImage();
		test.productDevlopmet.addMChart(getYamlValue("Mchart.ID"));
	}

	/**
	 * TC 006 add appearance.
	 */
	@Test(dependsOnMethods = "TC005_FitDescriptionAddOrCopyMchart")
	public void TC006_addAppearance() {
		test.productDevlopmet.create_Appearance((ArrayList) YamlReader.getMapValueArray("Appearance.List"),
				getYamlValue("Appearance.GraphicalAppearance"));
	}

	/**
	 * TC 007 add component development.
	 */
	@Test(dependsOnMethods = "TC006_addAppearance")
	public void TC007_AddComponentDevelopment() {
		test.productDevlopmet.addComponentDevelopments(getYamlValue("ComponentDevelopment"));
	}

	/**
	 * TC 008 add label.
	 */
	@Test(dependsOnMethods = "TC007_AddComponentDevelopment")
	public void TC008_addLabel() {
		test.productDevlopmet.addLabel(getYamlValue("LabelID"));
	}

	/**
	 * TC 009 add images.
	 */
	@Test(dependsOnMethods = "TC008_addLabel")
	public void TC009_addImages() {
		//
		// test.productDevlopmet.addImageForProductDevelopment(getYamlValue("productDevlopment.ImageSeason"),
		// getYamlValue("productDevlopment.department"), getYamlValue("Image"));
	}

	/**
	 * TC 010 add offices.
	 */
	@Test(dependsOnMethods = "TC009_addImages")
	public void TC010_addOffices() {
		test.productDevlopmet.addOffice(getYamlValue("office"));
	}

	/**
	 * TC 011 publish product.
	 */
	@Test(dependsOnMethods = "TC010_addOffices")
	public void TC011_publishProduct() {
		test.productDevlopmet.publishToMerchantGPOO(getYamlValue("GPOO.userInfoToPublish"), "GPOO");
	}

	/**
	 * TC 012 login as merchant.
	 */
	@Test(dependsOnMethods = "TC011_publishProduct")
	public void TC012_LoginAsMerchant() {
	}

	/**
	 * TC 013 search product ID.
	 */
	@Test(dependsOnMethods = "TC012_LoginAsMerchant")
	public void TC013_SearchProductID() {
		Assert.assertTrue(SearchProductIDGPOO(), "Undabe to search product ID");
	}

	/**
	 * Search product IDGPOO.
	 *
	 * @return true, if successful
	 */
	public boolean SearchProductIDGPOO() {
		test.castorHome.syncPage();
		test.closeBrowserSession();
		for (int i = 0; i < 15; i++) {
			try {
				test = new TestSessionInitiator(System.getProperty("datafile", "dataFile"));
				test.launchUrl(getYamlValue("castorUrl"));
				test.castorHome.loginToCastor(getYamlValue("loginInfo.GPOO.username"),
						getYamlValue("loginInfo.GPOO.password"));
				test.castorHome.performProductIDSearch(this.productID, "GPOO");
				return true;
			} catch (Exception e) {
				test.closeBrowserSession();
				Reporter.log("Unable to search product ID. Retry again..");
				System.out.println("Unable to search product ID. Retry again..");
			}
		}
		return false;
	}

	/**
	 * TC 014 options open option grouplink.
	 */
	@Test(dependsOnMethods = "TC013_SearchProductID")
	public void TC014_OptionsOpenOptionGrouplink() {
		test.merchantProductDevelopment.openOptionGroupLink();
	}

	/**
	 * TC 015 edit option group header and save.
	 */
	@Test(dependsOnMethods = "TC014_OptionsOpenOptionGrouplink")
	public void TC015_EditOptionGroupHeaderAndSave() {
		test.merchantProductDevelopment.editOptionGroupHeader(getYamlValue("Merchant.Options.ProductionGroup"),
				getYamlValue("Merchant.Options.ProductionType"), getYamlValue("Merchant.Options.ProductionAppearance"),
				getYamlValue("Merchant.Options.Country"), getYamlValue("Merchant.Options.RenameGroup"));
	}

	/**
	 * TC 016 add BOM action woven.
	 */
	@Test(dependsOnMethods = "TC015_EditOptionGroupHeaderAndSave")
	public void TC016_AddBOMActionWoven() {
		test.merchantProductDevelopment.addBOM(getYamlValue("Merchant.Options.ProductionGroup"),
				getYamlValue("Merchant.Options.BOMSearchID"), getYamlValue("Merchant.Options.position"));
	}

	/**
	 * TC 017 disconnect appearance.
	 */
	@Test(dependsOnMethods = "TC016_AddBOMActionWoven")
	public void TC017_DisconnectAppearance() {
		test.merchantProductDevelopment.diconnectAppearance((ArrayList) YamlReader.getMapValueArray("Disconnect.List"));
	}

	/**
	 * TC 018 create option group 2 by copy.
	 */
	@Test(dependsOnMethods = "TC017_DisconnectAppearance")
	public void TC018_createOptionGroup2ByCopy() {
		test.merchantProductDevelopment.createOptionGroup2ByCopy(getYamlValue("Option.CopyName"),
				getYamlValue("Merchant.Options.ProductionGroup"), getYamlValue("Merchant.Options.ProductionType"),
				getYamlValue("Merchant.Options.ProductionAppearance"), getYamlValue("Merchant.Options.Country"));
	}

	/**
	 * TC 019 disconnect appearance and connect apperances and save header.
	 */
	@Test(dependsOnMethods = "TC018_createOptionGroup2ByCopy")
	public void TC019_DisconnectAppearanceAndConnectApperancesAndSaveHeader() {
		test.merchantProductDevelopment.connect("11-107", "connect");
		test.merchantProductDevelopment.connect("10-201", "connect");
		test.merchantProductDevelopment.disconnect("09-090");
		test.merchantProductDevelopment.saveHeader();
	}

	/**
	 * TC 020 add office.
	 */
	@Test(dependsOnMethods = "TC019_DisconnectAppearanceAndConnectApperancesAndSaveHeader")
	public void TC020_AddOffice() {
		test.merchantProductDevelopment.addOffice(getYamlValue("Merchant.Options.office"));
	}

	/**
	 * TC 021 publish.
	 */
	@Test(dependsOnMethods = "TC020_AddOffice")
	public void TC021_publish() {
		test.productDevlopmet.publishToMerchantCNGZ(getYamlValue("CNGZ.userInfoToPublish"),
				getYamlValue("Merchant.Options.office"));
	}

	/**
	 * TC 022 search product ID.
	 */
	@Test(dependsOnMethods = "TC021_publish")
	public void TC022_SearchProductID() {
		Assert.assertTrue(SearchProductIDCNGZ(), "Undabe to search product ID");
	}

	/**
	 * Search product IDCNGZ.
	 *
	 * @return true, if successful
	 */
	public boolean SearchProductIDCNGZ() {
		test.castorHome.syncPage();
		test.closeBrowserSession();
		for (int i = 0; i < 15; i++) {
			try {
				test = new TestSessionInitiator(System.getProperty("datafile", "dataFile"));
				test.launchUrl(getYamlValue("castorUrl"));
				test.castorHome.loginToCastor(getYamlValue("loginInfo.CNGZ.username"),
						getYamlValue("loginInfo.CNGZ.password"));
				test.castorHome.performProductIDSearch(this.productID, "CNGZ");
				return true;
			} catch (Exception e) {
				test.closeBrowserSession();
				Reporter.log("Unable to search product ID. Retry again..");
				System.out.println("Unable to search product ID. Retry again..");
			}
		}
		return false;
	}

	/**
	 * TC 023 edit product development header add weight.
	 */
	@Test(dependsOnMethods = "TC022_SearchProductID")
	public void TC023_EditProductDevelopmentHeaderAddWeight() {
		test.productDevlopmet.editProductDevelopmentCNGZ();
		test.productDevlopmet.addWeight(getYamlValue("CNGZMerchant.Header.Weight"));
		test.productDevlopmet.saveProductDevelopmentEditCNGZ(getYamlValue("productDevlopment.season"));
	}

	/**
	 * TC 024 add supplier and request.
	 */
	@Test(dependsOnMethods = "TC023_EditProductDevelopmentHeaderAddWeight")
	public void TC024_addSupplierAndRequest() {
		test.cngzProductDevlopment.addSupplierAndRequest();
		test.cngzProductDevlopment.addSupplier(getYamlValue("CNGZMerchant.Header.Supplier1"));
		test.cngzProductDevlopment.addSupplierAndRequest();
		test.cngzProductDevlopment.addSupplier(getYamlValue("CNGZMerchant.Header.Supplier2"));
	}

	/**
	 * TC 025 option create option HOPLUN regularlining.
	 */
	@Test(dependsOnMethods = "TC024_addSupplierAndRequest")
	public void TC025_Option_CreateOptionHOPLUNRegularlining() {
		test.cngzProductDevlopment.addOptions();
	}

	/**
	 * TC 026 edit details add information and save.
	 */
	@Test(dependsOnMethods = "TC025_Option_CreateOptionHOPLUNRegularlining")
	public void TC026_editDetailsAddInformationAndSave() {
		test.cngzProductDevlopment.editDetailsAddInformationAndSave(getYamlValue("CNGZMerchant.options.country"));
	}

	/**
	 * TC 027 add BOM.
	 */
	@Test(dependsOnMethods = "TC026_editDetailsAddInformationAndSave")
	public void TC027_addBOM() {
		test.cngzProductDevlopment.addBOMCNGZ(getYamlValue("CNGZMerchant.BOM.placement"),
				getYamlValue("CNGZMerchant.BOM.OriginCountry"));
	}

	/**
	 * TC 028 add cost.
	 */
	@Test(dependsOnMethods = "TC027_addBOM")
	public void TC028_addCost() {
		test.cngzProductDevlopment.addCost(getYamlValue("CNGZMerchant.HopLundRegularliningOption.Material"),
				getYamlValue("CNGZMerchant.HopLundRegularliningOption.Trim"),
				getYamlValue("CNGZMerchant.HopLundRegularliningOption.Labour"),
				getYamlValue("CNGZMerchant.HopLundRegularliningOption.Finishing"),
				getYamlValue("CNGZMerchant.HopLundRegularliningOption.Labels"),
				getYamlValue("CNGZMerchant.HopLundRegularliningOption.Overhead"));
	}

	/**
	 * TC 029 lock withpadlock.
	 */
	@Test(dependsOnMethods = "TC028_addCost")
	public void TC029_LockWithpadlock() {
		test.cngzProductDevlopment.LockWithpadlock();
	}

	/**
	 * TC 030 select and handover optionk.
	 */
	@Test(dependsOnMethods = "TC029_LockWithpadlock")
	public void TC030_SelectAndHandoverOptionk() {
		test.cngzProductDevlopment.SelectAndHandoverOption();
	}

	/**
	 * TC 031 hand over publish.
	 */
	@Test(dependsOnMethods = "TC030_SelectAndHandoverOptionk")
	public void TC031_HandOverPublish() {
		test.cngzProductDevlopment.HandOverPublish();
	}

	/**
	 * TC 032 option create option HOPLUN extra line.
	 */
	@Test(dependsOnMethods = "TC031_HandOverPublish")
	public void TC032_Option_CreateOptionHOPLUNExtraLine() {
		test.cngzProductDevlopment.addOptionsExtraLine();
	}

	/**
	 * TC 033 edit details add information and save.
	 */
	@Test(dependsOnMethods = "TC032_Option_CreateOptionHOPLUNExtraLine")
	public void TC033_editDetailsAddInformationAndSave() {
		test.cngzProductDevlopment.editDetailsAddInformationAndSave(getYamlValue("CNGZMerchant.options.country"));
	}

	/**
	 * TC 034 add BOM.
	 */
	@Test(dependsOnMethods = "TC033_editDetailsAddInformationAndSave")
	public void TC034_addBOM() {
		test.cngzProductDevlopment.addBOMCNGZ(getYamlValue("CNGZMerchant.BOM.placement"),
				getYamlValue("CNGZMerchant.BOM.OriginCountry"));
	}

	/**
	 * TC 035 add cost.
	 */
	@Test(dependsOnMethods = "TC034_addBOM")
	public void TC035_addCost() {
		// test.cngzProductDevlopment.addCost();
		test.cngzProductDevlopment.addCost(getYamlValue("CNGZMerchant.HopLundExtraliningOption.Material"),
				getYamlValue("CNGZMerchant.HopLundExtraliningOption.Trim"),
				getYamlValue("CNGZMerchant.HopLundExtraliningOption.Labour"),
				getYamlValue("CNGZMerchant.HopLundExtraliningOption.Finishing"),
				getYamlValue("CNGZMerchant.HopLundExtraliningOption.Labels"),
				getYamlValue("CNGZMerchant.HopLundExtraliningOption.Overhead"));
	}

	/**
	 * TC 036 lock withpadlock.
	 */
	@Test(dependsOnMethods = "TC035_addCost")
	public void TC036_LockWithpadlock() {
		test.cngzProductDevlopment.LockWithpadlock();
	}

	/**
	 * TC 037 select and handover optionk.
	 */
	@Test(dependsOnMethods = "TC036_LockWithpadlock")
	public void TC037_SelectAndHandoverOptionk() {
		test.cngzProductDevlopment.SelectAndHandoverOptionExtraLine();
	}

	/**
	 * TC 038 hand over publish.
	 */
	@Test(dependsOnMethods = "TC037_SelectAndHandoverOptionk")
	public void TC038_HandOverPublish() {
		test.cngzProductDevlopment.HandOverPublishExtraLine();
	}

	// *******************************************
	/**
	 * TC 039 1 option create option CRYSTALMARTIN regular line.
	 */
	@Test(dependsOnMethods = "TC038_HandOverPublish")
	public void TC039_1_Option_CreateOptionCRYSTALMARTINRegularLine() {
		test.cngzProductDevlopment.addOptionsCRYSTALSupplier();
	}

	/**
	 * TC 039 2 edit details add information and save.
	 */
	@Test(dependsOnMethods = "TC039_1_Option_CreateOptionCRYSTALMARTINRegularLine")
	public void TC039_2_editDetailsAddInformationAndSave() {
		test.cngzProductDevlopment.editDetailsAddInformationAndSave(getYamlValue("CNGZMerchant.options.country"));
	}

	/**
	 * TC 039 2 add BOM.
	 */
	@Test(dependsOnMethods = "TC039_2_editDetailsAddInformationAndSave")
	public void TC039_2_addBOM() {
		test.cngzProductDevlopment.addBOMCNGZ(getYamlValue("CNGZMerchant.BOM.placement"),
				getYamlValue("CNGZMerchant.BOM.OriginCountry"));
	}

	/**
	 * TC 039 3 add cost.
	 */
	@Test(dependsOnMethods = "TC039_2_addBOM")
	public void TC039_3_addCost() {
		// test.cngzProductDevlopment.addCost();
		test.cngzProductDevlopment.addCost(getYamlValue("CNGZMerchant.CrystalMartinliningOption.Material"),
				getYamlValue("CNGZMerchant.CrystalMartinliningOption.Trim"),
				getYamlValue("CNGZMerchant.CrystalMartinliningOption.Labour"),
				getYamlValue("CNGZMerchant.CrystalMartinliningOption.Finishing"),
				getYamlValue("CNGZMerchant.CrystalMartinliningOption.Labels"),
				getYamlValue("CNGZMerchant.CrystalMartinliningOption.Overhead"));
	}

	/**
	 * TC 039 4 lock withpadlock.
	 */
	@Test(dependsOnMethods = "TC039_3_addCost")
	public void TC039_4_LockWithpadlock() {
		test.cngzProductDevlopment.LockWithpadlockQutioned();
	}

	/**
	 * TC 039 5 select and handover optionk.
	 */
	@Test(dependsOnMethods = "TC039_4_LockWithpadlock")
	public void TC039_5_SelectAndHandoverOptionk() {
		test.cngzProductDevlopment.SelectAndHandoverOptionCRYSTALLineSupplier();
	}

	/**
	 * TC 039 6 hand over publish.
	 */
	@Test(dependsOnMethods = "TC039_5_SelectAndHandoverOptionk")
	public void TC039_6_HandOverPublish() {
		test.cngzProductDevlopment.HandOverPublishCRYSTALLineSupplier();
	}

	// *******************************************
	/**
	 * TC 039 option create option CRYSTALMARTIN regular line.
	 */
	@Test(dependsOnMethods = "TC039_6_HandOverPublish")
	public void TC039_Option_CreateOptionCRYSTALMARTINRegularLine() {
		test.cngzProductDevlopment.addOptionsExtraLineSupplier();
	}

	/**
	 * TC 040 edit details add information and save.
	 */
	@Test(dependsOnMethods = "TC039_Option_CreateOptionCRYSTALMARTINRegularLine")
	public void TC040_editDetailsAddInformationAndSave() {
		test.cngzProductDevlopment.editDetailsAddInformationAndSave(getYamlValue("CNGZMerchant.options.country"));
	}

	/**
	 * TC 041 add BOM.
	 */
	@Test(dependsOnMethods = "TC040_editDetailsAddInformationAndSave")
	public void TC041_addBOM() {
		test.cngzProductDevlopment.addBOMCNGZ(getYamlValue("CNGZMerchant.BOM.placement"),
				getYamlValue("CNGZMerchant.BOM.OriginCountry"));
	}

	/**
	 * TC 042 add cost.
	 */
	@Test(dependsOnMethods = "TC041_addBOM")
	public void TC042_addCost() {
		test.cngzProductDevlopment.addCost(getYamlValue("CNGZMerchant.CrystalMartinRegularliningOption.Material"),
				getYamlValue("CNGZMerchant.CrystalMartinRegularliningOption.Trim"),
				getYamlValue("CNGZMerchant.CrystalMartinRegularliningOption.Labour"),
				getYamlValue("CNGZMerchant.CrystalMartinRegularliningOption.Finishing"),
				getYamlValue("CNGZMerchant.CrystalMartinRegularliningOption.Labels"),
				getYamlValue("CNGZMerchant.CrystalMartinRegularliningOption.Overhead"));
	}

	/**
	 * TC 043 lock withpadlock.
	 */
	@Test(dependsOnMethods = "TC042_addCost")
	public void TC043_LockWithpadlock() {
		test.cngzProductDevlopment.LockWithpadlockQutioned();
	}

	/**
	 * TC 044 select and handover optionk.
	 */
	@Test(dependsOnMethods = "TC043_LockWithpadlock")
	public void TC044_SelectAndHandoverOptionk() {
		test.cngzProductDevlopment.SelectAndHandoverOptionExtraLineSupplier();
	}

	/**
	 * TC 045 hand over publish.
	 */
	@Test(dependsOnMethods = "TC044_SelectAndHandoverOptionk")
	public void TC045_HandOverPublish() {
		test.cngzProductDevlopment.HandOverPublishExtraLineSupplier();
	}

	/**
	 * TC 046 search product ID.
	 */
	@Test(dependsOnMethods = "TC045_HandOverPublish")
	public void TC046_SearchProductID() {
		test.closeBrowserSession();
		test = new TestSessionInitiator(System.getProperty("datafile", "dataFile"));
		test.launchUrl(getYamlValue("castorUrl"));
		test.castorHome.loginToCastor(getYamlValue("loginInfo.GPOO.username"), getYamlValue("loginInfo.GPOO.password"));
		test.castorHome.performProductIDSearch(this.productID, "GPOO");
	}

	/**
	 * TC 047 cngz handover hop lun.
	 */
	@Test(dependsOnMethods = "TC046_SearchProductID")
	public void TC047_cngzHandoverHopLun() {
		test.cngzProductDevlopment.cngzHandoverHopLun();
	}

	/**
	 * TC 048 cngz handover CRYSTALMARTIN.
	 */
	@Test(dependsOnMethods = "TC047_cngzHandoverHopLun")
	public void TC048_cngzHandoverCRYSTALMARTIN() {
		test.cngzProductDevlopment.cngzHandoverCRYSTALMARTIN();
	}

	/**
	 * TC 049 search product ID.
	 */
	@Test(dependsOnMethods = "TC048_cngzHandoverCRYSTALMARTIN")
	public void TC049_SearchProductID() {
		test.closeBrowserSession();
		test = new TestSessionInitiator(System.getProperty("datafile", "dataFile"));
		test.launchUrl(getYamlValue("castorUrl"));
		test.castorHome.loginToCastor(getYamlValue("loginInfo.castorBuyer.username"),
				getYamlValue("loginInfo.castorBuyer.password"));
		test.castorHome.performProductIDSearch(this.productID, null);
	}

	/**
	 * TC 050 sebo handover RTO.
	 */
	@Test(dependsOnMethods = "TC049_SearchProductID")
	public void TC050_seboHandoverRTO() {
		test.cngzProductDevlopment.seboHandoverRTO();
	}

	/**
	 * TC 051 search product ID.
	 */
	@Test(dependsOnMethods = "TC050_seboHandoverRTO")
	public void TC051_SearchProductID() {
		test.closeBrowserSession();
		test = new TestSessionInitiator(System.getProperty("datafile", "dataFile"));
		test.launchUrl(getYamlValue("castorUrl"));
		test.castorHome.loginToCastor(getYamlValue("loginInfo.GPOO.username"), getYamlValue("loginInfo.GPOO.password"));
		test.castorHome.performProductIDSearch(this.productID, "GPOO");
	}

	/**
	 * TC 052 gpoo handover RTO.
	 */
	@Test(dependsOnMethods = "TC051_SearchProductID")
	public void TC052_gpooHandoverRTO() {
		test.cngzProductDevlopment.gpooHandoverRTO();
	}

	/**
	 * TC 053 search product ID.
	 */
	@Test(dependsOnMethods = "TC052_gpooHandoverRTO")
	public void TC053_SearchProductID() {
		test.closeBrowserSession();
		test = new TestSessionInitiator(System.getProperty("datafile", "dataFile"));
		test.launchUrl(getYamlValue("castorUrl"));
		test.castorHome.loginToCastor(getYamlValue("loginInfo.CNGZ.username"), getYamlValue("loginInfo.CNGZ.password"));
		test.castorHome.performProductIDSearch(this.productID, "CNGZ");
	}

	/**
	 * TC 054 sample register sample.
	 */
	@Test(dependsOnMethods = "TC053_SearchProductID")
	public void TC054_SampleRegister_sample() {
		test.cngzSample.sampleRegister_sample();
	}

	/**
	 * TC 055 send order sample.
	 */
	@Test(dependsOnMethods = "TC054_SampleRegister_sample")
	public void TC055_SendOrderSample() {
		test.cngzSample.sendOrderSample();
	}

	/**
	 * TC 056 sample register.
	 */
	@Test(dependsOnMethods = "TC055_SendOrderSample")
	public void TC056_SampleRegister() {
		test.cngzSample.sampleRegister("HOP LUN (HK) LTD");
	}

	/**
	 * TC 057 click on sample link and enter measurement and fit report.
	 */
	@Test(dependsOnMethods = "TC056_SampleRegister")
	public void TC057_clickOnSampleLinkAndEnterMeasurementAndFitReport() {
		test.cngzSample.clickOnSampleLinkAndEnterMeasurementAndFitReport();
	}

	/**
	 * TC 058 click on sample link and enter measurement and fit report.
	 */
	@Test(dependsOnMethods = "TC057_clickOnSampleLinkAndEnterMeasurementAndFitReport")
	public void TC058_clickOnSampleLinkAndEnterMeasurementAndFitReport() {
		test.cngzSample.chooseHandoverTillGPOOMerch();
	}

	/**
	 * TC 059 search product ID.
	 */
	@Test(dependsOnMethods = "TC058_clickOnSampleLinkAndEnterMeasurementAndFitReport")
	public void TC059_SearchProductID() {
		test.castorHome.syncPage();
		test.closeBrowserSession();
		test = new TestSessionInitiator(System.getProperty("datafile", "dataFile"));
		test.launchUrl(getYamlValue("castorUrl"));
		test.castorHome.loginToCastor(getYamlValue("loginInfo.GPOO.username"), getYamlValue("loginInfo.GPOO.password"));
		test.castorHome.performProductIDSearch(this.productID, "GPOO");
	}

	/**
	 * TC 060 edit sample from GPOO.
	 */
	@Test(dependsOnMethods = "TC059_SearchProductID")
	public void TC060_editSampleFromGPOO() {
		test.cngzSample.editSampleFromGPOO();
	}

	/**
	 * TC 061 handover to SEBO.
	 */
	@Test(dependsOnMethods = "TC060_editSampleFromGPOO")
	public void TC061_handoverToSEBO() {
		test.cngzSample.handoverToSEBO();
	}

	/**
	 * Inits the.
	 */
	@BeforeMethod
	public void init() {
		System.out.println("\n\n__________________________________________________________________________");
	}

	/**
	 * Capture screen shot on failure.
	 * 
	 * @param result
	 *            the result
	 */
	@AfterMethod
	public void captureScreenShotOnFailure(ITestResult result) {
		System.out.println("******************************************************");
		System.out.println("Test Name: " + result.getName());
		if (!result.isSuccess()) {
			System.out.println("Test Result: FAIL");
			if (getYamlValue("selenium.server").equalsIgnoreCase("remote")) {
				test.takeScreenshotOfFailure(result);
			} else {
				test.takeScreenshotOfFailureFromLocalMachine(result);
			}
		} else {
			System.out.println("Test Result: PASS");
		}
		System.out.println("******************************************************");
		System.out.println("__________________________________________________________________________");
	}

	/**
	 * Tear down class.
	 * 
	 * @throws Exception
	 *             the exception
	 */
	@AfterClass
	public void tearDownClass() throws Exception {
		test.closeBrowserSession();
		System.out.println("###############################################################################");
		System.out.println("############################################################################### \n\n");
	}
}
