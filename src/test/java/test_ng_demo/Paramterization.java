package test_ng_demo;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paramterization {
	
	WebDriver driver;
	
	@Parameters({"browser","username","password"})   //chnages made by other tester
	@Test(alwaysRun = true)
	public void BrowserOpen(String browser,String username,String password) throws InterruptedException {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		} else if(browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}
		else if(browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();

		}
		else {
			
			System.out.println("Wrong browser ip");
		}
		
		driver.get("https://github.com/login");
		
		
	
		
		WebElement username1=driver.findElement(By.xpath("/html/body/div[3]/main/div/div[4]/form/input[2]"));
		
		WebElement password1=driver.findElement(By.xpath("/html/body/div[3]/main/div/div[4]/form/div/input[1]"));

		WebElement btn=driver.findElement(By.xpath("/html/body/div[3]/main/div/div[4]/form/div/input[12]"));
		username1.sendKeys(username);
		
		password1.sendKeys(password);
		
		btn.click();
		
		
	driver.close();		
		
		
		
	}

}
