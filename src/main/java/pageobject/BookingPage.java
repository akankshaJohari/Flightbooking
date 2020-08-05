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
	//div[@class='form-fields']/div[1]//div[@class='autocompleter-scroll-cntr']/div[1]
	 ////div[@class='form-fields']/div[1]//div[@class='autocompleter-scroll-cntr']
	By roundtrip = By.xpath("//span[2]/span[contains(text(),'Round Trip')]");
	
	By from = By.xpath("//div[@class='form-fields']/div[1]//input");
	
	By fromautocomplete = By.xpath("//div[@class='form-fields']/div[1]//div[@class='autocompleter-scroll-cntr']/div[1]");
	
	By clearfromfield = By.xpath("//div[@class='form-fields']/div[1]/div/div[2]");
	
	By tofield = By.xpath("//div[@class='form-fields']/div[3]//input");
   
	By toautocomplete = By.xpath("//div[@class='form-fields']/div[3]//div[@class='autocompleter-scroll-cntr']/div[1]");
	
	By cleartofield = By.xpath("//div[@class='form-fields']/div[3]/div/div[2]");
	
	By departurefield = By.xpath("//div[@class='form-fields']/div[4]//div[1]/input");
	
	By departuredate = By.xpath("//div[2]/div[2]/div[1]/table/tbody/tr[2]/td[1]");
	
	By departuremonth = By.xpath("//div[contains(@class,'flight-dep-cal')]//div[@class=\"rd-month\"][1]/div[@class=\"rd-month-label\"]");
	
	By departureBack = By.xpath("//div[contains(@class,'flight-dep-cal')]//div[@class=\"rd-month\"][1]/button[contains(@class,'rd-back')]");
	
	By departureNext = By.xpath("//div[contains(@class,'flight-dep-cal')]//div[@class=\"rd-month\"][2]/button[contains(@class,'rd-next')]");
	
	By returnfield = By.xpath("//div[@class='form-fields']/div[4]//div[2]/input");
	
	By returnmonth = By.xpath("//div[3]/div[2]/div[2]/div[@class='rd-month-label']");
	
	By returndate = By.xpath("//div[3]/div[2]/div[2]/table/tbody/tr[2]/td[2]");
	
	By searchbtn = By.xpath("//div[@class=\"form-fields\"]/div[6]/button");
	
	By travellersinfo = By.xpath("//div[@class='form-fields']/div[5]//input");
	
	CalendarComponent depCal;// = new CalendarObject(departureCal,driver);
	
	CalendarComponent retCal; //  = new CalendarObject(returnCal,driver);
	
	String passengerBaseXPath="//div[contains(@class,'passenger')]";
	
	TravelerClassComponent travelers; 
	
	public WebElement getroundtrip() {
		return driver.findElement(roundtrip);
		}
	
	public WebElement getFrom() {
	return driver.findElement(from);
	}
	
	public WebElement getclearfromfield() {
		return driver.findElement(clearfromfield);
		}

	public WebElement getFromautocomplete() {
		return driver.findElement(fromautocomplete);
	}
   
	public WebElement gettofield() {
		return driver.findElement(tofield);
		}
		
	public WebElement getcleartofield() {
		return driver.findElement(cleartofield);
		}

	public WebElement gettoautocomplete() {
		return driver.findElement(toautocomplete);
	}
	
	public WebElement getdeparturefield() {
		return driver.findElement(departurefield);
		}

	public WebElement getdeparturemonth() {
		return driver.findElement(departuremonth);
		}

	public WebElement getdeparturedate() {
		return driver.findElement(departuredate);
		}
	
	public WebElement getreturnfield() {
		return driver.findElement(returnfield);
		}

	public WebElement getreturnmonth() {
		return driver.findElement(returnmonth);
		}

	public WebElement getreturndate() {
		return driver.findElement(returndate);
		}
	public WebElement getDepartureNext() {
		return driver.findElement(departureNext);
		}
	public WebElement getDepartureBack() {
		return driver.findElement(departureBack);
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
		driver.findElement(searchbtn).click();
	}

}
