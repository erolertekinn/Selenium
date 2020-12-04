package selenium;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitTest2 {
	// Waiting 30 seconds for an element to be present on the page, checking
	// for its presence once every 5 seconds.
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		// WebDriver interface of ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com//dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		// FluentWait icin WebDriver interface`inden ChromeDriver C
		// Bu süre zarfinda nosuchElemenet Exception ile karsilasirsan ignore et.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		//
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if (driver.findElement(By.id("[id='finish'] h4")).isDisplayed()) {
					return driver.findElement(By.id("[id='finish'] h4"));
				} else {
					return null;
				}
			}
		});
		System.out.println(driver.findElement(By.id("[id='finish'] h4")).isDisplayed());
	}

}