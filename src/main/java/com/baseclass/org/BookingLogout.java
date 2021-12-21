package com.baseclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingLogout {
	public static WebDriver driver;
	@FindBy(xpath = "//a[text()=\"Logout\"]")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}

	public BookingLogout(WebDriver driver7) {
		this.driver=driver7;
		PageFactory.initElements(driver7, this);
	}
	
}
