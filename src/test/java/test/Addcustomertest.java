package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Addcustomerpage;
import page.Dashboardpage;
import page.Loginpage;
import util.Browserfactory;

public class Addcustomertest {
WebDriver driver;

String username="demo@techfios.com";
String password="abc123";
@Test
public void validusershouldbeabletocreatecustomer() {
	driver=Browserfactory.init();
	Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
	
	lp.enterusername(username);
	lp.enterpassword(password);
	lp.clicksubmit();
	Dashboardpage dp=PageFactory.initElements(driver, Dashboardpage.class);
	dp.dashboardcheck();
	dp.customersbutton();
	dp.addcustomerbutton();
	Addcustomerpage acp=PageFactory.initElements(driver, Addcustomerpage.class);
	acp.verifyaddcontactpage();
	acp.insertfullname("selenium sep2021");
	acp.insertcompany("Mastec");
	acp.insertemail("abc@techfios.com");
	acp.insertphone("98989898989");
	acp.insertadress("3450 kilburn circle");
	acp.insertcity("richmond");
	acp.insertzip("989898");
	acp.insertcountry("Uzbekistan");
	acp.clicksubmit();
	
}
}
