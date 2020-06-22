package com.pom1.testcases;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pom1.basedriver.Basedriver;
import com.pom1.flows.Flow_login;



public class Testcase1 extends Basedriver {   
	    
	  @BeforeTest
	  
	  public void launchurl() throws InterruptedException, IOException
	  {
	  System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30,
	  TimeUnit.SECONDS); Thread.sleep(2000);
	  System.out.println("Starting the suite");
	  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies(); Thread.sleep(2000);
	  System.out.println("Launching the URL"); }
	
	  @Test
	  public void tc1() throws IOException { 
		
		  Flow_login fl= new  Flow_login();
	  
	  fl.login();
	  
	  }
	 
	  @AfterTest
	  
	  public void closethebrowser()
	  
	  {  
		  driver.quit(); 
		  
	  }
	 
	
	

}
