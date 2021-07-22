package org.testexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo_Row_Data {
//Row Data
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ranjithrekha\\eclipse-workspace-new\\DemoProjectMaven\\DataExcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		Row row = sheetAt.getRow(1);

		int cellsize = row.getPhysicalNumberOfCells();

		for (int i = 0; i < cellsize; i++) {

			Cell cell = row.getCell(i);

			CellType cellType = cell.getCellType();

			if (cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);

			} else if (cellType.equals(cellType.NUMERIC)) {
				double numeric = cell.getNumericCellValue();
				int value = (int) numeric;
				System.out.println(value);

			}

		}

	}

}
