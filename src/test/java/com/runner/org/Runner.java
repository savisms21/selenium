package com.runner.org;

import org.junit.BeforeClass;
 

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.configuration.File_Reader_Manager;
import com.baseclass.org.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\org", glue = "com\\stepdefinition\\org",plugin={"pretty","html:Report/HTML_Report","json:Report1/JSON_Report.json"})
public class Runner {
	
	public static WebDriver driver;
	
	//@BeforeClass
	/*public static void browserLaunch() {
		driver=Base.getDriver("chrome");	
}*/
@BeforeClass
public static void setup() throws Throwable {
String browser = File_Reader_Manager.getInstance().getInstanceCR().getbrowser();
driver = Base.getDriver(browser);
} 
	
}
