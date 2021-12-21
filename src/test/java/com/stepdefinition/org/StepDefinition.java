package com.stepdefinition.org;

import org.openqa.selenium.WebDriver;

import com.adactin.configuration.File_Reader_Manager;
import com.adactin.configuration.Page_Object_Manager;
import com.baseclass.org.Base;
import com.baseclass.org.BookingLogout;
import com.baseclass.org.Itinerary_Click;
import com.baseclass.org.Login;
import com.baseclass.org.PersonalDetails;
import com.baseclass.org.SearchHotel;
import com.baseclass.org.Search_Hotel;
import com.baseclass.org.SelectHotel;
import com.baseclass.org.itinerary;
import com.runner.org.Runner;

import io.cucumber.java.en.*;

public class StepDefinition extends Base{
	public static WebDriver driver = Runner.driver;
	Page_Object_Manager pom=new Page_Object_Manager(driver);
	//Login ln=new Login(driver);
	
	@Given("User Launch the adactin application")
	public void user_launch_the_adactin_application() throws Throwable {
	   //getUrl("https://adactinhotelapp.com/");
		String url = File_Reader_Manager.getInstance().getInstanceCR().geturl();
		getUrl(url);
	}
	/*
	 * @When("User enter the valid user name") public void
	 * user_enter_the_valid_user_name() { //inputValueElement(ln.getUserid(),
	 * "SavithaAlagar"); inputValueElement(pom.Login().getUserid(),
	 * "SavithaAlagar"); }
	 * 
	 * @When("User enter the valid password") public void
	 * user_enter_the_valid_password() { 
	 * //inputValueElement(ln.getPassword(),
	 * "7HGL4E"); inputValueElement(pom.Login().getPassword(), "7HGL4E");
	 * 
	 * }
	 */
	
	@When("User enter the \"SavithaAlagar\"valid user name")
	public void user_enter_the_savitha_alagar_valid_user_name() {
		inputValueElement(pom.Login().getUserid(), "SavithaAlagar");   
	}

	@When("User enter the valid \"7HGL4E\"password")
	public void user_enter_the_valid_7hgl4e_password() {
	inputValueElement(pom.Login().getPassword(), "7HGL4E");
	    
	}
	@Then("User validate the username and password")
	public void user_validate_the_username_and_password()throws Throwable {
			//clickOnElement(ln.getLogin());
		clickOnElement(pom.Login().getLogin());
			Thread.sleep(5000);
		} 
	
	public static WebDriver driver2=Runner.driver;
	//SearchHotel se1 = new SearchHotel(driver);


@Given("User select the location")
public void user_select_the_location() {
  // selection(se1.getLocation(), "byValue", "Sydney"); 
	selection(pom.SearchHotel().getLocation(), "byValue", "Sydney");
}

@When("user select the hotels")
public void user_select_the_hotels() {
	//selection(se1.getHotels(), "byValue", "Hotel Cornice");
	selection(pom.SearchHotel().getHotels(), "byValue","Hotel Cornice");
    }

@When("user select the room type")
public void user_select_the_room_type() {
    //selection(se1.getRoomtype(), "byValue", "Deluxe");
	selection(pom.SearchHotel().getRoomtype(), "byValue", "Deluxe");
}

@Then("user search the hotel")
public void user_search_the_hotel() {
	//clickOnElement(se1.getSearch());
	clickOnElement(pom.SearchHotel().getSearch());
    }

public static WebDriver driver3=Runner.driver;
//SelectHotel se2 = new SelectHotel(driver);

 
@Given("user click the hotel name")
public void user_click_the_hotel_name() {
   //clickOnElement(se2.getRadio());
	clickOnElement(pom.SelectHotel().getRadio());
}

@When("user click the continue button")
public void user_click_the_continue_button() {
	//clickOnElement(se2.getClick());
	clickOnElement(pom.SelectHotel().getClick());
    }

public static WebDriver driver4=Runner.driver;
//PersonalDetails pd=new PersonalDetails(driver);

@Given("user has to enter the Firstname")
public void user_has_to_enter_the_firstname() {
	//inputValueElement(pd.getFirstname(), "Savitha");
	inputValueElement(pom.PersonalDetails().getFirstname(), "Savitha");
   }

@When("user has to enter the Lastname")
public void user_has_to_enter_the_lastname() {
//	inputValueElement(pd.getLastname(), "Alagar");
	inputValueElement(pom.PersonalDetails().getLastname(), "Alagar");
  
}

@Given("user has to enter the billing address")
public void user_has_to_enter_the_billing_address() {
	// inputValueElement(pd.getAddress(), "Sbbu street");
	inputValueElement(pom.PersonalDetails().getAddress(), "Sbbu street");
   }

@When("user has to enter the credit cardno")
public void user_has_to_enter_the_credit_cardno() throws Throwable {
	// inputValueElement(pd.getCcnum(), "1236987456549876");
	//inputValueElement(pom.PersonalDetails().getCcnum(), "1236987456549876");
	String ccnum = File_Reader_Manager.getInstance().getInstanceCR().getccnum();
	inputValueElement(pom.PersonalDetails().getCcnum(), ccnum);
    }

@When("user enter the credit cardtype")
public void user_enter_the_credit_cardtype() {
	// selection(pd.getCctype(), "byValue", "VISA");
	selection(pom.PersonalDetails().getCctype(), "byValue", "VISA");
    }

@When("user has to select the expirydate")
public void user_has_to_select_the_expirydate() {
	// selection(pd.getExpmnth(), "byValue", "2");
	// selection(pd.getExpyear(), "byValue", "2015");
	selection(pom.PersonalDetails().getExpmnth(), "byValue", "2");
	selection(pom.PersonalDetails().getExpyear(),"byValue", "2015");
   }

@When("user has to enter the Cvvno")
public void user_has_to_enter_the_cvvno() throws Throwable {
	// inputValueElement(pd.getCvv(), "12365");
	//inputValueElement(pom.PersonalDetails().getCvv(), "12365");
	String cvvno = File_Reader_Manager.getInstance().getInstanceCR().getcvvno();
    } 

@Then("user select the booknow")
public void user_select_the_booknow() {
	// clickOnElement(pd.getBooknow());
	clickOnElement(pom.PersonalDetails().getBooknow());
	 }

public static WebDriver driver6=Runner.driver;
//Itinerary_Click itc=new Itinerary_Click(driver);

@Then("user select the itinerary")
public void user_select_the_itinerary() {
  // clickOnElement(itc.getItinerary()); 
	clickOnElement(pom.Itinerary_Click().getItinerary());
}

public static WebDriver driver7=Runner.driver;
//BookingLogout logout=new BookingLogout(driver);

@Then("user click the logout button")
public void user_click_the_logout_button() {
    //clickOnElement(logout.getLogout());
	clickOnElement(pom.BookingLogout().getLogout());
}

	}

