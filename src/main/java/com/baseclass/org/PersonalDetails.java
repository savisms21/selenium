package com.baseclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails {
	public static WebDriver driver;

@FindBy(name="first_name")
private WebElement firstname;
@FindBy(name="last_name")
private WebElement lastname;
@FindBy(name="address")
private WebElement address;
@FindBy(name="cc_num")
private WebElement ccnum;
@FindBy(name="cc_type")
private WebElement cctype;
@FindBy(name="cc_exp_month")
private WebElement expmnth;
@FindBy(name="cc_exp_year")
private WebElement expyear;
@FindBy(name="cc_cvv")
private WebElement cvv;
@FindBy(name="book_now")
private WebElement booknow;
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCcnum() {
	return ccnum;
}
public WebElement getCctype() {
	return cctype;
}
public WebElement getExpmnth() {
	return expmnth;
}
public WebElement getExpyear() {
	return expyear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBooknow() {
	return booknow;
}

public PersonalDetails(WebDriver driver5) {
	this.driver=driver5;
	PageFactory.initElements(driver5, this);
}
}
