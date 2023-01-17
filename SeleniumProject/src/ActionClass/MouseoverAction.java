package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverAction {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().minimize();
	driver.get("https://demo.opencart.com");
	WebElement desktopmenu = driver.findElement(By.xpath("//body/main[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
	WebElement iPhone = driver.findElement(By.xpath("//a[contains(text(),'iPhone (1)')]"));
	Actions act = new Actions(driver);
	act.moveToElement(iPhone).moveToElement(iPhone).click().perform();	
}
}
