package launchChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelDemoMozilla {
	

	public static WebDriver driver;
	
	@BeforeTest
	public void configureBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(5000);
		System.out.println("Browser launched");
		
	}
	
	@Test
	public void openApplication() throws InterruptedException
	
	{
		System.out.println("Google opened");
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		System.out.println("Google opened");
		
	}
	
	@AfterTest
	public void closeApplication()
	{
		driver.close();
	}



}
