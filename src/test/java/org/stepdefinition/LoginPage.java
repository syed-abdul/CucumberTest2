package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public  LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usrname;
	
	@FindBy(id="password")
	private WebElement psw;
	
	@FindBy(id="login")
	private WebElement lgnbtn;
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement booking;

	public WebElement getBooking() {
		return booking;
	}

	public WebElement getUsrname() {
		return usrname;
	}

	public WebElement getPsw() {
		return psw;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}
	public void login(String username,String password) {
		fill(getUsrname(),username);
		fill(getPsw(), password);
		click(getLgnbtn());
	}
	public void bookingItinerary() {

		click(getBooking());
	}
}
