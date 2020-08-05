package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPageComponent {
	
	WebDriver driver;
	String baseXPath ;//"//div[@class=\"result-wrpr\"]/div[1]/div[1]/div[contains(@class ,\"c-flight-listing-split-row\")]";
	String toResultXPath;
	String fromResultXPath;
	public SearchItemComponents toResultComponents;
	public SearchItemComponents fromResultComponents;
	
	
	public ResultPageComponent(WebDriver driver, String baseXPath) {
		this.driver = driver;
		this.baseXPath = baseXPath;
		this.toResultXPath = baseXPath+"/div[1]//div[contains(@class ,\"c-flight-listing-split-row\")]";
		this.fromResultXPath = baseXPath+"/div[2]//div[contains(@class ,\"c-flight-listing-split-row\")]";
		
		toResultComponents = new SearchItemComponents(toResultXPath, driver);
		fromResultComponents = new SearchItemComponents(fromResultXPath, driver);
		
		
	}
	
	
	
	
}
