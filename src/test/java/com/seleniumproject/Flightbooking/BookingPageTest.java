package com.seleniumproject.Flightbooking;

import org.testng.annotations.Test;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.util.StringUtil;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageobject.BookingPage;
import pageobject.ResultPageComponent;
import pageobject.TravelerClassComponent;
import resources.BaseClass;



public class BookingPageTest extends BaseClass{

	@Test
	public void basePageNavigation() throws IOException, InterruptedException, ParseException {
	driver = initialiazeDriver();
	driver.get("https://www.ixigo.com/");
	BookingPage bk= new BookingPage(driver);
	Thread.sleep(5000);
	//bk.getclearfromfield().click();
	bk.getroundtrip().click();
	Date depDate = new Date(2020,8,15);
	
		String text = bk.getFrom().getText();
		if(text!=null && text.length()<=0) {
			bk.getclearfromfield().click();
			
		}
		bk.getFrom().sendKeys("Indore");
		Thread.sleep(5000);
		bk.getFromautocomplete().click();
	    
		bk.gettofield().sendKeys("Kolkata");
		Thread.sleep(5000);
		bk.gettoautocomplete().click();
	    
		bk.getdeparturefield().click();
		bk.getDepCal().selectDate(depDate);
		System.out.println(bk.getRetCal().getCurrentMonth());
		bk.getRetCal().selectDate(new Date(2020,9,14));
		TravelerClassComponent travelerClass =bk.getTravelers(); 
		travelerClass.getAdult().setNumber(2);
		travelerClass.getChild().setNumber(2);
		travelerClass.getInfant().setNumber(2);
		travelerClass.selectClass(0);
		
		bk.search();
		Thread.sleep(15000);
		ResultPageComponent rp = new ResultPageComponent(driver, "//div[@class=\"result-wrpr\"]");
		System.out.println("Flight towards ");
		rp.toResultComponents.getFlightsBelow(6000);
		
		System.out.println("Return Flights");
		rp.fromResultComponents.getFlightsBelow(6000);
		

	}
}
