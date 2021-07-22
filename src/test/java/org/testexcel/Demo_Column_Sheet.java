package org.testexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo_Column_Sheet {

	private static Cell cell;

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ranjithrekha\\eclipse-workspace-new\\DemoProjectMaven\\DataExcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);
		int rowSize = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < rowSize; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell2 = row.getCell(2);
			System.out.println(cell2);

		}

	}

}
