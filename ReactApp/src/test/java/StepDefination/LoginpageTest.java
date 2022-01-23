package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseLayer.BaseClass;
import com.PageLayer.Admin;
import com.PageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginpageTest extends BaseClass{
	
	@Given("user open Ornage HRM URL")
	public void user_open_ornage_hrm_url() {
	    BaseClass.initialisation();
	}
	
	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		LoginPage obj=new LoginPage(driver);
		obj.typeusername();
		obj.typepassword();
	}
	
	@When("User click on login button")
	public void user_click_on_login_button() {
		LoginPage obj=new LoginPage(driver);
		obj.clickloginbutton();
	}
	
	@Then("user is on home page")
	public void user_is_on_home_page() {
	
		System.out.println(driver.getTitle());
				
	}
	
	@When("get titleon home page and validate")
	public void get_titleon_home_page_and_validate() {
		String webtitle=driver.getTitle();
		String actualtitle="OrangeHRM";
		Assert.assertEquals(webtitle,actualtitle);
	}
	@When("click on contact menu")
	public void click_on_contact_menu() {
		Admin obj=new Admin(driver);
		obj.adminpage();
	}
	@Then("user fill data for contact")
	public void user_fill_data_for_contact() {
		Admin obj=new Admin(driver);
		obj.enterusername();
		obj.selectuserroll();
		obj.enteremployeename();
		obj.selectemployeestatus();
		obj.selectsearch();
		obj.adduser();
	}



}
