package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_07 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int rowCount = driver.findElement(By.xpath("//table[@id='product']")).findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		
		System.out.println(rowCount);
		
		int columnCount = driver.findElement(By.xpath("//table[@id='product']")).findElements(By.xpath("//table[@id='product']/tbody/tr[2]/td")).size();
		
		System.out.println(columnCount);
		
		for (int i = 0; i < columnCount; i++) {
			String text = driver.findElement(By.xpath("//table[@id='product']")).findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")).get(i).getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
