package com.main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BasePage;
import com.util.PageDriver;

public class HomePage extends BasePage {
	
	public HomePage(PageDriver driver) {
		super((PageDriver) driver);
		
	}
		
	public void getUrl(){
		
		driver.get("");
	}
   
	public int counticons() {
    	
    	int count = 0;
    	List<WebElement> ele = driver.findElements(By.cssSelector("body > header > div.hidden-xs.top-bar > div > ul"));
    	if (!ele.isEmpty()){
    		count = ele.size();
    	}
    	return count;
    }
    
    public String clickWbl(){
    	String url = null;
    	driver.findElement(By.id("webhead")).click();
    	url = driver.getCurrentUrl();
    	
    	return url;
    }
    
    public String clickLogin(){
    	String url = null;
    	driver.findElement(By.id("loginButton")).click();
    	url = driver.getCurrentUrl();
    	
    	return url;
    	
   }

}
