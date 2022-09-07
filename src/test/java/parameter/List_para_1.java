package parameter;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class List_para_1 implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println("**********START TEST************");
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("******TEST CASE PASSED*******");
		
	}

	public void onTestFailure(ITestResult result) {
		
		File source = ((TakesScreenshot)List_prac.driver).getScreenshotAs(OutputType.FILE);
        File Destination = new File("C:\\Users\\Unique Web System\\eclipse-workspace\\test_ng_practice\\target\\abc.png");
        try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("*************FINISHED**********");
		
	}
	
	

}
