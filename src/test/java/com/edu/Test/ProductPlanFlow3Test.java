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
 * The Class ProductPlanFlow3Test.
 */
public class ProductPlanFlow3Test {
	
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
	public void TC001_LaunchPrePlan()
	{
		test.launchUrl(getYamlValue("preplanUrl"));
	}
	
	/**
	 * TC 002 create sales product.
	 */
	@Test(dependsOnMethods="TC001_LaunchPrePlan")
	public void TC002_CreateSalesProduct()
	{
		test.productPlan.CreateSalesProduct(getYamlValue("ProductInfoFlow3.section"),getYamlValue("ProductInfoFlow1.department"),getYamlValue("ProductInfoFlow3.season"),getYamlValue("ProductInfoFlow3.product"),getYamlValue("ProductInfoFlow3.sellprice"));
	}
	
	/**
	 * TC 003 add product classification.
	 */
	@Test(dependsOnMethods="TC002_CreateSalesProduct")
	public void TC003_AddProductClassification()
	{
		test.productPlan.AddProductClassification(getYamlValue("ProductInfoFlow3.productclassification"));
	}
	
	/**
	 * TC 004 add articles.
	 */
	@Test(dependsOnMethods="TC003_AddProductClassification")
	public void TC004_AddArticles()
	{
		test.productPlan.AddArticles(getYamlValue("ProductInfoFlow3.article1"),getYamlValue("ProductInfoFlow3.article2"));
	}
	
	/**
	 * TC 005 add graphical appearance.
	 */
	@Test(dependsOnMethods="TC004_AddArticles")
	public void TC005_AddGraphicalAppearance()
	{
		test.productPlan.AddGraphicalAppearance(getYamlValue("ProductInfoFlow3.article1"),getYamlValue("ProductInfoFlow3.graphicalappearance"));
	}
	
	/**
	 * TC 006 add IS ws.
	 */
	@Test(dependsOnMethods="TC005_AddGraphicalAppearance")
	public void TC006_AddISWs()
	{
		test.productPlan.AddISWs(getYamlValue("ProductInfoFlow3.weekno1"),getYamlValue("ProductInfoFlow3.weekno2"));
	}
	
	/**
	 * TC 007 add article type.
	 */
	@Test(dependsOnMethods="TC006_AddISWs")
	public void TC007_AddArticleType()
	{
		test.productPlan.AddArticleType(getYamlValue("ProductInfoFlow3.article1"),getYamlValue("ProductInfoFlow3.salestype"));
	}
	
	/**
	 * TC 008 add FM.
	 */
	@Test(dependsOnMethods="TC007_AddArticleType")
	public void TC008_AddFM()
	{
		test.productPlan.AddFM(getYamlValue("ProductInfoFlow3.article1"),getYamlValue("ProductInfoFlow3.fmvalue"));
	}
	
	/**
	 * TC 009 add product details and customs customer group.
	 */
	@Test(dependsOnMethods="TC008_AddFM")
	public void TC009_AddProductDetailsAndCustomsCustomerGroup()
	{
		test.productPlan.AddProductDetailsAndCustomsCustomerGroup(getYamlValue("ProductInfoFlow3.TypeOfConstruction"),getYamlValue("ProductInfoFlow3.CustomsCustomerGroup"));
	}
	
	/**
	 * TC 010 save product.
	 */
	@Test(dependsOnMethods="TC009_AddProductDetailsAndCustomsCustomerGroup")
	public void TC010_SaveProduct()
	{
		test.productPlan.SaveProduct();
	}
	
	/**
	 * TC 011 wait for article number display.
	 */
	@Test(dependsOnMethods="TC010_SaveProduct")
	public void TC011_WaitForArticleNumberDisplay()
	{
		test.productPlan.WaitForArticleNumberDisplay();
	}
	
	/**
	 * TC 012 close order.
	 */
	@Test(dependsOnMethods="TC011_WaitForArticleNumberDisplay")
	public void TC012_CloseOrder()
	{
		test.productPlan.CloseOrder();
	}
	
	/**
	 * TC 013 add article rough plan.
	 */
	@Test(dependsOnMethods="TC012_CloseOrder")
	public void TC013_AddArticleRoughPlan()
	{
		test.productPlan.AddArticleRoughPlan(System.getProperty("productPlanProductName"), getYamlValue("ProductInfoFlow3.weekno1"), getYamlValue("ProductInfoFlow3.weekno2"), getYamlValue("ProductInfoFlow3.RoughPlanQuantity1"),getYamlValue("ProductInfoFlow3.RoughPlanQuantity2"));
	}
	
	/**
	 * TC 014 save product after adding rough plan.
	 */
	@Test(dependsOnMethods="TC013_AddArticleRoughPlan")
	public void TC014_SaveProductAfterAddingRoughPlan()
	{
		test.productPlan.SaveProductAfterAddingRoughPlan(System.getProperty("productPlanProductName"));
	}
	
	/**
	 * TC 015 close order.
	 */
	@Test(dependsOnMethods="TC014_SaveProductAfterAddingRoughPlan")
	public void TC015_CloseOrder()
	{
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
	public void tearDownClass() throws Exception 
	{
		test.closeBrowserSession();
		//WindowsUtils.killByName("chromedriver.exe");
		System.out.println("###############################################################################");
		System.out.println("############################################################################### \n\n");
	}
}

