package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
// xpath'de parent'dan child'a giderken araya / koyuyoruz	
		List<WebElement> a= driver.findElements(By.xpath("//div[@id='checkbox-example']/fieldset/label"));
//css'de parent'dan child'a giderken araya bosluk koyuyoruz		
		List<WebElement> b= driver.findElements(By.cssSelector("div[id='checkbox-example'] label"));
		System.out.println(a.size());
		System.out.println(b.size());
	}

}
