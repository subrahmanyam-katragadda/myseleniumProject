package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAction { 
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.toolsqa.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/header/nav/div/div/div[4]/a/span[2]")).click();
	Thread.sleep(3000);
	driver.close();
	
	

	}

}