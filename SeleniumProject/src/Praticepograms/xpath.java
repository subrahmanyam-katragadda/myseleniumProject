package Praticepograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		Boolean imgFlag = driver.findElement(By.xpath("/html/body/div/header/a/img")).isDisplayed();
		System.out.println("The image is displayed: " + imgFlag);
		
		Boolean img_Flag = driver.findElement(By.xpath("//img")).isDisplayed();
		System.out.println("The image is displayed (located by //): " + img_Flag);
		
		driver.findElement(By.xpath("//input[contains(@id, 'userN')]")).sendKeys("Full Name");
		driver.findElement(By.xpath("//input[contains(@id, 'userN')]/.")).sendKeys("Full Name");
		String label = driver.findElement(By.xpath("//input[contains(@id, 'userN')]/../../div/label")).getText();
		System.out.println("The label of full text is : " + label);
		
		driver.findElement(By.xpath("//div[contains(@id, 'userName-wrapper')]/div[2]/*")).sendKeys("Full Name");
		
		driver.findElement(By.xpath("//input[@*= 'userName']")).sendKeys("Full Name");
		List<WebElement> lst = driver.findElements(By.xpath("//label[@*= 'userName-label']|//label[@*= 'userEmail-label']"));
		
		for (WebElement e : lst) {
			System.out.println(" The label is : " + e.getText());
		}

		driver.get("https://www.demoqa.com/webtables");
		
		boolean lstCol = driver.findElement(By.xpath("//div[@class='rt-tr -odd']/div[last()]")).isDisplayed();
		System.out.println("The last table element is displayed : " + lstCol);

		boolean positionCol = driver.findElement(By.xpath("//div[@class='rt-tr -odd']/div[position()='2']")).isDisplayed();
		System.out.println("The 2nd table element is displayed : " + positionCol);

		
		driver.quit();
		
	}

}
