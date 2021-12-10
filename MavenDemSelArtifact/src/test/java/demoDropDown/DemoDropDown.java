package demoDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDown {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
	driver=new ChromeDriver();//Launch the Chrome Browser
	Thread.sleep(5000);
	System.out.println("Browser launched");
driver.manage().window().maximize();//Maximize the chrome browser
//Open the application
driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//First Create the webelement for Dropdown
WebElement course_dd=driver.findElement(By.id("course"));

//Create the reference for dropdown using select object
Select scourse_dd=new Select(course_dd);
scourse_dd.selectByIndex(2);
Thread.sleep(2000);
scourse_dd.selectByValue("java");
Thread.sleep(2000);
scourse_dd.selectByVisibleText("Python");
Thread.sleep(2000);

List<WebElement> listdd=scourse_dd.getOptions();
for (WebElement webElement : listdd) {
	System.out.println(webElement);
	System.out.println(webElement.getText());
	
}

//using dd object select the values options in the dropdown
WebElement ide_dd=driver.findElement(By.id("ide"));

Select side_dd=new Select(ide_dd);
side_dd.selectByIndex(0);
side_dd.selectByValue("vs");
side_dd.selectByVisibleText("NetBeans");
List<WebElement> listwe=side_dd.getAllSelectedOptions();
for (WebElement webElement : listwe) 
{
	System.out.println(webElement.getText());
	
}

List<WebElement> listweall=side_dd.getOptions();
for (WebElement webElement : listweall) 
{
	System.out.println(webElement.getText());
}

/*Multiselect without control*/
//First Create the webelement for Dropdown
//Create the reference for dropdown using select object
//using dd object select the values options in the dropdown

}
}