package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_06 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		
		String valueCheckbox = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
		System.out.println(valueCheckbox);
	
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(valueCheckbox);
		
		driver.findElement(By.id("name")).sendKeys(valueCheckbox);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText = driver.switchTo().alert().getText();
		
		if(alertText.contains(valueCheckbox)) {
			System.out.println("Operation successful");
		}else {
			System.out.println("Test Failed");
		}

	}

}
