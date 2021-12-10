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

public class GetMethodsDemo {
	

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
		
	driver.get("file:///C:/Users/r.b.ramamurthy/Downloads/UserName.html");
	System.out.println("Html File opened");
	//Maximize the Browser window
	driver.manage().window().maximize();
	String title=driver.getTitle();
	Assert.assertEquals(title, "Zero - Account Summary");
		String cashAcc=driver.findElement(By.xpath("//h2[contains(text(),'Cash Accounts')]")).getText();
		Assert.assertEquals(cashAcc, "Cash Accounts");
	driver.findElement(By.xpath("//a[contains(text(),'Transfer Funds')]")).click();
	}
	
	@Test(priority=2)
	public void enterUserName() throws InterruptedException
	
	{
		System.out.println("Enter UserName");
		Thread.sleep(2000);
		//Id Demo		
		driver.findElement(By.id("username")).sendKeys("Sai");
		Thread.sleep(2000);
		//CSSSelector using Id Demo		
		driver.findElement(By.cssSelector("input#username")).sendKeys("Sai");
		Thread.sleep(2000);
		//name Demo		
		driver.findElement(By.name("password")).sendKeys("Sai");
		Thread.sleep(2000);
		//class Demo		
		driver.findElement(By.className("class_gi")).sendKeys("Sai");
		Thread.sleep(2000);
		//Css Seelector class Demo		
		driver.findElement(By.cssSelector("input.class_gi")).sendKeys("Sai");
		Thread.sleep(2000);
		//Css Seelector type attribute Demo		
		driver.findElement(By.cssSelector("input[@type='text']")).sendKeys("Sai");
		Thread.sleep(2000);
		//CSS Selector with 2 attributes-<input class="ajax" style="display:block">
		driver.findElement(By.cssSelector("input[class='ajax'][style='display:block']"));
		//Link Demo
		WebElement linkele=driver.findElement(By.linkText("User Login"));
		linkele.click();
		driver.navigate().back();
		//partial Link Demo
		WebElement partiallinkele=driver.findElement(By.partialLinkText("User"));
		partiallinkele.click();
		driver.navigate().back();
		//tag demo
		List<WebElement> trele=driver.findElements(By.tagName("tr"));
		int trelesize=trele.size();
		System.out.println(trelesize);
		
		
		
	}
		
	@AfterTest
	public void closeWindow()
	{
		driver.close();
	}



}
