package org.testexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo_AllData {

	public static void main(String[] args) throws IOException {
	
		File f = new File("C:\\Users\\ranjithrekha\\eclipse-workspace-new\\DemoProjectMaven\\DataExcel.xlsx");
        FileInputStream fis = new FileInputStream(f);
        Workbook w = new XSSFWorkbook(fis);
        
        Sheet sheetAt = w.getSheetAt(0);
        int rowSize = sheetAt.getPhysicalNumberOfRows();

        for (int i = 0; i < rowSize; i++) {
        	
        	Row row = sheetAt.getRow(i);
        	int cellSize = row.getPhysicalNumberOfCells();
        	for (int j = 0; j < cellSize; j++) {
        		
        		Cell cell = row.getCell(j);
        		
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

}
