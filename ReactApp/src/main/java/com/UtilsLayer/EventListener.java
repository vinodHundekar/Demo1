package com.UtilsLayer;

	import java.io.IOException;

import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.events.WebDriverEventListener;

import com.BaseLayer.BaseClass;


	
	public class EventListener extends BaseClass implements WebDriverEventListener {

		public void beforeAlertAccept(WebDriver driver) {
			System.out.println("Berore click on alert popup accept button");
			
		}

		public void afterAlertAccept(WebDriver driver) {
			System.out.println("After click on Alert Pop ccept Button ");		
		}

		public void afterAlertDismiss(WebDriver driver) {
			System.out.println("After click on Alert Pop cancel Button ");		
		}

		public void beforeAlertDismiss(WebDriver driver) {
			System.out.println("Before click on Alert Pop cancel  Button ");		
		}

		public void beforeNavigateTo(String url, WebDriver driver) {
			System.out.println("Before Navigating to :" + url);		
		}

		public void afterNavigateTo(String url, WebDriver driver) {
			System.out.println("After Navigating to :" + url);		
		}

		public void beforeNavigateBack(WebDriver driver) {
			System.out.println("Before Navigating back ");		
		}

		public void afterNavigateBack(WebDriver driver) {
			System.out.println("After Navigating back ");		
		}

		public void beforeNavigateForward(WebDriver driver) {
			System.out.println("Before Navigating forward ");		
		}

		public void afterNavigateForward(WebDriver driver) {
			System.out.println("After Navigating forward ");		
		}

		public void beforeNavigateRefresh(WebDriver driver) {
			System.out.println("Before Navigating refresh ");
			
		}

		public void afterNavigateRefresh(WebDriver driver) {
			System.out.println("After Navigating refresh ");
			
		}

		public void beforeFindBy(By by, WebElement element, WebDriver driver) {
			System.out.println("Trying to find element By "+by.toString());		
		}

		public void afterFindBy(By by, WebElement element, WebDriver driver) {
			System.out.println("Element is found : "+by.toString());		
		}

		public void beforeClickOn(WebElement element, WebDriver driver) {
			System.out.println("Trying to Click on : " + element.toString());		
		}

		public void afterClickOn(WebElement element, WebDriver driver) {

			System.out.println("Clicked on : " + element.toString());			
		}

		public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			System.out.println("Value of  "+element.toString());
			
		}

		public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			System.out.println("Element value is changed to  "+element.toString());
			
		}

		public void beforeScript(String script, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterScript(String script, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void beforeSwitchToWindow(String windowName, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterSwitchToWindow(String windowName, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void onException(Throwable throwable, WebDriver driver) {
			System.out.println("Exception Occur  ==========================  ");
			try {
				Utilsclass.Screenshot();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		public <X> void beforeGetScreenshotAs(OutputType<X> target) {
			// TODO Auto-generated method stub
			
		}

		public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
			// TODO Auto-generated method stub
			
		}

		public void beforeGetText(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterGetText(WebElement element, WebDriver driver, String text) {
			// TODO Auto-generated method stub
			
		}

	}
