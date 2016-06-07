package com.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	public String URL;
	public String Browser;
	
	
	public void propRead() {
		
		Properties pr = new Properties();
		try {
			FileReader fr = new FileReader("config.properties");
			try {
				pr.load(fr);
				URL = pr.getProperty("url");
				Browser = pr.getProperty("browser");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
