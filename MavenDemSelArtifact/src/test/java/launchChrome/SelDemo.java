package launchChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelDemo {
	

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
	public void openApplication() throws InterruptedException
	
	{
		System.out.println("Google opened");
//		driver.get("http://www.google.com");//Open the application
		driver.get("file:///C:/Users/r.b.ramamurthy/Downloads/UserNamePassword.html");
//		Thread.sleep(3000);
//		driver.findElement(By.name("username")).sendKeys("Sai");
//		driver.findElement(By.name("userpass")).sendKeys("Sai");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		System.out.println("Google opened");
		
	}
	
	@Test(priority=2)
	public void enterUserName() throws InterruptedException
	
	{
		System.out.println("Enter UserName");
		driver.findElement(By.name("username")).sendKeys("Sai");
		
	}
	
	@Test(priority=3)
	public void enterPassword() throws InterruptedException
	
	{
		System.out.println("Enter Password");

		driver.findElement(By.name("userpass")).sendKeys("Sai");
		
		
	}
	
	@Test(priority=4)
	public void ClickButton()
	{driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	@AfterTest
	public void closeWindow()
	{
		driver.close();
	}



}
