package com.pom1.flows;

import org.openqa.selenium.WebDriver;


import com.pom1.basedriver.Basedriver;
import com.pom1.pages.Page_login;



public class Flow_login  extends Basedriver{

	Page_login lp= new Page_login();
	
	
	public void login() {
		
		lp.getTx_username().sendKeys("pradeephnk@gmail.com");
		
		lp.getTx_password().sendKeys("Hansika2010");
		
		lp.getBtn_login().click();
	}

}
