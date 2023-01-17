package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Select Country = new Select(driver.findElement(By.name("country")));
		
		Country.selectByIndex(15);

	}

}
