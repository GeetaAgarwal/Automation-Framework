package com.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.util.PageDriver;


public abstract class BasePageTest {

	public PageDriver driver;
	 
	@BeforeSuite
	public void setUp() {
		
		driver = new PageDriver();
	}
	@AfterSuite
	public void quit(){
		
		driver.quit();
	}
}
