package com.main;

import org.openqa.selenium.By;

import com.base.BasePage;
import com.util.PageDriver;

public class LoginPage extends BasePage{
	
	public LoginPage(PageDriver driver) {
		 super (driver);
		
	}
	
   public String dologin(String usname, String pwd) {
	   String error  = null;
	   driver.findElement(By.id("username")).sendKeys(usname);
	   driver.findElement(By.id("password")).sendKeys(pwd);
	   driver.findElement(By.id("login")).click();
	    
	   error = driver.findElement(By.cssSelector("body > div.wrapper > div > div > div > div > article > h6")).getText();
	   
	   return error;
	   
   }
	

}
