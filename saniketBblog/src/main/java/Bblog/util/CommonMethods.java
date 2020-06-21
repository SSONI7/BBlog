package Bblog.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.Status;

public class CommonMethods {

	public WebDriver driver;
	protected ExtentTest test;
	protected Log log = LogFactory.getLog(this.getClass());

	public CommonMethods(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		 	
	}
	
	public void click(WebElement element) {
		try {
			element.click();
			test.log(Status.PASS, "Click " + element.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public void sendKeys(WebElement element, String keys) {
		try {
			element.clear();
			element.sendKeys(keys);

			test.log(Status.PASS, "Send " + keys + " to " + element.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
	} 
	
	public void waitAndSendkeys(WebElement element, String keys, int i) {
		try {
			WebDriverWait wait4 = new WebDriverWait(driver, i);
			wait4.until(ExpectedConditions.elementToBeClickable(element));
			element.sendKeys(keys);
			test.log(Status.PASS, "Send " + keys + " to " + element.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void waitAndClick(WebElement element, int time) {
		try {
			WebDriverWait wait4 = new WebDriverWait(driver, time);
			wait4.until(ExpectedConditions.elementToBeClickable(element)).click();
			test.log(Status.PASS, "Wait until " + element.toString() + "is clickable");
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}


	
	
	
}
