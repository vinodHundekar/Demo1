package com.UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;



public class JSmethods extends BaseClass{
	static JavascriptExecutor js=(JavascriptExecutor)driver;
	 
	public static void JSclick(WebElement wbtoclick) {
		 js.executeScript("arguments[0].click();", wbtoclick);	
	}
	public static void JSsendtext(WebElement wbfortextbox,String textforbox) {
		 js.executeScript("arguments[0].value='"+textforbox+"';", wbfortextbox);	
	}
	public static void JSnavigate(String jsURL) {
		 js.executeScript("window.location='"+jsURL+"';");	
	}
	public static String JStitle() {
		 String titlebyJS=js.executeScript("return document.title;").toString();	
		 return titlebyJS;
	}
	public static void JScurrentURL() {
		 String pageurlbyJS=js.executeScript("return document.URL;").toString();	
		 System.out.println(pageurlbyJS);
	}
	public static void JSrefresh() {
		 js.executeScript("history.go(0);");	
	}
	public static void JSmsgtoalert(String msg) {
		 js.executeScript("alert('"+msg+"');");	
	}
	public static void JSmoveinpage(WebElement wbinpagetomove) {
		 js.executeScript("argument[0].scrollIntoView(true);",wbinpagetomove);	
	}
	public static void JSmovebypixel() {
		 js.executeScript("window.scrollBy(0,500);");	
	}

}
