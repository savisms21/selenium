package com.baseclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public static WebDriver driver;

@FindBy(name="radiobutton_0")
private WebElement radio;
@FindBy(name="continue")
private WebElement click;
public WebElement getRadio() {
	return radio;
}
public WebElement getClick() {
	return click;
}

public SelectHotel(WebDriver driver4) {
	this.driver=driver4;
	PageFactory.initElements(driver4, this);
}
}