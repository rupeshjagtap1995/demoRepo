package parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class para {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void all(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}  else if (browser.equalsIgnoreCase("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		} else if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		else {
		
		System.out.println("Wrong i/p");
		}
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
	}

}
