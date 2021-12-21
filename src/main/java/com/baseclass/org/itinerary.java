package com.baseclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class itinerary {
	public static WebDriver driver;
	@FindBy(name="my_itinerary")
	private WebElement itinerary;
	public WebElement getItinerary() {
		return itinerary;
	}
	public itinerary(WebDriver driver6) {
		this.driver=driver6;
		PageFactory.initElements(driver6, this);
	}
	}

