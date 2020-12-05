package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_General {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='login_info']")).getText();
		System.out.println(text);
		
		//Assert.assertEquals(text, "Welcome, Tester!");
		Assert.assertTrue(text.contains("Welcome, Tester!"), "String doesn't exist.");
		
		
		driver.findElement(By.xpath("//a[@href='Default.aspx']")).click();
		
		int rowCount = driver.findElements(By.xpath("//table[id='ctl00_MainContent_orderGrid']/tbody/tr")).size();
		System.out.println(rowCount);
		
		driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();

		Select s = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
		s.selectByVisibleText("ScreenSaver");
		
		WebElement wb = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='12';", wb);
		jse.executeScript("document.getElementById('ctl00_MainContent_fmwOrder_txtUnitPrice').value='40';");
		jse.executeScript("document.getElementById('ctl00_MainContent_fmwOrder_txtDiscount').value='25';");
		//driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
		
		
		//driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(""+12);
		//driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys(""+40);
		//driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).sendKeys(""+25);
		//driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal")).sendKeys("200");
		
		
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Ali Yilmaz");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("Ankara Blvd.");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("Washington");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Seattle");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("98105");
		
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("1423142356788927");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("08/27");
		
		//driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
	}
}
