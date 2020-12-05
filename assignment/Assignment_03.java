package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_03 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masa�st�\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("results"))));
	
		System.out.println(driver.findElement(By.id("results")).getText());

	}

}
