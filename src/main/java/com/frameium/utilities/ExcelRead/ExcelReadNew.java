package com.frameium.utilities.ExcelRead;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ExcelReadNew {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	private static Properties property;
	public static Map map;
	public static String strDeviceName = null;
	public static String strDeviceUDID = null;
	public static int intRow = 0;
	public static Map mapDevice;
	public static Map mapdata;

	public static void setExcelFile(String Path,String SheetName) throws Exception {
	try {
	// Open the Excel file
	FileInputStream ExcelFile = new FileInputStream(Path);
	// Access the required test data sheet
	ExcelWBook = new XSSFWorkbook(ExcelFile);
	ExcelWSheet = ExcelWBook.getSheet(SheetName);
	} catch (Exception e){
	throw (e);
	}
	}

	public Map<String, Map<String, String>> getTestDataList(String strExcelPath, String strSheetName) {
	Map<String, Map<String, String>> testDataList = new HashMap();
	try {
	setExcelFile(strExcelPath, strSheetName);
	int colCount = ExcelWSheet.getRow(0).getPhysicalNumberOfCells();
	int rowCount = ExcelWSheet.getPhysicalNumberOfRows();
	for (int rowItr = 1; rowItr < rowCount; rowItr++) {
	String nameKey = "";
	HashMap<String, String> dataMap = new HashMap<String, String>();
	for (int colItr = 0; colItr < colCount; colItr++) {
	String headerName;
	String dataValue;
	if (ExcelWSheet.getRow(0).getCell(colItr).getCellTypeEnum() == CellType.NUMERIC) {
	headerName = String.valueOf((int)ExcelWSheet.getRow(0).getCell(colItr).getNumericCellValue());
	} else {
	headerName = ExcelWSheet.getRow(0).getCell(colItr).getStringCellValue();
	}
	XSSFCell cellObj= ExcelWSheet.getRow(rowItr).getCell(colItr);
	if (null == cellObj ) {
	dataValue = "";
	}
	else if(ExcelWSheet.getRow(rowItr).getCell(colItr).getCellTypeEnum() == CellType.NUMERIC) {
	dataValue = String.valueOf((int)ExcelWSheet.getRow(rowItr).getCell(colItr).getNumericCellValue());
	} else {
	dataValue = ExcelWSheet.getRow(rowItr).getCell(colItr).getStringCellValue();
	}
	if(colItr == 0) {
	nameKey =dataValue;
	}

	dataMap.put(headerName, dataValue);
	}
	testDataList.put(nameKey, dataMap);
	}
	} catch (Exception ex) {
	System.out.println("getTestDataList error");
	ex.printStackTrace();
	}
	return testDataList;



	}




//	********main*******
//	@Test
//	public void test() throws Throwable {
//
//	Map<String, Map<String, String>> testDataList = getTestDataList("D:\\Travel\\SauceDemo\\ExcelData\\TestDataInput.xlsx", "Sheet1");
//	String data = testDataList.get("Senthil").get("Number");
//
//	System.out.println("particular Info ::" +data);
//	}
}
