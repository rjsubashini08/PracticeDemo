package launchChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorsDemo {
	

	public static WebDriver driver;
	
	@BeforeTest
	public void configureBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		Thread.sleep(5000);
		System.out.println("Browser launched");
		
	}
	
	@Test(priority=1)
	public void demoGetMethods() throws InterruptedException
	
	{
		
	driver.get("http://zero.webappsecurity.com/");
	System.out.println(" opened Application");
	//Maximize the Browser window
	driver.manage().window().maximize();
	//Get Methods
	String title=driver.getTitle();
	System.out.println("Title of the page is "+title);
	String currenturl=driver.getCurrentUrl();
	System.out.println("My current Page URL is "+currenturl);
	String ps=driver.getPageSource();
	System.out.println("Page Source is"+ps);
	//Navigate Commands
	driver.navigate().to("http://www.google.com");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	
	
	}
	
	
		
	@AfterTest
	public void closeWindow()
	{
		driver.close();
	}



}
