package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.findElement(By.id("email")).sendKeys("krishnamohankumbha@gmail.com");
		driver.findElement(By.name("fullName")).sendKeys("Mohan Krishna Kumbha");
		driver.findElement(By.name("username")).sendKeys("Mohan Krishna");
		driver.findElement(By.name("pass")).sendKeys("Krishna99");
		driver.findElement(By.name("sign up")).click();
		driver.close();

	}
}
