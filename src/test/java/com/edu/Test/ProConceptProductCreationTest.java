package com.edu.Test;

import static com.edu.Utilities.YamlReader.getYamlValue;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.edu.CoreTestBase.TestSessionInitiator;
import com.edu.Lib.ProConceptLoginPageActions;

public class ProConceptProductCreationTest{
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
	String dataFile = "ProConcept_TestData.yml";

	/**
	 * Sets the up class.
	 */
	@BeforeClass
	public void setUpClass() {
		System.out.println("\n##############################################################################");
		System.out.println("################ ProConcept Test #############");
		System.out.println("###########################################################################\n\n");
		System.out.println("Test Name: ProConcept Test");
		System.setProperty("browser", "chrome");
		test = new TestSessionInitiator(System.getProperty("datafile", dataFile));			
	}
	

	/**
	 * TC 001 launch PreconceptURL.
	 */
	@Test
	public void TC001_LaunchProconceptURL()
	{
		test.launchUrl(getYamlValue("proConceptUrl"));	
		test.proConceptLogin.loginTo_Proconcept(getYamlValue("logininfo.username"),getYamlValue("logininfo.password"));
	}
	
	/**
	 * TC 002 Navigate to a products page.
	 */
	@Test(dependsOnMethods="TC001_LaunchProconceptURL")
	public void TC002_NavigateToProduct()
	{
		test.proConceptHome.navigateTo_Logistics_GoodsManagement_GoodsDevelopment_Products();
	}
	
//	/**
//	 * TC 003 create a product.
//	 */
//	@Test(dependsOnMethods="TC002_NavigateToProduct")
//	public void TC003_CreateProduct()
//	{
//		test.proConceptProduct.Create_Product();
//	}
	

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
