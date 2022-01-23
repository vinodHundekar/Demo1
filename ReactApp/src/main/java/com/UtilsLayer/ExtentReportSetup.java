package com.UtilsLayer;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportSetup{
	public static ExtentReports extent;
	public static ExtentSparkReporter sparkreport;
	public static ExtentTest extentTest;
	
	public static ExtentReports extentReportSetup() {
		 
		 sparkreport= new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\ExtentReport.html");
		 extent=new ExtentReports();
		 extent.attachReporter(sparkreport);
		 sparkreport.config().setTheme(Theme.STANDARD);
			
		 sparkreport.config().setDocumentTitle("Test Automation Report ");
		
			return extent;
			
	}

}
