package demoWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		//Implicit Wait
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Browser launched");
	driver.manage().window().maximize();//Maximize the chrome browser
	//Open the application
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//	driver.findElement(By.id("btn1")).click();
//	driver.findElement(By.id("txt1")).sendKeys("Manish");
	//Explicit wait
	WebDriverWait wb=new WebDriverWait(driver,2);
	
	driver.findElement(By.id("btn2")).click();
	wb.until(ExpectedConditions.presenceOfElementLocated(By.id("txt2")));
	driver.findElement(By.id("txt2")).sendKeys("Manish");
	}

}
