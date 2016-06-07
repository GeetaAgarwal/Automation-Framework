
package com.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageDriver {
	
         public WebDriver driver;
	
	
		//System.setProperty("webdriver.chrome.driver", "/Users/geetaagarwal/Documents/chromedriver");

		driver = new FireFoxDriver();
	
	
	
	public void get(String url) {
		
		driver.get(url);
	}
	public WebElement findElement(By by){
		
		return driver.findElement(by);
		
	}
	 public List<WebElement> findElements(By by){
		 
		 return driver.findElements(by);
		 
	 }
   public String getCurrentUrl(){
	   
	   return driver.getCurrentUrl();
   }
   
 public String getCurrentUrl2(){
	   
	   return driver.getCurrentUrl();
 }
	   
    public void quit(){
    	
    	driver.quit();
    }
}
