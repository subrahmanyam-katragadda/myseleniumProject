package Praticepograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        String url = driver.getCurrentUrl();
		System.err.println(url);
		String Title = driver.getTitle();
		System.out.println(Title);
		String Source = driver.getPageSource();
		System.out.println(Source);
		driver.quit();
	}
}