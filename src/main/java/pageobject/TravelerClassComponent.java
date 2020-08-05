package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelerClassComponent {
	
	String baseXPath;
	WebDriver driver ;
	NumberCounterComponent adult;
	NumberCounterComponent child;
	NumberCounterComponent infant;
	
	
	public TravelerClassComponent(String baseXPath, WebDriver driver) {
		this.baseXPath = baseXPath;
		adult = new NumberCounterComponent(baseXPath+"//div[@class='u-box-result'][1]/div[@class=\"number-counter\"][1]", driver);
		child = new NumberCounterComponent(baseXPath+"//div[@class='u-box-result'][1]/div[@class=\"number-counter\"][2]", driver);
		infant = new NumberCounterComponent(baseXPath+"//div[@class='u-box-result'][1]/div[@class=\"number-counter\"][3]", driver);
		this.driver = driver;
	}


	public NumberCounterComponent getAdult() {
		return adult;
	}


	public void setAdult(NumberCounterComponent adult) {
		this.adult = adult;
	}


	public NumberCounterComponent getChild() {
		return child;
	}


	public void setChild(NumberCounterComponent child) {
		this.child = child;
	}


	public NumberCounterComponent getInfant() {
		return infant;
	}


	public void setInfant(NumberCounterComponent infant) {
		this.infant = infant;
	} 
	
	public void selectClass(int i) { 
		By travelClass = By.xpath(baseXPath + "//div[@class='u-box-result'][2]//div[@data-radioindex=\""+i +"\"]" );
		driver.findElement(travelClass).click(); 
		
	}
	
	
	

}
