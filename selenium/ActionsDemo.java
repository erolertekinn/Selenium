package selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masa�st�\\Eclipse Workspace\\Selenium Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		Actions a = new Actions(driver);
		//mause`u amazonun Account and list b�l�m�ne g�t�rerek asagi dogru icerigin tiklamadan acilmasi aksiyonu
		//Build-->hazirla Perform--->icra et
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();

	}

}
