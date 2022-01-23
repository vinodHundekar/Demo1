package com.UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseLayer.BaseClass;

public class TestUtility extends BaseClass{
	
	public static String getScreenShotForPassedTC(String Screenshotname) throws IOException {

		String dateName=new SimpleDateFormat("__ddMMyyyy_HHmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String Finaldestination=System.getProperty("user.dir")+"/PassTestCaseScreenShot/"+Screenshotname+dateName+".png";
		File finalDist = new File(Finaldestination);
		FileUtils.copyFile(source, finalDist);
		return Finaldestination;
	}
	
	
	public static String getScreenShotForFailedTC(String Screenshotname) throws IOException {
		SimpleDateFormat dateFormat= new SimpleDateFormat("__ddMMyyyy_HHmmss");
		String dateName=dateFormat.format(new Date());
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String Finaldestination=System.getProperty("user.dir")+"/FailedTestCaseScreenShot/"+Screenshotname+dateName+".png";
		File finalDist = new File(Finaldestination);
		FileUtils.copyFile(source, finalDist);
		return Finaldestination;
	}

}
