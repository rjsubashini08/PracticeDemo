package demoKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoContextClick {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//https://swisnl.github.io/jQuery-contextMenu/demo.html
		//act.contectclick(ele).build.perform
		//then click on delete option using movetoelemnt.click.build.perform
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		Thread.sleep(5000);
		System.out.println("Browser launched");
	driver.manage().window().maximize();//Maximize the chrome browser
	//Open the application
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	Actions act=new Actions(driver);
		
		WebElement el1=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		WebElement el2=driver.findElement(By.xpath("/html/body/ul/li[5]"));
		
		act.contextClick(el1).build().perform();
		Thread.sleep(1000);
		act.moveToElement(el2).click().build().perform();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
		

	}

}
