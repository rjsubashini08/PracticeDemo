package launchChrome;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindowHandle {
static WebDriver driver;

public static void main(String args[]) throws InterruptedException
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
	driver=new ChromeDriver();//Launch the Chrome Browser
	Thread.sleep(5000);
	System.out.println("Browser launched");
driver.manage().window().maximize();//Maximize the chrome browser
//Open the application
driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
String baseWindow = driver.getWindowHandle(); // get the current window name
System.out.println("Base Window name is :" +baseWindow);// store the window name as object
System.out.println("Base window title is :"+driver.getTitle());
System.out.println("Base window Current URL is :"+driver.getCurrentUrl());
driver.findElement(By.xpath("(//a[contains(text(),'Demo Site')])[1]")).click();
Set<String> allWindow = driver.getWindowHandles(); // get all the windows opened by web driver
for(String s : allWindow){ // iterate the loop to switch to different window
if(!(s.equals(baseWindow))){
driver.switchTo().window(s);
System.out.println("Sub Window name is :" +s);  
System.out.println("Sub window url is :"+driver.getTitle());
System.out.println("Sub window url is :"+driver.getCurrentUrl());
driver.close();
}
}
driver.quit();

}


}
