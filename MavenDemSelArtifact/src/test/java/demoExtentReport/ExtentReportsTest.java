package demoExtentReport;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsTest {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	@BeforeTest
	public void startReport(){
	 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent-reports/"+new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yy").format(new Date(0))+".html");
	 extent = new ExtentReports();
	 extent.attachReporter(htmlReporter);
	 extent.setSystemInfo("Host Name", "Testing Stream");
	 extent.setSystemInfo("Environment", "Automation Testing - Selenium");
	 extent.setSystemInfo("User Name", "Subashini");
	 htmlReporter.config().setDocumentTitle("Title of the Report Comes here");
	 htmlReporter.config().setTheme(Theme.STANDARD);
	}
	@Test
	public void passTest(){
	 logger = extent.createTest("passTest");
	 AssertJUnit.assertTrue(true);
	 logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is passTest", ExtentColor.GREEN));
	}
	@Test
	public void skipTest(){
	 logger = extent.createTest("skipTest");
	 throw new SkipException("Skipping - This is not ready for testing ");
	}
	@Test
	public void failDemoWebShopTest() throws InterruptedException{
	 logger = extent.createTest("failTest");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\git\\repository3\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
//	 driver=DriverUtility.supplyDriver("chrome");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.browserstack.com/users/sign_in");
	 Thread.sleep(3000);
	 WebElement username=driver.findElement(By.id("user_email_login"));
	 Thread.sleep(2000);
	 WebElement password=driver.findElement(By.id("user_password"));
	 Thread.sleep(2000);
	 WebElement login=driver.findElement(By.name("commit"));
	 Thread.sleep(2000);
	 username.sendKeys("abc@gmail.com");
	 password.sendKeys("your_password");
	 Thread.sleep(1000);
	 login.click();
	 Thread.sleep(1000);
	 String actualUrl="https://live.browserstack.com/dashboard";
	 String expectedUrl= driver.getCurrentUrl();
	 Assert.assertEquals(expectedUrl,actualUrl);
	}
	@AfterMethod
	public void getResult(ITestResult result) throws IOException{
	 if(result.getStatus() == ITestResult.FAILURE){
	  logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
	  TakesScreenshot snapshot=(TakesScreenshot)driver;
	  File src=snapshot.getScreenshotAs(OutputType.FILE);
	  String path=System.getProperty("user.dir") +"/extent-reports/snapshots/"+result.getName()+".png";
	  FileUtils.copyFile(src, new File(path));
	  logger.addScreenCaptureFromPath(path,result.getName());
	  logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
	  }
	 else if(result.getStatus() == ITestResult.SKIP){
	  logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
	 }
	}
	@AfterTest
	public void endReport(){
	 extent.flush();
	 driver.close();
	}
}


