package com.adactin.configuration;

import org.openqa.selenium.WebDriver;

import com.baseclass.org.BookingLogout;
import com.baseclass.org.Itinerary_Click;
import com.baseclass.org.Login;
import com.baseclass.org.PersonalDetails;
import com.baseclass.org.SearchHotel;
import com.baseclass.org.SelectHotel;

public class Page_Object_Manager {
	public static WebDriver driver;
	private Login ln;
	private SearchHotel se1;
	private SelectHotel se2;
	private PersonalDetails pd;
	private Itinerary_Click itc;
	private BookingLogout logout;
	
	public Login Login() {
		ln=new Login(driver);
		return ln;

	}
	public SearchHotel SearchHotel() {
		se1=new SearchHotel(driver);
        return se1;
	}
	public SelectHotel SelectHotel() {
		se2=new SelectHotel(driver);
		return se2;

	}
	
	public PersonalDetails PersonalDetails() {
		pd=new PersonalDetails(driver);
     return pd;
	}
	public Itinerary_Click Itinerary_Click() {
		itc=new	Itinerary_Click(driver);
      return itc;
	}
	public BookingLogout BookingLogout() {
		logout =new BookingLogout(driver);
		return logout;

	}
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
}
