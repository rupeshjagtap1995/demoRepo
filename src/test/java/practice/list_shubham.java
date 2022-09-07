package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(practice.list.class)


public class list_shubham {
	
	static WebDriver driver;
	 
	@Test
	public void main_page() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // implicit wait - 2nd page invole
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		
		 String acc_result = driver.getCurrentUrl();
		 
		 String exc_result = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		 
		 
		 Assert.assertEquals(exc_result, acc_result);
		 Thread.sleep(2000);
		 
		 
	
		
		WebElement user_name = driver.findElement(By.xpath("//input[@name='username']"));
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		Thread.sleep(3000);
		
		user_name.sendKeys("Admin");
		
	    pass.sendKeys("admin123");
	    
	    btn.click();
	    
//	    Thread.sleep(3000);  // implicit wait in invol    
	    wait.until(ExpectedConditions.visibilityOf(btn)); // wait for btn
	    
	   WebElement result1 = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
	   
	   String exc_result1 = "Paul Collings";
	   
	   String acc_result1 = result1.getText();
	   
	   Assert.assertEquals(exc_result1, acc_result1);
	}
	


}


