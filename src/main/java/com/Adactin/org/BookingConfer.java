package com.Adactin.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfer {
	public static WebDriver driver;
	
	

	public BookingConfer(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath="//input[@value='My Itinerary']")
	private WebElement my_itinerary;

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

}
