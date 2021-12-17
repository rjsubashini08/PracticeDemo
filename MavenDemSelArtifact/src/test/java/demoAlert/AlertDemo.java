package demoAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AlertDemo {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\PracticeDemo\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		Thread.sleep(5000);
		System.out.println("Browser launched");
	driver.manage().window().maximize();//Maximize the chrome browser
	//Open the application
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	
	driver.findElement(By.id("alertBox")).click();
	if(ExpectedConditions.alertIsPresent()!=null)
	{
		
		Alert a=driver.switchTo().alert();
		String alertmsg=a.getText();
		Thread.sleep(1000);
		System.out.println("Allert Msg is "+alertmsg);
		Assert.assertEquals(alertmsg, "I am an alert box!");
		a.accept();
		Thread.sleep(1000);
		String outputmsg=driver.findElement(By.id("output")).getText();
		Thread.sleep(1000);
		System.out.println("Allert Msg is "+outputmsg);
		Assert.assertEquals(outputmsg, "You selected alert popup");
		
	}

	}

}
