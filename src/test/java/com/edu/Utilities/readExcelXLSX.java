package com.edu.Utilities;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelXLSX {

	public static String[][] readExcel(String absolutePathToFile) {

		// A Two dimensional array of Strings which represents the data in the
		// sheet
		String[][] data = null;
		try {
			// A Buffered File Input Stream to read the data
			InputStream is = new BufferedInputStream(new FileInputStream(
					"src/test/resources/testdata/"+absolutePathToFile));
			// Workbook representing the excel file
			XSSFWorkbook wb = new XSSFWorkbook(is);
			// Next a sheet which represents the sheet within that excel file
			XSSFSheet sheet = wb.getSheetAt(0);
			// No of rows in the sheet
			int rowNum = sheet.getLastRowNum()+1;
			// No of columns in the sheet
			int colNum = sheet.getRow(0).getLastCellNum();
			data = new String[rowNum][colNum];
			for (int i = 0; i < rowNum; i++) {
				// Get the row
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < colNum; j++) {
					// Get the columns or cells for the first row and keep
					// looping
					// for the other rows
					XSSFCell cell = row.getCell(j);
					// Make a call to the method cellToString which actually
					// converts the cell contents to String
					String value = cellToString(cell);
					data[i][j] = value;
					// Logic for handling the data
					// You can write the logic here, or leave the method as it
					// is to return a two dimensional array
					// representing the excel data
					System.out.print(value+"	");
				}
System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;

	}

	private static String cellToString(XSSFCell cell) {

		Object result;

		 if(cell.getCellTypeEnum() == CellType.STRING)
             return cell.getStringCellValue();
         else if(cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA)
         {
         	int k = (int) cell.getNumericCellValue();
             String cellValue = String.valueOf(k);
             if(HSSFDateUtil.isCellDateFormatted(cell))
             {
                 DateFormat df = new SimpleDateFormat("dd/MM/yy");
                 Date date = cell.getDateCellValue();
                 cellValue = df.format(date);
             }
             return cellValue;
         }else 
        	 
        if(cell.getCellTypeEnum() == CellType.BLANK)
             return null;
         else
             return String.valueOf(cell.getBooleanCellValue());
		 
	}

}