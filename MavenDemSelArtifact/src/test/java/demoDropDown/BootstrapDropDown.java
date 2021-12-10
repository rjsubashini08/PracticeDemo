package demoDropDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {
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
//Create the reference for dropdown using select object
//using dd object select the values options in the dropdown




/*Multiselect without control*/
//First Create the webelement for Dropdown
//Create the reference for dropdown using select object
//using dd object select the values options in the dropdown

}
}

