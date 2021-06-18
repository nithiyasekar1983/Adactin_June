package com.Adactinsite.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		File f = new File("E:\\Project\\programs done by me\\Adactin\\src\\test\\java\\com\\Adactin\\helper\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		 p = new Properties();
		
		p.load(fis);
		
	}
	
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
		

	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;

	}
	 
	public String getDebitCardNo() {
		String crecardno = p.getProperty("debitcardno");
		return crecardno;
		

	}
	
	public String getExpiryMonth() {
		
		String exmonth = p.getProperty("expirymonth");
		return exmonth;

	}
	
	public String getExpirydate() {
		String exdate = p.getProperty("expirydate");
		return exdate;

	}

}
