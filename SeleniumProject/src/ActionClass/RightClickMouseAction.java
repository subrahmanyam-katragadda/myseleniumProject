package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMouseAction {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
    Actions act = new Actions(driver);
   // act.contextClick(button).perform();
}
}