package com.BaseLayer;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.UtilsLayer.EventListener;
import com.UtilsLayer.JSmethods;

public class BaseClass {
	public static FileInputStream fis;
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver event_driver;
	public static EventListener listener;
	
	public static void initialisation() {
		System.setProperty("webdriver.chrome.driver", "F:\\Jagdish Jadhav\\JARS\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
			event_driver=new EventFiringWebDriver(driver);
			listener=new EventListener();
			event_driver.register(listener);
			driver=event_driver;
			
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
//		driver.get(prop.getProperty("url"));
		JSmethods.JSnavigate(prop.getProperty("url"));
		
	}
	
	public BaseClass() {
		 prop=new Properties();
		try{ fis=new FileInputStream("F:\\Jagdish Jadhav\\Worksapace\\OrangeHRMTest\\src\\main\\com.UtilsLayer\\com\\ConfigLayer\\prop.properties");
		prop.load(fis);}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
