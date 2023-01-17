package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_3c5cde92816efb21ee3dfab6316c1859c2404c4dddc64507128869f2&mfadid=adm");
		driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		driver.navigate().back();
		driver.navigate().forward();
		
	
		String title=driver.getTitle();
		//System.out.println(driver.getTitle());
		System.out.println(title);
		
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
	    driver.quit();		
		

	}

}
