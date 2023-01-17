package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.*;
public class CrossBrowerTesting {
	
	public WebDriver driver;
	  
	@Test  
	@Parameters("browser")
	
	 public void fblogin(String browser) {
	
	  // Passing Browser parameter from TestNG xml

	  // If the browser is Firefox, then do this

	  if(browser.equalsIgnoreCase("gecko")) {
		 
	//Initializing the firefox driver (Gecko)
		  driver = new FirefoxDriver();  

	  }else if (browser.equalsIgnoreCase("chrome")) { 

		  //Initialize the chrome driver

		  driver = new ChromeDriver();

	  } else if(browser.equalsIgnoreCase("edge")){
		  
		  
		  driver=new EdgeDriver();
	  }

	  // Enter the website address in the browser

	  driver.get("https://www.facebook.com/login"); 

	  // Once Before method is completed, Test method will start

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		

			driver.quit();

		}

}
