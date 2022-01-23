package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.JSmethods;
import com.UtilsLayer.Utilsclass;

public class LoginPage extends BaseClass {
	
	By username= By.name("Login");
	By password=By.name("password");
	By buttonlogin=By.xpath("//div[@class='login-submit-button']");
	By passwordvisibility=By.xpath("//i[@class='fas fa-eye-slash password-eye']");
	By forgotpass=By.xpath("//a[text()='Forgot password?']");
	By newuser=By.xpath("//a[text()='New User? Register Now']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void apptitle() {
		String s1=driver.getTitle();
		Assert.assertEquals(s1.equalsIgnoreCase("React App"),true);
	}
	public void typeusername() {
		driver.findElement(username).sendKeys(prop.getProperty("userid"));
	}
	
	public void typepassword() {
		driver.findElement(password).sendKeys(prop.getProperty("password"));
	}
	public void clickloginbutton() {
		driver.findElement(buttonlogin).click();
//		JSmethods.JSclick(obj.findElement(buttonlogin));
	}
	public void passwordvisibilitylogo() {
		boolean a=driver.findElement(passwordvisibility).isDisplayed();
		boolean b=driver.findElement(passwordvisibility).isEnabled();
		Assert.assertEquals(a,b);
		boolean c=driver.findElement(passwordvisibility).isSelected();
		if(c=false) {
			driver.findElement(passwordvisibility).click();
		}
	}
	public void forgotpassword() {
		driver.findElement(forgotpass).click();
		String s2=driver.findElement(By.xpath("//div[@class='paara-div']")).getText();
		boolean d=s2.contains("get you a new password");
		Assert.assertEquals(d, true);
	}
	 
	public void enternowhenforgetpassword() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Phone Number']")).sendKeys("1234567890");
	}
	public void forgotpasswordmobno() {
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
	}
	public void dismissforgetpasswordalert() {
		driver.findElement(By.xpath("//button[text()='Close']")).click();
//		Utilsclass.dismissalert();
	}
	public void newusercreation() {
		boolean e=driver.findElement(newuser).isDisplayed();
		Assert.assertEquals(e, true);
		driver.findElement(newuser).click();
	}

}
