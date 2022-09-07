package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class all_para_list_asse {
	
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	
public void open_browser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		} else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();

		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			driver.manage().window().maximize();
		}
		else {
			
			System.out.println("set browser plz....");
			
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Assert.assertTrue(true);
	
}

}
