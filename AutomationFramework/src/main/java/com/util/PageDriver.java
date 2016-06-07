
package com.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageDriver {
	
         public WebDriver driver;
         Configuration configuration;
 		
 		
     public PageDriver (Configuration config) {
     	System.setProperty("webdriver.chrome.driver", "/Users/geetaagarwal/Documents/chromedriver");
     	  this.driver = new ChromeDriver();
 		 this.configuration = config;
 	     startbrowser();
       }	 
 	public void startbrowser() {
 		String browser = configuration.Browser;
 		
 		switch (browser){
 		
 		case "Firefox":
 			startFirefox();
 			break;
 		case "Chrome":
 			startChrome();
 			break;
 	    default:
 			startHTML();
 			break;
 		}
 		
 	}
 		public void startFirefox(){
 			
 			this.driver = new FirefoxDriver();
 	}

 		public void startChrome(){
 			
 			this.driver = new ChromeDriver();
 	}

 		public void startHTML(){
 			
 			this.driver = new FirefoxDriver();
 	}
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
