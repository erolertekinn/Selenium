package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_02 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//driver.findElement(By.linkText("Forgot username?")).click();
		driver.findElement(By.partialLinkText("Forgot userna")).click();
		driver.findElement(By.className("phone-no")).sendKeys("erolertekinn.66@gmail.com");
	}

}
