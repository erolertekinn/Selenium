package selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Ismin bildigin belli bir cookies'i silmek istiyorsan bu stepi uygulayabilirsin
		// driver.manage().deleteCookieNamed("sessionKey");
		//driver.manage().addCookie(arg0); we are not facing that much
		WindowsUtils.killByName("excel.exe");



		// click on any link
		// login page- verify login url

		/*
		 * driver.get("http://google.com");
		 * 
		 * File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));
		 */

	}

}
