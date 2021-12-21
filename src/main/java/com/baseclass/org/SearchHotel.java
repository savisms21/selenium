package com.baseclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(name="hotels")
	private WebElement hotels;
	
	@FindBy(name="room_type")
	private WebElement roomtype;
	
	@FindBy(name="Submit")
	private WebElement search;

	
	
public WebElement getLocation() {
		return location;
	}



	public WebElement getHotels() {
		return hotels;
	}



	public WebElement getRoomtype() {
		return roomtype;
	}



	public WebElement getSearch() {
		return search;
	}



public SearchHotel(WebDriver driver3) {
	this.driver=driver3;
	PageFactory.initElements(driver3, this);
}
}
