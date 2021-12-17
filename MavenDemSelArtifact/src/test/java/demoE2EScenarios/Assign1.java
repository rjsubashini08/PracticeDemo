import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assign1 {
WebDriver driver;
WebDriverWait wait;

String URL = "http://automationpractice.com/index.php";
private By frameLocator = By.className("demo-frame");
private By tagText = By.id("tags");

@BeforeClass
public void Setup() {
String projectPath = System.getProperty("user.dir");
System.out.println("Project path is : "+projectPath);

System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/java/drivers/chromedriver.exe");
driver=new ChromeDriver();//Launching the Chrome browser
driver.manage().window().maximize();//Maximize the chrome browser
wait = new WebDriverWait(driver, 5);
}

@Test
public void SignUp() throws InterruptedException {
driver.navigate().to(URL);
driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("rjsubashini08@gmail.com");
driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
Thread.sleep(8000);
driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Rajasubashini");
Thread.sleep(8000);
driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Ram");
driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Ram123");
driver.findElement(By.id("days")).click();
Thread.sleep(2000);
Select days=new Select(driver.findElement(By.id("days")));
// days.selectByVisibleText("4");
days.selectByIndex(4);
driver.findElement(By.id("months")).click();
Thread.sleep(2000);
Select months=new Select(driver.findElement(By.id("months")));
// months.selectByVisibleText("November");
months.selectByIndex(4);
driver.findElement(By.id("years")).click();
Thread.sleep(2000);
Select years=new Select(driver.findElement(By.id("years")));
// years.selectByVisibleText("1990");
years.selectByIndex(4);

}
@AfterClass
public void tearDown() {
driver.quit();
}

}
