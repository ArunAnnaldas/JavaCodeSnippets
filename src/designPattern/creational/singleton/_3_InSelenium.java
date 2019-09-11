package designPattern.creational.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Browser {

	/*
	 * 
	 * How does Singleton pattern help in Selenium Webdriver?
	 * 
	 * a. Keep track of same driver instance throughout execution. 
	 * b. DBMS
	 * connectivity. 
	 * c. Loading external files like properties, excel etc once
	 * rather than loading again and again.
	 * d. Logger.
	 */
	
	private static Browser instanceOfBrowserClass;
	
	private WebDriver driver;
	
	private Browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//exe/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static Browser getInstanceOfBrowserClass() {
		if(instanceOfBrowserClass ==null)
			instanceOfBrowserClass = new Browser();
		return instanceOfBrowserClass;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}

public class _3_InSelenium{
	public static void main(String[] args) {
		Browser obj1 = Browser.getInstanceOfBrowserClass();
		WebDriver driver1 = obj1.getDriver();
		driver1.get("https://www.google.com/");
		System.out.println(driver1.getWindowHandle());
		
		Browser obj2 = Browser.getInstanceOfBrowserClass();
		WebDriver driver2 = obj2.getDriver();
		driver2.get("https://www.facebook.com/");
		System.out.println(driver2.getWindowHandle());
	}
}
