package test_ng_demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seq_test_ng {
	
	@BeforeSuite
	public void suite(){
		System.out.println("suite is running");
		
	}
	
	@BeforeTest
	public void test() {
		System.out.println("test is running");
	}
	
	@BeforeClass
	public void clas() {
		System.out.println("class is runnig");
	}
	
	@BeforeMethod
	public void method() {
		System.out.println("method is method");
	}
	
	@Test
	public void test1() {
		System.out.println("1st test is running");
	}
	
	@Test
	public void test2() {
		System.out.println("2nd test is running");
	}
	
	@AfterMethod
	public void method1() {
		System.out.println("method is compaleted");
	}
	
	@AfterClass
	public void clas2() {
		System.out.println("class is comaleted");
	}
	
	@AfterTest
	public void test11() {
		System.out.println("test is compaleted");
	}
	
	@AfterSuite
	
	public void suite1() {
		System.out.println("suite is compaleted");
	}

}
