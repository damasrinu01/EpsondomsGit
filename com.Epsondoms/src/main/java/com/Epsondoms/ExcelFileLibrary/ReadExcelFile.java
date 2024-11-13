package com.Epsondoms.ExcelFileLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {

	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static Workbook wb;

	public static String readSingleData(String SheetName, int rowno, int cellno) {
		// 1. Convert the physical file into java readable file

		try {
			fis = new FileInputStream("./src/test/resources/TestData/EmpDetails.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2. create the workbook using workbookFactory

		try {
			wb = WorkbookFactory.create(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3. Using Workbook Get The sheet control

		String data = wb.getSheet(SheetName).getRow(rowno).getCell(cellno).getStringCellValue();
		return data;

		// 4.Using sheet get the row control

		// 5.using Row get the column control

	}

	public static void readMultipleData(String Sheetname) {
		// 1. Convert the physical file into java readable file

		try {
			fis = new FileInputStream("./src/test/resources/TestData/EmpDetails.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2.create workbook using wbfactory

		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {

			e.printStackTrace();
		}

		//
		int rowcount = wb.getSheet(Sheetname).getLastRowNum();
		for (int i = 1; i < rowcount; i++) {
			String data = wb.getSheet(Sheetname).getRow(i).getCell(1).getStringCellValue();
		}

	}

	public static void writeData(String SheetName, int rowno, int cellno) {

		// 1. Convert the physical file into java readable file

		try {
			fis = new FileInputStream("./src/test/resources/TestData/EmpDetails.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2. create the workbook using workbookFactory

		try {
			wb = WorkbookFactory.create(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3. Using Workbook Get The sheet control

		String data = wb.getSheet(SheetName).getRow(rowno).getCell(cellno).getStringCellValue();

		// 6.Using column get the cell-data
		wb.getSheet(SheetName).getRow(0).createCell(0).setCellValue("data we will pass");

		// 7.convert java readable file into physical file
		try {
			fos = new FileOutputStream("./src/test/resources/TestData/EmpDetails.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 8.write the data
		try {
			wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 9.close the wrokbook
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
