package test_ng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keywords_1 {
	
	WebDriver d;
	
	@BeforeClass
	public void demo() {
		
		System.out.println("hiiii...");
	}
	
	@Test
	public void browser_open() {
		
		WebDriverManager.chromedriver().setup();
		
		d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.saucedemo.com/");
		
		d.navigate().refresh();
		
	}
	
	@Test(priority = 1)
	public void useID() throws InterruptedException {
		
		WebElement user_id = d.findElement(By.id("user-name"));
		Thread.sleep(2000);
		user_id.sendKeys("standard_user");
	}
	
	@Test(priority = 2)
	public void pass() throws InterruptedException {
		
		WebElement pass_word = d.findElement(By.id("password"));
		Thread.sleep(2000);
		pass_word.sendKeys("secret_sauce");
	}
	
	@Test(priority = 3)
	public void login() throws InterruptedException {
		
		WebElement login_btn = d.findElement(By.id("login-button"));
		Thread.sleep(2000);
		login_btn.click();
	}
	
	@AfterClass
	public void close() {
		
		d.close();
		System.out.println("close window");
	}

}
