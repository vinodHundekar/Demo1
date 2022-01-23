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
	
	public static void Alertpopup() {
		Alert alt=driver.switchTo().alert();
		alt.sendKeys(prop.getProperty("sendtextintoalertpopup"));
		alt.accept();
		System.out.println(alt.getText());
		alt.dismiss();
		
	}
	
	public static void Dropdown(WebElement dropdownwebelememt) {
//		WebElement dropdownwebelememt=driver.findElement(By.xpath(""));
		Select sl=new Select(dropdownwebelememt);
		sl.selectByVisibleText(prop.getProperty("selectdropdownvalue"));
		WebElement wbindropdown=sl.getFirstSelectedOption();
		String selecteddropdown=wbindropdown.getText();
		System.out.println("selected value from drop down="+selecteddropdown);
		List<WebElement> Dropdownlist=sl.getOptions();
		int sizeofdropdown=Dropdownlist.size();
		System.out.println("Drop down size="+sizeofdropdown);
		
		for(WebElement z:Dropdownlist) {
			String dropdowntext=z.getText();
			System.out.println("Drop down values="+dropdowntext);
		}
	}

	public static void Handleframe(WebElement frametobehandled) {
//		WebElement frametobehandled=driver.findElement(By.xpath(""));
		
		driver.switchTo().frame(prop.getProperty("frameindex"));
		driver.switchTo().frame(prop.getProperty("framename"));
		driver.switchTo().frame(frametobehandled);
		
		driver.switchTo().defaultContent();
		
	}
	
	public static void Multitabs() {
		
		String maintab=driver.getWindowHandle();
		Set<String> openedtabs=driver.getWindowHandles();
		int noofopenedtabs=openedtabs.size();
		System.out.println("No of tabs opened="+noofopenedtabs);
		
		ArrayList listoftabs=new ArrayList<String> (openedtabs);
		driver.switchTo().window((String) listoftabs.get(1));
//		driver.switchTo().window(listoftabs.get(index));	
	}
	
	public static void Handletable(WebElement tablewebelement) {
//		WebElement tablewebelement=driver.findElement(By.xpath(access.getProperty("xpathoftable")));
		
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		List<WebElement> coloumn=driver.findElements(By.tagName("th"));
		List<WebElement> cell=driver.findElements(By.tagName("td"));
		System.out.println("No of rows in table"+rows.size());
		System.out.println("No of coloumn in table"+coloumn.size());
		System.out.println("No of cell in table"+cell.size());
		
		for(WebElement matrix:cell) {
			String cellsvalue=matrix.getText();
			if(cellsvalue.contains(prop.getProperty("checkintable"))) {
				System.out.println(prop.getProperty("checkintable")+" Present in table");
			}
		}
		
	}
	
	public static void Screenshot() {
		TakesScreenshot sh=(TakesScreenshot)driver;
		File source=sh.getScreenshotAs(OutputType.FILE);
		File target=new File("F:\\Jagdish Jadhav\\Class doc\\Selenium\\Screenshot\\jj.png");
		try {
			FileUtils.copyFile(source, target);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
