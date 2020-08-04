package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NumberCounterObject {
	
	String baseXPath;
	WebDriver driver;
	
	
	public NumberCounterObject(String baseXPath, WebDriver driver) {
		super();
		this.baseXPath = baseXPath;
		this.driver = driver;
	}
	
	public void setNumber(int i) {
		String path = baseXPath+"//span[@data-val=\"" +i +"\"]";
		By by = By.xpath(path);
		driver.findElement(by).click();
		
	}
	
	
	

}
