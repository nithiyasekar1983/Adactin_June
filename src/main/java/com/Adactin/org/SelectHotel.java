package com.Adactin.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
public static WebDriver driver;
	

public SelectHotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}

public WebElement getRadiobutton() {
	return radiobutton;
}

public WebElement getContinu() {
	return continu;
}

public WebElement getHotel_name_dis() {
	return hotel_name_dis;
}

public WebElement getLocation_dis() {
	return location_dis;
}

public WebElement getRoom_type_dis() {
	return room_type_dis;
}

public WebElement getRoom_num_dis() {
	return room_num_dis;
}

public WebElement getTotal_days_dis() {
	return total_days_dis;
}

public WebElement getPrice_night_dis() {
	return price_night_dis;
}

public WebElement getTotal_price_dis() {
	return total_price_dis;
}

public WebElement getGst_dis() {
	return gst_dis;
}

public WebElement getFinal_price_dis() {
	return final_price_dis;
}



	@FindBy(xpath = "//input[@value='0']")
	private WebElement radiobutton;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continu;
	
	 @FindBy(id = "hotel_name_dis")
	 private WebElement hotel_name_dis;
	 
	 @FindBy(id = "location_dis")
	 private WebElement location_dis;
	 
	 @FindBy(id = "room_type_dis")
	 private WebElement room_type_dis;
	 
	 @FindBy(id = "room_num_dis")
	 private WebElement room_num_dis;
	 
	 @FindBy(id = "total_days_dis")
	 private WebElement total_days_dis;
	 
	 @FindBy(id = "price_night_dis")
	 private WebElement price_night_dis;
	 
	 @FindBy(id = "total_price_dis")
	 private WebElement total_price_dis;
	 
	 @FindBy(id = "gst_dis")
	 private WebElement gst_dis;
	 
	 @FindBy(id = "final_price_dis")
	 private WebElement final_price_dis;
	 
	
	 
	 

}
