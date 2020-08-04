package pageobject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarObject {
	
	By cal ;
	By month;
	private WebDriver driver;
	private String baseXPath;
	private String nextButtonXpath;
	private String previousButtonXpath;
	private String monthLabelXpath;
	
	public CalendarObject(String baseXpath, WebDriver driver) {
		this.baseXPath = baseXpath;
		
		this.cal = By.xpath(baseXpath);
		this.monthLabelXpath = baseXpath +"//div[@class=\"rd-month\"][1]/div[@class=\"rd-month-label\"]";
		this.nextButtonXpath = baseXpath +"//div[@class=\"rd-month\"][2]/button[contains(@class,'rd-next')]";
		this.previousButtonXpath = baseXpath+ "//div[@class=\"rd-month\"][1]/button[contains(@class,'rd-back')]";
		
		this.driver = driver;
	}
	
	
	public int  getCurrentMonth() throws ParseException {
		
		month = By.xpath(monthLabelXpath);
		WebElement x=  driver.findElement(month);
		String a = x.getText().split(" ")[0];
		System.out.println("aaaaaaaaaaaaaaaa"+a);
		int currentMonth = new SimpleDateFormat("MMMM").parse(a).getMonth();
		System.out.println("aaaaaaaaaaaaaaaa"+currentMonth);
		return currentMonth+1;
	}
	
	public void nextMonth() {
		By nextButton = By.xpath(nextButtonXpath);
		WebElement nextButtonElement = driver.findElement(nextButton);
		nextButtonElement.click();
	}
	
	public void previousMonth() {
		By nextButton = By.xpath(previousButtonXpath);
		WebElement previosButtonElement = driver.findElement(nextButton);
		previosButtonElement.click();
	}
	
	public void selectDate(Date toSelect) throws ParseException, InterruptedException {
		int requiredMonth = toSelect.getMonth();
		requiredMonth++;
		int currentMonth = getCurrentMonth();
		
		while(currentMonth!=requiredMonth) {
			if(requiredMonth>currentMonth) {
				nextMonth();
				Thread.sleep(2000);
			}else {
				previousMonth();
				Thread.sleep(2000);
			}	
			currentMonth = getCurrentMonth();
		}
		
		String date = toSelect.getDate() >9 ? ""+toSelect.getDate() : "0"+toSelect.getDate();
		date =date + (toSelect.getMonth()+1 > 9 ?  ""+(toSelect.getMonth()+1): "0"+ (toSelect.getMonth()+1));
		date = date + toSelect.getYear();
		System.out.println(date);
		By datex =By.xpath(baseXPath+"//div[@class=\"rd-month\"][1]//td[@data-date=\""+date+"\"]");
		driver.findElement(datex).click();
		
	}

}
