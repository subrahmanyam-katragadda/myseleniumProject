package Praticepograms;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("\"https://demoqa.com/alerts\"");
        driver.manage().window().maximize();	
        driver.findElement(By.id("rdbIdSciWithMathsYes")).click();
        Alert simplAlert = driver.switchTo().alert();
        simplAlert.accept();
	}

}