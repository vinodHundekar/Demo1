package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.JSmethods;

public class HomePage extends BaseClass {
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement admin;
	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIM;
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leave;
	@FindBy(id="menu_time_viewTimeModule")
	WebElement time;
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement recrutment;
	@FindBy(id="menu_pim_viewMyDetails")
	WebElement myinfo;
	@FindBy(id="menu__Performance")
	WebElement performance;
	@FindBy(id="menu_dashboard_index")
	WebElement dashboard;
	@FindBy(id="menu_directory_viewDirectory")
	WebElement directory;
	@FindBy(id="menu_maintenance_purgeEmployee")
	WebElement mainatance;
	@FindBy(id="menu_buzz_viewBuzz")
	WebElement buzz;
	@FindBy(id="welcome")
	WebElement welcome;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void checkhomemenu(){
		String admintext=admin.getText();
		System.out.println(admintext);
		admin.click();
		driver.navigate().back();
		String adminpim=PIM.getText();
		System.out.println(adminpim);
		PIM.click();
		driver.navigate().back();
		String adminleave=leave.getText();
		System.out.println(adminleave);
		leave.click();
		driver.navigate().back();
		String admintime=time.getText();
		System.out.println(admintime);
		time.click();
		driver.navigate().back();
		String adminrecrutment=recrutment.getText();
		System.out.println(adminrecrutment);
		recrutment.click();
		driver.navigate().back();
		String adminmyinfo=myinfo.getText();
		System.out.println(adminmyinfo);
		myinfo.click();
		driver.navigate().back();
		String adminperformance=performance.getText();
		System.out.println(adminperformance);
		performance.click();
		driver.navigate().back();
		String admindirectory=directory.getText();
		System.out.println(admindirectory);
		directory.click();
		driver.navigate().back();
		String adminbuzz=buzz.getText();
		System.out.println(adminbuzz);
		buzz.click();
		driver.navigate().back();
		String adminusername=welcome.getText();
		System.out.println(adminusername);
		System.out.println("Home menu tested ok");
	}
	
}
