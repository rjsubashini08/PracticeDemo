package demoWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebTables {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


//https://www.w3schools.com/html/html_tables.asp
	////*[@id="customers"]/tbody/tr[2]/td[1]
	
	//Print the first column row data
	//Print the second column row data
	//print the third column row data
	//check how many rows present in web table
	
	//Print the first row data
		//Print the second row  data
		//print the third  row data
		//check how many columns present in web table
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[2]/td[3]
		//*[@id="customers"]/tbody/tr[3]/td[3]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.b.ramamurthy\\eclipse-workspace\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		Thread.sleep(5000);
		System.out.println("Browser launched");
		driver.manage().window().maximize();//Maximize the chrome browser
		//Open the application
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println("Fetch the First Column");
		System.out.println("**************************");
		//Fetch the 1st Column Data
		String beforXPATH="//*[@id=\"customers\"]/tbody/tr[";
		String afterXPATH="]/td[1]";
		for(int i=2;i<=7;i++)
		{
			String actualXPATH=beforXPATH+i+afterXPATH;
			WebElement firstColumn=driver.findElement(By.xpath(actualXPATH));
			System.out.println(firstColumn.getText());
			
		}
		
		//Fetch the 2nd Column Data
		System.out.println("Fetch the Second Column");
		System.out.println("**************************");
		String beforXPATH1="//*[@id=\"customers\"]/tbody/tr[";
		String afterXPATH1="]/td[2]";
		for(int i=2;i<=7;i++)
		{
			String actualXPATH=beforXPATH1+i+afterXPATH1;
			WebElement firstColumn=driver.findElement(By.xpath(actualXPATH));
			System.out.println(firstColumn.getText());
			
		}
		System.out.println("Fetch the Third Column");
		System.out.println("**************************");
		//Fetch the 3rd Column Data
		String beforXPATH2="//*[@id=\"customers\"]/tbody/tr[";
		String afterXPATH2="]/td[3]";
		for(int i=2;i<=7;i++)
		{
			String actualXPATH=beforXPATH2+i+afterXPATH2;
			WebElement firstColumn=driver.findElement(By.xpath(actualXPATH));
			System.out.println(firstColumn.getText());
			
		}
		
		//Fetch the header Details Data
		System.out.println("Fetch the header Column");
		System.out.println("**************************");
		String BeforeXPATH="//*[@id='customers']/tbody/tr[1]/th[";
		String AfterXPATH="]/th[";
		
		for(int i=1;i<=3;i++)
		{
//			String xpath=BeforeXPATH+i+AfterXPATH+i+"]";
			WebElement header=driver.findElement(By.xpath(BeforeXPATH+i+"]"));
			System.out.println(header.getText());
		}
	}
	
}
