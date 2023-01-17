package Praticepograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	
	public static void main(String[] args) {
		
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	  driver.manage().window().maximize();
	 WebElement element = driver.findElement(By.id("sex-0"));
	 boolean isselected = element.isSelected();
	 
	 if(isselected==false) {
		 
		 element.click();
	 }
	}

}
