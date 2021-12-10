package launchChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelDemoMain {
	
public static void main(String args[]) throws InterruptedException
{
	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(5000);
		System.out.println("Browser launched");

		System.out.println("Google opened");
		driver.get("http://www.google.com");
//		driver.get("www.google.com");
		Thread.sleep(3000);
		System.out.println("Google opened");
		driver.close();
	}
}
