package Praticepograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Throws {
	public static void main(String[] args) throws InterruptedException {
		
      WebDriver driver=new ChromeDriver();		
      
      driver.get("https://www.facebook.com/");
      
      Thread.sleep(6000);
      driver.findElement(By.id("email")).sendKeys("hdfkjdhfjd");
	}

}
