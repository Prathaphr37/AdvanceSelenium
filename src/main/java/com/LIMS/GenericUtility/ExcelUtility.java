package com.LIMS.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class ExcelUtility extends JavaUtility {

	/**
	 * This method is used to read data from excel
	 * 
	 * @author Prathap
	 * @param Sheetname
	 * @param RowNo
	 * @param ColNo
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromExcelFile(String Sheetname, int RowNo, int ColumnNo) throws Throwable {

		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(Sheetname);
		Row ro = sh.getRow(RowNo);
		Cell cel = ro.getCell(ColumnNo);
		String value = cel.getStringCellValue();
		return value;
	}

	/**
	 * This method is used to write data into excel
	 * 
	 * @author Prathap
	 * @param Sheetname
	 * @param RowNo
	 * @param ColumnNo
	 * @param data
	 * @throws Throwable
	 */
	public void writeDataIntoExcel(String Sheetname, int RowNo, int ColumnNo, String data) throws Throwable {

		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(Sheetname);
		Row ro = sh.getRow(RowNo);
		Cell cel = ro.getCell(ColumnNo);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(IPathConstants.ExcelPath);
		wb.write(fos);
		wb.close();
	}

	/**
	 * This method is used to get last row count
	 * 
	 * @author Prathap
	 * @param Sheetname
	 * @return
	 * @throws Throwable
	 */
	public int getLastRowNo(String Sheetname) throws Throwable {

		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(Sheetname);
		int RowCount = sh.getLastRowNum();
		return RowCount;
	}

	/**
	 * This method is used to get last col count
	 * 
	 * @author Prathap
	 * @param Sheetname
	 * @param RowNo
	 * @return
	 * @throws Throwable
	 */
	public int getLastColumnNo(String Sheetname, int RowNo) throws Throwable {

		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(Sheetname);
		Row ro = sh.getRow(RowNo);
		int ColCount = ro.getLastCellNum();
		return ColCount;
	}

	public void getList(String sheetName, WebDriver driver) throws Throwable {

		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		int colCount = sh.getRow(1).getLastCellNum();

		for (int i = 0; i < colCount; i++) {
			String key = sh.getRow(0).getCell(i).getStringCellValue();
			String value = sh.getRow(1).getCell(i).getStringCellValue();
			driver.findElement(By.name(key)).sendKeys(value);
		}
	}

	public void getListForUpdate(String sheetName, WebDriver driver) throws Throwable {

		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		int colCount = sh.getRow(1).getLastCellNum();

		for (int i = 0; i < colCount; i++) {
			String key = sh.getRow(0).getCell(i).getStringCellValue();
			String value = sh.getRow(1).getCell(i).getStringCellValue();
			Thread.sleep(1000);
			driver.findElement(By.name(key)).clear();
			Thread.sleep(1000);
			driver.findElement(By.name(key)).sendKeys(value);
		}
	}

	public Map<String, String> getList(String sheetName) throws Throwable {

		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		int colCount = sh.getRow(1).getLastCellNum();

		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < colCount; i++) {
			String key = sh.getRow(0).getCell(i).getStringCellValue();
			String value = sh.getRow(1).getCell(i).getStringCellValue();
			map.put(key, value);
		}
		return map;
	}

	public Object[][] getDataFromExcelToDataProvider(String SheetName) throws Throwable {
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(SheetName);
		int RowCount = sh.getLastRowNum() + 1;
		int ColumnCount = sh.getRow(0).getLastCellNum();

		Object[][] obj = new Object[RowCount][ColumnCount];
		for (int i = 0; i < RowCount; i++) {
			for (int j = 0; j < ColumnCount; j++) {
				obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}
	
	public Object[][] dataFromExcelToDataProvider(String SheetName) throws Throwable {
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(SheetName);
		int RowCount = sh.getLastRowNum() + 1;
		int ColumnCount = sh.getRow(0).getLastCellNum();
		Object[][] ob=new Object[RowCount][ColumnCount];
		for (int j = 0; j < ColumnCount; j++) {
			for (int i = 0; i < RowCount; i++) {
			ob[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return ob;
	}
}
