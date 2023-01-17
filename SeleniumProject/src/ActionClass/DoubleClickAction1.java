package ActionClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClickAction1 {
     public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		 
		 driver.manage().window().maximize();
		   
		   driver.switchTo().frame("iframeResult");
		   
		   WebElement feild1= driver.findElement(By.xpath("//input[@id='field1']"));
		   
		   feild1.clear();
		   feild1.sendKeys("Sai Devaansh Is My Son");
		   
		   Actions act = new Actions(driver);
		   
		   WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		   act.doubleClick(button).perform();

	}
}
