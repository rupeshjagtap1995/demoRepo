package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(parameter.List_para_1.class)
public class List_prac {
	
	

  static WebDriver driver;

	@Test
	public void act_time() throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement user = driver.findElement(By.id("username"));
		
		WebElement pass = driver.findElement(By.name("pwd"));
		
		WebElement btn = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div"));
		
		Thread.sleep(3000);
		
		
		
		
		user.sendKeys("trainee");
		pass.sendKeys("trainee");
		btn.click();
		
		Thread.sleep(3000);
		WebElement result = driver.findElement(By.xpath("//table[@class='noprint']//td"));
		
		String ext_result="Enter Track";
		
		String acc_result=result.getText();
		
		Assert.assertEquals(ext_result, acc_result);
		
	}

}
