package Bblog.util;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	 
	public class BrowserFactory {


	public static WebDriver driver;
	 
	public static WebDriver getDriver(String browserName){
		
	if(driver==null){
	if(browserName.equalsIgnoreCase("firefox")){
	System.setProperty("webdriver.gecko.driver", "");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//	driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	}else if(browserName.equalsIgnoreCase("chrome")){
	System.out.println("in chrome");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saniket\\git\\BBlog\\saniketBblog\\lib\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	//driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	}else if(browserName.equalsIgnoreCase("IE")){
	System.setProperty("webdriver.ie.driver", "");
	driver=new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	//driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	}
	}
	return driver;
	}
	}

