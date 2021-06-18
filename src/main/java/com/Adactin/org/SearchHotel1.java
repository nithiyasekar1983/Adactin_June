package com.Adactin.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel1 {	
	
	public static WebDriver driver;
	


public SearchHotel1(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver1, this);
	}

public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoom_type() {
	return room_type;
}

public WebElement getRoom_nos() {
	return room_nos;
}

public WebElement getDatepick_in() {
	return datepick_in;
}

public WebElement getAdult_room() {
	return adult_room;
}

public WebElement getChild_room() {
	return child_room;
}

public WebElement getSearch() {
	return search;
}

@FindBy(id = "location")
private WebElement location;

@FindBy(id = "hotels")
private WebElement hotels;

@FindBy(id = "room_type")
private WebElement room_type;

@FindBy(id = "room_nos")
private WebElement room_nos;

@FindBy(id = "datepick_in")
private WebElement datepick_in;

@FindBy(id = "adult_room")
private WebElement adult_room;

@FindBy(id = "child_room")
private WebElement child_room;

@FindBy(xpath = "//input[@value='Search']")
private WebElement search;

}
