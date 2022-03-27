package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Dashboardpage;
import page.Loginpage;
import util.Browserfactory;

public class Logintest {
	WebDriver driver;
	//Logindata
String username="demo@techfios.com";
String password="abc123";
	
	public void usershouldbeabletologin() {
		
	driver=Browserfactory.init();
	Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
	Dashboardpage dp=PageFactory.initElements(driver, Dashboardpage.class);
	lp.enterusername(username);
	lp.enterpassword(password);
	lp.clicksubmit();
	dp.dashboardcheck();
	//Browserfactory.teardown();
	

	}

}
