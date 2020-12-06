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

public class FluentWaitTest {
	// Waiting 30 seconds for an element to be present on the page, checking
	// for its presence once every 5 seconds.
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masa�st�\\Eclipse Workspace\\Selenium Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com//dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		
//Ekrana Hello world yazisinin gelmesi vakit aldigi icin her 3 saniyede bir kontrol et hata atma bunu 30 saniye boyunca 10 defa tekrar et
//Bu �zelliklere sahip wait nesnesi olustur.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

//Bu nesneyi driver`in g�sterdigi internet sayfasina uygula.
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if (driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
				} else {
					return null;
				}
			}
		});
//Ekrana geldimi True False
//Ekrana geleni yazdir.
		//System.out.println(driver.findElement(By.id("[id='finish'] h4")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}

}