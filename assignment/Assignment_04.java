package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_04 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");

		// ilk pencere icin 1.yöntem
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		// ilk pencere icin 2.yöntem
		// driver.findElement(By.linkText("Multiple Windows")).click();

		// ikinci pencere icin
		driver.findElement(By.cssSelector("a[href*='windows']")).click();

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();

		String pIt = it.next();
		String cIt = it.next();
		
		driver.switchTo().window(cIt);
		driver.findElement(By.id()).getText();
		driver.switchTo().window(pIt);
				driver.switchTo().window(parentIt);
		// System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	}
}