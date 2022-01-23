package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.Admin;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;

public class Testing extends BaseClass {
	static LoginPage obj=new LoginPage(driver);
	@BeforeClass
	public void setup() {
		BaseClass.initialisation();
//		System.out.println(driver.getTitle());
	}
	
	@Test(priority=1)
	public void checkTitle() {
		obj.apptitle();
	}
	@Test(priority=2)
	public void passwordvisiblelogo() {
		obj.passwordvisibilitylogo();
	}
	@Test(priority=3)
	public void forgetpasswordtitletest() {
		obj.forgotpassword();
	}
	@Test(dependsOnMethods= {"forgetpasswordtitletest"})
	public void entermobifforgetpassword() {
		obj.enternowhenforgetpassword();
	}
	@Test(dependsOnMethods= {"entermobifforgetpassword"})
	public void acceptforgetpasswordalert() {
		obj.forgotpasswordmobno();
	}
	@Test(dependsOnMethods= {"acceptforgetpasswordalert"})
	public void dismissforgetalert() {
		obj.dismissforgetpasswordalert();
	}
	@Test(priority=4)
	public void checknewuser() {
		obj.newusercreation();
	}
	@Test(priority=5)
	public void insertusername() {
		obj.typeusername();
	}
	@Test(priority=6)
	public void insertpassword() {
		obj.typepassword();
	}
	@Test(priority=7)
	public void clickonlogintest() {
		obj.clickloginbutton();
	}
	
	
	
	@AfterClass
	public void rundown() {
		driver.close();
	}

}
