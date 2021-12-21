package com.baseclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary_Click {
	public static WebDriver driver;
@FindBy(xpath = "//a[text()=\"Booked Itinerary\"]")
private WebElement itinerary;
public WebElement getItinerary() {
	return itinerary;
}
public Itinerary_Click(WebDriver driver6) {
	this.driver=driver6;
	PageFactory.initElements(driver6, this);
	
}
}
