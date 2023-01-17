package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Demo {
	
	WebDriver driver;
	
	@BeforeTest
	void beforeapp() {
		driver=new ChromeDriver();
	}
	
	@Test
	void fblogin() {
		
		
	      driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	 void fblogin2()
	 {
		
	      driver.get("https://www.facebook.com/");
		
	 }
	
	@AfterTest
	
	void closeapp()
	{
		driver.close();
	}

}
