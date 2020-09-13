package org.manager;

import org.stepdefinition.BaseClass;
import org.stepdefinition.BookingHotelId;
import org.stepdefinition.BookingHotelPage;
import org.stepdefinition.CancelPage;
import org.stepdefinition.LoginPage;
import org.stepdefinition.SearchHotelPage;
import org.stepdefinition.SelectHotelPage;

public class PageObjectManager extends BaseClass {
	 private static PageObjectManager PageObjectManager;
	    
	    private  LoginPage loginPage;
	    private  SearchHotelPage searchHotelPage;
	    private  SelectHotelPage selectHotelPage;
	    private  BookingHotelPage bookingHotelPage;
	    private  BookingHotelId bookingHotelId;
	    private  CancelPage cancelPage;
	    public static PageObjectManager getPageObjectManager() {
			return PageObjectManager;
		}

		public static PageObjectManager getInstance() {
			return (PageObjectManager==null)?PageObjectManager=new PageObjectManager():PageObjectManager;
	    }
	    
		public  LoginPage getLoginPage(){
			
			return (loginPage==null)?loginPage=new LoginPage():loginPage;
		}
		public SearchHotelPage getSearchHotelPage() {
			return (searchHotelPage==null)?searchHotelPage=new SearchHotelPage():searchHotelPage;
		}
		public SelectHotelPage getSelectHotelPage() {
			return (selectHotelPage==null)?selectHotelPage=new SelectHotelPage():selectHotelPage;
		}
		public BookingHotelPage getBookingHotelPage() {
			return (bookingHotelPage==null)?bookingHotelPage=new BookingHotelPage():bookingHotelPage;
		}
		public BookingHotelId getBookingHotelId() {
			return (bookingHotelId==null)?bookingHotelId=new BookingHotelId():bookingHotelId;
		}

		public CancelPage getCancelPage() {
			return (cancelPage==null)?cancelPage=new CancelPage():cancelPage;
		}

}
