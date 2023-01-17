 package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeReult");
        WebElement field1= driver.findElement(By.xpath("//input[@id='field1']"));
        field1.clear();
        field1.sendKeys("Mini Is My Wife");
        Actions act = new Actions(driver);  
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
        act.doubleClick(button).perform();
        driver.close();
	}
} 