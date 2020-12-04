
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_08 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		
		WebDriverWait w= new WebDriverWait(driver,5);
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("autocomplete"))));
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);		
		
		  // System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String script = "return document.getElementById(\"autocomplete\").value;";
		
		String text = (String) js.executeScript(script);
		
		int i = 0;
		
		while (!text.equalsIgnoreCase("INDIA")) {
			i++;
			System.out.println(i);
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i > 10) {
				break;
			}

		}

		if (i > 10) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element  found");
		}

	}

}