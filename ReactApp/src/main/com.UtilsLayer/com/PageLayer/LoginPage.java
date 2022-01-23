package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseLayer.BaseClass;
import com.UtilsLayer.JSmethods;

public class LoginPage extends BaseClass {
	WebDriver obj;
	By username= By.id("txtUsername");
	By password=By.id("txtPassword");
	By buttonlogin=By.id("btnLogin");
	
	public LoginPage(WebDriver obj) {
		this.obj=obj;
	}
	
	
	public void typeusername() {
		obj.findElement(username).sendKeys(prop.getProperty("userid"));
	}
	
	public void typepassword() {
		obj.findElement(password).sendKeys(prop.getProperty("password"));
	}
	public void clickloginbutton() {
		obj.findElement(buttonlogin).click();
//		JSmethods.JSclick(obj.findElement(buttonlogin));
	}

}
