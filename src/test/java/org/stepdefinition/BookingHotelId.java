package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotelId extends BaseClass{
	public BookingHotelId(){
		PageFactory.initElements(driver, this);
	}

		 
		    
         @FindBy(id="order_no")
         private WebElement orderno;
		
         @FindBy(id="logout") 
		 private WebElement log;
         @FindBy(id="my_itinerary")
         private WebElement itin;

         public WebElement getOrderno() {
			return orderno;
		}

       public WebElement getLog() {
			return log;
		}
		public void orderId() {
	     getId(getOrderno());
	
}
		public WebElement getItin() {
			return itin;
		}
        public void logOut() {
			click(getLog());
		}

}
