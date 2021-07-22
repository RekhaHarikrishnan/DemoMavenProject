package org.testexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoWriteData {

	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\ranjithrekha\\eclipse-workspace-new\\DemoProjectMaven\\DataExcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		
		
		Sheet createSheet = w.createSheet("DataFiles");
		Row creatRrow = createSheet.createRow(0);
		Cell createCell = creatRrow.createCell(0);
		createCell.setCellValue("UserName");
		
		//Sheet sheet = w.getSheet("DataFile");
		//Row row = sheet.getRow(0);
		//Cell createCell1 = row.createCell(1);
		//createCell1.setCellValue("Password");
		
		
		w.getSheet("DataFiles").getRow(0).createCell(1).setCellValue("Password");
		w.getSheet("DataFiles").getRow(0).createCell(2).setCellValue("ID");
		w.getSheet("DataFiles").createRow(1).createCell(0).setCellValue("Rekha");
		w.getSheet("DataFiles").getRow(1).createCell(1).setCellValue("hijk");
		w.getSheet("DataFiles").getRow(1).createCell(2).setCellValue("1234");
		w.getSheet("DataFiles").createRow(2).createCell(0).setCellValue("Vibin");
		w.getSheet("DataFiles").getRow(2).createCell(1).setCellValue("gnhj");
		w.getSheet("DataFiles").getRow(2).createCell(2).setCellValue("5697");
		
		
		
		
		
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
		
		System.out.println("Sheet Created Succesfully");
		
		
		

	}

}
