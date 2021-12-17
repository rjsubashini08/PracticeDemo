package demoDataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ExcelExample{
	
	static WebDriver driver;
	
@Test(dataProvider="testdata")
public void demoClass(String username, String password) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\PracticeDemo\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
	driver=new ChromeDriver();//Launch the Chrome Browser
	Thread.sleep(5000);
	System.out.println("Browser launched");
driver.manage().window().maximize();//Maximize the chrome browser
driver.get("https://www.browserstack.com/users/sign_in");
driver.findElement(By.name("user[login]")).sendKeys(username);
Thread.sleep(3000);
driver.findElement(By.name("user[password]")).sendKeys(password);
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.name("commit")));
driver.findElement(By.name("commit")).click();
Thread.sleep(5000);
//Assert.assertTrue(driver.getTitle().matches("BrowserStack Login | Sign Into The Best Mobile & Browser Testing Tool"), "Invalid credentials");
System.out.println("Login successful");
}
@AfterMethod
void ProgramTermination() {
driver.quit();
} 
@DataProvider(name="testdata")
public Object[][] testDataExample(){
ReadExcelFile configuration = new ReadExcelFile("C:\\Users\\Sony\\git\\PracticeDemo\\MavenDemSelArtifact\\dataDemo.xlsx");
int rows = configuration.getRowCount(0);
Object[][] signin_credentials = new Object[rows][2];

for(int i=0;i<rows;i++)
{
signin_credentials[i][0] = configuration.getData(0, i, 0);
signin_credentials[i][1] = configuration.getData(0, i, 1);
}
return signin_credentials;
}
}
