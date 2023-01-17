package DATADRIVEN;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\my pc\\eclipse-workspace\\SeleniumProject\\src\\EXCELSHEET\\FacebookLogin 1 xlsx.xlsx");
		
		FileInputStream inputstream = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		
		XSSFSheet sheet = wb.getSheet("sheet1");
		
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement username = driver.findElement(By.id("email"));
		
		WebElement password = driver.findElement(By.id("pass"));
		
		WebElement loginbttn = driver.findElement(By.id("loginbutton"));
		
		for(int i=1;i<=rowCount;i++) {
			
			username.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			
			password.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
			
			loginbttn.click();
			
			WebElement conformationmessage= driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]/a"));
			
			XSSFCell cell = sheet.getRow(i).createCell(5);
			
			 if (conformationmessage.isDisplayed()) {
	                // if the message is displayed , write PASS in the excel sheet
	                cell.setCellValue("PASS");
	                
	            } else {
	                //if the message is not displayed , write FAIL in the excel sheet
	                cell.setCellValue("FAIL");
	            }
			 FileOutputStream outputStream = new FileOutputStream("C:\\Users\\my pc\\eclipse-workspace\\SeleniumProject\\src\\EXCELSHEET\\FacebookLogin 1 xlsx.xlsx");
	            wb.write(outputStream);
	            
	            wb.close();
	            
	            driver.quit();
			 
		}

		
		
		
		
		
		
	}

}
