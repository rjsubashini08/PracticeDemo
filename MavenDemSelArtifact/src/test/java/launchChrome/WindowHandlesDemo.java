package launchChrome;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		Thread.sleep(5000);
		System.out.println("Browser launched");
	driver.manage().window().maximize();//Maximize the chrome browser
	//Open the application
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	String baseWindow = driver.getWindowHandle();
	System.out.println("Parent Window name is :" +baseWindow);  
	System.out.println("Parent window url is :"+driver.getTitle());
	System.out.println("Parent window url is :"+driver.getCurrentUrl());
	Thread.sleep(3000);
	driver.findElement(By.id("newTabBtn")).click();
	
	Set<String> allWindow = driver.getWindowHandles(); // get all the windows opened by web driver
	for(String s : allWindow)
	{ // iterate the loop to switch to different window
	if(!(s.equals(baseWindow)))
	{
	driver.switchTo().window(s);
	driver.findElement(By.id("alertBox")).click();
	Thread.sleep(1000);
	System.out.println("Sub Window name is :" +s);  
	driver.switchTo().alert().accept();
	System.out.println("Sub window url is :"+driver.getTitle());
	System.out.println("Sub window url is :"+driver.getCurrentUrl());
	driver.close();
	}
	
	}
	driver.quit();
	}
}


