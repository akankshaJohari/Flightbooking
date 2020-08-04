package pageobject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchItemComponents {
	
	String  toResultXPath ; 
	WebDriver driver;
	
	public SearchItemComponents(String toResultXPath, WebDriver driver) {
		super();
		this.toResultXPath = toResultXPath;
		this.driver = driver;
	}
	
	public void getFlightsBelow(float cap){
		List<WebElement> items= driver.findElements(By.xpath(toResultXPath));
		
		int i=1;
		for(WebElement we : items) {
			float f = Float.parseFloat(driver.findElement(By.xpath(toResultXPath+"["+ i +"]/div[@Class=\"summary-section\"]//div[@class=\"price\"]//span[2]")).getText());;
			if(f<cap) {
				System.out.println(driver.findElement(By.xpath(toResultXPath+"[" +i++ +"]/div[@Class=\"summary-section\"]/div[@class=\"time-group\"]//div[@class=\"u-text-ellipsis\"]" )).getText());
			}
		}
		
		
		
		
		
	}
	
	

}
