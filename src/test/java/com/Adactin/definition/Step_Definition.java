package com.Adactin.definition;

import org.openqa.selenium.WebDriver;

import com.Adactin.BaseClass;
import com.Adactin.org.BookedHotel;
import com.Adactin.org.BookedItinary;
import com.Adactin.org.BookingConfer;
import com.Adactin.org.LoginPage;
import com.Adactin.org.SearchHotel1;
import com.Adactin.org.SelectHotel;
import com.Adactin.runner.Test_Runner;
import com.Adactinsite.helper.FileReaderManager;
import com.Adactinsite.helper.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {
	public static WebDriver driver=Test_Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		implicitWait();
		String url = FileReaderManager.getInstance().getInstanceCR().geturl();
		
		getUrl(url);
			
	}

//	@When("^user Enter The Username In Username Field$")
//	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
//		enterValues(pom.getIntanceLogin().getUsername(), "nithiyasekar2010");
//		
//	}
//
//	@When("^user Enter The Password In Passowrd Field$")
//	public void user_Enter_The_Password_In_Passowrd_Field() throws Throwable {
//		
//		enterValues(pom.getIntanceLogin().getPassword(), "melijofi");
//	}
	
		
	// to pass multiple data(set of data)

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	enterValues(pom.getIntanceLogin().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Passowrd Field$")
	public void user_Enter_The_In_Passowrd_Field(String password) throws Throwable {
		enterValues(pom.getIntanceLogin().getPassword(), password);
	}
	
	
	
	

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel() throws Throwable {
		
		clickOnElement(pom.getIntanceLogin().getLogin());
	}
	
	
	@When("^user Select The Location In The Location Field$")
	public void user_Select_The_Location_In_The_Location_Field() throws Throwable {
		dropDown(pom.getInstanceSearch().getLocation(), "Sydney");
	}

	@When("^user Select The Hotel Name In The Hotel Name Field$")
	public void user_Select_The_Hotel_Name_In_The_Hotel_Name_Field() throws Throwable {
		
		dropDown2(pom.getInstanceSearch().getHotels(), "Hotel Creek");
	}
	
	@When("^user Select The Room Type In The Room Type Field$")
	public void user_Select_The_Room_Type_In_The_Room_Type_Field() throws Throwable {
		
		dropDown(pom.getInstanceSearch().getRoom_type(), "3");
	}

	@When("^user Select The NUmber Of Rooms In The Number Of Rooms Field$")
	public void user_Select_The_NUmber_Of_Rooms_In_The_Number_Of_Rooms_Field() throws Throwable {
		
		dropDown1(pom.getInstanceSearch().getRoom_nos(), "2");
	}

	@When("^user Select The Number Of Rooms In The Adults Per Room Field$")
	public void user_Select_The_Number_Of_Rooms_In_The_Adults_Per_Room_Field() throws Throwable {
		
		dropDown1(pom.getInstanceSearch().getAdult_room(), "2");
	}

	@When("^user Select The Number Of Rooms In The  Per Children Room Field$")
	public void user_Select_The_Number_Of_Rooms_In_The_Per_Children_Room_Field() throws Throwable {
		
		dropDown1(pom.getInstanceSearch().getChild_room(), "2");
	}

	@Then("^user Click On The Search button And It Navigates To The Select Hotel$")
	public void user_Click_On_The_Search_button_And_It_Navigates_To_The_Select_Hotel() throws Throwable {
		clickOnElement(pom.getInstanceSearch().getSearch());
	}

	@When("^user Select The Radio Button In The Select field$")
	public void user_Select_The_Radio_Button_In_The_Select_field() throws Throwable {
		
		clickOnElement(pom.getIntanceSelect().getRadiobutton());
	}

	@Then("^user Select The Continue Button And It Navigates To The Book A Hotel$")
	public void user_Select_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel() throws Throwable {
		
		clickOnElement(pom.getIntanceSelect().getContinu());
	}

	@When("^user Enter The First Name In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
		enterValues(pom.getIntanceBook().getFirst_name(), "nithiya");
	}

	@When("^user Enter The Last Name In The Last Name Fiel$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Fiel() throws Throwable {
		enterValues(pom.getIntanceBook().getLast_name(), "rakkini");
	}

	@When("^user enter The Address In The Billing Address Field$")
	public void user_enter_The_Address_In_The_Billing_Address_Field() throws Throwable {
		enterValues(pom.getIntanceBook().getAddress(), "Airport,Trichy");
	}

	@When("^user Enter The Credit Card Number In The Credit Card No Field$")
	public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_No_Field() throws Throwable {
		String cardNo = FileReaderManager.getInstance().getInstanceCR().getDebitCardNo();
		enterValues(pom.getIntanceBook().getCc_num(), cardNo);
	}
	@When("^user Select The Credit Card Type In The Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field() throws Throwable {
		
		dropDown3(pom.getIntanceBook().getCc_type(), "VISA");
		
	}

	@When("^user Select The Expiry Month In the Select Month Field$")
	public void user_Select_The_Expiry_Month_In_the_Select_Month_Field() throws Throwable {
		
		String expiryMonth = FileReaderManager.getInstance().getInstanceCR().getExpiryMonth();
		
		dropDown3(pom.getIntanceBook().getCc_exp_month(), expiryMonth);
	}

	@When("^user Select The Expiry Year In The Select Year Field$")
	public void user_Select_The_Expiry_Year_In_The_Select_Year_Field() throws Throwable {
		String expirydate = FileReaderManager.getInstance().getInstanceCR().getExpirydate();
		
		dropDown3(pom.getIntanceBook().getCc_exp_year(), expirydate);
	}

	@When("^user select the CVV Number In The CVV Number Field$")
	public void user_select_the_CVV_Number_In_The_CVV_Number_Field() throws Throwable {
		enterValues(pom.getIntanceBook().getCc_cvv(), "123");
	}

	@Then("^user Click The Book Now Button And It Naviagtes To The Booking Conformation$")
	public void user_Click_The_Book_Now_Button_And_It_Naviagtes_To_The_Booking_Conformation() throws Throwable {
		
		clickOnElement(pom.getIntanceBook().getBook_now());
		
	}

	@Then("^user Click The My Itinerary Button And It Navigates To the Booked Itinerary$")
	public void user_Click_The_My_Itinerary_Button_And_It_Navigates_To_the_Booked_Itinerary() throws Throwable {
		implicitWait();
		moveToClickOption(pom.getIntanceConfer().getMy_itinerary());
		
	}
	@Then("^user Click The Logout Button To Logout from the Hotel Booking$")
	public void user_Click_The_Logout_Button_To_Logout_from_the_Hotel_Booking() throws Throwable {
		implicitWait();
		clickOnElement(pom.getInstanceItinary().getLogout());
	}



}
