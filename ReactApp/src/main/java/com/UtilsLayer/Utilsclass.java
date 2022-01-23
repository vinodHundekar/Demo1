package com.UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;


public class Utilsclass extends BaseClass {
	static Alert alt;
	static Select sl;
	static List<WebElement> ls;
	static String maintab;
	static Set<String> childtabs;
	static ArrayList<String> al;
	static List<WebElement> rows;
	static List<WebElement> column;
	static List<WebElement> cell;
	
	public static void switchtoalert(String texttoalert) {
		alt=driver.switchTo().alert();
		alt.sendKeys(texttoalert);
	}
	public static String alertmsg() {
		String msg=alt.getText();
		return msg;
	}
	public static void acceptalert() {
		alt.accept();
	}
	public static void dismissalert() {
		alt.dismiss();
	}
	public static void selectdropdown(WebElement wb,String dropdowntext) {
		sl=new Select(wb); 
		sl.selectByVisibleText(dropdowntext);
	}
	public static String selecteddropdown() {
		WebElement wb1=sl.getFirstSelectedOption();
		String s1=wb1.getText();
		return s1;
	}
	public static int noofvaluesindropdown() {
		ls=sl.getOptions();
		int sizeofdropdown=ls.size();
		return sizeofdropdown;
	}
	public static void alldropdownvalues() {
		for(WebElement z:ls) {
			String abc=z.getText();	
			System.out.println(abc);
		}
	}
	
	public static void selectframebyindex(int frameindex) {
		driver.switchTo().frame(frameindex);
	}
	public static void switchtotopframe() {
		driver.switchTo().defaultContent();
	}
	
	public static void switchtotab(int windowindex) {
		maintab=driver.getWindowHandle();
		childtabs=driver.getWindowHandles();
		al=new ArrayList<String>(childtabs);
		driver.switchTo().window(al.get(windowindex));
	}
	public static int rowsintable(WebElement wb) {
		rows=(List<WebElement>) driver.findElement(By.tagName("tr"));
		int rowsintable=rows.size();
		return rowsintable;
	}
	public static int columnintable(WebElement wb) {
		column=(List<WebElement>) driver.findElement(By.tagName("th"));
		int columnintable=column.size();
		return columnintable;
	}
	public static int cellsintable(WebElement wb) {
		cell=(List<WebElement>) driver.findElement(By.tagName("td"));
		int totalcells=cell.size();
		return totalcells;
	}
	public static void checkcellvalue() {
		String textincell;
		for(WebElement z:cell) {
			textincell=z.getText();
			System.out.println(textincell);
		}
	}
	public static void Screenshot() throws IOException {
		TakesScreenshot sh=(TakesScreenshot)driver;
		File source=sh.getScreenshotAs(OutputType.FILE);
		File target=new File("F:\\Jagdish Jadhav\\Class doc\\Selenium\\Screenshot\\jj.png");
		FileUtils.copyFile(source, target);
	}
	
}
