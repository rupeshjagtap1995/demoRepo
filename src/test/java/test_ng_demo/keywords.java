package test_ng_demo;

import  org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keywords {

	WebDriver d;

	@BeforeTest
	public void mainpage(){

		WebDriverManager.chromedriver().setup();

		d=new ChromeDriver(); 

		d.manage().window().maximize();

		d.get("https://github.com/");

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		d.navigate().refresh();
	}

	@Test
	public void title() throws InterruptedException {

		String exptitle=": Where the world builds software · GitHub";

		String acctitile = d.getTitle();
		
		SoftAssert s=new SoftAssert();
		
		s.assertEquals(exptitle, acctitile);

//		Assert.assertEquals(exptitle, acctitile);


		WebElement logClick = d.findElement(By.xpath("//div[@class='position-relative mr-3 mb-4 mb-lg-0 d-inline-block']//a"));
		logClick.click();
//		Assert.assertTrue(logClick.isDisplayed());
		Thread.sleep(4000);


		WebElement username = d.findElement(By.xpath("//input[@id='login_field']"));
//		Assert.assertTrue(username.isDisplayed());
		Thread.sleep(2000);
		WebElement password = d.findElement(By.xpath("//input[@id='password']"));
//		Assert.assertTrue(password.isDisplayed());
		Thread.sleep(2000);
		WebElement logbtn = d.findElement(By.xpath("//input[@class='btn btn-primary btn-block js-sign-in-button']"));
//		Assert.assertTrue(logbtn.isDisplayed());
		Thread.sleep(2000);


		username.sendKeys("rupesh@123");
		password.sendKeys("12345678");
		logbtn.click();
		
		s.assertAll();
	}
		
	@AfterTest
	public void close(){
		d.close();
	}


}
