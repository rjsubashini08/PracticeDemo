package launchChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFrames {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		Thread.sleep(5000);
		System.out.println("Browser launched");
	driver.manage().window().maximize();//Maximize the chrome browser
	//Open the application
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	
	driver.findElement(By.id("name")).sendKeys("Hello");
	Thread.sleep(2000);
	driver.switchTo().frame(driver.findElement(By.id("frm1")));
//	Select se=new Select(driver.findElement(By.xpath("//*[@id='course']");
	driver.findElement(By.xpath("//*[@id='course']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//option[@value='java']")).click();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	driver.findElement(By.id("name")).clear();
	Thread.sleep(1000);
	driver.findElement(By.id("name")).sendKeys("HelloSai");
	
	
	

	}

}
