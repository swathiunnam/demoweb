package utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectSpecification;

public class Listeners extends ProjectSpecification implements ITestListener {
	
	ExtentTest test;
	ExtentReports extent=ExtentReportsDemoblaze.getReport();
	
	@Override
	public void onTestStart(ITestResult result) {
		
		test = extent.createTest(result.getMethod().getMethodName());
		System.out.println("Test started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test passed");
		System.out.println("Test sucess");
	
	}
	   
	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		System.out.println("Test failed");
		
      String filepath = null;
		
		try {
			
			filepath = getScreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
		
		
	}
	  
		@Override
		public void onTestSkipped(ITestResult result) {
			
			System.out.println("Test skipped");
		}
		
		
		@Override
		public void onFinish(ITestContext context) {
			extent.flush();
		}
	  
	  

	
}
