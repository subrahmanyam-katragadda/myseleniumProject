package DATADRIVEN;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoi {
	
	public static void main(String[] args) throws IOException {
		
		
		File file = new File("C:\\Users\\my pc\\eclipse-workspace\\SeleniumProject\\src\\EXCELSHEET\\FacebookLogin 1 xlsx.xlsx");
		
		FileInputStream inputstream = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		
		XSSFSheet sheet = wb.getSheet("sheet1");
		
		XSSFRow row1=sheet.getRow(0);
		
		XSSFCell cell = row1.getCell(0);
		
		XSSFRow row2=sheet.getRow(1);
		
		XSSFCell cell1 = row2.getCell(1);
		
		String address = cell.getStringCellValue();
		
		String address1 = cell1.getStringCellValue();
		
		System.out.println("Address is:"+address);
		
		System.out.println("Address is:"+address1);
		
		wb.close();
		
		
	}

}
