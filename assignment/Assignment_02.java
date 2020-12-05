package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_02 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com");

		// One way radio button click
		driver.findElement(By.xpath("//*[@id='OneWay']")).click();
		// Round trip radio button click
		driver.findElement(By.xpath("//*[@id='RoundTrip']")).click();
		// One way radio button click
		driver.findElement(By.xpath("//*[@id='OneWay']")).click();

		driver.findElement(By.cssSelector("div[class='col col11'] dl dd div input")).click();

		driver.findElement(By.cssSelector("a[class=\"ui-state-default ui-state-highlight ui-state-active \"]")).click();
		;
		// CssSelector'da [] parantez kullanmak yerine a. a# kullanabiliriz
		// driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();

		// Select Class'i ile calisma sekli ÖNEMLI!
		// Birinci yöntem
		WebElement adult = driver.findElement(By.id("Adults"));
		Select s1 = new Select(adult);
		s1.selectByIndex(1);

		WebElement child = driver.findElement(By.id("Childrens"));
		Select s2 = new Select(child);
		s2.selectByIndex(2);

		Thread.sleep(2000);

		// Ikinci yöntem
		Select eltern = new Select(driver.findElement(By.id("Adults")));
		eltern.selectByIndex(2);

		Select kindern = new Select(driver.findElement(By.id("Childrens")));
		kindern.selectByIndex(1);

		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();

		Select classOfTravel = new Select(driver.findElement(By.id("Class")));
		classOfTravel.selectByIndex(2);
		classOfTravel.selectByValue("Business");

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");

		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}
}
