package selenium;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;
public class SslCertifications {

	public static void main(String[] args) {
		//SSl certificates

		//Desired capabilities=
		//general chrome profile
		//In that way the browser that you are opening is knowing what you are doing
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//like in secure sertification http
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Belows to your local browser
		ChromeOptions c= new ChromeOptions();
		//You have to add capabilities to your chrome browser
		//Invoke the chrome browser with the knowledge that ch have
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erole\\Masaüstü\\Eclipse Workspace\\Chrome-Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);

	}

}