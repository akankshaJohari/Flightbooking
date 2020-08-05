package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingPage {

	
	public BookingPage(WebDriver driver) {
		
		this.driver = driver;
		this.depCal = new CalendarComponent("//div[contains(@class,'flight-dep-cal')]",driver);
		
		this.retCal = new CalendarComponent("//div[contains(@class,'flight-ret-cal')]",driver);
	}


	public WebDriver driver;

	By rountTrip = By.xpath("//span[2]/span[contains(text(),'Round Trip')]");
	
	By from = By.xpath("//div[@class='form-fields']/div[1]//input");
	
	By fromAutocomplete = By.xpath("//div[@class='form-fields']/div[1]//div[@class='autocompleter-scroll-cntr']/div[1]");
	
	By clearFromField = By.xpath("//div[@class='form-fields']/div[1]/div/div[2]");
	
	By toField = By.xpath("//div[@class='form-fields']/div[3]//input");
   
	By toAutocomplete = By.xpath("//div[@class='form-fields']/div[3]//div[@class='autocompleter-scroll-cntr']/div[1]");
	
	By clearToField = By.xpath("//div[@class='form-fields']/div[3]/div/div[2]");
	
	By departureField = By.xpath("//div[@class='form-fields']/div[4]//div[1]/input");
	
	
	By returnField = By.xpath("//div[@class='form-fields']/div[4]//div[2]/input");
	
	By searchBtn = By.xpath("//div[@class=\"form-fields\"]/div[6]/button");
	
	
	CalendarComponent depCal;// = new CalendarObject(departureCal,driver);
	
	CalendarComponent retCal; //  = new CalendarObject(returnCal,driver);
	
	String passengerBaseXPath="//div[contains(@class,'passenger')]";
	
	TravelerClassComponent travelers; 
	
	public WebElement getRoundTrip() {
		return driver.findElement(rountTrip);
		}
	
	public WebElement getFrom() {
	return driver.findElement(from);
	}
	
	public WebElement getClearFromField() {
		return driver.findElement(clearFromField);
		}

	public WebElement getFromAutocomplete() {
		return driver.findElement(fromAutocomplete);
	}
   
	public WebElement getToField() {
		return driver.findElement(toField);
		}
		
	public WebElement getClearToField() {
		return driver.findElement(clearToField);
		}

	public WebElement getToAutocomplete() {
		return driver.findElement(toAutocomplete);
	}
	
	public WebElement getDepartureField() {
		return driver.findElement(departureField);
		}

	public WebElement getReturnField() {
		return driver.findElement(returnField);
		}

	public CalendarComponent getDepCal() {
		return depCal;
	}

	public void setDepCal(CalendarComponent depCal) {
		this.depCal = depCal;
	}

	public CalendarComponent getRetCal() {
		return retCal;
	}

	public void setRetCal(CalendarComponent retCal) {
		this.retCal = retCal;
	}

	public TravelerClassComponent  getTravelers() {
		return new TravelerClassComponent(passengerBaseXPath, driver);
	}
	
	public void search() {
		driver.findElement(searchBtn).click();
	}

}
