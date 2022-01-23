package com.UtilsLayer;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;


public class ExtentReportListener extends ExtentReportSetup implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest=extent.createTest(result.getMethod().getMethodName());
	
	}

	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "Test Case passed is ::"+result.getMethod().getMethodName());
		try {
			extentTest.addScreenCaptureFromPath(TestUtility.getScreenShotForPassedTC(result.getMethod().getMethodName()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, "Test case failed is ::"+result.getMethod().getMethodName());
		extentTest.log(Status.FAIL, result.getThrowable());
		
		try {
			extentTest.addScreenCaptureFromPath(TestUtility.getScreenShotForFailedTC(result.getMethod().getMethodName()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "Test case skipped is ::"+result.getMethod().getMethodName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onStart(ITestContext arg0) {
		ExtentReportSetup.extentReportSetup();
	
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
