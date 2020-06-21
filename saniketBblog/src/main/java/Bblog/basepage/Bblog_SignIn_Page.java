package Bblog.basepage;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Bblog.util.PropertiesFiles;



public class Bblog_SignIn_Page {
	
	

	WebDriver driver;
	Properties testdata = PropertiesFiles.readPropertiesFiles();
	
	public  Bblog_SignIn_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement SignInUsername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement SignInPagePassword;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary pull-xs-right']")
	WebElement SignInButton;
	
	
	public void open() {
		
		String URL = testdata.getProperty("url");
		driver.get(URL);
	}


	public void SignInMethod() {

		try {
			
			String usr = testdata.getProperty("username");
			String pwd = testdata.getProperty("password");
			SignInUsername.sendKeys(usr);
     		SignInPagePassword.sendKeys(pwd);
			Thread.sleep(2000);
			SignInButton.click();
			System.out.println("Logged in to the Bblog website");
		} catch (Exception e) {
			System.out.println("Exception is handled");
		}

	}

}
