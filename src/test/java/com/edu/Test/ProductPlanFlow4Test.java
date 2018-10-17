package com.edu.Test;

import static com.edu.Utilities.YamlReader.getYamlValue;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.edu.CoreTestBase.TestSessionInitiator;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductPlanFlow4Test.
 */
public class ProductPlanFlow4Test {
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

	/**
	 * Sets the up class.
	 */
	@BeforeClass
	public void setUpClass() {
		System.out.println("\n##############################################################################");
		System.out.println("################ ProductPlan Product Devlopment Test #############");
		System.out.println("###########################################################################\n\n");
		System.out.println("Test Name: setUpClass");
		System.setProperty("browser", "chrome");
		test = new TestSessionInitiator(System.getProperty("datafile", "EDU_TestData.yml"));
	}

	/**
	 * TC 001 launch pre plan.
	 */
	@Test
	public void TC001_LaunchPrePlan() {
		test.launchUrl(getYamlValue("preplanUrl"));
	}

	/**
	 * TC 002 create sales product.
	 */
	@Test(dependsOnMethods = "TC001_LaunchPrePlan")
	public void TC002_CreateSalesProduct() {
		test.productPlan.CreateSalesProduct(getYamlValue("ProductInfoFlow4.section"),
				getYamlValue("ProductInfoFlow1.department"), getYamlValue("ProductInfoFlow4.season"),
				getYamlValue("ProductInfoFlow4.product"), getYamlValue("ProductInfoFlow4.sellprice"));
	}

	/**
	 * TC 003 add product classification.
	 */
	@Test(dependsOnMethods = "TC002_CreateSalesProduct")
	public void TC003_AddProductClassification() {
		test.productPlan.AddProductClassification(getYamlValue("ProductInfoFlow4.productclassification"));
	}

	/**
	 * TC 004 add articles.
	 */
	@Test(dependsOnMethods = "TC003_AddProductClassification")
	public void TC004_AddArticles() {
		test.productPlan.AddArticles(getYamlValue("ProductInfoFlow4.article1"),
				getYamlValue("ProductInfoFlow4.article2"));
	}

	/**
	 * TC 005 add graphical appearance.
	 */
	@Test(dependsOnMethods = "TC004_AddArticles")
	public void TC005_AddGraphicalAppearance() {
		test.productPlan.AddGraphicalAppearance(getYamlValue("ProductInfoFlow4.article1"),
				getYamlValue("ProductInfoFlow4.graphicalappearance"));
	}

	/**
	 * TC 006 add IS ws.
	 */
	@Test(dependsOnMethods = "TC005_AddGraphicalAppearance")
	public void TC006_AddISWs() {
		test.productPlan.AddISWs(getYamlValue("ProductInfoFlow4.weekno1"), getYamlValue("ProductInfoFlow4.weekno2"));
	}

	/**
	 * TC 007 add article type.
	 */
	@Test(dependsOnMethods = "TC006_AddISWs")
	public void TC007_AddArticleType() {
		test.productPlan.AddArticleType(getYamlValue("ProductInfoFlow4.article1"),
				getYamlValue("ProductInfoFlow4.salestype"));
	}

	/**
	 * TC 008 add FM.
	 */
	@Test(dependsOnMethods = "TC007_AddArticleType")
	public void TC008_AddFM() {
		test.productPlan.AddFM(getYamlValue("ProductInfoFlow4.article1"), getYamlValue("ProductInfoFlow4.fmvalue"));
	}

	/**
	 * TC 009 add product details and customs customer group.
	 */
	@Test(dependsOnMethods = "TC008_AddFM")
	public void TC009_AddProductDetailsAndCustomsCustomerGroup() {
		test.productPlan.AddProductDetailsAndCustomsCustomerGroup(getYamlValue("ProductInfoFlow4.TypeOfConstruction"),
				getYamlValue("ProductInfoFlow4.CustomsCustomerGroup"));
	}

	/**
	 * TC 010 save product.
	 */
	@Test(dependsOnMethods = "TC009_AddProductDetailsAndCustomsCustomerGroup")
	public void TC010_SaveProduct() {
		test.productPlan.SaveProduct();
	}

	/**
	 * TC 011 add quantity.
	 */
	@Test(dependsOnMethods = "TC010_SaveProduct")
	public void TC011_AddQuantity() {
		test.productPlan.AddQuantity(getYamlValue("ProductInfoFlow4.ExclPMQuantity"));
	}

	/**
	 * TC 012 save product.
	 */
	@Test(dependsOnMethods = "TC011_AddQuantity")
	public void TC012_SaveProduct() {
		test.productPlan.SaveProduct();
	}

	/**
	 * TC 013 wait for article number display.
	 */
	@Test(dependsOnMethods = "TC012_SaveProduct")
	public void TC013_WaitForArticleNumberDisplay() {
		test.productPlan.WaitForArticleNumberDisplay();
	}

	/**
	 * TC 014 close order.
	 */
	@Test(dependsOnMethods = "TC013_WaitForArticleNumberDisplay")
	public void TC014_CloseOrder() {
		test.productPlan.CloseOrder();
	}

	/**
	 * TC 015 add article rough plan.
	 */
	@Test(dependsOnMethods = "TC014_CloseOrder")
	public void TC015_AddArticleRoughPlan() {
		test.productPlan.AddArticleRoughPlan(System.getProperty("productPlanProductName"),
				getYamlValue("ProductInfoFlow4.weekno2"), getYamlValue("ProductInfoFlow4.RoughPlanQuantity"));
	}

	/**
	 * TC 016 save product after adding rough plan.
	 */
	@Test(dependsOnMethods = "TC015_AddArticleRoughPlan")
	public void TC016_SaveProductAfterAddingRoughPlan() {
		test.productPlan.SaveProductAfterAddingRoughPlan(System.getProperty("productPlanProductName"));
	}

	/**
	 * TC 017 close order.
	 */
	@Test(dependsOnMethods = "TC016_SaveProductAfterAddingRoughPlan")
	public void TC017_CloseOrder() {
		test.productPlan.CloseOrder();
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
		// WindowsUtils.killByName("chromedriver.exe");
		System.out.println("###############################################################################");
		System.out.println("############################################################################### \n\n");
	}
}
