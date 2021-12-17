package demoSeleniumIDE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


public class ValidationsOfBasicControlsTest {
	private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @BeforeTest
	  public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sony\\git\\PracticeDemo\\MavenDemSelArtifact\\src\\test\\java\\demoSeleniumIDE\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  @AfterTest
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void validationsOfBasicControls() {
	    driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	    driver.manage().window().setSize(new Dimension(985, 692));
	    {
	      WebElement element = driver.findElement(By.cssSelector("#header-inner > a"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    js.executeScript("window.scrollTo(0,373)");
	    js.executeScript("window.scrollTo(0,478)");
	    driver.findElement(By.id("firstName")).click();
	    driver.findElement(By.id("firstName")).sendKeys("Rajasubashini");
	    driver.findElement(By.id("lastName")).click();
	    driver.findElement(By.id("lastName")).sendKeys("R");
	    driver.findElement(By.id("femalerb")).click();
	    driver.findElement(By.id("englishchbx")).click();
	    driver.findElement(By.cssSelector(".basicControls")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("rjsubashini");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("ssss");
	    driver.findElement(By.id("registerbtn")).click();
	    driver.findElement(By.xpath("//div[@id=\'post-body-7593811851313663875\']/div/div/div[3]/a")).click();
//	    driver.close();
	  }
	}
