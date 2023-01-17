package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		
		
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(6000);
		Alert simpleAlert1=driver.switchTo().alert();
		simpleAlert1.dismiss();
		

	}

}
