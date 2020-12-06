package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Selenium Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.java.com./tr/");
		driver.manage().window().maximize();
		
		
	}
}
