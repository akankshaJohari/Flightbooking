package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelerClassObject {
	
	String baseXPath;
	WebDriver driver ;
	NumberCounterObject adult;
	NumberCounterObject child;
	NumberCounterObject infant;
	
	
	public TravelerClassObject(String baseXPath, WebDriver driver) {
		this.baseXPath = baseXPath;
		adult = new NumberCounterObject(baseXPath+"//div[@class='u-box-result'][1]/div[@class=\"number-counter\"][1]", driver);
		child = new NumberCounterObject(baseXPath+"//div[@class='u-box-result'][1]/div[@class=\"number-counter\"][2]", driver);
		infant = new NumberCounterObject(baseXPath+"//div[@class='u-box-result'][1]/div[@class=\"number-counter\"][3]", driver);
		this.driver = driver;
	}


	public NumberCounterObject getAdult() {
		return adult;
	}


	public void setAdult(NumberCounterObject adult) {
		this.adult = adult;
	}


	public NumberCounterObject getChild() {
		return child;
	}


	public void setChild(NumberCounterObject child) {
		this.child = child;
	}


	public NumberCounterObject getInfant() {
		return infant;
	}


	public void setInfant(NumberCounterObject infant) {
		this.infant = infant;
	} 
	
	public void selectClass(int i) { 
		By travelClass = By.xpath(baseXPath + "//div[@class='u-box-result'][2]//div[@data-radioindex=\""+i +"\"]" );
		driver.findElement(travelClass).click(); 
	}
	
	
	

}
