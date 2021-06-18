package com.Adactin.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinary {
	
public static WebDriver driver;
	


	public BookedItinary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public WebElement getSelect_itinerary() {
		return select_itinerary;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getOrder() {
		return order;
	}
	
	@FindBy(xpath="//input[@value='425568']")
	private WebElement select_itinerary;

	@FindBy(xpath="//input[@value='Search Hotel']")
	private WebElement cancel;
	
	@FindBy(xpath = "//input[@value='Logout']")
	private WebElement logout;
	
	@FindBy(id = "order_id_text")
	private WebElement order;
	
}
