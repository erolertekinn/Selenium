package selenium;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class exercise {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");

		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/p/a")).click();
		// Before swiching we write the name of our first website
		System.out.println(driver.getTitle());

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		String parentid = it.next();

		String childid = it.next();

		driver.switchTo().window(childid);
		// After switching
		System.out.println(driver.getTitle());
		// Switching back to parent
		driver.switchTo().window(parentid);

		System.out.println(driver.getTitle());

	}

}
