package com.baseclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public static WebDriver driver;
	@FindBy(name="username")
	private WebElement userid;
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement login;
	

public Login (WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
		}
public WebElement getUserid() {
	return userid;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}
}