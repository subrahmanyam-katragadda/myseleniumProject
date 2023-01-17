package Praticepograms;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a name instant of the html unit driver
		// Notice that the remainder of the code relies on the interface,
		// not the implementation.
        WebDriver driver = new FirefoxDriver();
        
        // And now use this to visit Google
        driver.get("https://www.google.com/");
        
        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));
        
        // Enter something to search for
        element.sendKeys("Hello Selenium WebDriver!");
        
        // Submit the form based on an element in the form
        element.submit();
        
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
	}
}
