package com.adactin.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties pro;
	public Configuration_Reader() throws Throwable {
		File f=new File("C:\\Users\\SAVITHA\\eclipse-workspace\\cucumber1\\src\\test\\java\\Adaction.Properties");
	FileInputStream fis = new FileInputStream(f);
	pro = new Properties();
	pro.load(fis);
			}
	public String getbrowser() {
		String browser=pro.getProperty("browser");
		return browser;

	}
	public String geturl() {
		String url = pro.getProperty("url");
		return url;

	}
	public String getccnum() {
		String ccnum = pro.getProperty("Ccnum");
 return ccnum;
	}
	public String getcvvno() {
		String cvvno = pro.getProperty("cvvno");
		return cvvno;

	}
}
