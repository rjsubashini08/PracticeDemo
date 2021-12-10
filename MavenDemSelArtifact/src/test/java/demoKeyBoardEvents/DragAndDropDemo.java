package demoKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragAndDropDemo {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		Thread.sleep(5000);
		System.out.println("Browser launched");
	driver.manage().window().maximize();//Maximize the chrome browser
	//Open the application
	driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Actions act=new Actions(driver);
	
	WebElement source=driver.findElement(By.xpath("//*[@id=\'box6\']"));
	WebElement dest=driver.findElement(By.xpath("//*[@id=\'box106\']"));
	
//	act.clickAndHold(source).moveToElement(dest).release().build().perform();
	
	act.dragAndDrop(source, dest).build().perform();
	Thread.sleep(3000);
	WebElement green=driver.findElement(By.xpath("//div[@style='visibility: visible; background-color: rgb(0, 255, 0);']"));
	System.out.println(green.getText());
	Assert.assertNotNull(green);
		//3 steps
		//clickAndHold(source).movetoelement(dest).release().build.perform;

	}

}
