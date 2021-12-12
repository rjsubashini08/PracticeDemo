package screenshotDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTakeScreenshotOnFailure {

	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\git\\repository3\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		Thread.sleep(5000);
		System.out.println("Browser launched");
//	driver.manage().window().maximize();//Maximize the chrome browser
	//Open the application
		//goto url
		driver.get("https://www.browserstack.com");
		//Call take screenshot function
		this.takeSnapShot(driver, "c://Failuretest.png") ; 
		}
	
	
	@Test
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}


}
