package Praticepograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Twitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		String url = driver.getCurrentUrl();
		System.out.println("https://twitter.com/");
		driver.navigate();
		System.out.println("navigate");
		driver.getWindowHandle();
		System.out.println("WindowHandle");
		driver.quit();
	}

}
