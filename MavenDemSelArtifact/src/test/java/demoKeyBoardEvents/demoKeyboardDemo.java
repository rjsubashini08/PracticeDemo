package demoKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoKeyboardDemo {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
	driver=new ChromeDriver();//Launch the Chrome Browser
	Thread.sleep(5000);
	System.out.println("Browser launched");
driver.manage().window().maximize();//Maximize the chrome browser
//Open the application
driver.get("http://demo.automationtesting.in/Windows.html");

//create action object
Actions act=new Actions(driver);

//create 3 Webelemnt

WebElement el1=driver.findElement(By.xpath("//*[@id=\'header\']/nav/div/div[2]/ul/li[6]/a"));
Thread.sleep(1000);
WebElement el2=driver.findElement(By.xpath("//*[@id=\'header\']/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
Thread.sleep(1000);
//WebElement el3=driver.findElement(By.xpath("//*[@id=\'header\']/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/a"));
Thread.sleep(3000);
WebElement el4=driver.findElement(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/a"));
Thread.sleep(3000);
//act.moveToElement(el1).build().perform();
//act.moveToElement(el2).build().perform();
//act.moveToElement(el4).click().build().perform();



act.moveToElement(el1).moveToElement(el2).moveToElement(el4).click().build().perform();
driver.switchTo().frame("ad_iframe");
WebElement closebtn=driver.findElement(By.xpath("//*[@id=\'dismiss-button\']/div/span"));
closebtn.click();
Thread.sleep(2000);

System.out.println("My Current URL is "+driver.getCurrentUrl());

//act.movetoelement(el1).build.perform,act.movetoelement(el2).build.perform,act.movetoelement(el3).click.build.perform
//act.movetoelement(el1).movetoelement(el2).movetoelement(el3)click build.perform
}
}
