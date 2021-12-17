package demoAutoComplete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDemo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open the Google page
		//net some value as "selenium interview
		//capture all the options in list using findelements as //ul/li/className->this is AutoComplete List
		//Get the count
		//Use foreach Statemmt
		//print all the data in list
		//inside for insert if condition and check that webelent equalsignorecase(softaewre testing)
		//b.click
		//no need to do further iterations so give break
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\PracticeDemo\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		Thread.sleep(5000);
		System.out.println("Browser launched");
		driver.manage().window().maximize();//Maximize the chrome browser
		//Open the application
		driver.get("https://google.com");
		
		WebElement search=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input"));
		search.sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> items=driver.findElements(By.xpath("//ul/li[@class='sbct']"));
		int size=items.size();
		System.out.println(size);
		System.out.println("Hello");
		for (WebElement webElement : items) {
			System.out.println(webElement.getText());
			if(webElement.getText().equalsIgnoreCase("selenium tutorial"))
			{
				webElement.click();
				break;
				
			}
			
			
		}



	}

}
