package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Tisting1 {
	WebDriver driver;
	
	@Test
	void instagram() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/maps");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[5]/div/div/div/div[1]/div/div/div/div/div[5]/div[2]/div[7]/button/span/span[1]"));
		Thread.sleep(6000);
	}
 
	@Test
	
	@AfterClass
	void instagram1() {
		
		driver = new ChromeDriver();
		
	}
	
	@BeforeGroups
	void maps()
	{
		driver.get("https://www.google.com/maps");
			
	}
	
	@Test
	void mapsclose() 
	{
		driver.get("https://www.google.com/maps");
		
	}
		
}
