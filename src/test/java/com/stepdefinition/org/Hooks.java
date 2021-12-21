package com.stepdefinition.org;

import java.io.IOException;

import com.baseclass.org.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends Base {
@Before
public void beforehooks(Scenario scenario) {
	String name=scenario.getName();
	System.out.println("Scenario title:"+name);	
}
@After
public void afterhooks(Scenario scenario) throws Throwable {
	Status status=scenario.getStatus();
	System.out.println("Scenario status :"+status);		
if(scenario.isFailed()) {
	screenshot("C:\\Users\\SAVITHA\\eclipse-workspace\\cucumber1\\Failed Screenshot//img.png");
}
}
}