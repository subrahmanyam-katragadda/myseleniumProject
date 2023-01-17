package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropAction {
	public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	  driver.manage().window().maximize();
	  WebElement madrid = driver.findElement(By.id("box7"));
	  WebElement norway = driver.findElement(By.id("box101"));
	  Actions act = new Actions(driver);
	  act.dragAndDrop(madrid, norway).perform();  
	}

}
