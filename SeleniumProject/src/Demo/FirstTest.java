package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.crome.driver", "D:\\selenium\\browsers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com//");
		driver.get("https://www.office.com///");
		driver.close();

	}

}
