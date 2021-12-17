package demoSeleniumIDE;

// Generated by Selenium IDE
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.core.IsNot.not;
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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ValidatetheRegistrationPageTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeMethod
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
  public void validatetheRegistrationPage() {
    // Test name: Validate the RegistrationPage
    // Step # | name | target | value
    // 1 | open | /p/basic-controls.html | 
    driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
    // 2 | setWindowSize | 1382x744 | 
    driver.manage().window().setSize(new Dimension(1382, 744));
    // 3 | click | css=#nav1 > .parent:nth-child(4) > a | 
    driver.findElement(By.cssSelector("#nav1 > .parent:nth-child(4) > a")).click();
    // 4 | click | css=li:nth-child(7) > a | 
    driver.findElement(By.cssSelector("li:nth-child(7) > a")).click();
    // 5 | runScript | window.scrollTo(0,408) | 
    js.executeScript("window.scrollTo(0,408)");
    // 6 | click | id=firstName | 
    driver.findElement(By.id("firstName")).click();
    // 7 | type | id=firstName | rrr
    driver.findElement(By.id("firstName")).sendKeys("rrr");
    // 8 | type | id=lastName | vvv
    driver.findElement(By.id("lastName")).sendKeys("vvv");
    // 9 | click | css=.basicControls | 
    driver.findElement(By.cssSelector(".basicControls")).click();
    // 10 | click | id=femalerb | 
    driver.findElement(By.id("femalerb")).click();
    // 11 | click | id=englishchbx | 
    driver.findElement(By.id("englishchbx")).click();
    // 12 | click | id=email | 
    driver.findElement(By.id("email")).click();
    // 13 | type | id=email | rrf
    driver.findElement(By.id("email")).sendKeys("rrf");
    // 14 | type | id=password | qqq
    driver.findElement(By.id("password")).sendKeys("qqq");
    // 15 | click | id=registerbtn | 
    driver.findElement(By.id("registerbtn")).click();
    // 16 | click | id=navigateHome | 
    driver.findElement(By.id("navigateHome")).click();
    // 17 | mouseOver | css=.tybox-rest:nth-child(2) .tyimg-lay | 
    {
      WebElement element = driver.findElement(By.cssSelector(".tybox-rest:nth-child(2) .tyimg-lay"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 18 | mouseOver | css=.tybox-rest:nth-child(2) .tyimg-lay | 
    {
      WebElement element = driver.findElement(By.cssSelector(".tybox-rest:nth-child(2) .tyimg-lay"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 19 | mouseOut | css=.tybox-rest:nth-child(2) .tyimg-lay | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 20 | mouseOver | css=.tybox-rest:nth-child(3) .tyimg-lay | 
    {
      WebElement element = driver.findElement(By.cssSelector(".tybox-rest:nth-child(3) .tyimg-lay"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 21 | mouseOut | css=.tybox-rest:nth-child(3) .tyimg-lay | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}
