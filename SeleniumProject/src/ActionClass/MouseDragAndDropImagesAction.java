package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropImagesAction {
	
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	driver.manage().window().maximize();
	driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id=\"wrapper\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]/iframe[1]")));
	WebElement image1 = driver.findElement(By.xpath("//body/div[1]/ul[1]/li[3]/img[1]"));
	WebElement image2 = driver.findElement(By.xpath("//body/div[1]/ul[1]/li[4]/img[1]"));
	WebElement trash = driver.findElement(By.xpath("//div{@id=\"trash\"]"));
	Actions act = new Actions(driver);
	act.dragAndDrop(image2, trash).perform();
	act.dragAndDrop(image2, trash).perform();	
}
}
