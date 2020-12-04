package selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masa�st�\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Actions a = new Actions(driver);
		//WebElementi bir degisken tipi sag taraftaki List b�l�m�n� buldu 27 satirda orayi mause s�r�yerek acti
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		//Arama b�l�m�ne hello yazdi onu b�y�k harflerle yazdi click in klavyedeki benzeri keydown sonra
		//doubleclickle onu karaladi
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().
		keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//1.
		//a.moveToElement(move).build().perform();
		//2.
		//contextClick sag klick demektir. List b�l�m�ne geldi sag mause yapti ve aksiyona gecti
		a.moveToElement(move).contextClick().build().perform();


	}

}


/*
    System.out.println(driver.getTitle());
*/