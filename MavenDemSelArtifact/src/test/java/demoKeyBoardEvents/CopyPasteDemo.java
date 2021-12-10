package demoKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteDemo {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
	//https://extendsclass.com/text-compare.html
	
	//act.keyDown(webele1,keys.CONTROL).sendkeys("a").sendkeys(."c").build.perform
	//act.keyDown(webele2,keys.CONTROL).sendkeys("a").sendkeys(."v").build.perform
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
	driver=new ChromeDriver();//Launch the Chrome Browser
	Thread.sleep(5000);
	System.out.println("Browser launched");
driver.manage().window().maximize();//Maximize the chrome browser
//Open the application
driver.get("https://extendsclass.com/text-compare.html");

Actions act=new Actions(driver);

	WebElement el1=driver.findElement(By.xpath("//*[@id=\'dropZone\']/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[3]/pre"));
	WebElement el2=driver.findElement(By.xpath("//*[@id=\'dropZone2\']/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));

	act.keyDown(el1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	Thread.sleep(2000);
	act.keyDown(el2, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	
	act.keyDown(el2, Keys.SHIFT).sendKeys("manish");
	
	
	//*[@id="dropZone"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[3]/pre
	
	//*[@id="dropZone2"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre

}
	
}
