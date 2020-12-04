package seleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_02 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.get("https://www.yahoo.com");
		System.out.println(driver.getTitle());		
		
//Eski sayfaya yani Google'a geri döner
		driver.navigate().back();
		System.out.println(driver.getTitle());
//Yahoo'ya tekrar gecti		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
//Facebook'a gecti
		driver.navigate().to("http://facebook.com");
		System.out.println(driver.getTitle());
		
//Close ve Quit arasinda cok kücük bir fark vardir Current - All farki
		driver.close();
		//driver.quit();
	}
}
