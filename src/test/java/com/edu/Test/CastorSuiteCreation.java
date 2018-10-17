package com.edu.Test;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.Parameters;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.edu.Utilities.CreateColumnList;
import com.edu.Utilities.ExcelApi;
import com.edu.Utilities.readExcelXLSX;

public class CastorSuiteCreation {
	@Test
	public static void createSuiteForCastor() throws Exception {
		XmlSuite suite = new XmlSuite();
		suite.setName("Castor End TO End Suite");
		System.out.println("main");
		ExcelApi sheetDataTest = new ExcelApi("Prepp_TestData.xlsx");
		sheetDataTest.loadColums("Credentials");
		sheetDataTest.getRowCount();
		int rowCount = sheetDataTest.getRowCount();
		String[][] array = readExcelXLSX.readExcel("Prepp_TestData.xlsx");
		for (int i = 1; i < rowCount; i++) {
			XmlTest test = new XmlTest(suite);
			// ************* Test ********************
			test.setName("Castor Iteration: " + i);
			// ************* Parameters ********************
			Parameters par = new Parameters();
			for (int j = 0; j < CreateColumnList.colNames.size(); j++) {
				test.addParameter(CreateColumnList.colNames.get(j).toLowerCase(), array[i][j]);
				System.out.println(CreateColumnList.colNames.get(j) + " ++++ " + array[i][j] + "");
			}
			// ************* Class ********************
			List<XmlClass> classes = new ArrayList<XmlClass>();
			classes.add(new XmlClass("com.edu.Test.Init_CastorProductDevlopmentTest"));
			test.setXmlClasses(classes);
			// ****************************************************
		}
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites); 
		//tng.setParallel("true");  //To execute tests in parallel
		tng.setOutputDirectory("./target/test-output");
		tng.run();
	}
}
