package loginTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demoqa.com/books");
		
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		
		home.clickLogin();
		
		login.enterUsername("krishna");
		login.enterPassword("kdshfsg");
		login.clickLogin();
		Thread.sleep(3000);

	}

}
