package com.Adactinsite.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.org.BookedHotel;
import com.Adactin.org.BookedItinary;
import com.Adactin.org.BookingConfer;
import com.Adactin.org.LoginPage;
import com.Adactin.org.SearchHotel1;
import com.Adactin.org.SelectHotel;

public class PageObjectManager {
	
	
	public WebDriver driver;
	
	private LoginPage login;
	private SearchHotel1 search;
	private SelectHotel select;
	private BookedHotel book;
	private BookingConfer confer;
	private BookedItinary itinary;
	
	public PageObjectManager(WebDriver driver2) {
	 this.driver = driver2;
	 PageFactory.initElements(driver2, this);
	
	}
	

	public LoginPage getIntanceLogin() {
		login = new LoginPage(driver);
		return login;
	}
	
	public SearchHotel1 getInstanceSearch() {
		search = new SearchHotel1(driver);
		return search;

	}
	
	public SelectHotel getIntanceSelect() {
		select = new SelectHotel(driver);
		return select;
	}
	
	public BookedHotel getIntanceBook() {
		book = new BookedHotel(driver);
		return book;
	}
	
	public BookingConfer getIntanceConfer() {
		confer = new BookingConfer(driver);
		return confer;
	}
	public BookedItinary getInstanceItinary() {
		
		itinary = new BookedItinary(driver);
		return itinary;
		

	}
	
	
	
	

}
