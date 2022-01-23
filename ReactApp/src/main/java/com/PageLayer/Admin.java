package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.Actionsclass;
import com.UtilsLayer.JSmethods;
import com.UtilsLayer.Utilsclass;

public class Admin extends BaseClass{
	WebDriver driver;
	By adminbutton=By.id("menu_admin_viewAdminModule");
	By usermanegment=By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[1]/ul/li/a");
	By searchuser=By.name("searchSystemUser[userName]");
	By userroll=By.id("searchSystemUser_userType");
	By employeename=By.id("searchSystemUser_employeeName_empName");
	By employeestatus=By.id("searchSystemUser_status");
	By searchbutton=By.id("searchBtn");
	By addbutton=By.id("btnAdd");
//	By usertablevalue=By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody");
	
	public Admin(WebDriver driver) {
		this.driver=driver;		
	}
	
	public void adminpage() {
		Actionsclass.Mtoclick(driver.findElement(adminbutton));
	}
	public void usermanagmentpage() {
		JSmethods.JSclick(driver.findElement(usermanegment));
	}
	public void enterusername() {
		JSmethods.JSsendtext(driver.findElement(searchuser), "Jagdish");
	}
	public void selectuserroll() {
		Select sl=new Select(driver.findElement(userroll));
		sl.selectByVisibleText("Admin");
	}
	public void enteremployeename() {
		driver.findElement(employeename).sendKeys("JJ");
	}
	public void selectemployeestatus() {
		Select sl=new Select(driver.findElement(employeestatus));
		sl.selectByVisibleText("All");
	}
	public void selectsearch() {
		driver.findElement(searchbutton).click();
	}
	public void adduser() {
		driver.findElement(addbutton).click();
	}


}
